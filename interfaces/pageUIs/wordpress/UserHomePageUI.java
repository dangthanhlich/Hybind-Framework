package pageUIs.wordpress;

public class UserHomePageUI {
	public static final String POST_TITLE_TEXT = "xpath=//article//h2//a[text()='%s']";
	public static final String POST_CURRET_DATE_TEXT_BY_POST_TITLE = "xpath=//article//h2//a[text()='%s']//parent::h2//following-sibling::div//time[text()='%s']";
	public static final String POST_BODY_TEXT_BY_POST_TITLE = "xpath=//article//h2//a[text()='%s']//ancestor::header//following-sibling::div//p[text()='%s']";
	public static final String POST_AUTHOR_TEXT_BY_POST_TITLE = "xpath=//article//h2//a[text()='%s']//parent::h2//following-sibling::div//a[text()='%s']";

}
