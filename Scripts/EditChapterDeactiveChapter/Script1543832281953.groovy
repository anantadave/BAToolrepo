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

WebUI.click(findTestObject('Object Repository/Page_Bulk Authoring Tool/span_Toggle navigation_caret'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/a_Modify or deactivate chapter'))

WebUI.selectOptionByLabel(findTestObject('Page_Bulk Authoring Tool/select_205 testAbnormal Psycho'), V_Productname, true)

WebUI.click(findTestObject('Page_Bulk Authoring Tool/input_Select product_submit'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/a_Modify'))

WebUI.setText(findTestObject('Page_Bulk Authoring Tool/input__chap_name'), 'Chapter added automation_6 updated')

WebUI.click(findTestObject('Page_Bulk Authoring Tool/input_max. 100 alpha-numericsp'))

WebUI.rightClick(findTestObject('Page_Bulk Authoring Tool/strong_Action Successfull'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/strong_Action Successfull'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/a_Modify Chapter'))

WebUI.selectOptionByLabel(findTestObject('Page_Bulk Authoring Tool/select_205 testAbnormal Psycho'), V_Productname, true)

WebUI.click(findTestObject('Page_Bulk Authoring Tool/input_Select product_submit'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/a_Deactivate'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/a_Click here'))

WebUI.selectOptionByLabel(findTestObject('Page_Bulk Authoring Tool/select_205 testAbnormal Psycho'), V_Productname, true)

WebUI.click(findTestObject('Page_Bulk Authoring Tool/input_Select product_submit'))

WebUI.rightClick(findTestObject('Page_Bulk Authoring Tool/a_Activate'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/td_Modify'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/a_Test User'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/a_Logout'))

WebUI.closeBrowser()

