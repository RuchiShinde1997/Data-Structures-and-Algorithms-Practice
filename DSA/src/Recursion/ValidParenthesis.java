package Recursion;

public class ValidParenthesis {

    void printValidParenthesis(int n, int op, int cl, char[] ar, int id){
        if(op==n && cl==n){
            print(ar, n);
            return;
        }
        if(op<n){
            ar[id] = '{';
            printValidParenthesis(n, op+1, cl, ar, id+1);
        }
        if(cl<op){
            ar[id] = '}';
            printValidParenthesis(n, op, cl+1, ar, id+1);
        }
    }

    void print(char[] ar, int n){
        System.out.println(new String(ar));
    }
    public static void main(String[] args){
        ValidParenthesis v = new ValidParenthesis();
        int n = 12;
        v.printValidParenthesis(n, 0, 0, new char[n*2], 0);
    }
}
