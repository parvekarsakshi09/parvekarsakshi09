import java.util.Scanner;
class methods{
     static int a=3;
     int b=2;
     int x,y,z,k;
    public static void main(String args[]){

        methods m=new methods();
        m.input();
        m.process();
        m.show();
    //     int q=su(a);
    //     int r=m.pu(a,m.b);
    //    System.out.println(q);
    //    System.out.println(r);


    // }
    // static int su(int a){
    //         return a;
    //     }
    //     int pu(int a,int b){
    //         return a*b;
    //     }


    }

//input process and output
void input(){
    Scanner sc=new Scanner(System.in);
      x=sc.nextInt();
      y=sc.nextInt();
}
void process(){
     z=x+y;
     k=x-y;
}
void show(){
    System.out.println(z);
    System.out.println(k);
}
}