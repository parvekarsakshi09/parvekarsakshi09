import java.util.Scanner;
import java.util.Arrays;
class vid96{
    public static void main(String args[]){
        //sort() equals() copyall()
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []a=new int[size];
        int b[]=new int[size];
        // int b[]=new int[8];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<b.length;i++){
            b[i]=sc.nextInt();
        }
        // Arrays.sort(a);
       
        //  for(int i=0;i<a.length;i++){
        //     System.out.println(a[i]);
        // }

        boolean b1=Arrays.equals(a,b);
        System.out.println(b1);

      int []c=Arrays.copyOf(a,2);
      // c[5]=122222;
      // c[6]=234455;
      // c[7]=456777;
       for(int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }



        //diff betn == and equals
        int []m={1,2,3,4,5};
        int []n={1,2,3,4,5};
        if(m==n){
             System.out.println("equals ");
        }
        else{
             System.out.println("not equals");
        }
        if(Arrays.equals(m,n)){
             System.out.println("equals ");
        }
        else{
             System.out.println("not equals");
    
        }

        //min and max element
        int min=a[0];
        int max=a[0];
        for(int i=1;i<a.length;i++){
          if(max<a[i]){
            max=a[i];
          }
          else if(min>a[i]){
            min=a[i];
          }
        }
        System.out.println(min);
        System.out.println(max);

    }
}
