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

WebUI.setText(findTestObject('Object Repository/Page_Hasaki.vn  M Phm  Clinic/input_Toner_q'), 'dầu gội khô')

WebUI.click(findTestObject('Object Repository/Page_Hasaki.vn  M Phm  Clinic/img_Toner_icon_search loading'))

WebUI.click(findTestObject('Object Repository/Page_Mua Du Gi Kh Chnh Hng 100 Ti Hasaki.vn_fccb9c/strong_Girlz Only'))

WebUI.click(findTestObject('Object Repository/Page_Du Gi Kh Girlz Only Tc Bng Bnh Tc Th 2_79639b/img_Nu_m-auto rounded-2px'))

WebUI.click(findTestObject('Object Repository/Page_Du Gi Kh Girlz Only Cho Tc Nu, Ti Mu 2_53b6a0/div_Cart plus iconGi hng'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Du Gi Kh Girlz Only Cho Tc Nu, Ti Mu 2_53b6a0/div_Sn Phm  c thm vo gi hng thnh cng'), 
    'Sản Phẩm đã được thêm vào giỏ hàng thành công')

WebUI.click(findTestObject('Object Repository/Page_Du Gi Kh Girlz Only Cho Tc Nu, Ti Mu 2_53b6a0/path'))

WebUI.click(findTestObject('Object Repository/Page_Du Gi Kh Girlz Only Cho Tc Nu, Ti Mu 2_53b6a0/path'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Gi hng (2 sn phm)  Hasaki.vn/a_Girlz Only'), 'Girlz Only')

