package com.dimas.modul8.praktikum;
public class Method <K, V> {
    int capacity = 100;
    int size = 0;
    Entry <K, V> table[]= new Entry[capacity];
    
    private int Hashing(int hashCode) {
        int location = hashCode % capacity;
       
        return location;
    }
    
    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        if (this.size == 0) {
            return true;
        }
        return false;
    }
    public boolean containsKey(Object key) {
        if (key == null) {
            if (table[0].getKey() == null) {
                return true;
        }
    }
        int location = Hashing(key.hashCode());
        Entry e = null;
        try {
            e = table[location];
        } 
        catch (NullPointerException ex) {
        }
        if (e != null && e.getKey() == key) {
            return true;
        }
        return false;
    }
    public boolean containsValue(Object value) {
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null && table[i].getVal() == value) {
                return true;
            }
        }
        return false;
    }
    
    public V get(K key) {
        V ret = null;
        if (key == null) {
            Entry<K, V> e = null;
            try {
                e = table[0];
            } 
            catch (NullPointerException ex) {
            }
            if (e != null) {
                return (V) e.getVal();
            }
        } 
        else {
            int location = Hashing(key.hashCode());
            Entry<K, V> e = null;
            try {
                e = table[location];
            } 
            catch (NullPointerException ex) {
            }
            if (e != null && e.getKey() == key) {
                return (V) e.getVal();
            }
        }
        return ret;
    }
    public V put(K key, V val) {
        V ret = null;
        if (key == null) {
            ret = putForNullKey(val);
            return ret;
        } 
        else {
            int location = Hashing(key.hashCode());
            if (location >= capacity) {
                System.out.println("Rehashing required");
                return null;
            }
            Entry<K, V> e = null;
            try {
                e = table[location];
            } 
            catch (NullPointerException ex) {
            }
            if (e != null && e.getKey() == key) {
                ret = (V) e.getVal();
            } 
            else {
                Entry<K, V> eNew = new Entry<K, V>();
                eNew.setKey(key);
                eNew.setVal(val);
                table[location] = eNew;
                size++;
            }
        }
        return ret;
    }
    
    public V putForNullKey(V val) {
        Entry<K, V> e = null;
            try {
            e = table[0];
            } 
            catch (NullPointerException ex) {
            }
            V ret = null;
            if (e != null && e.getKey() == null) {
                ret = (V) e.getVal();
                e.setVal(val);
                return ret;
            } 
            else {
            Entry<K, V> eNew = new Entry<K, V>();
            eNew.setKey(null);
            eNew.setVal(val);
            table[0] = eNew;
            size++;
            }
        return ret;
    }
    
    public void remove (K key){
        int location = Hashing(key.hashCode());
        Entry previous = null;
        Entry Entry = table[location];
        while (Entry != null){
            if (Entry.getKey().equals(key)){
                if  (previous==null){
                    Entry = (Entry) Entry.getNext();
                    table[location] = Entry;
                    return;
                }
                else {
                    previous.setKey(Entry.getNext());
                    return;
                }
            }
            previous = Entry;
            Entry = (Entry) Entry.getNext();
        }
    }
    
   

}
