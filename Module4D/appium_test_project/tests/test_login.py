import time
import pytest
from ..utilities.driver_setup import get_driver
from ..pages.menu_page import MenuPage
from ..pages.login_page import LoginPage
# from ..pages.products_page import Products


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


def test_invalid_password(driver, navigate_to_login):
    login_page = navigate_to_login

    login_page.enter_username('bob@example.com')
    login_page.enter_password('afhajehwhjjq')
    login_page.submit_login()

    time.sleep(5)  # Add explicit wait here if needed
    assert 'Provided credentials do not match any user in this service.' in login_page.get_error_message()


def test_login_blank_username(driver, navigate_to_login):
    login_page = navigate_to_login

    login_page.enter_username('')
    login_page.enter_password('10203040')
    login_page.submit_login()

    time.sleep(5)
    assert 'Username is required' in login_page.get_error_message_blank_username()


def test_valid_login(driver, navigate_to_login):
    login_page = navigate_to_login

    login_page.enter_username('bob@example.com')
    login_page.enter_password('10203040')
    login_page.submit_login()

    time.sleep(5)
    # products = Products(driver)
    # products.get_product_page().is_displayed()
