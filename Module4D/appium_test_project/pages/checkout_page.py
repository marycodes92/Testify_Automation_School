from appium.webdriver.common.mobileby import MobileBy
from .base_page import BasePage


class Checkout(BasePage):
    FULLNAME_INPUT = (MobileBy.ACCESSIBILITY_ID, 'Full Name* input field')
    ADDRESS_LINE_1 = (MobileBy.ACCESSIBILITY_ID, 'Address Line 1* input field')
    CITY_INPUT = (MobileBy.ACCESSIBILITY_ID, 'City* input field')
    STATE_INPUT = (MobileBy.ACCESSIBILITY_ID, 'State/Region input field')
    ZIP_CODE_INPUT = (MobileBy.ACCESSIBILITY_ID, 'Zip Code* input field')
    COUNTRY_INPUT = (MobileBy.ACCESSIBILITY_ID, 'Country* input field')
    PAYMENT_BUTTON = (MobileBy.ACCESSIBILITY_ID, 'To Payment button')
    CONFIRM_PAYMENT_PAGE = (MobileBy.XPATH, '//android.widget.TextView[@text="Enter a payment method"]')
    CARD_NUMBER_INPUT = (MobileBy.XPATH, '//android.widget.EditText[@content-desc="Card Number* input field"]')
    EXPIRY_DATE_INPUT = (MobileBy.XPATH, '//android.widget.EditText[@content-desc="Expiration Date* input field"]')
    SECURITY_CODE_INPUT = (MobileBy.XPATH, '//android.widget.EditText[@content-desc="Security Code* input field"]')
    REVIEW_ORDER_BUTTON = (MobileBy.XPATH, '//android.view.ViewGroup[@content-desc="Review Order button"]')
    PLACE_ORDER_BUTTON = (MobileBy.ACCESSIBILITY_ID, 'Place Order button')
    SUCCESS_MESSAGE = (MobileBy.XPATH, '//android.widget.TextView[@text="Thank you for your order"]')

    def enter_fullname(self, fullname):
        self.send_keys(self.FULLNAME_INPUT, fullname)

    def enter_address(self, address):
        self.send_keys(self.ADDRESS_LINE_1, address)

    def enter_city(self, city):
        self.send_keys(self.CITY_INPUT, city)

    def enter_state(self, state):
        self.send_keys(self.STATE_INPUT, state)

    def enter_zip_code(self, zipcode):
        self.send_keys(self.ZIP_CODE_INPUT, zipcode)

    def enter_country(self, country):
        self.send_keys(self.COUNTRY_INPUT, country)

    def get_payment_btn(self):
        self.click(self.PAYMENT_BUTTON)

    def enter_card_number(self, card_number):
        self.send_keys(self.CARD_NUMBER_INPUT, card_number)

    def enter_expiry(self, expiry):
        self.send_keys(self.EXPIRY_DATE_INPUT, expiry)

    def enter_security_code(self, code):
        self.send_keys(self.SECURITY_CODE_INPUT, code)

    def get_review_button(self):
        self.click(self.REVIEW_ORDER_BUTTON)

    def get_place_order_btn(self):
        self.click(self.PLACE_ORDER_BUTTON)

    def get_success_message(self):
        return self.find_element(self.SUCCESS_MESSAGE).text

    def confirm_payment_page(self):
        return self.find_element(self.CONFIRM_PAYMENT_PAGE)
