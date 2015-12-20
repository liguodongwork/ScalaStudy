97  在build.sbt文件夹下，添加最后两行文件，然后下载
name := "StudyAkkaWithSBT"

version := "1.0"

scalaVersion := "2.11.6"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies += "com.typesafe.akka" % "akka-actor" % "2.0.3"


------------
98  对于windows 32位系统直接运行SBT Console下（run），他会到IEDA的目录下找jre，
而对于64位操作系统而言，他就不会到IDEA目录下去找JRE。

所以64位操作系统 要运行idea64.exe

------------
99  手动Artifacts打包并运行SBT开发Akka第一个案例

SBT可以自动打包编译运行，我们也可以用IDEA方式打包编译运行，为什么要手动Artifacts打包？
我们希望把开发的工程打包成jar包在其他的机器或者命令终端，或者让其他人去运行，
那么这个时候就需要打包成jar包的方式。
File->Project Structure->Artifacts-> + -> jar -> From Modules With Denpendences...



编译打包：
Build -> Build Artifacts -> Action Build

在工程 $PROJECT_PATH/out/artifacts/studyakkawithsbt_jar/ 目录下看到jar文件。

运行
$PROJECT_PATH/out/artifacts/studyakkawithsbt_jar>java -jar studyakkawithsbt.jar Demo.Main

$PROJECT_PATH/out/artifacts/studyakkawithsbt_jar>java -jar studyakkawithsbt.jar
最好指定Main Class，一是运行速度更快，二是一个工程有可能有多个Main Class。

-----------
100 消息、main入口、MasterActor








