from appium.webdriver.common.mobileby import MobileBy
from base_page import BasePage


class Cart(BasePage):

    CART_ICON = (MobileBy.ACCESSIBILITY_ID, 'cart badge')
    # //android.view.ViewGroup[@content-desc="cart badge"]

    def get_cart(self):
        pass
