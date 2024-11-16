import java.util.Scanner;
import java.util.Arrays;
class vid86 {
    public static void main(String args[]){
        // int []a=new int[5];
        // a[0]=1;
        // a[1]=2;
        // a[2]=3;
        // a[3]=4;
        // a[4]=5;
        // System.out.println(a[2]);
        // for(int b:a){
        //     System.out.println(b);
        // }
        // for(int i=0;i<5;i++){
        //     System.out.println(a[i]);
        // }
        int size;
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        int a[]=new int[size];
        //  for(int i=0;i<size;i++){
        //     a[i]=sc.nextInt();
        //  }
        //  for(int i=0;i<size;i++){
        //     System.out.println(a[i]);
        //  }
        //  System.out.println("reverse array");
        //  for(int i=size-1;i>=0;i--){
        //     System.out.print(a[i]);


        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        for(int x:a){
            System.out.println(x);
        }
        System.out.println(a.length);





        //Array methods
        String arr[]={"sam","sak","pop"};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.asList(arr));
        int ar[]={1,2,3,4,5};
        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.asList(ar));

        int arra[][]={{12,14},{22,24}};
        System.out.println(Arrays.deepToString(arra));
         }
    }

