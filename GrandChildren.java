package ZohoGraduationSchool;

import java.util.Scanner;

public class GrandChildren {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String childAndFather[][]={{"luke","shaw"},{"wayne","rooney"},{"rooney","ronaldo"},{"shaw","rooney"}};
        System.out.println("Enter the grandfather Name: ");
        String grandFatherName=sc.next();
        String temp="";
        for(int i=0;i<childAndFather.length;i++){
            if(grandFatherName.equalsIgnoreCase(childAndFather[i][1]))
                temp=childAndFather[i][0];
        }

        int childsCount=0;
        for(int i=0;i<childAndFather.length;i++){
            if(temp.equalsIgnoreCase(childAndFather[i][1]))
                childsCount++;
        }
        System.out.println(grandFatherName+" has "+childsCount+" grandchildrens.");
    }
}
