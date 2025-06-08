import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://hasaki.vn/')

WebUI.click(findTestObject('Object Repository/Page_Hasaki.vn  M Phm  Clinic/button_Khng ng'))

WebUI.click(findTestObject('Object Repository/Page_Hasaki.vn  M Phm  Clinic/img_Toner_loaded'))

WebUI.click(findTestObject('Object Repository/Page_Hasaki.vn  M Phm  Clinic/a_ng nhp'))

WebUI.setText(findTestObject('Object Repository/Page_Hasaki.vn  M Phm  Clinic/input_Hoc ng nhp vi Hasaki.vn_username'), 
    '0966265795')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Hasaki.vn  M Phm  Clinic/input_Hoc ng nhp vi Hasaki.vn_password'), 
    'E8armQUHXii2zYsMQioVZA==')

WebUI.click(findTestObject('Object Repository/Page_Hasaki.vn  M Phm  Clinic/button_ng nhp'))

WebUI.click(findTestObject('Object Repository/Page_Hasaki.vn  M Phm  Clinic/img_H trkhch hng_loading'))

qty = WebUI.getAttribute(findTestObject('Object Repository/Page_Gi hng (1 sn phm)  Hasaki.vn/input_Xa_outline-none border-1px px-1.5 tex_31f081'), 
    'value')

WebUI.verifyMatch(qty, '2', false)

WebUI.click(findTestObject('Object Repository/Page_Gi hng (2 sn phm)  Hasaki.vn/input_Xa_outline-none border-1px px-1.5 tex_31f081'))

WebUI.click(findTestObject('Object Repository/Page_Gi hng (2 sn phm)  Hasaki.vn/svg_Xa_text-foreground'))

WebUI.click(findTestObject('Object Repository/Page_Gi hng (1 sn phm)  Hasaki.vn/input_Xa_outline-none border-1px px-1.5 tex_31f081'))

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Page_Gi hng (1 sn phm)  Hasaki.vn/input_Xa_outline-none border-1px px-1.5 tex_31f081'), 
    'value', '1', 5 // timeout in seconds
    )

WebUI.closeBrowser()

