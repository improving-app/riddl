dependencyOverrides = [{
  pullRequests = { frequency = "@monthly" },
  dependency = { groupId = "org.scalameta", artifactId = "scalafmt-core" }
}, {
  pullRequests = { frequency = "@monthly" },
  groupId = "org.scala-lang", artifactId = "scala-library" }
}]
