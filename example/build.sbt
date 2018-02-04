enablePlugins(ScalaJSPlugin)

organization := "com.payalabs"
name := "scalajs-react-bridge-example"
version := "0.5.0-SNAPSHOT"

crossScalaVersions := Seq("2.12.2", "2.11.12")
scalaVersion := crossScalaVersions.value.head

libraryDependencies ++= {
  val scalaJsDom = "0.9.2"
  val scalaJsReact = "1.1.0"
  //val scalaJsReactBridge = "0.4.0-SNAPSHOT"

  Seq(
    "org.scala-lang" % "scala-reflect" % scalaVersion.value,
    "org.scala-js" %%% "scalajs-dom" % scalaJsDom,
    "com.github.japgolly.scalajs-react" %%% "core" % scalaJsReact,
    "com.github.japgolly.scalajs-react" %%% "extra" % scalaJsReact//,
    //"com.payalabs" %%% "scalajs-react-bridge" % scalaJsReactBridge
  )
}

resolvers += Resolver.sonatypeRepo("snapshots")
