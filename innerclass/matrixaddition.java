package com.innerclass;

public class matrixaddition {
public static void main(String[] args) {
	int mat1[][]={{1,2},{3,4}};
	int mat2[][]={{1,2},{3,4}};
	int mat3[][]=new int[2][2];
	for(int i=0;i<2;i++)
	{
		for(int j=0;i<2;j++)
		{
			mat3[i][j]=mat1[i][j]+mat2[i][j];
			System.out.print(mat3[i][j]+" ");
			
		}
		System.out.println();
	}
}
}
