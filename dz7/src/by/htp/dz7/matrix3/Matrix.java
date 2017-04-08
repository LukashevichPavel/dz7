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
			if (checkNextUp(i, j)){//начинаем подсчет возрастающей последовательности
			//System.out.println("Проверяем элемент["+i+"]["+j+"]"+matrix[i][j]);
			currentCount=countUp(i,j);
			if (currentCount>maxCount){
				maxCount=currentCount;
				maxI=i;
				maxJ=j;}
			}
		}
	}
	System.out.println("Наибольшее число возрастающих элементов матрицы, идущих подряд: "+maxCount+" в строке "+(maxI+1));
	for (int i=0;i<maxCount;i++){System.out.print(matrix[maxI][maxJ+i]+" ");}
	System.out.println("");
	//System.out.println("Max up "+maxCount+" element");
}

public void findMaxDown(){
	
	int maxCount=1;
	int currentCount=1;
	int maxI=0;
	int maxJ=0;
	for (int i=0;i<n;i++){
		for (int j=0;j<n-1;j++){
			if (checkNextDown(i, j)){//начинаем подсчет убывающей последовательности
			//System.out.println("Проверяем элемент["+i+"]["+j+"]"+matrix[i][j]);
			currentCount=countDown(i,j);
			if (currentCount>maxCount){
				maxCount=currentCount;
				maxI=i;
				maxJ=j;}
			}
		}
	}
	System.out.println("Наибольшее число убывающих элементов матрицы, идущих подряд: "+maxCount+" в строке "+(maxI+1));
	for (int i=0;i<maxCount;i++){System.out.print(matrix[maxI][maxJ+i]+" ");}
	System.out.println("");
	//System.out.println("Max up "+maxCount+" element");
}

public int countUp(int i, int j){
	int count=1;
	while (checkNextUp(i, j)){
		//System.out.println("matrix["+i+"]["+j+"]="+matrix[i][j]+" < matrix["+i+"]["+(j+1)+"]="+matrix[i][j+1]);
		count++;
		j++;
	}
	return count;
}

public int countDown(int i, int j){
	int count=1;
	while (checkNextDown(i, j)){
		//System.out.println(matrix[i][j]" < matrix["+i+"]["+(j+1)+"]="+matrix[i][j+1]);
		count++;
		j++;
	}
	return count;
}

public boolean checkNextUp(int i,int j){
	boolean check=false;
	if (j!=n-1){
		if (matrix[i][j]<matrix[i][j+1]){check=true;}
	}		
	return check;
}

public boolean checkNextDown(int i,int j){
	boolean check=false;
	if (j!=n-1){
		if (matrix[i][j]>matrix[i][j+1]){check=true;}
	}		
	return check;
}


public void findMin(){
	int min=matrix[0][0];
	int minI=0;
	int minJ=0;
	for (int i=0;i<n;i++){
		for (int j=0;j<n;j++){
			if (matrix[i][j]<min){min=matrix[i][j];minI=i;minJ=j;}
		}
	} 
	System.out.println("Минимальный элемент matrix["+minI+"]["+minJ+"]="+matrix[minI][minJ]+" ");
}

public void moveElement(int i, int j){
	
}



public static double rnd(int min,int max){
	max-=min;    
	return (int) (Math.random() * ++max) + min;
}
		
		
}
