package by.htp.dz7.matrix3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

	public static void main(String[] args) throws IOException {
		//Задание на дом стр. 51 Вариант C задача 3
		int[][]matrix;
		int max, min;
		System.out.println("Ввести с консоли n-размерность матрицы a[n] [n].");
		System.out.println("Задать значения элемен-тов матрицы в интервале значений от -n до n с помощью датчика случайных чисел.");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введите размерность матрицы ");
		int n=Integer.parseInt(reader.readLine());
		//System.out.println(n);
		matrix=new int[n][n];
		for (int i=0;i<n;i++){
			for (int j=0;j<n;j++){
				matrix[i][j]=(int)(rnd(-n,n));
				System.out.print("["+matrix[i][j]+"]");
			}
			System.out.println("");
		}
		max=findMax(matrix);
		min=findMin(matrix);
	}
	public static double rnd(int min,int max)
    {
        max-=min;    
        return (int) (Math.random() * ++max) + min;
    }
public static void checkForMaxUp(){
	
}

public static int findMax(int[][]matrix){
	int max=matrix[0][0];
	return max;
}
public static int findMin(int[][]matrix){
	int min=matrix[0][0];
	return min;
}
}
