import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\ANANTA~1.DAV\\AppData\\Local\\Temp\\Katalon\\Test Cases\\CreateItemFB\\20181206_121727\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('https://bat-qa.macmillan-learning.com/gateway/index.php')

not_run: WebUI.click(findTestObject('Page_Lumina Datamatics/a_Click here'))

not_run: WebUI.setText(findTestObject('Page_Lumina Datamatics/input_User name_username'), 'testuser')

not_run: WebUI.setEncryptedText(findTestObject('Page_Lumina Datamatics/input_Password_password'), '8SQVv/p9jVScEs4/2CZsLw==')

not_run: WebUI.click(findTestObject('Page_Lumina Datamatics/input_Password_submitButton'))

not_run: WebUI.click(findTestObject('Page_Common Gateway/a_QTI Authoring'))

not_run: WebUI.click(findTestObject('Page_Bulk Authoring Tool/span_Toggle navigation_caret'))

not_run: WebUI.click(findTestObject('Page_Bulk Authoring Tool/a_Create a new item'))

not_run: WebUI.click(findTestObject('Page_Bulk Authoring Tool/a_Fill in the blank'))

not_run: WebUI.setText(findTestObject('Page_Bulk Authoring Tool/input_Title_title'), 'FB Automation added1')

not_run: WebUI.setText(findTestObject('Page_Bulk Authoring Tool/input_Hint_hint'), 'F B hint')

not_run: WebUI.click(findTestObject('Page_Bulk Authoring Tool/input_Hint_desctoo'))

not_run: WebUI.click(findTestObject('Page_Bulk Authoring Tool/input_Elements path_stemtoo'))

not_run: WebUI.click(findTestObject('Page_Bulk Authoring Tool/input_Elements path_mc_promptt'))

not_run: WebUI.setText(findTestObject('Page_Bulk Authoring Tool/input_Default Feedback_default'), 'default feedback FB')

//WebUI.click(findTestObject('Page_Bulk Authoring Tool/p'))
not_run: WebUI.setText(findTestObject('Page_Bulk Authoring Tool/div_Ans1'), '<p style="outline: rgb(255, 0, 0) solid 2px;"><ins class="ice-ins ice-cts" data-cid="2" data-userid="" data-username="" data-changedata="" data-time="1544010177091" data-last-change-time="1544010178453">Ans1</ins><br></p>')

not_run: WebUI.setText(findTestObject('Page_Bulk Authoring Tool/div_Ans2'), '<p style=""><ins class="ice-ins ice-cts" data-cid="2" data-userid="" data-username="" data-changedata="" data-time="1544010179960" data-last-change-time="1544010180818">Ans2</ins><br></p>')

not_run: WebUI.setText(findTestObject('Page_Bulk Authoring Tool/div_Ans3'), '<p style=""><ins class="ice-ins ice-cts" data-cid="2" data-userid="" data-username="" data-changedata="" data-time="1544010184795" data-last-change-time="1544010185909">Ans3</ins><br></p>')

not_run: WebUI.setText(findTestObject('Page_Bulk Authoring Tool/input_Raptor ID_raptor_id'), 'raptor123')

not_run: WebUI.selectOptionByValue(findTestObject('Page_Bulk Authoring Tool/select_-- Select one --Writer'), '1', true)

not_run: WebUI.click(findTestObject('Page_Bulk Authoring Tool/input_Workflow stage_submit'))

not_run: WebUI.click(findTestObject('Page_Bulk Authoring Tool/a_clicking here'))

not_run: WebUI.click(findTestObject('Page_Bulk Authoring Tool/input_ins_submit'))

not_run: WebUI.click(findTestObject('Page_Bulk Authoring Tool/input_Elements path_submit'))

not_run: WebUI.click(findTestObject('Page_Bulk Authoring Tool/input_ins_submit_1'))

not_run: WebUI.click(findTestObject('Page_Bulk Authoring Tool/input_Elements path_submit'))

not_run: WebUI.click(findTestObject('Page_Bulk Authoring Tool/input_ins_submit_2'))

not_run: WebUI.click(findTestObject('Page_Bulk Authoring Tool/input_Elements path_submit'))

//WebUI.click(findTestObject('Page_Bulk Authoring Tool/a_edit'))
not_run: WebUI.click(findTestObject('Page_Bulk Authoring Tool/a_Try it'))

not_run: WebUI.switchToWindowTitle('Bulk Authoring Tool')

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('Page_Bulk Authoring Tool/button_Close'))

WebUI.switchToWindowTitle('Bulk Authoring Tool')

WebUI.click(findTestObject('Page_Bulk Authoring Tool/a_Item list'))

WebUI.setText(findTestObject('Page_Bulk Authoring Tool/input_Toggle Dropdown_form-con'), 'FB Automation added1')

WebUI.click(findTestObject('Page_Bulk Authoring Tool/svg_Toggle Dropdown_svg-inline'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/a_Delete'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/a_Test User'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/a_Logout'))

WebUI.closeBrowser()

''', 'Test Cases/CreateItemFB', new TestCaseBinding('Test Cases/CreateItemFB',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
