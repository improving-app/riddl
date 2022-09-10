Global / onChangedBuildSource := ReloadOnSourceChanges
scalaVersion := "2.13.8"
enablePlugins(RiddlSbtPlugin)
libraryDependencies ++= Seq(
  "com.reactific" %% "riddl-testkit" % "0.14.0" % "test",
  "com.reactific" %% "riddl-hugo" % "0.14.0" % "test",
  "org.scalactic" %% "scalactic" % "3.2.9" % "test",
  "org.scalatest" %% "scalatest" % "3.2.9" % "test"
)
riddlcOptions := Seq(
  "--verbose",
  "from", "src/main/riddl/ImprovingApp.conf", "hugo"
)
riddlcMinVersion := "0.14.0"
