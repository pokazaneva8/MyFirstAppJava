package lr3.Task7;

public class Task7 {
    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.addTail(10);
        list.addTail(11);
        list.addTail(12);
        list.addTail(13);
        list.addTail(14);
        System.out.println("Список после добавления 5 элементов в хвост: ");
        list.printList();
        list.addHead(9);
        list.addHead(8);
        list.addHead(7);
        list.addHead(6);
        list.addHead(5);
        System.out.println("Список после добавления еще 5 элементов в начало: ");
        list.printList();
    }

}
