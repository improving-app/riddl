package app.improving

import com.ossuminc.riddl.testkit.RunCommandSpecBase

/** Generate a test site */
class GenerateTestSiteSpec extends RunCommandSpecBase {

  "GenerateTestSite" should {
    "validate RIDDL and generate Hugo" in {
      val command = Array(
        "--show-times",
        "--suppress-style-warnings",
        "--suppress-missing-warnings",
        "--verbose",
        "from",
        "src/main/riddl/ImprovingApp.conf",
        "hugo"
      )
      runWith(command)
    }
  }
}
