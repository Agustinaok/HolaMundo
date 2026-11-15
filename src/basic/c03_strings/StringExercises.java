package basic.c03_strings;

public class StringExercises {
    public static void main(String[] args) {

        String name="Hola";
        String name2=",chau";


        String resultado = name + name2;
        System.out.println(resultado);

        System.out.println(name.length());
        System.out.println(name.substring(0,1));
        System.out.println(name.substring(3,4));

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println("Holi" .contains("ol"));

        int number= 3;
        String texto = String.format("Hola tengo el numero %d", number);


        System.out.println(texto.trim());

        String calle="Maria de las fuentes";
        System.out.println(calle.replace(" ",""));





     var nombre= " Samuel ";
     var nombre2 = " Samuel ";

        System.out.println(nombre.equals(nombre2));


    }
}
