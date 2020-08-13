

import org.openqa.selenium.chrome.ChromeDriver
import geb.report.ScreenshotReporter

waiting.timeout = 10

// pngファイルのみ取得するようレポーターを変更
reporter = new ScreenshotReporter()

reportsDir = 'build/geb-reports'

// デフォルトの失敗時のみﾚﾎﾟｰﾄ取得をfalseに
reportOnTestFailureOnly = false

System.setProperty("webdriver.gecko.driver", "lib/geckodriver.exe")
System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe")

//defaultはChrome
driver = { new ChromeDriver() }

