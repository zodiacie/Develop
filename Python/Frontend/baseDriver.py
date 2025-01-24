from selenium import webdriver
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.common.keys import Keys
from time import sleep 

class chromeDriver:
    def __init__(self):
        driverpath = "C:\\Users\\woxia\\Desktop\\DOCS\\Automation\\Drivers\\chromedriver.exe"
        options = webdriver.ChromeOptions()
        options.add_experimental_option('useAutomationExtension', False)
        options.add_argument("--start-maximized")
        self.driver = webdriver.Chrome(options=options, executable_path=driverpath)