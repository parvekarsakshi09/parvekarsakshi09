import java.util.Scanner;
class vid110{
    public static void main(String args[]){
        //taking input from user print 2d array their addition transpose multiplication mirror and water image
           Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int q=sc.nextInt();
        int r=sc.nextInt();
        int a[][]=new int[p][q];
         int b[][]=new int[q][r];
         int c[][]=new int[p][r];
     
          System.out.print("enter 1 ");
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.print("enter 2");
        for(int i=0;i<q;i++){
            for(int j=0;j<r;j++){
                b[i][j]=sc.nextInt();
            }
        }
        System.out.print("matrix 1\n");
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                System.out.print(" "+a[i][j]);
            }
              System.out.println("");
        }
        System.out.print("matrix2\n");
        for(int i=0;i<q;i++){
            for(int j=0;j<r;j++){
                System.out.print(" "+b[i][j]);
            }
              System.out.println("");
        }
        System.out.println("product");
        for(int i=0;i<p;i++){
            for(int j=0;j<r;j++){
                c[i][j]=0;
                for(int k=0;k<q;k++){
                c[i][j]+=a[i][k]*b[k][j];
                
                }
                System.out.print(" "+c[i][j]);
            }
              System.out.println("");
        }
       
        System.out.println("mirror of a matrix");
        for(int i=p-1;i>=0;i--){
            for(int j=0;j<r;j++){
                System.out.print(" "+c[i][j]);
            }
              System.out.println("");
        }
    //write a program for fibonnaci
    // int a=0,b=1,c=2,d,term;
    // term=sc.nextInt();
    // for(int m=0;m<term;m++){
    //     System.out.println(a);
    //    d=a+b+c;
    //    a=b;
    //    b=c;
    //    c=d;
    // }

    }
}