import unittest
import BeautifulReport

class unitest(unittest.TestCase):
    def testmultiple(self):
        case_dir = r"C:\Users\woxia\Desktop\DOCS\Automation\Coding\TestPython\test"
        discover = unittest.defaultTestLoader.discover(case_dir,pattern='test_*.py',top_level_dir=None)
        result = BeautifulReport.BeautifulReport(discover)
        result.report(filename='report',description='testingreport',report_dir=r"C:\Users\woxia\Desktop\DOCS\Automation\Coding\TestPython\test")

if __name__ == "__main__":
    unittest.main()