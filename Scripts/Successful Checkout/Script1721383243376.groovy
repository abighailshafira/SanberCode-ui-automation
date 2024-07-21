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

WebUI.click(findTestObject('Cart/button_checkout'))

WebUI.setText(findTestObject('Cart/input_firstName'), 'John')

WebUI.setText(findTestObject('Cart/input_lastName'), 'Doe')

WebUI.setText(findTestObject('Cart/input_postalCode'), '12345')

WebUI.click(findTestObject('Cart/button_continue'))

WebUI.click(findTestObject('Cart/button_finish'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), 'https://www.saucedemo.com/checkout-complete.html', false)

WebUI.verifyElementVisible(findTestObject('Cart/complete_header'))

WebUI.verifyElementText(findTestObject('Cart/complete_header'), 'Thank you for your order!')

WebUI.verifyElementVisible(findTestObject('Cart/complete_text'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Cart/complete_text'), 'Your order has been dispatched, and will arrive just as fast as the pony can get there!')

WebUI.verifyElementVisible(findTestObject('Cart/button_back_home'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Cart/button_back_home'))

WebUI.closeBrowser()

