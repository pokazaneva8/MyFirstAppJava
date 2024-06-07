package lr3.Task8;

public class LinkList {

    private class Node {
        public  int value;
        public Node next;
        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
    private Node head;
    public LinkList(){
        head = null;
    }

    //Ввод с хвоста - создание головы (вставка эл в начало)
    public void createHead(int data){
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }
    //Ввод с головы - создание хвоста (вставка эл в конец)
    public void createTail(int data) {
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
    //Вывод в строку
    public String toString() {
        StringBuilder stringOfList = new StringBuilder();
        Node temp = head;
        while (temp != null){
            stringOfList.append(temp.value);
            stringOfList.append(" ");
            //System.out.println(temp.value);
            temp = temp.next;
        }
        return stringOfList.toString();
    }
    //Добавление элемента в начало списка
    public void AddFirst(int data){
        createHead(data);
    }
    //Добавление элемента  в конец списка
    public void AddLast(int data){
        createTail(data);
    }
    //Добавление элемента на указанный номер позиции в списке
    public void Insert(int index,int data){
        if (index < 0) {
            System.out.println("Неверный номер позиции");
            return;
        }
        Node temp = new Node(data);
        if (index == 0) {
            temp.next = head;
            head = temp;
        } else {
            Node ref = head;
            int k = 0;
            while (ref.next!= null && (k < index - 1)) {
                ref = ref.next;
                k++;
            }
            temp.next = ref.next;
            ref.next = temp;
        }
    }
    //Удаление элемента с головы списка
    public void RemoveFirst(){
        if (head == null){
            System.out.println("Пустой список");
            return;
        }
        head = head.next;
    }
    //Удаление элемента с конца списка
    public void RemoveLast(){
        if (head == null){
            System.out.println("Пустой список");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node ref = head;
        while (ref.next.next != null) {
            ref = ref.next;
        }
        ref.next = null;
    }
    //Удаление элемента с указаным номером позиции в списке
    public void Remove(int index){
        if (head == null){
            System.out.println("Пустой список");
            return;
        }
        if (index < 0) {
            System.out.println("Неверный номер позиции");
            return;
        }
        if (index == 0){
            head = head.next;
            return;
        }
        Node ref = head;
        int  k = 0;
        while (ref.next != null && (k < index - 1)) {
            ref = ref.next;
            k++;
        }
        if (ref == null || ref.next == null){
            System.out.println("Неверный номер позиции");
            return;
        }
        ref.next = ref.next.next;
    }
    //Ввод с головы с использованием рекурсии
      public void createHeadRec(int value) {
        head = HeadRec(head, value);
    }
    private Node HeadRec(Node temp, int value) {
        if(temp== null) {
            temp = new Node(value);
        } else {
            Node newNode = new Node(value);
            newNode.next = temp;
            temp = newNode;
        }
        return temp;
    }
    // Ввод с хвоста с использованием рекурсии
    public void createTailRec(int data) {
        head = TailRec(head, data);
    }
    private Node TailRec(Node temp, int data) {
        if (temp == null) {
            return new Node(data);
        }
        temp.next = TailRec(temp.next, data);
        return temp;
    }

    //Вывод в строку с использованием рекурсии
    public String toStringRec() {
        return StringRec(head);
    }
    private String StringRec(Node temp) {
        if (temp == null) {
            return "";
        }
        if (temp.next == null) {
            return String.valueOf(temp.value);
        }
        return temp.value + " " + StringRec(temp.next);
    }



}
