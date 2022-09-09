package ZohoGraduationSchool;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiplicatoin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int firstMatrix[][]=new int[2][2];
        int secondMatrix[][]=new int[2][3];
        int resultMatrix[][]=new int[2][3];
        System.out.println("Enter the first matrix");
        for(int i=0;i<firstMatrix.length;i++){
            for(int j=0;j<firstMatrix.length;j++){
                firstMatrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the second matrix");
        for(int i=0;i<secondMatrix.length;i++){
            for(int j=0;j<secondMatrix[i].length;j++){
                secondMatrix[i][j]=sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(firstMatrix));
        System.out.println(Arrays.deepToString(secondMatrix));
        for(int i=0;i<resultMatrix.length;i++){
            for(int j=0;j<resultMatrix[i].length;j++){
                for(int k=0;k<resultMatrix.length;k++){
                    resultMatrix[i][j]+=firstMatrix[i][k]*secondMatrix[k][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(resultMatrix));
    }
}
