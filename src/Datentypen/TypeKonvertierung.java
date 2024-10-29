package Datentypen;

public class TypeKonvertierung {
    public static void main(String[] args) {

        short a = 10;
        byte b = (byte) a; //explicit type conversion


        byte c = 10;
        short d = c; // implicit type conversion

    }
}
