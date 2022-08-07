import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;

import static com.codeborne.selenide.Selenide.$;

public class GithubElements {

    static SelenideElement
            wikiTab = $("#wiki-tab"),
            wikiBody = $("#wiki-body"),
            softAssertionsLink = wikiBody.find(new ByText("Soft assertions"));
}
