package lesson11;

import lesson8.LinkedList;

/**
 * Created by ITHILLEL2 on 28.07.2015.
 */
public class HashTable {
    private static int DEFAULT_TABLE_SIZE = 10;
    private LinkedList[] table = new LinkedList[DEFAULT_TABLE_SIZE];
    public void put(String key, Object value){
        int index = key.hashCode() % DEFAULT_TABLE_SIZE;
        LinkedList linkedList = table[index];
        if (linkedList==null){
            linkedList = new LinkedList();
        }
        linkedList.add(new Entry(key, value));
        table[index]= linkedList;
    }

    public Object get(String key){
        int index = key.hashCode() % DEFAULT_TABLE_SIZE;
        LinkedList list = table[index];
        if (list== null){
            return null;
        }
        for (Object entryFromList : list){
            Entry entry = (Entry) entryFromList;
            if(entry.getKey().equals(key)){
                return entry.getValue();
            }
        }
        return null;
    }

    public static class Entry{

        private String key;
        private Object value;
        public Entry(String key, Object value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public Object getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        System.out.println("hello".hashCode());
        System.out.println("privet".hashCode());
        LinkedList list = new LinkedList();
    }
}
