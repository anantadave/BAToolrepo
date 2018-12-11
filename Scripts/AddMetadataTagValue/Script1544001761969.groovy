import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://bat-qa.macmillan-learning.com/gateway/index.php')

WebUI.click(findTestObject('Page_Lumina Datamatics/a_Click here'))

WebUI.setText(findTestObject('Page_Lumina Datamatics/input_User name_username'), 'testuser')

WebUI.setEncryptedText(findTestObject('Page_Lumina Datamatics/input_Password_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Page_Lumina Datamatics/input_Password_submitButton'))

WebUI.click(findTestObject('Page_Common Gateway/a_QTI Authoring'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/span_Toggle navigation_caret'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/a_Manage metadata tags'))

WebUI.setText(findTestObject('Page_Bulk Authoring Tool/input__list_head'), V_Productname)

WebUI.selectOptionByValue(findTestObject('Page_Bulk Authoring Tool/select_205 testAbnormal Psycho'), '64', true)

WebUI.click(findTestObject('Page_Bulk Authoring Tool/input_Hold Control (in Windows'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/a_Add metadata values'))

WebUI.selectOptionByValue(findTestObject('Page_Bulk Authoring Tool/select_--Select Product --'), '64', true)

WebUI.setText(findTestObject('Page_Bulk Authoring Tool/textarea_Metadata value_metada'), 'Value1')

WebUI.click(findTestObject('Page_Bulk Authoring Tool/input_Metadata value_submit'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/a_Go to homepage'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/span_Downloads_caret'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/a_Logout'))

WebUI.closeBrowser()

