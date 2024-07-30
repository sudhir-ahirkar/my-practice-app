package com.practice.test.application;

public class MatrixMultiplicationExample {

  public static void main(String[] args) {

    
    int[][] matrix1= {{1,2,3},{4,5,6}};
    int[][] matrix2= {{7,8},{9,10},{11,12}};
    
    int result[][]=new int[2][2];
    int sum=0;
    
    for (int i = 0; i < 2; i++) {
      
      for (int j = 0; j < 2; j++) {
        result[i][j]=0;
        for (int k = 0; k < 3; k++) {
          
          result[i][j]+=matrix1[i][k]*matrix2[k][j];
        }
//        result[i][j]=sum;
//        System.out.println(sum);
//        sum=0;
      }
    }
    
    
    for(int i = 0; i < 2; i++)
    {
        for(int j = 0; j < 2; j++)
        {
        System.out.print(result[i][j]+" ");
        }
        System.out.println(" ");
    }
  }

}
