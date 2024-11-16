import java.util.Scanner;
class vid76{
    public static void main(String args[]){
        //Reverse a number
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            int r=n%10;
            System.out.print(r);
            n=n/10;
        }
        //find sum of digits in number
        Scanner sc1=new Scanner(System.in);
        int sum=0;
        int num=sc1.nextInt();
        while(num>0){
            int r1=num%10;
            sum+=r1;
            num=num/10;
        }
        System.out.println("sum"+sum);

        //palindrome of a number
        Scanner sc3=new Scanner(System.in);
        int no=sc3.nextInt();
        int c=no;
        int s=0;
        while(no>0){
            int re=no%10;
             s=(s*10)+re;
            no=no/10;
        }
        if(s==c){
            System.out.println("palindrome");
        }
        else{
       System.out.println("not palindrome");
        }
     

        //amstrong number
        Scanner sc4=new Scanner(System.in);
        int number=sc4.nextInt();
        int copy=number;
        int rem;
         int arm=0;
        while(number>0){
            rem=number%10;
            arm=(rem*rem*rem)+arm;
            number=number/10;
        }
    if(copy==arm){
        System.out.println("amstrom");
    }
    else{
        System.out.println("not amstrong");
    }


   }
}