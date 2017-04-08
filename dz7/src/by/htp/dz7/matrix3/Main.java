package by.htp.dz7.matrix3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

public class Main {

	public static void main(String[] args) throws IOException {
		//Задание на дом стр. 51 Вариант C задача 3
		Matrix matrix;
		int max, min;
		System.out.println("c 51, вариант С задача 3");
		System.out.println("Ввести с консоли n-размерность матрицы a[n] [n].");
		System.out.println("Задать значения элемен-тов матрицы в интервале значений от -n до n с помощью датчика случайных чисел.");
		System.out.println("Найти и вывести наибольшее число возрастающих (убывающих) элемен-тов матрицы, идущих подряд.");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введите размерность матрицы ");
		int n=Integer.parseInt(reader.readLine());
		matrix=new Matrix(n);	
		matrix.printMatrix();
		matrix.findMaxUp();
		matrix.findMaxDown();
		
		System.out.println("c 51, вариант С задача 12");
		System.out.println("В матрице найти минимальный элемент и переместить его на место заданно-го элемента путем перестановки строк и столбцов.");
		matrix.findMin();
		System.out.println("Куда переместить элемент? Введите номер строки: ");
		int j=Integer.parseInt(reader.readLine());
		System.out.println("Введите номер позиции в строке: ");
		int i=Integer.parseInt(reader.readLine());
		matrix.moveElement(i, j);
	}
}
