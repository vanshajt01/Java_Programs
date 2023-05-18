package LinkeDList;

import java.util.Scanner;

public class reverseLL {
    class Node{
        int val;
        Node next;
        public Node(int val){
            this.val=val;
        }}
    private Node head;
    private int size=0;
    private Node tail;

    public void addLast(int item){
        Node nn=new Node(item);
        if(size==0){
            head=nn;
            tail=nn;
            size++;
        }
        else{
            tail.next=nn;
            tail=nn;
            size++;}

    }
    public void display(){
        for(int i=0;i<this.size;i++){
            System.out.print(this.head.val+" ");
            this.head=this.head.next;
        }
    }
    public void reverse(){

    }

    public static void main (String args[]) {
        Scanner inp=new Scanner(System.in);
        reverseLL x=new reverseLL();
        int size=inp.nextInt();
        for(int i=0;i<size;i++){
            x.addLast(inp.nextInt());
        }
        x.display();
    }
}
