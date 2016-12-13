package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginWarehouse {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://ycwarehouse.alpha.elenet.me/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testLoginWarehouse() throws Exception {
    driver.get(baseUrl + "/#/login/phone");
    driver.findElement(By.id("mobile")).clear();
    driver.findElement(By.id("mobile")).sendKeys("17878273827");
    driver.findElement(By.id("vericode")).clear();
    driver.findElement(By.id("vericode")).sendKeys("517517");
    driver.findElement(By.id("captcha")).clear();
    driver.findElement(By.id("captcha")).sendKeys("1104");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.findElement(By.cssSelector("div.ant-select-selection-selected-value")).click();
    driver.findElement(By.cssSelector("li.ant-select-dropdown-menu-item-active.ant-select-dropdown-menu-item")).click();
    driver.findElement(By.xpath("//div[@id='main']/div/header/div[2]/div[2]/div/div")).click();
    driver.findElement(By.cssSelector("li.ant-select-dropdown-menu-item-active.ant-select-dropdown-menu-item")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
