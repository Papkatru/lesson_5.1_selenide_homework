import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;

import static com.codeborne.selenide.Selenide.$;

public class GithubElements {

    static SelenideElement
            wikiTab = $("#wiki-tab"),
            wikiBody = $("#wiki-body"),
            pagesList = $("#wiki-pages-box"),
            showMorePages = $(".wiki-more-pages-link>button"),
            softAssertionsLink = pagesList.find(new ByText("SoftAssertions"));
}
