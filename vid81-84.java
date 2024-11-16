import java.util.Scanner;
 class vid81{
    public static void main(String args[]){
    //square root of number
    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double sr=Math.sqrt(n);
        System.out.println(sr);
    

    //check prime number or not
    Scanner sc1=new Scanner(System.in);
    int numb=sc1.nextInt();
    int count=0;
    for(int i=1; i<=numb; i++){
        if(numb%i==0){
        count++;
    }
}
    if(count==2){
        System.out.println("prime");
    }
    else{
        System.out.println("not prime");
    }



    //perfect square number
    Scanner sc2=new Scanner(System.in);
    int num=sc2.nextInt();
    int sum=0;
   for(int i=1;i<num;i++){
    if(num%i==0){
    sum+=i;
    }
   }
  System.out.println(sum);
  if(num==sum){
    System.out.println("perfect number");
  }
  else{
    System.out.println("not perfect");
  }

    //print prime number
    Scanner sc3=new Scanner(System.in);
    int n1=sc3.nextInt();
    int i,j;
    int n2=sc3.nextInt();
    for( i=n1;i<=n2;i++){
        for(j=2;j<=i;j++){
        if(i%j==0)
            break;  
    }
    if(i==j){
        System.out.println(j);
        }

}
 
    }
}
 