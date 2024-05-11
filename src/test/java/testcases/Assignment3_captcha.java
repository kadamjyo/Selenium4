package testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3_captcha {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://timesofindia.indiatimes.com/poll.cms");
        String[] question = driver.findElement(By.xpath("//*[@id='mathq2']")).getText().split(" ");
        int first = Integer.parseInt(question[0]);
        String op = question[1];
        int last = Integer.parseInt(question[2]);
        int ans = 0;
        if(op.equals("+")){
            ans = first + last;
        } else if (op.equals("-")){
            ans = first - last;
        }else{
            ans = first * last;
        }

        driver.findElement(By.xpath("//*[@id='mathuserans2']")).sendKeys(""+ans);
    }
}
