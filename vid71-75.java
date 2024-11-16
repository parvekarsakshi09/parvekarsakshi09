import java.util.Scanner;
class vid71{
    @SuppressWarnings("resource")
    public static void main(String args[]){
//leap year
boolean isleapyear=false;
Scanner sc=new Scanner(System.in);
int leapyear=sc.nextInt();
if(leapyear%400==0 && leapyear%100==0 || leapyear%100!=0 && leapyear%4==0){
    System.out.println("it is a leap year");
    isleapyear=true;
}
else{
    System.out.println("it is not a leap year");
}


//div by 5
int n=33;
if(n%5==0){
    System.out.println("it is divisible by 5");
}
else{
    System.out.println("it is not divisible by 5");
}

//name of a weekend
Scanner sc1=new Scanner(System.in);
int w =sc1.nextInt();
switch(w){
    case 1:
    System.out.println("monday");
    break;
    case 2:
    System.out.println("tuesday");
    break;
    case 3:
    System.out.println("wednesday");
    break;
    case 4:
    System.out.println("thusday");
    break;
    case 5:
    System.out.println("friday");
    break;
    case 6:
    System.out.println("saturday");
    break;
    case 7:
    System.out.println("sunday");
    break;
    default:
    System.out.println("valid no dalo");

}

//factor of a number
Scanner sc2=new Scanner(System.in);
int num =sc2.nextInt();
for(int i=1;i<=num;i++){
    if(num%i==0){
        System.out.println(i);
    }
}
//input month no
Scanner sc3=new Scanner(System.in);
int number =sc3.nextInt();
if(number==1){
    System.out.println("january-31");
}
else if(number==2 && isleapyear ){
    System.out.println("feb-29");
}
else if(number==2 && isleapyear==false){
    System.out.println("feb-28");
}
else if(number==3){
    System.out.println("mar-31");
}
else if(number==4){
    System.out.println("apr-30");
}
else if(number==5){
    System.out.println("may-31");
}
else if(number==6){
    System.out.println("june-30");
}
else if(number==7){
    System.out.println("july-31");
}
else if(number==8){
    System.out.println("aug-31");
}
else if(number==9){
    System.out.println("sep-30");
}
else if(number==10){
    System.out.println("oct-31");
}
else if(number==11){
    System.out.println("nov-30");
}
else if(number==12){
    System.out.println("dec-31");
}

    }
}