在build.sbt文件夹下，添加最后两行文件，然后下载
name := "StudyAkkaWithSBT"

version := "1.0"

scalaVersion := "2.11.6"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies += "com.typesafe.akka" % "akka-actor" % "2.0.3"


------------
对于windows 32位系统直接运行SBT Console下（run），他会到IEDA的目录下找jre，
而对于64位操作系统而言，他就不会到IDEA目录下去找JRE。

所以64位操作系统 要运行idea64.exe

------------
手动Artifacts打包并运行SBT开发Akka第一个案例

为什么要手动Artifacts打包？