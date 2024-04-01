package app.improving.test

import com.ossuminc.riddl.testkit.RunCommandSpecBase

class CheckRiddlTest extends RunCommandSpecBase {

  "CheckRiddlTest" should {
    "validate riddl" in {
      runWith(Seq(
        "--suppress-style-warnings", "--suppress-missing-warnings",
        "--hide-usage-warnings",
        "validate", "src/main/riddl/ImprovingApp.riddl"
      ))
    }
  }
}
