package lr3.Task7;

public class LinkList {
    private Node head;
    public LinkList(){
        head = null;
    }
    public void addHead(int data){
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }
    public void addTail(int data){
        Node temp = new Node(data);
        Node ref = head;
        if (head == null){
            head = temp;
        }
        else {
            while (ref.next != null){
                ref = ref.next;
            }
            ref.next = temp;
        }

    }
    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}
