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

WebUI.click(findTestObject('Object Repository/Page_Lumina Datamatics/a_Click here'))

WebUI.setText(findTestObject('Object Repository/Page_Lumina Datamatics/input_User name_username'), 'testuser')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Lumina Datamatics/input_Password_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Page_Lumina Datamatics/input_Password_submitButton'))

WebUI.click(findTestObject('Object Repository/Page_Common Gateway/a_QTI Authoring'))

WebUI.click(findTestObject('Object Repository/Page_Bulk Authoring Tool/span_Toggle navigation_caret'))

WebUI.click(findTestObject('Object Repository/Page_Bulk Authoring Tool/a_Create new product'))

WebUI.setText(findTestObject('Object Repository/Page_Bulk Authoring Tool/input__title'), V_Productname)

WebUI.setText(findTestObject('Object Repository/Page_Bulk Authoring Tool/input__isbn'), V_ISBN)

WebUI.setText(findTestObject('Object Repository/Page_Bulk Authoring Tool/input__author'), 'AD automation')

WebUI.setText(findTestObject('Object Repository/Page_Bulk Authoring Tool/input_Comments_comments'), 'testing')

WebUI.click(findTestObject('Object Repository/Page_Bulk Authoring Tool/input_max. 200 alpha-numericsp'))

WebUI.rightClick(findTestObject('Object Repository/Page_Bulk Authoring Tool/strong_Action Successful'))

WebUI.click(findTestObject('Object Repository/Page_Bulk Authoring Tool/body_Toggle navigation'))

WebUI.click(findTestObject('Object Repository/Page_Bulk Authoring Tool/a_Allocate to users'))

WebUI.click(findTestObject('Object Repository/Page_Bulk Authoring Tool/input_Select member(s) to allo'))

WebUI.click(findTestObject('Object Repository/Page_Bulk Authoring Tool/input_Status_submit'))

WebUI.click(findTestObject('Object Repository/Page_Bulk Authoring Tool/a_Create Chapterstopics'))

WebUI.setText(findTestObject('Object Repository/Page_Bulk Authoring Tool/input__chap_title'), V_Chaptername)

WebUI.click(findTestObject('Object Repository/Page_Bulk Authoring Tool/input_max. 100 alpha-numericsp'))

WebUI.click(findTestObject('Object Repository/Page_Bulk Authoring Tool/a_Create Item'))

WebUI.click(findTestObject('Object Repository/Page_Bulk Authoring Tool/a_Multiple Choice (Single Sele'))

WebUI.setText(findTestObject('Object Repository/Page_Bulk Authoring Tool/input_Title_title'), V_Itemname)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_Bulk Authoring Tool/select_Select ProductTicket Te'), V_Productname,true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_Bulk Authoring Tool/select_Select ChapterChapter A'), V_Chaptername, 
    true)

WebUI.setText(findTestObject('Object Repository/Page_Bulk Authoring Tool/input_Hint_hint'), 'Test hint')

WebUI.click(findTestObject('Object Repository/Page_Bulk Authoring Tool/input_Hint_desctoo'))

WebUI.click(findTestObject('Object Repository/Page_Bulk Authoring Tool/input_Elements path_stemtoo'))

WebUI.click(findTestObject('Object Repository/Page_Bulk Authoring Tool/input_Elements path_mc_promptt'))

WebUI.setText(findTestObject('Object Repository/Page_Bulk Authoring Tool/input_Default Feedback_default'), 'Default feedback')

WebUI.click(findTestObject('Object Repository/Page_Bulk Authoring Tool/input_YesNo_randomization'))

WebUI.setText(findTestObject('Object Repository/Page_Bulk Authoring Tool/div_Option A'), '<p style=""><ins class="ice-ins ice-cts" data-cid="2" data-userid="" data-username="" data-changedata="" data-time="1543818594195" data-last-change-time="1543818595162">Option A</ins><br></p>')

WebUI.click(findTestObject('Object Repository/Page_Bulk Authoring Tool/p'))

WebUI.setText(findTestObject('Object Repository/Page_Bulk Authoring Tool/div_Option A feedback'), '<p style=""><ins class="ice-ins ice-cts" data-cid="2" data-userid="" data-username="" data-changedata="" data-time="1543818598078" data-last-change-time="1543818600821" style="">Option A feedback</ins><br></p>')

WebUI.click(findTestObject('Object Repository/Page_Bulk Authoring Tool/p_1'))

WebUI.setText(findTestObject('Object Repository/Page_Bulk Authoring Tool/div_Option B'), '<p style=""><ins class="ice-ins ice-cts" data-cid="2" data-userid="" data-username="" data-changedata="" data-time="1543818603301" data-last-change-time="1543818604168" style="">Option B</ins><br></p>')

WebUI.click(findTestObject('Object Repository/Page_Bulk Authoring Tool/p_2'))

WebUI.setText(findTestObject('Object Repository/Page_Bulk Authoring Tool/div_Option B feedback'), '<p style=""><ins class="ice-ins ice-cts" data-cid="2" data-userid="" data-username="" data-changedata="" data-time="1543818607082" data-last-change-time="1543818609562" style="">Option B feedback</ins><br></p>')

WebUI.click(findTestObject('Object Repository/Page_Bulk Authoring Tool/p_3'))

WebUI.setText(findTestObject('Object Repository/Page_Bulk Authoring Tool/div_Option C'), '<p style=""><ins class="ice-ins ice-cts" data-cid="2" data-userid="" data-username="" data-changedata="" data-time="1543818612966" data-last-change-time="1543818613987" style="">Option C</ins><br></p>')

WebUI.click(findTestObject('Object Repository/Page_Bulk Authoring Tool/p_4'))

WebUI.setText(findTestObject('Object Repository/Page_Bulk Authoring Tool/div_Option C feedback'), '<p style=""><ins class="ice-ins ice-cts" data-cid="2" data-userid="" data-username="" data-changedata="" data-time="1543818616328" data-last-change-time="1543818620388" style="">Option C feedback</ins><br></p>')

WebUI.click(findTestObject('Object Repository/Page_Bulk Authoring Tool/p_5'))

WebUI.setText(findTestObject('Object Repository/Page_Bulk Authoring Tool/div_Option D'), '<p style=""><ins class="ice-ins ice-cts" data-cid="2" data-userid="" data-username="" data-changedata="" data-time="1543818623227" data-last-change-time="1543818623540" style="">Option D</ins><br></p>')

WebUI.click(findTestObject('Object Repository/Page_Bulk Authoring Tool/p_6'))

WebUI.setText(findTestObject('Object Repository/Page_Bulk Authoring Tool/div_Option D feedback'), '<p style=""><ins class="ice-ins ice-cts" data-cid="2" data-userid="" data-username="" data-changedata="" data-time="1543818626336" data-last-change-time="1543818628071" style="">Option D feedback</ins><br></p>')

WebUI.click(findTestObject('Object Repository/Page_Bulk Authoring Tool/input_Option B_correct_answer'))

WebUI.setText(findTestObject('Object Repository/Page_Bulk Authoring Tool/input_Raptor ID_raptor_id'), 'raptor1234')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Bulk Authoring Tool/select_-- Select one --Writer'), '1', 
    true)

WebUI.click(findTestObject('Object Repository/Page_Bulk Authoring Tool/input_Workflow stage_submit'))

WebUI.click(findTestObject('Object Repository/Page_Bulk Authoring Tool/a_Test User'))

WebUI.click(findTestObject('Object Repository/Page_Bulk Authoring Tool/a_Logout'))

WebUI.closeBrowser()

