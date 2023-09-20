Global / onChangedBuildSource := ReloadOnSourceChanges
scalaVersion := "3.3.1"
lazy val riddl_version = "0.24.+"
libraryDependencies ++= Seq(
  "com.reactific" %% "riddl-testkit" % riddl_version % "test",
  "com.reactific" %% "riddl-hugo" % riddl_version % "test",
  "org.scalactic" %% "scalactic" % "3.2.9" % "test",
  "org.scalatest" %% "scalatest" % "3.2.9" % "test"
)
enablePlugins(RiddlSbtPlugin)
riddlcOptions :=
  Seq("--show-times", "from", "src/main/riddl/ImprovingApp.conf", "hugo")
riddlcMinVersion := s"0.24.0"
riddlcPath := file(
  // NOTE: Set this to your local path which will always have this portion
  // NOTE: of the path as a constant: riddl/riddlc/target/universal/stage/bin/riddlc
  // NOTE: You must "sbt stage" in the riddl/riddlc directory for this to work
  "/Users/reid/Code/reactific/riddl/riddlc/target/universal/stage/bin/riddlc"
)
