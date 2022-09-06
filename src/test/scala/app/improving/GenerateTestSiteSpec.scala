package app.improving

import com.reactific.riddl.RIDDLC
import org.scalatest.matchers.must.Matchers
import org.scalatest.wordspec.AnyWordSpec

/** Generate a test site */
class GenerateTestSiteSpec extends AnyWordSpec with Matchers {

  "GenerateTestSite" should {
    "validate RIDDL and generate Hugo" in {
      val command = Array("--show-times", "--verbose", "hugo", "src/main/riddl/ImprovingApp.conf")
      RIDDLC.runMain(command) must be(0)
    }
  }
}
