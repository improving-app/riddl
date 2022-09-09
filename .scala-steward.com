dependencyOverrides = [{
  pullRequests = { frequency = "@monthly" },
  dependency = { groupId = "org.scalameta", artifactId = "scalafmt-core" }
}]
