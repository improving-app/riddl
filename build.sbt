Global / onChangedBuildSource := ReloadOnSourceChanges
scalaVersion := "2.13.10"
lazy val riddl_version = "0.19.0"
libraryDependencies ++= Seq(
  "com.reactific" %% "riddl-testkit" % riddl_version % "test",
  "com.reactific" %% "riddl-hugo" % riddl_version % "test",
  "org.scalactic" %% "scalactic" % "3.2.9" % "test",
  "org.scalatest" %% "scalatest" % "3.2.9" % "test"
)
enablePlugins(RiddlSbtPlugin)
riddlcOptions :=
  Seq("--show-times", "from", "src/main/riddl/ImprovingApp.conf", "hugo")
riddlcMinVersion := s"$riddl_version"
riddlcPath := file(
  "/Users/reid/Code/reactific/riddl/riddlc/target/universal/stage/bin/riddlc"
)
