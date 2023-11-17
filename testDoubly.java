public class testDoubly {

    public static void main(String[] args) throws Exception {
        // Node n1 = new Node(10);
        // Node n2 = new Node(20);
        // Node n3 = new Node(30);

        // n1.next = n2;
        // n2.next = n3;

        // System.out.println(n1.value);

        // System.out.println(n2.value);
        // System.out.println(n1.next.value);

        // System.out.println(n3.value);
        // System.out.println(n1.next.next.value);

        DoublyLinkedList list = new DoublyLinkedList();

        list.AddFirst(10); //add 10
        list.AddFirst(20); //add 20
        list.AddFirst(30); //add 30
        list.Print(); //display 30 > 20 > 10

        list.AddLast(15); //add 15
        list.Print();//display 30 > 20 > 10 > 15
        
        list.AddLast(25); //add 25
        list.Print(); // display 30 > 20 > 10 > 15 > 25

        list.deleteFirst(); //delete 30
        list.Print(); // display 20 > 10 > 15 > 25

        list.deleteLast(); //delete 25
        list.Print(); // display 20 > 10 > 15

        list.AddLast(15);
        list.Print();

        list.deleteValue(15); //delete the node that contains the value 10
        list.Print(); // display 20 > 15
    }
}