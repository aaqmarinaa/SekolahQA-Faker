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
import com.github.javafaker.Faker as Faker
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://vuln.cilsy.id/')

WebUI.delay(2)

WebUI.click(findTestObject('AuthenticationRepository/Daftar_Repository/PageDaftar/menu_daftar'))

WebUI.delay(2)

Faker faker = new Faker()

WebUI.setText(findTestObject('AuthenticationRepository/Daftar_Repository/PageDaftar/input_username'), username = faker.name().username())

WebUI.setText(findTestObject('AuthenticationRepository/Daftar_Repository/PageDaftar/input_email'), email = faker.internet().emailAddress())

WebUI.setText(findTestObject('AuthenticationRepository/Daftar_Repository/PageDaftar/input_password'), password = faker.internet().password())

WebUI.getNumberOfSelectedOption(findTestObject('AuthenticationRepository/Daftar_Repository/PageDaftar/input_konfirmasiPassword'),
	WebUI.setText(findTestObject('AuthenticationRepository/Daftar_Repository/PageDaftar/input_konfirmasiPassword'), password),
	WebUI.click(findTestObject('AuthenticationRepository/Daftar_Repository/PageDaftar/button_daftar')),
	WebUI.click(findTestObject('AuthenticationRepository/PageNavbarInDashboard/icon_dropdownMenuOfProfile')),
	WebUI.click(findTestObject('AuthenticationRepository/PageNavbarInDashboard/menu_logout')),
	WebUI.closeBrowser())