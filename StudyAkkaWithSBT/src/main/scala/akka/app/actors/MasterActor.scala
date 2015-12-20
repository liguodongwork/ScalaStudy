package akka.app.actors

import akka.actor.{Props, ActorRef, Actor}
import akka.app.message.Result

/**
  * Created by liguodong on 2015/12/19.
  */
class MasterActor extends Actor{

  //创建AggregateActor
  val aggregateActor:ActorRef = context.actorOf(Props[AggregateActor],name="aggregate")

  //reduceActor结果会交给aggregateActor
  val reduceActor:ActorRef = context.actorOf(Props(new ReduceActor(aggregateActor)),name="reduce")

  //mapActor结果会交给reduceActor
  val mapActor:ActorRef = context.actorOf(Props(new MapActor(reduceActor)),name="map")

  //进行消息匹配
  def receive: Receive = {
    //字符串
    case message:String =>
      mapActor ! message
    //Result
    case message:Result =>
      aggregateActor ! message
    case _ =>

  }
}
