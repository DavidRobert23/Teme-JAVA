
public class Main {
public static void main(String[] args) {
Integer a =6;
Integer b=8;
Integer c=96;
//1

if((a>0 && b>0)||(b>0 &&c>0) ||(a>0 && c>0) ) {
	System.out.print(true);
	
}else {
	System.out.print(false);
}

System.out.println();
System.out.println();
//2

Integer num1 =6;
Integer num2=800;
Integer num3=96;


Integer max = num3 > (num1>num2 ? num1:num2) ? num3:((num1>num2) ? num1:num2);
System.out.print(max);

System.out.println();
System.out.println();
//3

int[] array = new int[]{ 1,32,673,41,985,655,744,5348,9,11210 }; 

for (int i:array) {
	if(i%2 ==1) {
		System.out.println(i);
	}
}



System.out.println();

//4

int primus=9;
boolean temp = false;
for (int i = 2; i <= primus / 2; ++i) {
  if (primus % i == 0) {
    temp = true;
   break;
  }
}

if (!temp)
  System.out.println(primus + " este prim.");
else
  System.out.println(primus + " nu este prim");








System.out.println();
//5

int r,sum=0,aux;    
int pal=565;

aux=pal;    
while(pal>0){    
 r=pal%10;  
 sum=(sum*10)+r;    
 pal=pal/10;    
}    
if(aux==sum)    
 System.out.println("este palindrom");    
else    
 System.out.println("nu este palindrom");    


System.out.println();
//6
int fibbo=13;
int x1 = 0, x2 = 1, i;

if (fibbo < 1)
    System.out.print("Numarul nu este compatibil");
System.out.print(x1 + " ");
for (i = 1; i < fibbo; i++) 
{
    System.out.print(x2 + " ");
    int sumx = x1 + x2;
    x1 = x2;
    x2 = sumx;
}


System.out.println();
System.out.println();
//7
int perfect=56;
int suma = 1; 


for (int j = 2; j * j <= perfect; j++) { 
    
    if (perfect % j == 0) { 
        
       if (j * j == perfect) {
            suma += j; 
       }else {
            suma += j + (perfect / j); 
       }
    } 
} 

if (suma == perfect) {
	System.out.print(perfect+" este perfect");
}else {
	System.out.print(perfect+" nu este perfect");
}


System.out.println();
System.out.println();
//8
// nu mai stiu semnificatia matematica a lui f(x) si cum s-ar rezolva matematic problema :)

















}
}

    








