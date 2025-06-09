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

WebUI.click(findTestObject('Object Repository/Page_Hasaki.vn  M Phm  Clinic/button_Khng ng (2)'))

WebUI.click(findTestObject('Object Repository/Page_Hasaki.vn  M Phm  Clinic/img_Toner_loaded (1)'))

WebUI.click(findTestObject('Object Repository/Page_Hasaki.vn  M Phm  Clinic/a_ng nhp (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Hasaki.vn  M Phm  Clinic/input_Hoc ng nhp vi Hasaki.vn_username (1)'), 
    '0889241887')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Hasaki.vn  M Phm  Clinic/input_Hoc ng nhp vi Hasaki.vn_password (1)'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Page_Hasaki.vn  M Phm  Clinic/button_ng nhp (1)'))

WebUI.click(findTestObject('Object Repository/Page_Hasaki.vn  M Phm  Clinic/img_H trkhch hng_loading (1)'))

WebUI.click(findTestObject('Object Repository/Page_Gi hng (1 sn phm)  Hasaki.vn/button_Tin hnh t hng (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Thanh ton  Hasaki.vn/input_Thm a ch mi_telephone (1)'), '098563826482764824')

WebUI.click(findTestObject('Object Repository/Page_Thanh ton  Hasaki.vn/button_Tip tc (6)'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Thanh ton  Hasaki.vn/p_S in thoi khng hp l (1)'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Thanh ton  Hasaki.vn/p_S in thoi khng hp l (1)'), 'Số điện thoại không hợp lệ')

