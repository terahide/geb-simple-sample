package page

import geb.
import org.openqa.selenium.Keys

class GoogleHomePage extends Page {
    static url = "https://www.google.com"
    static at = { title == "Google" }
    static content = {
        キーワード { $("input", name: "q") }
    }

    def Gebを検索する() {
        キーワード << "Geb"
        キーワード << Keys.ENTER
    }Page
}