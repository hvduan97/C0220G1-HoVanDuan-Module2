package cautrucdulieuvagiaithuat.baitap.LinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {

        MyLinkedList<String> myLinkedList=new MyLinkedList<String>("hvd");

        myLinkedList.add(1,"hovanB");
        myLinkedList.add(2,"hovanC");
        myLinkedList.add(3,"hovanD");
        myLinkedList.add(4,"hovanE");

//        myLinkedList.add(0,"hovanF");
//        myLinkedList.printList();
//        System.out.println(myLinkedList.get(0));
//        myLinkedList.remove(2);
//        myLinkedList.printList();
//        System.out.println(myLinkedList.get(3));
//        myLinkedList.remove("hvd");
//        myLinkedList.printList();
//        myLinkedList.printList();
//        System.out.println(myLinkedList.getFirst());
//        System.out.println(myLinkedList.getLast());
//        myLinkedList.clear();
//        myLinkedList.printList();
        System.out.println("add first va add last");
        myLinkedList.addFirst("dautien");
        myLinkedList.addLast("cuoicung");
        myLinkedList.printList();
        System.out.println("Sau khi clone sang mang moi: ");
        myLinkedList.clone().printList();
    }
}
