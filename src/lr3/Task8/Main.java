package lr3.Task8;

public class Main {
    public static void main(String[] args) {
        LinkList list = new LinkList();
        // Ввод с головы
        list.createHead(3);
        list.createHead(2);
        list.createHead(1);
        System.out.println("Список после ввода с головы: " + list.toString()); //Ожидаемый результат: 1 2 3
        // Ввод с хвоста
        list.createTail(4);
        list.createTail(5);
        list.createTail(6);
        System.out.println("Список после ввода с хвоста: " + list); //Ожидаемый результат: 1 2 3 4 5 6
        // Добавление элемента в начало списка
        list.AddFirst(0);
        System.out.println("Список после добавления в начало: " + list);// Ожидаемый результат: 0 1 2 3 4 5 6
        // Добавление элемента в конец списка
        list.AddLast(7);
        System.out.println("Список после добавления в конец: " + list);// Ожидаемый результат: 0 1 2 3 4 5 6 7
        // Вставка элемента в список с указанным номером
        list.Insert(5, 10);
        System.out.println("Список после вставки элемента: " + list); //Ожидаемый результат: 0 1 2 3 4 10 5 6 7
        // Удаление элемента с головы списка
        list.RemoveFirst();
        System.out.println("Список после удаления с головы: " + list); //Ожидаемый результат: 1 2 3 4 10 5 6 7
        // Удаление последнего элемента списка
        list.RemoveLast();
        System.out.println("Список после удаления с хвоста: " + list); //Ожидаемый результат: 1 2 3 4 10 5 6
        // Удаление из списка элемента с указанным номером
        list.Remove(4);
        System.out.println("Список после удаления элемента: " + list); //Ожидаемый результат: 1 2 3 4 5 6
        // Ввод с головы с использованием рекурсии
        list.createHeadRec(0);
        list.createHeadRec(-1);
        System.out.println("Список после ввода с головы с использованием рекурсии: " + list.toStringRec()); // Ожидаемый результат: -1 0 1 2 3 4 5 6
        // Ввод с хвоста с использованием рекурсии
        list.createTailRec(7);
        list.createTailRec(8);
        System.out.println("Список после ввода с хвоста с использованием рекурсии: " + list.toStringRec()); // Ожидаемый результат: 8 9 1 2 3 4 5 6 7 8
    }

}
