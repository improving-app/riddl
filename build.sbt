Global / onChangedBuildSource := ReloadOnSourceChanges
scalaVersion := "2.13.8"
lazy val riddl_version = "0.14.4"
libraryDependencies ++= Seq(
  "com.reactific" %% "riddl-testkit" % riddl_version % "test",
  "com.reactific" %% "riddl-hugo" % riddl_version % "test",
  "org.scalactic" %% "scalactic" % "3.2.9" % "test",
  "org.scalatest" %% "scalatest" % "3.2.9" % "test"
)
enablePlugins(RiddlSbtPlugin)
riddlcOptions :=
  Seq("--show-times", "from", "src/main/riddl/ImprovingApp.conf", "hugo")
riddlcMinVersion := "0.14.4"
