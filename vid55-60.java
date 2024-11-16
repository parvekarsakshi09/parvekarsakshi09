import java.util.Scanner;
class vid55{
    public static void main(String args[]){
        //sum and avg of 5 numbers
//         float a,b,c,d,e;
//         Scanner sc=new Scanner(System.in);
//         a=sc.nextFloat();
//         b=sc.nextFloat();
//         c=sc.nextFloat();
//         d=sc.nextFloat();
//         e=sc.nextFloat();
//         float avg=(a+b+c+d+e)/5;
//  System.out.println(avg);


        //Factorial of a number
          int n;
          Scanner sc=new Scanner(System.in);
          n=sc.nextInt();
          int fact=1;
          for(int i=1;i<=n;i++){
            fact=fact*i;
          }
          System.out.println(fact);


          //no of digits in a no
          int m;
           Scanner sc1=new Scanner(System.in);
          m=sc1.nextInt();
            int noofdigit=0;
          while(m>0){
            m=m/10;
             noofdigit++;
          }
           System.out.println(noofdigit);

        //voting eligiblity
         int age;
           Scanner sc2=new Scanner(System.in);
          age=sc2.nextInt();
          if(age>=18){
            System.out.println("you can vote");
          }
          else{
            System.out.println("you cannot vote");
          }
        
        //multiplication table
        int y;
        Scanner sc3=new Scanner(System.in);
          y=sc3.nextInt();
          for(int i=1;i<=10;i++){
            System.out.println("mul of table "+ y +" * "+i+" = "+(y*i));
          }
    }
}