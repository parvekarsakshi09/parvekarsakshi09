class star_patterns{
    public static void main(String []args){
       for(int i=1;i<=5;i++){
        for(int j=5;j>=i;j--){
            System.out.print(" ");
        }
        for(int k=1;k<=2*i-1;k++){
            if(k==1||k==(2*i-1)){
            
            System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.print("\n");
       }
         for(int i=4;i>=0;i--){
        for(int j=5;j>=i;j--){
            System.out.print(" ");
        }
        for(int k=1;k<=2*i-1;k++){
            if(k==1||k==(2*i-1)){
            
            System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        
        }
        System.out.print("\n");
       }

    }
}



// for * in reverse
//for(int i=1;i<6;i++){
          //  for(int j=5;j>=i;j--){


//1 space and 5 *
//  for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=5;k>=i;k--){
//                     System.out.print("*");
//             }
//             System.out.println(" ");
//         }



//4 space and 1*
//  for(int i=1;i<=5;i++){
//             for(int j=5;j>=i;j--){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=i;k++){
//                     System.out.print("*");
//             }
//             System.out.println(" ");
//         }


//for 1
    //   1 2
    //   1 2 3
    //    for(int i=1;i<=5;i++){
    //         for(int j=1;j<=i;j++){
    //             System.out.print(j);
    //         }
            
    //         System.out.println(" ");
    //     }

// and sout(i) for 1
// 22
// 333
//add count to inccreaser value



// print pattern for    11111
                    //  2   2
                    //  3   3
                    //  4   5
                    //  55555
//    for(int i=1;i<=5;i++){
//             for(int j=1;j<=5;j++){
//                 if(i==1||i==5||j==1||j==5){
//                  System.out.print(j);
//               
//                 }
//                 else{
//                      System.out.print(" ");
//                 }
//             }
            
//             System.out.println("");
//         }



// //for pyramid patterns with 1 3 5 7 *
//  for(int i=1;i<=5;i++){
//             for(int j=5;j>i;j--){
//                   System.out.print(" ");
//             }
//             for(int k=1;k<=2*i-1;k++){
//                  System.out.print("*");
//             }
            
//             System.out.println("");
//         }
// and if k<=i then it will print pyramid shaped




//for printing char 
//  char count='a';
//         for(char i='a';i<='e';i++){
//             for(char j='a';j<=i;j++){
//                   System.out.print(j);
//             }
            
//             System.out.println(" ");
//         }

// for continuous increse  values

//  char count='a';
//         for(char i='a';i<='e';i++){
//             for(char j='a';j<=i;j++){
//                    System.out.print(count);
//                 count++;
               
            // }
            
        //     System.out.println(" ");
        // }


//pyramid with upward and downwords
// for(int i=1;i<=5;i++){
//         for(int j=5;j>=i;j--){
//             System.out.print(" ");
//         }
//         for(int k=1;k<=2*i-1;k++){
//             System.out.print("*");
//         }
//         System.out.print("\n");
//        }
//          for(int i=4;i>=0;i--){
//         for(int j=5;j>=i;j--){
//             System.out.print(" ");
//         }
//         for(int k=1;k<=2*i-1;k++){
//             System.out.print("*");
//         }
//         System.out.print("\n");
//        }
