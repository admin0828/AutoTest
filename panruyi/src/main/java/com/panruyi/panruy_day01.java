package com.panruyi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class panruy_day01 {
    public static void chome(){
        System.setProperty("webdriver.chrome.driver", "D:\\admin\\chromedriver_win32\\chromedriver.exe");
        // 创建一个WebDriver实例
        WebDriver driver= new ChromeDriver();
        // 访问google
        driver.get("https://www.panruy.com");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.className("el-menu-demo el-menu--horizontal el-menu"));
        List<WebElement> li = element.findElements(By.tagName("li"));
        li.get(2).click();

    }
    public static void firefox(){
        System.setProperty("webdriver.gecko.bin", "D:\\admin\\geckodriver-v0.29.1-win64\\geckodriver.exe");
        // 创建一个WebDriver实例
        WebDriver driver= new FirefoxDriver();
        // 访问google
        driver.get("https://www.panruy.com");
        driver.manage().window().maximize();
    }
    public static  void main(String[] args) {
         chome();
        //firefox();

    }


}
