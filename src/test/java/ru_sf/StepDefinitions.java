package ru_sf;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class StepDefinitions {
    private static final WebDriver webDriver;
    private static final HomePage homePage;
    static {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\valdo\\IdeaProjects\\Practice_35.6\\src\\test\\resources\\chromedriver.exe");
        webDriver = new ChromeDriver();
        homePage = new HomePage(webDriver);
    }

    @Given("url of e2e4 {string}")
    public void url_of_e2e4(String url) {
        webDriver.get(url);
    }

    @When("page is open search {string}")
    public void page_is_open_search(String searchCode) {
        homePage.searchByCode(searchCode);

    }

    @Then("click buy button")
    public void click_buy_button() {
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        webDriver.findElement(By.xpath("/html/body/div[6]/div/div[3]/div[2]/div[1]/div/div[1]/div[2]/div/div[2]/div[7]/div/div[3]/div/p/strong/img")).click();

    }

    @And("check cart")
    public void check_cart() {
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        webDriver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div/div[2]/div[3]/div/div[1]/a[2]")).click();
    }


}

