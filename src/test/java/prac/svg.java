package prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class svg {
    public static void main(String args[]) {

     String s1="a2b3c4";
     String result="";
     for(int i=0;i<s1.length();i+=2)
     {
         char ch=s1.charAt(i);
         int count=s1.charAt(i+1)-'0';
         for(int j=0;j<count;j++)
         {
             result+=ch;
         }
     }
        System.out.println(result);
    }
}