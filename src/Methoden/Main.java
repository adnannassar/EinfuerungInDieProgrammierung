package Methoden;

public class Main {
    public static void main(String[] args) {
        System.out.println("Result of add is : " + add(10, 20));
        System.out.println("Result of sub is : " + sub(5, 3));
        System.out.println("Result of mul is : " + mul(2, 3));
        System.out.println("Result of div is : " + div(40, 20));

        greet("Ibrahim");
        greet("Ahmad");
        greet("Ali");
    }


    public static int add(int a, int b) {
        int c = a + b;
        return c;
    }

    public static int sub(int a, int b) {
        int c = a - b;
        return c;
    }

    public static int mul(int a, int b) {
        int c = a * b;
        return c;
    }

    public static int div(int a, int b) {
        int c = a / b;
        return c;
    }

    public static void greet(String name){
        System.out.println("Hallo " + name);
    }

}
