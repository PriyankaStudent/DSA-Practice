public class LinkedList{
    Node head;
    public static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    
    public static LinkedList insertAtEnd(LinkedList list, int d){
        Node n=new Node(d);
        if (list.head == null) {
            list.head = n;
        }
        else {
            Node l = list.head;
            while (l.next != null) {
                l = l.next;
            }
            l.next=n;
        }
        return list;
    }

    public static LinkedList insertAtStart(LinkedList list, int d){
        Node n=new Node(d);
        if(list.head==null) list.head=n;
        else{
            n.next=list.head;
            list.head=n;
        }
        return list;
    }

    public static LinkedList insertAtPos(LinkedList list, int v, int d){
        Node n=new Node(d);
        if(list.head==null) // when list is empty
        {   
            System.out.println("List is empty");
            return list;
        }
        else{
            Node c=list.head;
            while(c!=null){//search for the given value
                if(c.data==v){
                    n.next=c.next;
                    c.next=n;
                    return list;
                }
                c=c.next;
            }
            //there is no given value found
            System.out.println("There is no given value present in the list");
        }
        return list;
    }

    public static void printList(LinkedList list){
        Node c=list.head;
        if(list.head==null) System.out.println("List is Empty");
        else{
            System.out.print("LinkedList: ");
            while(c!=null){
                System.out.print(c.data+" ");
                c=c.next;
            }
        }
    }
    public static void main(String ar[]){
        LinkedList list=new LinkedList();
        list=insertAtEnd(list,2);
        list=insertAtEnd(list, 3);
        list=insertAtEnd(list, 4);
        list=insertAtStart(list, 1);
        list=insertAtPos(list, 5,5);
        printList(list);
    }
} 