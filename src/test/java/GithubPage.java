import static com.codeborne.selenide.Condition.text;

public class GithubPage {

    public static void openWikiPage(){
        GithubElements.wikiTab.click();
        GithubElements.showMorePages.click();
        GithubElements.pagesList.shouldHave(text("SoftAssertions"));
    }

    public static void openSoftAssertionPage(){
        GithubElements.softAssertionsLink.click();
        GithubElements.wikiBody.shouldHave(text("Using JUnit5 extend test class:"));
    }
}
