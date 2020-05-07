package test;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class testxyz{
    public static void main(String[] args) {
        Map map = new HashMap();
        // add elements to map
        map.put(1, "Java");
        map.put(3, "C++");
        map.put(2, "PHP");
        map.put(4, "Python");
        // show Map
        Set set = map.keySet();
        for (Object key : set) {
            System.out.println(/*key + " " + */map.get(key));
        }
    }
}
