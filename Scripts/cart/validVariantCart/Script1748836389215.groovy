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

WebUI.click(findTestObject('Object Repository/Page_Hasaki.vn  M Phm  Clinic/img_Toner_loading'))

WebUI.click(findTestObject('Object Repository/Page_Hasaki.vn  M Phm  Clinic/a_ng nhp'))

WebUI.setText(findTestObject('Object Repository/Page_Hasaki.vn  M Phm  Clinic/input_Hoc ng nhp vi Hasaki.vn_username'), 
    '0833204787')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Hasaki.vn  M Phm  Clinic/input_Hoc ng nhp vi Hasaki.vn_password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Page_Hasaki.vn  M Phm  Clinic/button_ng nhp'))

WebUI.setText(findTestObject('Object Repository/Page_Hasaki.vn  M Phm  Clinic/input_Toner_q'), 'Nước tẩy trang')

WebUI.click(findTestObject('Object Repository/Page_Hasaki.vn  M Phm  Clinic/img_Toner_icon_search loading'))

WebUI.click(findTestObject('Object Repository/Page_Mua Nc Ty Trang Mt Chnh Hng 100 Gia Tt_646436/img_Hin th 60_photo image img_thumb_sub loading'))

WebUI.click(findTestObject('Object Repository/Page_Combo 2 Nc Ty Trang B ao Cocoon Lm Sch_17cd7b/a_140ml'))

WebUI.click(findTestObject('Object Repository/Page_Nc Ty Trang Cocoon B ao Lm Sch  Gim Du_5fec36/div_Cart plus iconGi hng'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Nc Ty Trang Cocoon B ao Lm Sch  Gim Du_5fec36/div_Sn Phm  c thm vo gi hng thnh cng'), 
    'Sản Phẩm đã được thêm vào giỏ hàng thành công')

WebUI.click(findTestObject('Object Repository/Page_Nc Ty Trang Cocoon B ao Lm Sch  Gim Du_5fec36/svg_Sn Phm  c thm vo gi hng thnh cng_h-4 w-4'))

WebUI.click(findTestObject('Object Repository/Page_Nc Ty Trang Cocoon B ao Lm Sch  Gim Du_5fec36/svg'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Gi hng (3 sn phm)  Hasaki.vn/a_Nc Ty Trang Cocoon B ao Lm Sch  Gim Du 140ml'), 
    'Nước Tẩy Trang Cocoon Bí Đao Làm Sạch & Giảm Dầu 140ml')

