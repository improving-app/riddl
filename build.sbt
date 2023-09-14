Global / onChangedBuildSource := ReloadOnSourceChanges
scalaVersion := "3.3.1"
lazy val riddl_version = "0.23.+"
libraryDependencies ++= Seq(
  "com.reactific" %% "riddl-testkit" % riddl_version % "test",
  "com.reactific" %% "riddl-hugo" % riddl_version % "test",
  "org.scalactic" %% "scalactic" % "3.2.9" % "test",
  "org.scalatest" %% "scalatest" % "3.2.9" % "test"
)
enablePlugins(RiddlSbtPlugin)
riddlcOptions :=
  Seq("--show-times", "from", "src/main/riddl/ImprovingApp.conf", "hugo")
riddlcMinVersion := s"0.20.5"
riddlcPath := file(
  "/Users/reid/Code/reactific/riddl/riddlc/target/universal/stage/bin/riddlc"
)
