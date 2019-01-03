package service;

import model.Dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DictionaryServiceImpl{
    private static Map <Integer, Dictionary> dictionaries = new HashMap <>();

    static {
        dictionaries.put(1, new Dictionary("hello", "xin chào"));
        dictionaries.put(2, new Dictionary("dog", "con chó"));
        dictionaries.put(3, new Dictionary("game", "trò chơi"));
        dictionaries.put(4, new Dictionary("sex", "giới tính"));
        dictionaries.put(5, new Dictionary("girl", "con gái"));
    }

    public List <Dictionary> findAll() {
        return new ArrayList <>(dictionaries.values());
    }
}