import java.util.Scanner;


class Node{
    int rollNo;
    String name;
    int age;
    char grade;
    Node next = null;
    public Node(int rollNo , String name , int age ,char grade){
        this.rollNo = rollNo;
        this.name = name ;
        this.age = age ;
        this.grade = grade ;
    }
}
public class StudentRecordManagement{
    public static Node insertAtFirst(Node head,int rollNo , String name , int age , char grade){
        Node newNode = new Node(rollNo, name, age, grade);
        newNode.next = head;
        return newNode ; 
    }
    public static Node insertAtLast(Node head,int rollNo , String name , int age , char grade){
        Node ptr = head ;
        while(ptr.next!=null){
            ptr = ptr.next;
        }
        Node node = new Node(rollNo, name, age, grade);
        ptr.next= node ;
        return head ; 
    }
    public static Node insertAtPosition(int position,Node head,int rollNo , String name , int age , char grade){
        Node ptr = head;
        Node newNode = new Node(rollNo, name, age, grade);
        while (ptr!= null && position!=1) {
            position--;
            ptr = ptr.next;
        }
        Node ptr2 = ptr.next;
        ptr.next = newNode;
        newNode.next = ptr2;
        return head;

    }

    // delete first 
    public static Node deleteFirst(Node head){
        return head.next;
    }
    // delete last 
    public static Node deleteLast(Node head){
        Node ptr = head ;
        while(ptr.next.next!=null){
            ptr = ptr.next;
        }
        ptr.next= null;
        return head;
    }
    // delete position wise 
    public static Node deleteAtPosition(Node head , int rollNo ){
        Node ptr = head ;
        while(ptr.next!=null && ptr.next.rollNo !=rollNo){
            ptr = ptr.next;
        }
        ptr.next = ptr.next.next;
        return head;
    }
    public static void printList(Node head){
        Node ptr = head ;
        while (ptr!= null) {
            System.out.println(ptr.name+" "+ptr.rollNo+" "+ptr.age+" "+ptr.grade);
            ptr= ptr.next;
        }
    }
    // search by roll no 
    public static void search(Node head,int rollNo){
        Node ptr = head ;
        while (ptr!=null&&ptr.rollNo != rollNo) {
            ptr= ptr.next;
        }
        if(ptr==null){
            System.out.println("Invalid ");

        }else if(ptr.rollNo == rollNo ){
            System.out.println("the student with roll no :"+ rollNo +" name is " +ptr.name);
        }else{
            System.out.println("No record found");
        }

    }

    public static void update(Node head , int rollNo , char grade){
        Node ptr = head ;
        while(ptr!=null&&ptr.rollNo!=rollNo){
            ptr = ptr.next;
        }
        if (ptr == null){
            return ;
        }
        if(ptr.rollNo == rollNo){
            ptr.grade = grade;
            System.out.println("Grade updated successfully");
        }
        else{
            System.out.println("Student with this rollno is not found");
        }
    }
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        Node head = new Node(20, "Rajat", 21, 'A');
        head.next = new Node(1, "Abc", 21, 'B');
        head.next.next = new Node(90, "zxc", 12, 'A');
        // insert at first
        head = insertAtFirst(head,1,"Amit",14,'C');
        // insert at last
        head = insertAtLast(head, 70, "yug", 13, 'A');
        //insert at position
        insertAtPosition(3, head, 32, "sumit", 10, 'C');

        head=deleteFirst(head);

        head = deleteLast(head);
        // head = deleteAtPosition(head, 3);
        search(head, 1);
        printList(head);
        update(head, 32, 'A');
        printList(head);
        
        scanner.close();
    }
}