package org.itstep.qa.lesson.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver243.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://hflabs.github.io/suggestions-demo/");
        //тут должен быть ассерт на открытие страницы...

        //присваиваем:
        WebElement field = driver.findElement(By.id("fullname"));
        field.sendKeys("Иванов Иван Иванович");

        //присвоение напрямую:
        driver.findElement(By.id("email")).sendKeys("log@mail.ru");

        driver.findElement(By.xpath("//*[@id=\"feedback-form\"]/div[5]/button")).click();

        //итоговая проверка
        WebElement feedback = driver.findElement(By.id("feedback-massage"));


    }
}
