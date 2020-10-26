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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import com.github.javafaker as JavaFaker

WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl('https://vuln.cilsy.id/')
WebUI.click(findTestObject('AuthenticationRepository/PageNavbarInDashboard/menu_masuk'))
WebUI.delay(2)
WebUI.setText(findTestObject('AuthenticationRepository/MasukRepository/PageMasuk/input_email'), 'usercilsy05@mail.com')
WebUI.setEncryptedText(findTestObject('AuthenticationRepository/MasukRepository/PageMasuk/input_password'), 'dixL9v+xVGD8HksABks3VA==')
WebUI.click(findTestObject('AuthenticationRepository/MasukRepository/PageMasuk/button_masuk'))
WebUI.delay(3)
WebUI.click(findTestObject('AuthenticationRepository/PageNavbarInDashboard/icon_dropdownMenuOfProfile'))
WebUI.click(findTestObject('AuthenticationRepository/PageNavbarInDashboard/menu_logout'))
WebUI.delay(3)
WebUI.closeBrowser()