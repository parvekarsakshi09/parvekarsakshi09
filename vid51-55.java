import java.util.Scanner;
class vid51{
    public static void main(String args[]){
        char ch;
        Scanner sc=new Scanner(System.in);

        
        // ch=sc.next().charAt(0);
        // int a=ch;
        //  System.out.println("value of "+ch+ "is"+ a);
        
        // for( ch='a';ch<='z';ch++)
        //   {
        //     int a=ch;
        //     System.out.println("value of "+ch+ "is"+ a);
        //    }


    for(int i=0;i<255;i++){
        System.out.println("value of "+(char)i+  " is"+ i);
    }



// power of a number
int n,p;
 n=sc.nextInt();
 p=sc.nextInt();
 int res=1;
for(int i=1;i<=p;i++){
  res=res*n;
}
System.out.println(res);


//greatest of three no
int a1,a2,a3;
a1=sc.nextInt();
 a2=sc.nextInt();
 a3=sc.nextInt();
 if(a1>a2){
 if(a1>a3){
    System.out.println(a1);
 }
 else{
    System.out.println(a3);
 }
 }
 else{
    if(a2>a3){
  System.out.println(a2);
    }
    else{
     System.out.println(a3);
 }
 }


//using ternary
int a,b,c;
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
int mx= (a>b) ? (a>c?a:c): (b>c?b:c);
 System.out.println(mx);
    }
}