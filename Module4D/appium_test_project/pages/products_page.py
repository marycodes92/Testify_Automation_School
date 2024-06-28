from appium.webdriver.common.mobileby import MobileBy
from base_page import BasePage


class Products(BasePage):
    PRODUCTS_PAGE = (MobileBy.LINK_TEXT, 'Products')
    SORT_BUTTON = (MobileBy.XPATH, '//android.view.ViewGroup[@content-desc="sort button"]')
    PRICE_ASC = (MobileBy.XPATH, '//android.view.ViewGroup[@content-desc="priceAsc"]')
    ITEM1 = (MobileBy.XPATH, '(//android.view.ViewGroup[@content-desc="store item"])[1]/android.view.ViewGroup[1]')
    ITEM2 = (MobileBy.XPATH, '(//android.view.ViewGroup[@content-desc="store item"])[2]/android.view.ViewGroup[1]')
    ITEM3 = (MobileBy.XPATH, '(//android.view.ViewGroup[@content-desc="store item"])[3]/android.view.ViewGroup[1]')
    ITEM4 = (MobileBy.XPATH, '(//android.view.ViewGroup[@content-desc="store item"])[4]/android.view.ViewGroup[1]')
    ITEM5 = (MobileBy.XPATH, '(//android.view.ViewGroup[@content-desc="store item"])[3]/android.view.ViewGroup[1]')
    ITEM6 = (MobileBy.XPATH, '(//android.view.ViewGroup[@content-desc="store item"])[4]/android.view.ViewGroup[1]')
    FIVE_STAR = (MobileBy.XPATH, '(//android.view.ViewGroup[@content-desc="review star 5"])[1]')
    REVIEW_MESSAGE = (MobileBy.XPATH, '//android.widget.TextView[@text="Thank you for submitting your review!"]')
    CLOSE_MODAL_BUTTON = (MobileBy.ACCESSIBILITY_ID, 'Close Modal button')
    ADD_TO_CART = (MobileBy.ACCESSIBILITY_ID, 'Add To Cart button')

    def get_product_page(self):
        return self.find_element(self.PRODUCTS_PAGE)

    def get_sort_icon(self):
        self.click(self.SORT_BUTTON)

    def give_five_start_review(self):
        self.click(self.FIVE_STAR)

    def get_add_to_cart_btn(self):
        self.click(self.ADD_TO_CART)

    def sort_price_by_ascending(self):
        self.click(self.PRICE_ASC)

    def select_item_1(self):
        self.click(self.ITEM1)

    def select_item_2(self):
        self.click(self.ITEM2)

    def select_item_3(self):
        self.click(self.ITEM3)

    def select_item_4(self):
        self.click(self.ITEM4)

    def select_item_5(self):
        self.click(self.ITEM5)

    def select_item_6(self):
        self.click(self.ITEM6)

    def get_review_message(self):
        return self.find_element(self.REVIEW_MESSAGE).text

    def get_close_modal_btn(self):
        self.click(self.CLOSE_MODAL_BUTTON)

