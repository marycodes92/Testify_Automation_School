import time
import pytest
from ..utilities.driver_setup import get_driver
from ..pages.menu_page import MenuPage
from ..pages.login_page import LoginPage
from ..pages.products_page import ProductPage
from ..pages.cart_page import Cart
from ..pages.checkout_page import Checkout


@pytest.fixture
def driver():
    driver = get_driver()
    yield driver
    driver.quit()


@pytest.fixture
def navigate_to_login(driver):
    menu_page = MenuPage(driver)
    login_page = LoginPage(driver)

    # Navigate to Login page
    menu_page.open_menu()
    menu_page.go_to_login()
    return login_page


@pytest.fixture
def go_to_products(driver):
    product_page = ProductPage(driver)
    return product_page


@pytest.fixture
def go_to_cart(driver):
    cart = Cart(driver)
    return cart


@pytest.fixture
def go_to_checkout(driver):
    checkout = Checkout(driver)
    return checkout


def test_purchase_items_and_checkout(driver, navigate_to_login, go_to_products, go_to_cart, go_to_checkout):
    login_page = navigate_to_login
    product_page = go_to_products
    cart = go_to_cart
    checkout = go_to_checkout

    # login
    login_page.enter_username('bob@example.com')
    login_page.enter_password('10203040')
    login_page.submit_login()
    time.sleep(3)

    # add items to cart
    product_page.select_item_1()
    product_page.get_add_to_cart_btn()
    time.sleep(3)
    driver.back()

    time.sleep(3)
    product_page.select_item_2()
    product_page.get_add_to_cart_btn()
    time.sleep(3)
    driver.back()

    time.sleep(3)
    product_page.select_item_3()
    product_page.get_add_to_cart_btn()
    driver.back()

    time.sleep(3)
    product_page.select_item_4()
    product_page.get_add_to_cart_btn()
    driver.back()

    time.sleep(3)
    product_page.select_item_5()
    product_page.get_add_to_cart_btn()
    driver.back()

    time.sleep(3)
    product_page.select_item_6()
    product_page.get_add_to_cart_btn()
    driver.back()

    # go to cart page
    cart.get_cart_page()
    time.sleep(3)

    # validate items

    # Remove items from cart
    cart.remove_item_from_cart()
    time.sleep(2)

    cart.remove_item_from_cart()
    time.sleep(2)

    # assert number of items remaining in cart

    # proceed to checkout
    cart.get_checkout_button()
    time.sleep(3)

    # input shipping details
    checkout.enter_fullname('Mary Onuorah')
    checkout.enter_address('Fara Park Estate')
    checkout.enter_city('Ajah')
    checkout.enter_state('Lagos')
    checkout.enter_zip_code('106104')
    checkout.enter_country('Nigeria')
    checkout.get_payment_btn()
    time.sleep(3)

    assert checkout.confirm_payment_page().is_displayed()

    # imput payment details
    checkout.enter_fullname('Mary Onuorah')
    checkout.enter_card_number('4242424242424242')
    checkout.enter_expiry('10/24')
    checkout.enter_security_code('123')
    checkout.get_review_button()
    time.sleep(3)

    # Review order
    checkout.get_place_order_btn()
    assert 'Thank you for your order' in checkout.get_success_message()