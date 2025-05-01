package prac;


import java.util.Random;

public class prac1 {

  public static void main(String args[]) {
    String s1 = "Hello world";
    boolean counted[]=new boolean[s1.length()];
    char ch[]=s1.toCharArray();
    for (int i=0;i< ch.length;i++)
    {
      if(counted[i])
        continue;
      char current=s1.charAt(i);
      int count=1;
      for (int j=i+1;j<ch.length;j++)
      {
        if(ch[i]==ch[j])
        {
          count++;
          counted[j]=true;
        }
      }
      System.out.println(current+""+count);
    }
  }}
