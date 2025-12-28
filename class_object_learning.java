class node{
    int data;
    int next;
    node(int d,int next){
        this.data=d;
        this.next=next;
    }
   void display(){
        System.out.println("data = "+data);
   }
}




class class_object_learning{
    public static void main(String[] args) {
        node n1=new node(2,6);
    }
}