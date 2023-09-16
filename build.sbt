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
  // NOTE: This value will fail for everyone but Reid. Change it locally
  // NOTE: for your path to riddlc executable
  "/Users/reid/Code/reactific/riddl/riddlc/target/universal/stage/bin/riddlc"
)
