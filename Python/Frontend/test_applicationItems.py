import unittest
from baseDriver import chromeDriver

class applicationItems(unittest.TestCase):
    def testapplicationItems(self):
        app = chromeDriver()
        app.driver.get("https://www.google.com")
        '''app.driver.close()'''

if __name__=='__main__':
    unittest.main()