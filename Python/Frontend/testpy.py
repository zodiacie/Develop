'''
Created on May 19, 2020

@author: WoXia
'''
# coding=gbk
print("hello world")

from selenium import webdriver
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.common.keys import Keys
import time

driverpath = "C:\\Users\\woxia\\Desktop\\DOCS\\QA\\Automation\\Drivers\\chromedriver.exe"

options = webdriver.ChromeOptions()
options.add_experimental_option('useAutomationExtension', False)
options.add_argument("--start-maximized")
driver = webdriver.Chrome(options=options, executable_path=driverpath)

driver.get("https://cibcsit.service-now.com/cibcport")

time.sleep(20)

business = driver.find_element_by_xpath('//*[@id="x7cf4c016dbab63005d46d7bb5e961997"]/div[1]/ul/li[2]/a/span')

business.click()

time.sleep(5)

ba = driver.find_element_by_xpath('//*[@id="body"]/div[2]/div/div[2]/a/div/div[2]/div/p')

'''
wait = WebDriverWait(driver, 10)
men_menu = wait.until(expected_conditions.visibility_of_element_located((By.XPATH, "//a[@data-tracking-id='men']")))
'''

ba.click()

time.sleep(5)

catalogitem = driver.find_element_by_link_text('Hardware')

'''find_element_by_xpath('//*[@id="xe183cfc9db5c7f001ccbdd8b5e961991"]/div[1]/div/div/div/div[3]/div/div[1]/div/div/a')'''

catalogitem.click()

time.sleep(5)
driver.find_element_by_xpath('//*[@id="xe183cfc9db5c7f001ccbdd8b5e961991"]/div[2]/div/div/div/div[3]/div/div[1]/div/a/div/div[1]/h2').click()

time.sleep(8)
typerequest = driver.find_element_by_id('select2-chosen-4') 
typerequest.click()

requestvalue = driver.find_element_by_xpath('//*[@id="s2id_autogen4_search"]')
requestvalue.send_keys("Add")
requestvalue.send_keys(Keys.ENTER)

time.sleep(2)
desktoptype = driver.find_element_by_id('select2-chosen-5')
desktoptype.click()

desktopvalue = driver.find_element_by_xpath('//*[@id="s2id_autogen5_search"]')
desktopvalue.send_keys("CIBC Standard")
time.sleep(1)
desktopvalue.send_keys(Keys.ENTER)

location = driver.find_element_by_xpath('//*[@id="select2-chosen-7"]')
location.click()      

locationvalue = driver.find_element_by_xpath('//*[@id="s2id_autogen7_search"]')
locationvalue.send_keys("Yes")
time.sleep(1)
locationvalue.send_keys(Keys.ENTER)

keyboard = driver.find_element_by_xpath('//*[@id="select2-chosen-8"]')
keyboard.click()

keyboardvalue = driver.find_element_by_xpath('//*[@id="s2id_autogen8_search"]')
keyboardvalue.send_keys("French keyboard with French software")
time.sleep(1)
keyboardvalue.send_keys(Keys.ENTER)

monitor = driver.find_element_by_xpath('//*[@id="select2-chosen-9"]')
monitor.click()

monitorvalue = driver.find_element_by_xpath('//*[@id="s2id_autogen9_search"]')
monitorvalue.send_keys("Yes")
time.sleep(1)
monitorvalue.send_keys(Keys.ENTER)

time.sleep(1)
submitbn = driver.find_element_by_xpath('//*[@id=\"sc_cat_item\"]/div[1]/div/div/div[3]/div/span/button')
submitbn.click()

time.sleep(5)
chkoutbn1 = driver.find_element_by_xpath('//*[@id=\"sc_cat_item\"]/div[1]/div/div/div[3]/div/span/a[1]')
chkoutbn1.click()

time.sleep(3)
chkoutbn2 = driver.find_element_by_xpath('//*[@id=\"x44001e05dbf7af001ccbdd8b5e9619be\"]/div/div/div[1]/div/div/div[2]/button')
chkoutbn2.click()

