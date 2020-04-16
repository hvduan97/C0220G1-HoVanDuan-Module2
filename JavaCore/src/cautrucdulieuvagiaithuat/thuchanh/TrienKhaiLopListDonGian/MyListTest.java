package cautrucdulieuvagiaithuat.thuchanh.TrienKhaiLopListDonGian;

public class MyListTest {
    public static void main(String[] args) {
//        Object[] objects=new Object[];
        MyList<String> listInteger = new MyList<String>();
        listInteger.add("abc");
        listInteger.add("xyz");
        listInteger.add("fgh");
        listInteger.add("ikl");
        listInteger.add("mno");

        System.out.println("element 4: "+listInteger.get(4));
        System.out.println("element 1: "+listInteger.get(1));
        System.out.println("element 2: "+listInteger.get(2));

        listInteger.get(6);
        System.out.println("element 6: "+listInteger.get(6));
    }
}
