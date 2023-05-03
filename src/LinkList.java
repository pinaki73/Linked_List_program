import java.util.LinkedList;
import java.util.List;

public class LinkList{
    Node head;
    Node tail;
    public static LinkList insert(LinkList l1, int data){
        Node newNode = new Node(data);
        if (l1.head == null){
            l1.head = newNode;
        }else {
            Node last = l1.head;
            while (last.next != null){
                last = last.next;
            }
            last.next = newNode;
        }
        return l1;
    }
public static void print(LinkList l1){
        Node currentnode = l1.head;
        System.out.println("Linked List");
        while (currentnode != null){
            System.out.println(currentnode.data+ " ");
            currentnode = currentnode.next;

        }

}
    public static void main(String[] args) {
        LinkList l = new LinkList();
        l = insert(l,35);
        l= insert(l, 78);
        l= insert(l, 78);
        print(l);
    }
}