import com.intellij.testFramework.fixtures.BasePlatformTestCase

class MakefileHighlightingTest : BasePlatformTestCase() {
  fun testUnresolved() = doTest()
  fun testRedundant() = doTest(true)
  fun testTargetspecificvars() = doTest()

  fun doTest(checkInfos: Boolean = false) { myFixture.testHighlighting(true, checkInfos, true, "$testDataPath/$basePath/${getTestName(true)}.mk") }

  override fun getTestDataPath() = "testData"
  override fun getBasePath() = "highlighting"
}