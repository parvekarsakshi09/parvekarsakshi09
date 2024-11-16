import java.util.Scanner;
class vid61{
    @SuppressWarnings("resource")
    public static void main(String args[]){

    // calculating tax
   double tax;
   int salary;
  Scanner sc1=new Scanner(System.in);
  salary=sc1.nextInt();
  if(salary<10000){
    System.out.println("no tax");
  }
  else if(salary>10000 && salary<100000){
    tax=salary*0.10;
    System.out.println(salary+"    "+tax);
  }
  else{
    tax=salary*0.20;
    System.out.println(salary+"     "+tax);
    }



    //make calculator
     int a,b;
     char op;
     Scanner sc=new Scanner(System.in);
     a=sc.nextInt();
     b=sc.nextInt();
     op=sc.next().charAt(0);
     if(op=='+'){
        System.out.println(a+b);
     }
     else if(op=='-'){
         System.out.println(a-b);
     }
        else if(op=='*'){
         System.out.println(a*b);
     }
        else if(op=='/'){
         System.out.println(a/b);
     }
     else{
        System.out.println("enter valid");
     }

// using switch
char op1;
op1=sc.next().charAt(0);
switch(op1){
    case '+':
        System.out.println(a+b);
        break;
     case '-':
        System.out.println(a-b);
        break;
     case '*':
        System.out.println(a*b);
        break;
      case '/':
        System.out.println(a/b);
        break;
       default:
        System.out.println("enetr valid");
}

    // Area of rectangle
    int l,b1;
     Scanner sc2=new Scanner(System.in);
    l=sc2.nextInt();
    b1=sc2.nextInt();
     System.out.println("Area of rectangle"+(l*b1));


    //Area of circle
    int r;
    double pie=3.14;
    Scanner sc3=new Scanner(System.in);
    r=sc3.nextInt();
        System.out.println("Area of circle"+(pie*r*r));

    //Area of a square
    int side;
    Scanner sc4=new Scanner(System.in);
    side=sc4.nextInt();
      System.out.println("Area of square"+(side*side));
    }
}