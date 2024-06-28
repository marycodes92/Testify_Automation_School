from appium.webdriver.common.mobileby import MobileBy
from .base_page import BasePage


class LoginPage(BasePage):
    USERNAME_INPUT = (MobileBy.ACCESSIBILITY_ID, 'Username input field')
    PASSWORD_INPUT = (MobileBy.ACCESSIBILITY_ID, 'Password input field')
    LOGIN_BUTTON = (MobileBy.XPATH, '//android.view.ViewGroup[@content-desc="Login button"]')
    ERROR_MESSAGE = (
    MobileBy.XPATH, '//android.widget.TextView[@text="Provided credentials do not match any user in this service."]')
    ERROR_MESSAGE_BLANK_USERNAME = (MobileBy.XPATH, '//android.widget.TextView[@text="Username is required"]')

    def enter_username(self, username):
        self.send_keys(self.USERNAME_INPUT, username)

    def enter_password(self, password):
        self.send_keys(self.PASSWORD_INPUT, password)

    def submit_login(self):
        self.click(self.LOGIN_BUTTON)

    def get_error_message(self):
        return self.find_element(self.ERROR_MESSAGE).text

    def get_error_message_blank_username(self):
        return self.find_element(self.ERROR_MESSAGE_BLANK_USERNAME).text