name := "scala-sandbox"

version := "0.1"

scalaVersion := "2.12.7"

// for the JVM
libraryDependencies += "io.monix" %% "monix" % "3.0.0-RC2"
libraryDependencies += "com.outworkers" %% "phantom-dsl" % "2.30.0"
libraryDependencies += "io.getquill" %% "quill-cassandra" % "2.6.0"
libraryDependencies += "com.datastax.cassandra" % "cassandra-driver-extras"  % "3.2.0"