package by.htp.dz7.matrix3;

public class Matrix {
private int [][]matrix;
private int n;
public Matrix(int n){
	this.n=n;
	this.matrix=new int[n][n];
	for (int i=0;i<n;i++){
		for (int j=0;j<n;j++){
			this.matrix[i][j]=(int)(rnd(-n,n));
		}
	}
}
public void printMatrix(){
	for (int i=0;i<this.n;i++){
		for (int j=0;j<this.n;j++){
	//	System.out.print("matrix["+i+"]["+j+"]:"+this.matrix[i][j]+" ");
		System.out.print(this.matrix[i][j]+" ");
		}
		System.out.println("");
	}
}

public void findMaxUp(){
	
	int maxCount=1;
	int currentCount=1;
	int maxI=0;
	int maxJ=0;
	for (int i=0;i<n;i++){
		for (int j=0;j<n-1;j++){
			if (checkNext(i, j)){//начинаем подсчет возрастающей последовательности
			//System.out.println("ѕровер€ем элемент["+i+"]["+j+"]"+matrix[i][j]);
			currentCount=countUp(i,j);
			if (currentCount>maxCount){
				maxCount=currentCount;
				maxI=i;
				maxJ=j;}
			}
		}
	}
	System.out.println("Ќаибольшее число возрастающих элементов матрицы, идущих подр€д: "+maxCount+" в строке "+maxI);
	for (int i=0;i<maxCount;i++){System.out.print(matrix[maxI][maxJ+i]+" ");}
	
	//System.out.println("Max up "+maxCount+" element");
}

public int countUp(int i, int j){
	int count=1;
	while (checkNext(i, j)){
		//System.out.println("matrix["+i+"]["+j+"]="+matrix[i][j]+" < matrix["+i+"]["+(j+1)+"]="+matrix[i][j+1]);
		count++;
		j++;
	}
	return count;
}

public boolean checkNext(int i,int j){
	boolean check=false;
	if (j!=n-1){
		if (matrix[i][j]<matrix[i][j+1]){check=true;}
	}		
	return check;
}

public static int findMax(int[][]matrix){
	int max=matrix[0][0];
	return max;
}
public static int findMin(int[][]matrix){
	int min=matrix[0][0];
	return min;
}


public static double rnd(int min,int max){
	max-=min;    
	return (int) (Math.random() * ++max) + min;
}
		
		
}
