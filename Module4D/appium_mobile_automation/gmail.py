import time

from appium import webdriver
from appium.webdriver.common.mobileby import MobileBy
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

def main():
    desired_caps = {
        "deviceName": "Android Emulator",
        "automationName": "UiAutomator2",
        "platformName": "Android",
        "platformVersion": "11",
        "appPackage": "com.google.android.gms",
        "appActivity": "GoogleApiActivity",
        "noSign": True
    }

    driver = webdriver.Remote(command_executor="http://127.0.0.1:4723", desired_capabilities=desired_caps)
    deviceElement = WebDriverWait(driver, 5).until(EC.element_to_be_clickable((MobileBy.XPATH("//android.widget.TextView[@text='GOT IT']"))))
    deviceElement.click()
    time.sleep()
    driver.quit()

if __name__ == '__main__':
    main()