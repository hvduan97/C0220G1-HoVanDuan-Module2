package cautrucdulieuvagiaithuat.baitap.LinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {

        MyLinkedList<String> myLinkedList=new MyLinkedList<String>("hvd");
        myLinkedList.add(1,"hovanduan");
        myLinkedList.add(0,"ho");
        myLinkedList.printList();
        myLinkedList.addFirst("anh");
        myLinkedList.printList();

    }
}
