package Operators;

public class OperatorExercises {
    public static void main(String[] args) {

        int a = 5;
        int b = 5;

        //Opereadores arimetricos
        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        int division = a / b;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion" + multiplicacion);
        System.out.println("Division: " + division);

        //Operadores de asignacion
        a += 2;
        a -= 2;
        a /= 2;
        a *= 2;

        //Operadores de comparacion
        System.out.println(a != b);
        System.out.println(a == 6);
        System.out.println(a == b);
        System.out.println(a == 8);

        //Operadores logicos
        System.out.println(a > 5 && b < 10);
        System.out.println(a == 8 || b == 5);
        System.out.println(!(a == 8));
        //System.out.println( false |& true);


        //Incremento y decremento
        System.out.println(--b);
        System.out.println(++b);
        System.out.println(b++);
    }
}
