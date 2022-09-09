Global / onChangedBuildSource := ReloadOnSourceChanges
scalaVersion := "2.13.8"
// enablePlugins(RiddlSbtPlugin)
libraryDependencies ++= Seq(
  "com.reactific" %% "riddl-testkit" % "0.13.+" % "test",
  "com.reactific" %% "riddl-hugo" % "0.13.+" % "test",
  "org.scalactic" %% "scalactic" % "3.2.9" % "test",
  "org.scalatest" %% "scalatest" % "3.2.9" % "test"
)
// Compile / riddlcOptions :=
// Seq("from", "src/main/riddl/ImprovingApp.conf", "hugo")
