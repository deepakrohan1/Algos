import java.util.*;

public class Stack {
    
    ArrayList<Integer> st = new ArrayList<> ();
    
    
    private void push(int item) {
        st.add(st.size(), item);
    }
    
    private Integer pop() {

        if (st.size() > 0) {
            return st.remove(st.size() - 1);
        } else {
            System.out.println("stack underflow!");
        }

        return null;        
    }
    
    private Integer size() {
        return st.size();
    }
    
    private Integer peek() {
        if (st.size() > 0) {
            return st.get(st.size() - 1);
        } else {
            System.out.println("nothing to peek");
        }
        
        return null;
    }
    
}

