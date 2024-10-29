package Datentypen;

public class PrimitiveDatenTypen {
    public static void main(String[] args) {
        // zahlen
        // Ganze Zahlen
        // byte, short, int, long
        byte x = 127; // 1 byte -128 bis 127
        short y = 32767; // 2 byte -32,768 bis 32,767
        int z = 10; // 4 byte -2,147,483,648 bis 2,147,483,647
        long w = 10; // 8 byte -9,223,372,036,854,775,808 bis 9,223,372,036,854,775,807

        // Fließkommazahlen
        // float, double
        float a = 10.5f; // 4 byte
        double b = 10.5; // 8 byte

        // zeichenketten
        // texte, wörter, sätze
        String c = "Hallo Welt!"; // 22 byte

        // zeichen
        // einzelne buchstaben, zahlen, sonderzeichen
        char d = 'a'; // 2 byte

        // logische werte
        // wahr oder falsch, true or false , 0, 1
        boolean isOkay = false; // 1 byte

    }
}
