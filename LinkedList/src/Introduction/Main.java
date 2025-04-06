package Introduction;
import java.util.LinkedList;
public class Main {

    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(99);
        list.insert(100, 3);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();

//        DLL list = new DLL();
//        list.insertFirst(10);
//        list.insertFirst(12);
//        list.insertFirst(13);
//        list.display();

    }
}
