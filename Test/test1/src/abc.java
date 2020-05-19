import com.sun.deploy.util.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class abc {
    public static boolean searchName(Map<Integer,Product> products,String tim){
        for (Map.Entry<Integer, Product> entry : products.entrySet()) {

            if (tim.equals(entry.getValue().getName())){
                return true;
            }
        }
        return  false;
    }
    public static String removeDuplicateWhitespace(String inputStr) {
        String patternStr = "\\s+";
        String replaceStr = " ";
        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(inputStr);
        return matcher.replaceAll(replaceStr);
    }

    public static void main(String[] args) {
        Map<Integer, Product> products = new HashMap<>();
        products.put(1, new Product(1, "ipx", "25", "apple","max"));
        products.put(2, new Product(2, "samsungS20", "20", "samsung","S"));
        products.put(3, new Product(3, "HTCU12", "10", "HTC","U"));
        products.put(4, new Product(4, "Xiaomi Mi10", "12", "Xiaomi","Mi"));
        products.put(5, new Product(5, "Bphone 3", "9", "bphone","Bp"));
        products.put(6, new Product(6, "Oppo Reno", "15", "Oppo","Reno"));
        products.put(7, new Product(7, "Xiaomi Mi10", "12", "Xiaomi","Mi"));

        Scanner scanner=new Scanner(System.in);
        System.out.print("nhap: ");
        String str=scanner.nextLine();
        String abc= removeDuplicateWhitespace(str);
        boolean a=searchName(products,abc);
        if (a){
            System.out.println("Tìm thấy");
        }
        else {
            System.out.println("K tìm thấy");
        }
        for (Map.Entry<Integer, Product> entry : products.entrySet()) {

            if (str.equals(entry.getValue().getName())){
                System.out.println(entry.getValue().getName()+" "+entry.getValue().getPrice()+" "+entry.getValue().getDescription());
            }
        }

    }
}
