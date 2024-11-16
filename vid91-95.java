import java.util.Scanner;
class vid91{
    public static void main(String args[]){
        //copy all elements into another array
        int n,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        
        for( i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            b[i]=a[i];
            System.out.print(b[i]);
        }

    //     //sum and avg of array elements 
          int num,i1,sum=0,avg;
        Scanner sc1=new Scanner(System.in);
        num=sc1.nextInt();
        int arr[]=new int[num];
        
        for( i1=0;i1<num;i1++){
            arr[i1]=sc1.nextInt();
            sum+=arr[i1];
        }
       
          System.out.println(sum);
           avg=sum/arr.length;
            System.out.println(avg);
    


    //search array element
    System.out.println("enter search element");
    int count=0;
    int searchnum;
     searchnum=sc1.nextInt();
     for(i=0;i<num;i++){
     if(searchnum==arr[i]){
        count++;
     }
     }
     if(count>0){
        System.out.println("element"+searchnum+"found"+count+"times");
     }
     else{
        System.out.println("not found ");
     }

     //arrange in acending order
     int z[]=new int[5];
     int j,k;
     Scanner scr=new Scanner(System.in);
     for( k=0;k<z.length;k++){
        z[k]=scr.nextInt();
     }

     for( k=0;k<z.length;k++){
        for( j=k+1;j<z.length;j++){
            if(z[k]>z[j]){
                int temp=z[k];
                z[k]=z[j];
                z[j]=temp;
            }
        }
     }
     for(k=0;k<z.length;k++){
        System.out.print("   "+z[k]);
     }
//decending order
     for( k=0;k<z.length;k++){
        for( j=k+1;j<z.length;j++){
            if(z[k]<z[j]){
                int temp=z[k];
                z[k]=z[j];
                z[j]=temp;
            }
        }
     }
     for(k=0;k<z.length;k++){
        System.out.print("   "+z[k]);
     }

    }
}