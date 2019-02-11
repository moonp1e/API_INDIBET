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

WebUI.openBrowser('https://agents.indibet.com/profile')

WebUI.click(findTestObject('create_player/i_adduser'))

WebUI.click(findTestObject('create_player/span_account_type'))

WebUI.setText(findTestObject('create_player/input_account_type'), 'player')

WebUI.sendKeys(findTestObject('create_player/input_account_type'), Keys.chord(Keys.ENTER))

WebUI.selectOptionByLabel(findTestObject('create_player/div_countrymanager'), 'countrymanager-loadtest - (1.00%)', false)

WebUI.selectOptionByLabel(findTestObject('create_player/div_masteragent'), 'shanti.ayyar - (1.00%)', false)

WebUI.setText(findTestObject('create_player/input_emailadd'), '')

WebUI.setText(findTestObject('create_player/input_password'), '')

WebUI.setText(findTestObject('create_player/input_confirmpass'), '')

WebUI.click(findTestObject('create_player/input_amount'))

WebUI.clearText(findTestObject('create_player/input_amount'))

WebUI.setText(findTestObject('create_player/input_amount'), '100000000')

WebUI.setText(findTestObject('create_player/button_submit'), '100M')

WebUI.setText(findTestObject('create_player/input_firstname'), '')

WebUI.setText(findTestObject('create_player/input_lastname'), '')

WebUI.setText(findTestObject('create_player/input_mobilenumber'), '')

WebUI.setText(findTestObject('create_player/textarea_address'), '')

WebUI.click(findTestObject('create_player/button_submit'))

