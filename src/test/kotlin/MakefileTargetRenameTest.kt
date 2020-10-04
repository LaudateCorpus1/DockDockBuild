import com.intellij.testFramework.fixtures.BasePlatformTestCase

class MakefileTargetRenameTest : BasePlatformTestCase() {
  fun testSimple() = doTest("qwerty")


  fun doTest(newName: String) {
    myFixture.configureByFile("$testDataPath/$basePath/${getTestName(true)}.mk")
    myFixture.renameElementAtCaret(newName)
    myFixture.checkResultByFile("$basePath/${getTestName(true)}.gold.mk")
  }

  override fun getTestDataPath() = "testData"
  override fun getBasePath() = "rename"
}