'''Approval'''
time.sleep(20)
reqnum = driver.find_element_by_xpath ('//*[@id="x10ced8b3dbcef7c01ccbdd8b5e96194a"]/div/div/div[2]/div/div/ul/li/div[2]/div[2]/p').text
print(reqnum)

reqnum2 = reqnum[0:10]

print(reqnum2)

driver.get("https://cibcsit.service-now.com")

time.sleep(5)
namedropdown = driver.find_element_by_xpath('//*[@id=\"user_info_dropdown\"]')
namedropdown.click()

impersonate = driver.find_element_by_xpath('//*[@id=\"glide_ui_impersonator\"]')
impersonate.click()

searchuser = driver.find_element_by_xpath('//*[@id=\"select2-chosen-2\"]')
searchuser.click()

uservalue = driver.find_element_by_xpath('//*[@id=\"s2id_autogen2_search\"]')
uservalue.send_keys('Nella Bogdanovic')
time.sleep(3)
uservalue.send_keys(Keys.ENTER)

time.sleep(10)
approvalink = driver.find_element_by_xpath('//*[@id=\"8fbcec58d4dd9800929e197930ab157e\"]')
approvalink.click()

driver.switch_to.frame('gsft_main')
time.sleep(10)
driver.find_element_by_partial_link_text(reqnum2).click()

time.sleep(5)
driver.find_element_by_xpath('//*[@id=\"tabs2_list\"]/span[2]/span/span[2]').click()

time.sleep(3)
driver.find_element_by_xpath('//table[@id="sc_request.sysapproval_approver.sysapproval_table"]/tbody/tr/td[3]/a').click()

time.sleep(2)
driver.find_element_by_xpath('//*[@id=\"approve_bottom\"]').click()

'''Task Fulfillment'''
time.sleep(5)
driver.switch_to_default_content()

time.sleep(5)
namedropdown = driver.find_element_by_xpath('//*[@id=\"user_info_dropdown\"]')
namedropdown.click()

impersonate = driver.find_element_by_xpath('//*[@id=\"glide_ui_impersonator\"]')
impersonate.click()

searchuser = driver.find_element_by_xpath('//*[@id=\"select2-chosen-2\"]')
searchuser.click()

uservalue = driver.find_element_by_xpath('//*[@id=\"s2id_autogen2_search\"]')
uservalue.send_keys('Tony Panoff')
time.sleep(3)
uservalue.send_keys(Keys.ENTER)

time.sleep(5)
search = driver.find_element_by_xpath('/html/body/div[5]/div/div/header/div[1]/div/div[2]/div/div[4]/form/div/label/span')
search.click()

searchinput = driver.find_element_by_xpath('//*[@id=\"sysparm_search\"]')
searchinput.send_keys(reqnum2)
time.sleep(90)
searchinput.send_keys(Keys.ENTER)

driver.switch_to_frame("gsft_main")

time.sleep(5)
driver.find_element_by_xpath('//*[@id="tabs2_list"]/span[1]/span/span[2]').click()
time.sleep(5)
driver.find_element_by_partial_link_text('RITM').click()

time.sleep(5)
driver.find_element_by_xpath('//table[@id="sc_req_item.sc_task.request_item_table"]/tbody/tr/td[3]/a').click()

time.sleep(5)
driver.find_element_by_id('sys_display.sc_task.assigned_to').send_keys("Tony Panoff (panoffto)")
driver.find_element_by_id('sys_display.sc_task.assigned_to').send_keys(Keys.ENTER)
driver.find_element_by_id('sc_task.work_notes').send_keys("Test")
driver.find_element_by_id('sc_task.u_alm_vendor_instructions').send_keys("Test")

time.sleep(5)
driver.find_element_by_xpath('//*[@id=\"u_complete_task_bottom\"]').click()