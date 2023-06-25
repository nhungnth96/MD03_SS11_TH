package TH1;

import java.util.LinkedList;

public class MyGenericStack<T> {
    public LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList<>();
    }
    public  void push(T element){
        stack.addFirst(element);
    };
    public T pop(){
        return stack.removeFirst();
    };
    public  int size(){
        return  stack.size();
    };
    public boolean isEmpty(){
        if(stack.size()==0){
            return true;
        }
        return false;
    };

    @Override
    public String toString() {
        return "TH1.MyGenericStack: " +
                  stack
                ;
    }
}
