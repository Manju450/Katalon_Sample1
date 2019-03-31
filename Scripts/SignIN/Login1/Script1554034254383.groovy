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

WebUI.navigateToUrl('http://newtours.demoaut.com/')

WebUI.setText(findTestObject('Object Repository/Login_Page/Page_Welcome Mercury Tours/input_User'), 'manju450')

WebUI.setEncryptedText(findTestObject('Object Repository/Login_Page/Page_Welcome Mercury Tours/input_Password_password'), 
    'WAFb3tzi4gc=')

WebUI.click(findTestObject('Object Repository/Login_Page/Page_Welcome Mercury Tours/input_Password_login'))

WebUI.click(findTestObject('Object Repository/Login_Page/Page_Find a Flight Mercury Tours/td_SIGN-OFF'))

WebUI.closeBrowser()

