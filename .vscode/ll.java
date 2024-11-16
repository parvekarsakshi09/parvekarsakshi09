class node{
    
    String data;
    node next;
    node(String data){
        this.data=data;
        this.next=next;
    }
}
class ll{
   static node head;
static void insertbeg(String data){
    node newnode=new node(data);
    if(head==null){
        head=newnode;
        return;
    }
    newnode.next=head;
    head=newnode;
}
static void insertend(String data){
    node newnode=new node(data);
    if(head==null){
        head=newnode;
        return;
    }
    node currentnode=head;
    while(currentnode.next!=null){
        currentnode=currentnode.next;
        //  
    }
   currentnode.next=newnode;
    newnode.next=null;
}
static void printlist(){
    
    node currentnode=head;
    while(currentnode!=null){
        System.out.print( currentnode.data+" -> ");
        currentnode=currentnode.next;
    }
    System.out.println("null");
}
static void deletefirst(){
    if(head==null){
        return;
    }
    head=head.next;
}
static void deleteLast(){
     if(head==null){
        return;
    }
   else if(head.next==null){
        head=null;
        return;
    }
   node lastprevnode=head;
   node lastnode=head.next;
    while(lastnode.next!=null){
        lastnode=lastnode.next;
        lastprevnode=lastprevnode.next;
    }
    lastprevnode.next=null;
}
static void reversellitera(){
    if(head==null){
        return;
    }
   node prevnode=head;
   node currentnode=head.next;
   
    while(currentnode!=null){
         node nextnode=currentnode.next;
         currentnode.next=prevnode;
        prevnode=currentnode;
        currentnode=nextnode;
    }
     head.next=null;
     head=prevnode;
}
    public static void main(String[] args){
        printlist();   
        insertbeg("sak");
            // printlist();
             insertend("yash");  
            insertend("parv");
            //   printlist();  
            //   deletefirst();
            //     printlist();  
                // deleteLast();
                printlist();
                reversellitera();
                printlist();
    }
}