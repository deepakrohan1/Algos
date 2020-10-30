package com.company.ds;

import java.util.*;

public class Stack {
    
    ArrayList<String> st = new ArrayList<> ();
    
    
    public void push(String item) {
        st.add(st.size(), item);
    }
    
    public String pop() {

        if (st.size() > 0) {
            return st.remove(st.size() - 1);
        } else {
            System.out.println("stack underflow!");
        }

        return null;        
    }
    
    public Integer size() {
        return st.size();
    }
    
    public String peek() {
        if (st.size() > 0) {
            return st.get(st.size() - 1);
        } else {
            System.out.println("nothing to peek");
        }
        
        return null;
    }
    
}

