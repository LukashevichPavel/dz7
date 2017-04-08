package by.htp.dz7.palindrom;

public class Chislo {
private int []x;

public Chislo(){}

public Chislo(int randomCountCifr){
this.x=new int[randomCountCifr];
	for (int i=0;i<randomCountCifr;i++){
	this.x[i]=(int)(Math.random()*10);
}	
}

public Chislo(int n1,int n2){
	this.x=new int [2];
	this.x[0]=n1;
	this.x[1]=n2;
}
public Chislo(int n1,int n2,int n3){
	this.x=new int [3];
	this.x[0]=n1;
	this.x[1]=n2;
	this.x[2]=n3;
}

public Chislo(int n1,int n2,int n3, int n4){
	this.x=new int [4];
	this.x[0]=n1;
	this.x[1]=n2;
	this.x[2]=n3;
	this.x[3]=n4;
}

public Chislo(int n1,int n2,int n3, int n4, int n5){
	this.x=new int [5];
	this.x[0]=n1;
	this.x[1]=n2;
	this.x[2]=n3;
	this.x[3]=n4;
	this.x[4]=n5;
}

public Chislo(int n1,int n2,int n3,int n4, int n5,int n6){
	this.x=new int [6];
	this.x[0]=n1;
	this.x[1]=n2;
	this.x[2]=n3;
	this.x[3]=n4;
	this.x[4]=n5;
	this.x[5]=n6;
}

public Chislo(int n1,int n2,int n3,int n4, int n5,int n6, int n7){
	this.x=new int [7];
	this.x[0]=n1;
	this.x[1]=n2;
	this.x[2]=n3;
	this.x[3]=n4;
	this.x[4]=n5;
	this.x[5]=n6;
	this.x[6]=n7;
}

public Chislo(int n1,int n2,int n3,int n4, int n5,int n6, int n7, int n8){
	this.x=new int [8];
	this.x[0]=n1;
	this.x[1]=n2;
	this.x[2]=n3;
	this.x[3]=n4;
	this.x[4]=n5;
	this.x[5]=n6;
	this.x[6]=n7;
	this.x[7]=n8;
}

public Chislo(int n1,int n2,int n3,int n4, int n5,int n6, int n7, int n8, int n9){
	this.x=new int [9];
	this.x[0]=n1;
	this.x[1]=n2;
	this.x[2]=n3;
	this.x[3]=n4;
	this.x[4]=n5;
	this.x[5]=n6;
	this.x[6]=n7;
	this.x[7]=n8;
	this.x[8]=n9;
}

public Chislo(int n1,int n2,int n3,int n4, int n5,int n6, int n7, int n8, int n9, int n10){
	this.x=new int [10];
	this.x[0]=n1;
	this.x[1]=n2;
	this.x[2]=n3;
	this.x[3]=n4;
	this.x[4]=n5;
	this.x[5]=n6;
	this.x[6]=n7;
	this.x[7]=n8;
	this.x[8]=n9;
	this.x[9]=n10;
	}

public Chislo random(){
	int randomCountCifr=(int)(Math.random()*11);
	Chislo chislo=new Chislo(randomCountCifr);
	return chislo;
}

public void print(){
	for (int i=0;i<this.x.length;i++) {System.out.print(this.x[i]);}
	System.out.print(" ");
}

public void isPolindrom(){
	int result=-1;
	int countPass=0;
	Chislo tempChislo=new Chislo(this.x.length);
	if (this.x.length==1) result=1;
	else{
		for (int i=0;i<this.x.length;i++){tempChislo.x[this.x.length-1-i]=this.x[i];}
		for (int i=0;i<this.x.length;i++){if (tempChislo.x[i]==this.x[i]) countPass++;}
		if (countPass==this.x.length){result=1;}
	}
	//this.print();
//	tempChislo.print();
	if (1==result){this.print();System.out.println("<--------------Число является палиндромом");}
	else {System.out.println("Число не является палиндромом");}
}

}
