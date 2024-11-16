import java.util.Scanner;
class vid101{
    public static void main(String []args){

        //Inset element in an array
        // int size,loc,item;
       
        // Scanner sc=new Scanner(System.in);
        // size=sc.nextInt();
        //  int a[]=new int[size+1];
        // for(int i=0;i<size;i++){
        //     a[i]=sc.nextInt();
        // }
        // System.out.println("enter location");
        // loc=sc.nextInt();
        // System.out.println("enter item");
        
        // item=sc.nextInt();
        // for(int i=size;i>loc;i--){
        //     a[i]=a[i-1];
        // }
        // a[loc]=item;
        // size++;
        // for(int i=0;i<size;i++){
        //    System.out.println(a[i]); 
        // }



        //delete element in an array
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
          int arr[]=new int[s];
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter location");
        int location=sc.nextInt();
        for(int i=location;i<s;i++){
            arr[i]=arr[i+1];
        }
        s--;
        for(int i=0;i<s;i++){
            System.out.print(arr[i]);
        }

    }
}