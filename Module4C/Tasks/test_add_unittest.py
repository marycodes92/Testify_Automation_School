import add
import unittest


class TestAdd(unittest.TestCase):
    def test_addition(self):
        self.assertEquals(add.addition(4, 6), 10)
        self.assertEquals(add.addition(2, 1), 3)


if __name__ == '_main_':
    unittest.main()
