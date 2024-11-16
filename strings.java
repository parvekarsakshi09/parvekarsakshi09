class strings{

    public static void main(String args[]){
        String a="saKShi";
        a=a.toLowerCase();
         a=a.toUpperCase();
         int c=a.length();
         String b="           sks     ";
         String d="yte";
        System.out.println(d.concat(a));
        System.out.println(a.charAt(3));
         System.out.println(a.indexOf('A'));
          System.out.println(a.replace('S','w'));

        // String b=new String("sakshi");
        // if(a==b){
        //     System.out.println("equal");
        // }
        // else{
        //       System.out.println(" not equal");
        // }

   //reverse of a strting
        StringBuffer x=new StringBuffer("sakshi");
        System.out.println(x.reverse());
        StringBuilder y=new StringBuilder("soham");
        System.out.println(y.reverse());
        String s="sakshom";
        String q="";
        int l=s.length();
        for(int i=l-1;i>=0;i--){
          q=q+s.charAt(i);
        }
          System.out.println(q);

     String p="sakshi";
     String r="sakshi";
      System.out.println(p);
       System.out.println(r);
       p=p.concat("pary");
        System.out.println(p);
    String mn=new String("ankit");
     System.out.println(mn);
     String mn1=new String("ankit");
     System.out.println(mn1);
     mn=mn.concat("kumar");
     
     System.out.println(mn);

    }
}