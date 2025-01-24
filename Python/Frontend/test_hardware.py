import unittest
from baseDriver import chromeDriver

class hardware(unittest.TestCase):
    def testhardware(self):
        desktop = chromeDriver()
        desktop.driver.get("https://www.google.com")
        desktop.driver.close()
    
if __name__=='__main__':
    unittest.main()  