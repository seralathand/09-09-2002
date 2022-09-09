package ZohoGraduationSchool;

import java.util.Scanner;
import java.util.Arrays;
public class AlternativeSorting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int arrSize=sc.nextInt();
        System.out.println("Enter the array element: ");
        int arr[]=new int[arrSize];
        for(int i=0;i<arrSize;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int midValue=0;
        if(arr.length%2!=0)
            midValue=arr.length/2;
        else
            midValue=(arr.length/2)-1;
       // System.out.println(midValue);
        int i=midValue,j=midValue+1;
        while(i>=0){
            System.out.print(arr[i--]+" ");
            if(j<arr.length)
            System.out.print(arr[j++]+" ");
        }
    }
}
