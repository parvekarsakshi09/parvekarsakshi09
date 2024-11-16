
class recursion{

    public static void main(String args[]){

        //sum of n natural numbers
     recursion r=new recursion();
     int a=r.fun(5);
     System.out.print(a);

     //Factorial of a number
     int x=r.fact(5);
      System.out.print(x);

      //fibonaaci series
      int m=r.fibo(10);
      System.out.print(m);
      for(int i=0;i<10;i++){
        System.out.print(r.fibo(i));
      }
    }
    int fun(int b){
        if(b>0){
            return b+fun(b-1);
        }
        else{
            return 0;
        }
     }
   
   int fact(int y){
    if(y==0||y==1){
        return 1;
    }
    else {
        return y*fact(y-1);
    }
   }
   int fibo(int n){
    if(n<=1){
        return n;
    }
    else{
        return fibo(n-1)+fibo(n-2);
    }
   }

}