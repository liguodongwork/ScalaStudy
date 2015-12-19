
91  案例的介绍
MapActor--->对传进来的数据进行单词的切分
ReduceActor--->对MapActor产生的结果进行统计
AggregateActor--->对所有的ReduceActor产生的结果进行统计
MasterActor--->控制器   Actor之间存在着消息的传输


HelloAkka

92  开发环境的介绍

<dependencies>
    <dependency>
        <groupId>com.typesafe.akka</groupId>
        <artifactId>akka-actor</artifactId>
        <version>2.0.2</version>
    </dependency>
</dependencies>

<repositories>
    <repository>
        <id>typesafe</id>
        <name>Typesafe Repository</name>
        <url>http://repo.typesafe.com/typesafe/releases/</url>
    </repository>
</repositories>

93

