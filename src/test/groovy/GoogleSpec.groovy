import page.*
import geb.spock.*

class GoogleSpec extends GebReportingSpec {

    def "GoogleでGebを検索する"() {
        given:
        to GoogleHomePage

        when:
        Gebを検索する()

        then:
        waitFor { at GoogleResultsPage }

        and:
        最初のリンク.text() == "GEB - ウィキペディア"

        when: "Wikipediaのリンクを開く"
        最初のリンク.click()

        then:
        waitFor { at WikipediaPage }
    }

}
