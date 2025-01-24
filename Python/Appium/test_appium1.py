from appium import webdriver
from appium.webdriver.common.touch_action import TouchAction
from appium.webdriver.common.multi_action import MultiAction
import time

caps = {}
caps["automationName"] = "Appium"
caps["platformName"] = "Android"
caps["platformVersion"] = "8.1"
caps["deviceName"] = "127.0.0.1:5554"

driver = webdriver.Remote('http://127.0.0.1:4723/wd/hub', caps)
el1 = driver.find_element_by_xpath("(//android.widget.TextView[@content-desc=\"Chrome\"])[2]")
el1.click()
time.sleep(3)
driver.back()