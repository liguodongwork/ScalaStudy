package akka.app

import java.util.{HashMap => JHashMap}

/**
  * Created by liguodong on 2015/12/20.
  */
object Demo {
  def main(args: Array[String]) {

    val hashMap = new JHashMap[String,Integer];

    hashMap.put("df",1);
    hashMap.put("ddf",1);
    hashMap.put("dfdf",1);
    hashMap.put("dfsf",1);

    for (str <- hashMap.keySet().toArray){
      println(str)
    }

    println("fdg")
  }
}
