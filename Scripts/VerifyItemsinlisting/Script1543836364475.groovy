import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.text.BreakIterator as BreakIterator
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.By.ByLinkText as ByLinkText
import org.openqa.selenium.By.ByTagName as ByTagName
import org.openqa.selenium.By.ByXPath
import org.openqa.selenium.By.ByCssSelector
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')

WebUI.navigateToUrl('https://bat-qa.macmillan-learning.com/gateway/index.php')

WebUI.click(findTestObject('Page_Lumina Datamatics/a_Click here'))

WebUI.setText(findTestObject('Page_Lumina Datamatics/input_User name_username'), 'testuser')

WebUI.setEncryptedText(findTestObject('Page_Lumina Datamatics/input_Password_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Page_Lumina Datamatics/input_Password_submitButton'))

WebUI.click(findTestObject('Page_Common Gateway/a_QTI Authoring'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/span_Toggle navigation_caret'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/a_Review and reassign item - A'))



 
 
//WebUI.click(findTestObject('Page_Bulk Authoring Tool/a_View'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/a_edit'))

WebUI.setText(findTestObject('Page_Bulk Authoring Tool/input_Item Title_new_field'), 'MC multi automation_6 title updated')

WebUI.click(findTestObject('Page_Bulk Authoring Tool/input_max. 5592405 HTML chars.'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/a_edit_1'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/input_ins_submit'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/input_Elements path_submit'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/input_Elements path_submit_1'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/a_edit_2'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/input_ins_submit'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/a_edit_3'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/input_ins_submit'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/input_Elements path_submit_2'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/input_Elements path_submit_3'))


WebUI.click(findTestObject('Page_Bulk Authoring Tool/a_Try it'))

WebUI.switchToWindowTitle('Bulk Authoring Tool')

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('Page_Bulk Authoring Tool/input_Option A_response_value'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/button_Hint'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/input_Test hint_submit'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/button_Close'))

WebUI.switchToWindowTitle('Bulk Authoring Tool')

WebUI.click(findTestObject('Page_Bulk Authoring Tool/a_Item list'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/a_Delete'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/a_Logout'))

WebUI.closeBrowser()

