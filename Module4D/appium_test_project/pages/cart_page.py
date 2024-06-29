from appium.webdriver.common.mobileby import MobileBy
from .base_page import BasePage


class Cart(BasePage):
    CART_ICON = (MobileBy.ACCESSIBILITY_ID, 'cart badge')
    ITEMS = (MobileBy.XPATH, '//android.widget.TextView[@content-desc="product label"]')
    REMOVE_ITEM = (MobileBy.XPATH, '(//android.widget.TextView[@text="Remove Item"])[1]')
    CHECKOUT_BUTTON = (MobileBy.ACCESSIBILITY_ID, 'Proceed To Checkout button')

    def get_cart_page(self):
        self.click(self.CART_ICON)

    def get__all_items_in_cart(self):
        return self.find_elements(self.ITEMS)

    def get_cart_item_names(self):
        items = self.get__all_items_in_cart()
        return [item.text for item in items]

    def remove_item_from_cart(self):
        self.click(self.REMOVE_ITEM)

    def get_checkout_button(self):
        self.click(self.CHECKOUT_BUTTON)
