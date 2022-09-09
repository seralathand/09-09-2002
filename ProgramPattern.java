package ZohoGraduationSchool;

import java.util.Scanner;

public class ProgramPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String temp1=sc.next();
        //String temp1="PROGRAM";
        if(temp1.length()%2!=0) {
            for (int i = 1; i <= temp1.length(); i++) {
                for (int j = 1; j <= temp1.length(); j++) {
                    if (i == j)
                        System.out.print(temp1.charAt(i - 1));
                    else if (i + j == temp1.length() + 1)
                        System.out.print(temp1.charAt(j - 1));
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
        else
            System.out.println(0);
    }
}
