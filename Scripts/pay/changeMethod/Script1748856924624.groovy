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

WebUI.click(findTestObject('Object Repository/Page_Gi hng (1 sn phm)  Hasaki.vn/button_Tin hnh t hng'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Thanh ton  Hasaki.vn/h2_Hnh thc thanh ton'), 'Hình thức thanh toán')

WebUI.click(findTestObject('Object Repository/Page_Thanh ton  Hasaki.vn/button_Thay i'))

WebUI.click(findTestObject('Object Repository/Page_Thanh ton  Hasaki.vn/p_Th ATM ni aInternet Banking (H tr Interne_e8be9c'))

WebUI.click(findTestObject('Object Repository/Page_Thanh ton  Hasaki.vn/button_Tip tc'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Thanh ton  Hasaki.vn/div_Cp nht hnh thc thanh ton thnh cng'), 
    'Cập nhật hình thức thanh toán thành công')

WebUI.click(findTestObject('Object Repository/Page_Thanh ton  Hasaki.vn/svg_Cp nht hnh thc thanh ton thnh cng_h-4 w-4'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Thanh ton  Hasaki.vn/p_Th ATM ni aInternet Banking (H tr Interne_e8be9c_1'), 
    'Thẻ ATM nội địa/Internet Banking (Hỗ trợ Internet Banking)')

WebUI.closeBrowser()

