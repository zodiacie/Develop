import unittest
import requests
'''import sys'''

class test_api(unittest.TestCase):
    def test_apirequst(self):
        res = requests.get("https://reqres.in/api/users?page=2")
        '''if res == 200:'''
        print(res.json())

if __name__=='__main__':
    unittest.main() 
