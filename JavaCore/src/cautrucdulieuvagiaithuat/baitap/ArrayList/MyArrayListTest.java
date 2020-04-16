package cautrucdulieuvagiaithuat.baitap.ArrayList;



public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList=new MyArrayList<String>();
        myArrayList.add("hovanduan");
        myArrayList.add("lethilysa");
        myArrayList.add("gaucanon");
        myArrayList.add("songoku");
        System.out.println("phan tu 1: "+myArrayList.get(1));
        myArrayList.add("chichi");
        System.out.println("phan tu 1: "+myArrayList.get(1));
        System.out.println("phan tu 2: "+myArrayList.get(2));
        myArrayList.remove(0);
        System.out.println("phan tu 0: "+myArrayList.get(0));
        myArrayList.add("sababo",1);
        System.out.println("phan tu 1: "+myArrayList.get(1));
        System.out.println("phan tu 2: "+myArrayList.get(2));

    }
}
