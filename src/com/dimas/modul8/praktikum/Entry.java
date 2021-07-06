package com.dimas.modul8.praktikum;

public class Entry<K, V> {
    
    K key;
    V val;
    Entry <K, V> next;
    public K getKey() {
        return key;
    }
    
    public void setKey(K key) {
        this.key = key;
    }
    
    public V getVal() {
        return val;
    }
    
    public void setVal(V val) {
        this.val = val;
    }
    
    public int hashCode() {
        int prime = 13;
        int mul = 11;
        if (key != null) {
            int hashCode = prime * mul + key.hashCode();
            return hashCode;
        }
        return 0;
    }
    
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass().getName() != o.getClass().getName()){
            return false;
        }
        Entry e = (Entry) o;
        if (this.key == e.key) {
            return true;
        }
        return false;
    }

    Object getNext() {
        return next;
    }

    
}
