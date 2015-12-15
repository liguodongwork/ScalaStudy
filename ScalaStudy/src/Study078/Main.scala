package Study078
import scala.reflect.runtime.universe.typeOf
/**
 * Type与Class实战
 * Created by liguodong on 2015/12/15.
 */

class Spark
trait Hadoop
object Flink
class Java{
  class Scala
}

object Main {
  def main(args: Array[String]) {
    println(typeOf[Spark])
    println(classOf[Spark]) //Class[_ <: Spark]
    val sp = new Spark()
    println(sp.getClass)

    val spark = new Spark
    println(spark.getClass)

    println(typeOf[Hadoop])
    println(classOf[Hadoop])

    println(Flink.getClass) //class Study078.Flink$  在Scala中，Object背后是有具体的类
    //println(classOf[Flink])

    val java1 = new Java
    val java2 = new Java

    val scala1 = new java1.Scala
    val scala2 = new java2.Scala
    println(scala1.getClass)
    println(scala2.getClass)

    //type是更详细的信息
    println(typeOf[java1.Scala] == typeOf[java2.Scala])//false
    println(typeOf[java1.Scala])
    println(typeOf[java2.Scala])

    println(classOf[List[Int]] == classOf[List[String]])
    println(typeOf[List[Int]] == typeOf[List[String]])



  }
}
