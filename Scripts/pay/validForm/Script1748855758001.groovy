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

WebUI.click(findTestObject('Object Repository/Page_Hasaki.vn  M Phm  Clinic/button_Khng ng (17)'))

WebUI.click(findTestObject('Object Repository/Page_Hasaki.vn  M Phm  Clinic/img_Toner_loaded (13)'))

WebUI.click(findTestObject('Object Repository/Page_Hasaki.vn  M Phm  Clinic/a_ng nhp (16)'))

WebUI.setText(findTestObject('Object Repository/Page_Hasaki.vn  M Phm  Clinic/input_Hoc ng nhp vi Hasaki.vn_username (16)'), 
    '0889241887')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Hasaki.vn  M Phm  Clinic/input_Hoc ng nhp vi Hasaki.vn_password (16)'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Page_Hasaki.vn  M Phm  Clinic/button_ng nhp (16)'))

WebUI.click(findTestObject('Object Repository/Page_Hasaki.vn  M Phm  Clinic/img_H trkhch hng_loading (16)'))

WebUI.click(findTestObject('Object Repository/Page_Gi hng (1 sn phm)  Hasaki.vn/button_Tin hnh t hng (15)'))

WebUI.setText(findTestObject('Object Repository/Page_Thanh ton  Hasaki.vn/input_Thm a ch mi_telephone (13)'), '0966265795')

WebUI.setText(findTestObject('Object Repository/Page_Thanh ton  Hasaki.vn/input_Identification Card Icon_full_name (11)'), 
    '')

WebUI.click(findTestObject('Object Repository/Page_Thanh ton  Hasaki.vn/input_Identification Card Icon_full_name (11)'))

WebUI.setText(findTestObject('Object Repository/Page_Thanh ton  Hasaki.vn/input_Identification Card Icon_full_name (11)'), 
    'nguyễn văn a')

WebUI.click(findTestObject('Object Repository/Page_Thanh ton  Hasaki.vn/button_Chn Tnh TP, Qun HuynCaret Down Icon (6)'))

WebUI.click(findTestObject('Object Repository/Page_Thanh ton  Hasaki.vn/div_H Ch Minh - Qun 1 (6)'))

WebUI.click(findTestObject('Object Repository/Page_Thanh ton  Hasaki.vn/button_Chn Phng XCaret Down Icon (5)'))

WebUI.click(findTestObject('Object Repository/Page_Thanh ton  Hasaki.vn/div_Phng Tn nh (5)'))

WebUI.click(findTestObject('Object Repository/Page_Thanh ton  Hasaki.vn/button_S nh  Tn ng (4)'))

WebUI.click(findTestObject('Object Repository/Page_Thanh ton  Hasaki.vn/input_Sa v tr trn bn_flex h-11 w-full py-2._a50923 (4)'))

WebUI.setText(findTestObject('Object Repository/Page_Thanh ton  Hasaki.vn/input_Sa v tr trn bn_flex h-11 w-full py-2._a50923_1 (4)'), 
    '4A, Ngõ 6')

WebUI.click(findTestObject('Object Repository/Page_Thanh ton  Hasaki.vn/button_Tip tc (13)'))

WebUI.click(findTestObject('Object Repository/Page_Thanh ton  Hasaki.vn/button_Tip tc_1 (2)'))

