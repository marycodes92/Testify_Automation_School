from appium.webdriver.common.mobileby import MobileBy
from .base_page import BasePage


class MenuPage(BasePage):
    MENU_BUTTON = (MobileBy.ACCESSIBILITY_ID, 'open menu')
    LOGIN_BUTTON = (MobileBy.XPATH, '//android.view.ViewGroup[@content-desc="menu item log in"]')

    def open_menu(self):
        self.click(self.MENU_BUTTON)

    def go_to_login(self):
        self.click(self.LOGIN_BUTTON)
