package akka.app;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

import akka.app.actors.MasterActor;
import akka.app.messages.Result;


/**
 * Created by liguodong on 2015/12/17.
 */
public class HelloAkka {
    public static void main(String[] args) throws Exception{
        ActorSystem system = ActorSystem.create("HelloAkka");

        ActorRef master = system.actorOf(new Props(MasterActor.class),"master");

        master.tell("Hi! My name is Rocky. I'm so so so so happy to be here.");
        master.tell("Today, I'm going to read a news article for you.");
        master.tell("I hope I hope you'll like it.");
        Thread.sleep(500);

        master.tell(new Result());
        Thread.sleep(500);
        system.shutdown();

    }
}
