package basic.c03_strings;

public class Strings {

    public static void main(String[] args) {

        //cadena de texto

        //declaracion
        String name = "Pamela";
        var surname = new String("Suarez");


       /* // operaciones basicas

        //concatenacion
        System.out.println(name + " " + surname);

        //longitud
        System.out.println(name.length()-1);

        //obtener carecter
        System.out.println(name.charAt(name.length()-1));//para ver el ulitimo carecter -1

        //subcadena
        System.out.println(name.substring(2));
        System.out.println(name.substring(1, 3));

        //Mayuscula y minusculas

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        System.out.println(name);

        // comprobar si contiene o no contiene
        System.out.println("hola mundo" .contains("Brandon"));
        System.out.println( "hola mundo" .contains("ola"));*/

        //comparacion
        System.out.println(name.equals("Pamela") );
        System.out.println(name.equals("pamela"));
        System.out.println(name.equalsIgnoreCase("pamela"));

        // == vs .equals
         var a = "Ahre";
         var b = "Ahre";
         var c = new String("Ahre");
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));

        // trim
        System.out.println("  hola me llamo paula ".trim());//para eliminar el espacio

        //replace
        System.out.println("  hola me llamo paula ".replace("paula ", "agustina").trim());//borra los espacios

        //format
        var age= 28;
        System.out.println(String.format("Hola, %s. tengo %d, ", name, age));// %s = string %d =int  %f= decimal



    }
}
