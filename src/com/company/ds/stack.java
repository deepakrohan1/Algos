import java.util.*;

public class MyClass {
    
    ArrayList<Integer> st = new ArrayList<> ();
    
    public static void main(String args[]) {

      MyClass c = new MyClass();
      c.pop();
      c.push(1111);
      c.push(88888);
      System.out.println("size: " + c.size());
      System.out.println("peek: " + c.peek());
      System.out.println("popped: " + c.pop());
      System.out.println("size: " + c.size());
      System.out.println("peek: " + c.peek());
      System.out.println("popped: " + c.pop());
      System.out.println("size: " + c.size());
      System.out.println("peek: " + c.peek());
      System.out.println("popped: " + c.pop());
      System.out.println("size: " + c.size());
      System.out.println("peek: " + c.peek());
    }
    
    
    private void push(int item) {
        st.add(st.size(), item);
        System.out.println("added: " + item);
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

