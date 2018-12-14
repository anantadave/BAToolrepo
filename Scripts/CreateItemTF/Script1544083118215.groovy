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

WebUI.click(findTestObject('Object Repository/Page_Common Gateway/a_Bulk Authoring Tool'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/a_Operations'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/a_Create a new item'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/a_True or False'))

WebUI.selectOptionByLabel(findTestObject('Page_Bulk Authoring Tool/select_Select ProductLehninger'), V_Productname,true)

WebUI.selectOptionByLabel(findTestObject('Page_Bulk Authoring Tool/select_Select ChapterChapter A'),V_Chaptername,true)

WebUI.setText(findTestObject('Page_Bulk Authoring Tool/input_Title_title'), 'TF Automation added1')

WebUI.setText(findTestObject('Page_Bulk Authoring Tool/input_Hint_hint'), 'Testhint')

WebUI.click(findTestObject('Page_Bulk Authoring Tool/input_Hint_desctoo'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/input_Elements path_stemtoo'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/input_Elements path_mc_promptt'))

WebUI.setText(findTestObject('Page_Bulk Authoring Tool/input_Default Feedback_default'), 'default feedback')

WebUI.click(findTestObject('Page_Bulk Authoring Tool/input_YesNo_randomization'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/p'))

WebUI.setText(findTestObject('Page_Bulk Authoring Tool/div_Feedback for True'), '<p style=""><ins class="ice-ins ice-cts" data-cid="2" data-userid="" data-username="" data-changedata="" data-time="1544531589758" data-last-change-time="1544531593317" style="">Feedback for True</ins><br></p>')

WebUI.click(findTestObject('Page_Bulk Authoring Tool/input_False_correct_answer'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/p_1'))

WebUI.setText(findTestObject('Page_Bulk Authoring Tool/div_Feedback for false'), '<p style=""><ins class="ice-ins ice-cts" data-cid="2" data-userid="" data-username="" data-changedata="" data-time="1544531597762" data-last-change-time="1544531600410" style="">Feedback for false</ins><br></p>')

//WebUI.click(findTestObject('Page_Bulk Authoring Tool/input_False_correct_answer'))

WebUI.setText(findTestObject('Page_Bulk Authoring Tool/input_Raptor ID_raptor_id'), 'raptor123')

WebUI.selectOptionByValue(findTestObject('Page_Bulk Authoring Tool/select_-- Select one --Writer'), '1', true)

WebUI.click(findTestObject('Page_Bulk Authoring Tool/input_Workflow stage_submit'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/a_clicking here'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/input_ins_submit'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/input_Elements path_submit'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/input_ins_submit_1'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/input_Elements path_submit'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/input_ins_submit_2'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/input_Elements path_submit'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/a_Try it'))

WebUI.switchToWindowTitle('Bulk Authoring Tool')

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('Page_Bulk Authoring Tool/input_True_response_value'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/button_Hint'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/input_Testhint_submit'))

WebUI.rightClick(findTestObject('Page_Bulk Authoring Tool/h3_Correct Answer'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/button_Close'))

WebUI.switchToWindowTitle('Bulk Authoring Tool')

WebUI.click(findTestObject('Page_Bulk Authoring Tool/a_Item list'))

WebUI.setText(findTestObject('Page_Bulk Authoring Tool/input_Toggle Dropdown_form-con'), 'TF Automation added1')

WebUI.click(findTestObject('Page_Bulk Authoring Tool/path'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/a_Delete'))

WebUI.click(findTestObject('Page_Bulk Authoring Tool/span_Downloads_caret'))

//WebUI.click(findTestObject('Page_Bulk Authoring Tool/a_Logout'))

//WebUI.closeBrowser()

