import unittest
import time
from baseDriver import chromeDriver


class incident(unittest.TestCase):
    def testincident(self):
        incident = chromeDriver()
        incident.driver.get("https://cibcsit.service-now.com/")
        time.sleep(50)
        '''incident.driver.close()'''

if __name__=='__main__':
    unittest.main()