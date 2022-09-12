package app.improving.test

import com.reactific.riddl.testkit.RunCommandSpecBase

class CheckRiddlTest extends RunCommandSpecBase {

  "CheckRiddlTest" should {
    "validate riddl" in {
      runWith(Seq(
        "--verbose", "--debug",
        "--suppress-style-warnings", "--suppress-missing-warnings",
        "validate", "src/main/riddl/ImprovingApp.riddl"
      ))
    }
  }
}