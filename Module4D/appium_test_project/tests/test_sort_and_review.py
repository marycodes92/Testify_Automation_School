import time
import pytest
from ..utilities.driver_setup import get_driver
from ..pages.menu_page import MenuPage
from ..pages.login_page import LoginPage
from ..pages.products_page import ProductPage


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


def test_sort_price_ascending(driver, navigate_to_login, go_to_products):
    login_page = navigate_to_login
    product_page = go_to_products

    # login
    login_page.enter_username('bob@example.com')
    login_page.enter_password('10203040')
    login_page.submit_login()

    # sort items by price in ascending order
    product_page.get_sort_icon()
    time.sleep(3)
    product_page.sort_price_by_ascending()
    time.sleep(3)

    # Give five star review
    product_page.give_five_start_review()
    time.sleep(5)
    assert 'Thank you for submitting your review!' in product_page.get_review_message()
    product_page.get_close_modal_btn()
