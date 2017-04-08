package by.htp.dz7.matrix3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

	public static void main(String[] args) throws IOException {
		//Задание на дом стр. 51 Вариант C задача 3
		Matrix matrix;
		int max, min;
		System.out.println("Ввести с консоли n-размерность матрицы a[n] [n].");
		System.out.println("Задать значения элемен-тов матрицы в интервале значений от -n до n с помощью датчика случайных чисел.");
		System.out.println("Найти и вывести наибольшее число возрастающих (убывающих) элемен-тов матрицы, идущих подряд.");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введите размерность матрицы ");
		int n=Integer.parseInt(reader.readLine());
		matrix=new Matrix(n);	
		matrix.printMatrix();
		matrix.findMaxUp();
	}
}
