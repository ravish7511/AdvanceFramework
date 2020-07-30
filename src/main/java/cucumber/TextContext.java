package cucumber;

import managers.PageObjectManager;
import webdrivermanger.WebDriverManager;

public class TextContext {

	private PageObjectManager pageObjectManager;
	private WebDriverManager webDriverManager;
	private ScenarioContext scenarioContext;

	public TextContext() {
		webDriverManager = new WebDriverManager();
		pageObjectManager = new PageObjectManager(webDriverManager.initializeDriver());
		scenarioContext=new ScenarioContext();
	}

	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}

	public WebDriverManager getWebDriverManager() {
		return webDriverManager;
	}
	
	public ScenarioContext getScenarioContext()
	{
		return scenarioContext;
	}
}
