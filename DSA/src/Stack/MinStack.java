package Stack;

import java.util.Stack;

public class MinStack {
    Stack<Integer> minStack;
    Integer min;
    public MinStack(){
        minStack = new Stack<Integer>();
        min = 0;
    }
    void push(int x){
        System.out.println("Push: "+x);
        if(minStack.isEmpty()){
            minStack.push(x);
            min = x;
        } else{
            if(x<min){
                x = 2*x-min;
                minStack.push(x);
                min = x;
            } else{
                minStack.push(x);
            }
        }
    }

    void pop(){
        if(!minStack.isEmpty()) {
            int y = minStack.pop();

            if (y < min) {
                min = 2 * min - y;
                System.out.println("Pop: "+min);
            }
            else{
                System.out.println("Pop: "+y);
            }
        }
    }

    int top(){
        int ans = 0;
        ans = minStack.peek();
        return ans;
    }

    int getMin(){
        return min;
    }

    public static void main(String[] args){
        MinStack s = new MinStack();

        // Function calls
        s.push(-2);
        s.push(0);
        s.push(-3);
        System.out.println("Min: "+s.getMin());
        s.pop();
        System.out.println("Top: "+ s.top());
        System.out.println("Min: "+s.getMin());
    }
}
