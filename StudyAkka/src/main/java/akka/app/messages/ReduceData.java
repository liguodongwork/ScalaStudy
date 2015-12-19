package akka.app.messages;

import java.util.HashMap;

/**
 * Created by liguodong on 2015/12/17.
 */
public class ReduceData {

    private HashMap<String,Integer> reduceDataList;

    public HashMap<String, Integer> getReduceDataList() {
        return reduceDataList;
    }

    public ReduceData(HashMap<String,Integer> reduceDataList){
        this.reduceDataList = reduceDataList;
    }
}
