package service.impl;

import org.springframework.stereotype.Service;
import service.Dictionary;

import java.util.HashMap;
import java.util.Map;
@Service
public class DictionaryImpl implements Dictionary {
    @Override
    public String translateWord(String check) {
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
}
