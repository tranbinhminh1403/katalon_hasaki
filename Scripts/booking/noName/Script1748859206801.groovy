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
    '0833204787')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Hasaki.vn  M Phm  Clinic/input_Hoc ng nhp vi Hasaki.vn_password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Page_Hasaki.vn  M Phm  Clinic/button_ng nhp'))

WebUI.click(findTestObject('Object Repository/Page_Hasaki.vn  M Phm  Clinic/img_Mua L C Qu_lazy loaded'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Booking SPA  Hasaki.vn/input__fullName'))

WebUI.setText(findTestObject('Object Repository/Page_Booking SPA  Hasaki.vn/input__fullName'), '')

WebUI.click(findTestObject('Object Repository/Page_Booking SPA  Hasaki.vn/button_t hn'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Booking SPA  Hasaki.vn/div_Vui lng nhp h tn_1'), 'Vui lòng nhập họ tên !')

