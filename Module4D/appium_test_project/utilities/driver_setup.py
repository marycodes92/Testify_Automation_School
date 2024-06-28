from appium import webdriver


def get_driver():
    desired_caps = {
        "deviceName": "Android Emulator",
        "automationName": "UiAutomator2",
        "platformName": "Android",
        "platformVersion": "11",
        "app": "/Users/maryonuorah/Downloads/Android-MyDemoAppRN.1.1.0.build-226.apk",
        "appPackage": "com.saucelabs.mydemoapp.rn",
        "appActivity": ".MainActivity",
        "noSign": True,
    }

    return webdriver.Remote(command_executor="http://127.0.0.1:4723", desired_capabilities=desired_caps)
