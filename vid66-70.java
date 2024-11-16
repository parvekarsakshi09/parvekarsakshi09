import java.util.Scanner;
class vid66{
    @SuppressWarnings("resource")
    public static void main(String args[]){
//Area of Traingle
int a,b,c,sp;
double area;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
sp=(a+b+c)/2;
area=Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
  System.out.println("area of traingle"+area);


//Swapping of two numbers
Scanner sc1=new Scanner(System.in);
int a1=sc1.nextInt();
int b1=sc1.nextInt();
int temp=a1;
a1=b1;
b1=temp;
  System.out.println("a1"+a1+"  "+"b1"+ b1);

//swapping without third variable
Scanner sc2=new Scanner(System.in);
int a2=sc2.nextInt();
int b2=sc2.nextInt();
a2=a2+b2;
b2=a2-b2;
a2=a2-b2;
System.out.println("a2"+a2+"  "+"b2"+ b2);

//swapping without operators
Scanner sc3=new Scanner(System.in);
int a3=sc3.nextInt();
int b3=sc3.nextInt();
a3=a3^b3;
b3=a3^b3;
a3=a3^b3;
System.out.println("a3"+a3+"  "+"b3"+ b3);


//uppercase to lowercase -->string
String uppercase;
Scanner sc4=new Scanner(System.in);
uppercase=sc4.nextLine();
String ch=uppercase.toLowerCase();
System.out.println(ch);

//uppercase to lowercase -->char
char ch1;
char ch2;
char ch3;
Scanner sc5=new Scanner(System.in);
ch1=sc5.next().charAt(0);
if(ch1>='a' && ch1<='z'){
    ch2=Character.toUpperCase(ch1);
   System.out.println(ch2); 
}
else{
      ch3=Character.toLowerCase(ch1);
   System.out.println(ch3); 
}


// Positive or negative number
int num;
Scanner sc6=new Scanner(System.in);
num=sc6.nextInt();
if(num>0){
      System.out.println("positive number"); 
}
else if(num<0){
    System.out.println("negative number"); 
}
else{
    System.out.println("neither pos nor negative"); 
}
    }
}