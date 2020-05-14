package service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {
    public static String translateWord(String check) {
        Map<String,String> map=new HashMap<>();
        map.put("book","sách");
        map.put("hello","xin chào");
        map.put("bye","tạm biệt");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (check.equals(entry.getKey())){
                return map.get(check);
            }
        }
        return "Not Found";
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("nhap: ");
        String a=scanner.next();
        System.out.println(main.translateWord(a));
    }
}
