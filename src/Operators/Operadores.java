package Operators;

public class Operadores {
    public static void main(String[] args) {

        //operadores

        //aritmetricos

        var a= 5 ;
        var b= 3;

        System.out.println( a + b );
        System.out.println( a / b );
        System.out.println( a * b );
        System.out.println( a - b );
        System.out.println( a % b );

        //asignacion

        a = b;
        System.out.println( a);
        a = b * 2;
        System.out.println( a);
        a += 1; //a = a + 1
        System.out.println( a);

        a -= 1;
        System.out.println( a);
        a *= 2;
        System.out.println( a);
        a /= 2;
        System.out.println( a);
        a %= 2;
        System.out.println( a);


    //comparacion (relacionales)

        System.out.println( a == b);
        System.out.println( a == 6);

        System.out.println( a != b);
        System.out.println( a <= b);
        System.out.println( a >= b);
        System.out.println( a < b);
        System.out.println( a > b);

        //logicos

        // Y (AND)

        System.out.println( true && true);
        System.out.println( true && false);
        System.out.println( false && true);
        System.out.println( false && false);

        System.out.println(3 > 2 && 5 == 2 );

        //O (0R)

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println( false || true);
        System.out.println( false || false);

        System.out.println( 3 > 2 || 5 == 2 );//basta con que haya un true para que sea verdadera

        //NO (NOT)

        System.out.println(!true);
        System.out.println(!false);

        System.out.println( !(3 > 2) || 5 == 2 );

        //unarios

        System.out.println(+b);
        System.out.println(-b);
        System.out.println(++b);
        System.out.println(b++);
        System.out.println(b);
        System.out.println(--b);
        System.out.println(b--);




    }
}
