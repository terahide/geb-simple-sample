package page

import geb.Page

class GoogleResultsPage extends Page {
    static at = { title == "Geb - Google 検索" }
    static content = {
        最初のリンク { $("#search").find("a", 0).find("h3") }
    }


}
