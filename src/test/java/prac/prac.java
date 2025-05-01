package prac;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class prac {

    public static void main(String args[]) {
        String s1 = "mug";
        String s2 = "gum";
        if (s1.length()!= s2.length()) {
            System.out.println("not anagarm");
        }
        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2))
        {
            System.out.println("ana");
        }else
        {
            System.out.println("not ana");
        }
    }
}