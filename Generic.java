public class Generic{
    public static void main(String args []){
        display("java",1);
        int a=10;
        float b=20.5f;
        display(a,b);
    }
    public static<T,V>void display(T s,V r){
        System.out.println(s);
        System.out.println(r);
        }
    }