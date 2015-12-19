package akka.app.actors;

import akka.actor.Actor;
import akka.actor.ActorRef;
import akka.actor.UntypedActor;
import akka.app.messages.MapData;
import akka.app.messages.ReduceData;
import akka.app.messages.WordCount;

import java.util.HashMap;
import java.util.List;

/**
 * 对MapActor产生的结果进行统计
 * Created by liguodong on 2015/12/17.
 */
public class ReduceActor extends UntypedActor{

    private ActorRef aggregateActor = null;

    public ReduceActor(ActorRef inAggregateActor){
        aggregateActor = inAggregateActor;
    }


    @Override
    public void onReceive(Object message) throws Exception {
        if(message instanceof MapData){
            MapData mapData = (MapData)message;
            //reduce the incoming data
            ReduceData reduceData = reduce(mapData.getDataList());
            //forword the result to aggregate actor
            aggregateActor.tell(reduceData);
        }else{
            unhandled(message);
        }
    }

    private ReduceData reduce(List<WordCount> dataList){
        HashMap<String,Integer> reduceMap = new HashMap<String,Integer>();
        for(WordCount wordCount : dataList){
            if(reduceMap.containsKey(wordCount.getWord())){
                Integer value = (Integer)reduceMap.get(wordCount.getWord());
                value++;
                reduceMap.put(wordCount.getWord(),value);
            }else{
                reduceMap.put(wordCount.getWord(),Integer.valueOf(1));
            }
        }
        return new ReduceData(reduceMap);
    }
}
