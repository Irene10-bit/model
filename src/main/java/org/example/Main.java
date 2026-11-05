package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static String grade(int marks){
        if(marks>=50)return "Pass";
        else return "Fail";
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        System.out.print("pass or fail:");
        System.out.print(grade(m));
    }
}