/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplos;

/**
 *
 * @author jose_
 */
public class Ejemplos {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {

        ///////--------------------------TIPOS DE DATOS
        /*
            Tipos de Datos
            Cada tipo de dato esta predefinido como parte del lenguaje de programación.
                * Datos primitivos
                * Datos no primitivos (datos objeto)
        */
        
        /*
            Tipo de dato entero -> se encuentra disponible entre rango [-2147483648 ,2147483647]
        */
        int numero1 = 2147483647;
        
        /*
            Tipo de dato flotante, este tipo de dato guarda grandes valores en arreglos,
            estos se definen con el valor f despues del valor decimal que requiera.
            De lo contrario se debe realizar el casteo de datos.
        
            Use float (en lugar double) si necesita guardar en memoria grandes arrays de números de coma flotante.
        */
        float numero2 = (float) 1.1; //datos casteados
        float numero3 = 1.1f;
        
        /*
            Tipo de dato double, este tipo de dato es utilizado para trabajar numeros decimales.
        */
        double numero4 = 1.1;
        
        /*
            Tipo de dato long, es un numero generalmente demasiado grande que abarca más alla de los numeros enteros,
            su rango esta definido en [-2147483648 ,2147483647]
        */
        long numero5 = 2147483647;
        
        
        /*
            Tipo de dato char, representa un caracter, este no ocupa mas de dos digitos, puede escribirse en unicode
            \u0000 \uFFFFF
        */
        char letra = 'a';
        char letra1 = '\u0FFF';
        
        /*
            Tipo de dato short, contiene valores muy pequeños se encuentran [ -32768 , 32767]
        */
        short numero6 = 36;
        
        /*
            Tipo de dato byte, sirve para guardar valores de 8 bits, para representar valores positivos y negativos
            [-128, 127]
        */
        byte numero7 = 127;
        
        /*
            Tipos de datos objeto, son aquellos representados para utilizar objetos que no se encuentran representados 
            en los valores primitivos, como el tipo de dato String 
        */
        String cadena = "Esto es una cadena";
        
        /*
            Tambien se encuentran en esta area los datos auxiliares denominados como wrapper
        */
        
        int numero_transformado1 = Integer.parseInt("1");
        String cadena_transformada1 = Character.toString(15666);
        short numero_transformado2 = Short.parseShort("56");
        float numero_transformado3 = Float.parseFloat("15.65");
        double numero_transformado4 = Double.parseDouble("1.556");
        byte numero_transformado5 = Byte.parseByte("16");
        long numero_transformado6 = Long.parseLong("15645678");
        
        
        ///////--------------------------OPERADORES
        /*
            Operaciones aritmeticas
        */
        
        int multiplicacion = 5*5;
        int division = 5/5; //cuidar numeros 5/0 (lanzarian un error de excepcion)
        int suma = 5+5;
        int resta = 5-5;
        
        /*
            Operaciones unarias
        */
        
        int negativo = -4;
        int positivo = +5;
        int prenumero = 5;
        // pre-decremento
        --prenumero;
        // pre-incremento
        ++prenumero;
        int postnumero = 5;
        // post-decremento
        postnumero--;
        // post-incremento
        postnumero++;
        boolean negacionvalor = !true; //convierte en false
        
        /*
            Operaciones de asignacion
        */
        
        int numeroAsignacion = 5;
        
        //suma de numero asignacion -> convierte en 10
        numeroAsignacion += 5;
        
        //resta de numero asignacion -> convierte en 5
        numeroAsignacion -= 5;
        
        //multiplicacion de numero asignacion -> convierte en 5
        numeroAsignacion *= 5;
        
        //division de numero asignacion -> convierte en 5
        numeroAsignacion /= 5;
        
        //modulo de numero asignacion -> convierte en 0
        numeroAsignacion %= 5;
        
        /*
            Operaciones relacionales
        */
        
        // estos valores trabajan con true o false
        //retorna false
        boolean valor = 5>5;
        
        //retorna true
        valor = 5<4;
        
        //retorna true
        valor = 5>=5;
        
        //retorna true
        valor = 5<=4;
        
        
        /*
            Operadores logicos
        */
        
        //trabajan unicamente con valores true o false
        
        //retorna true
        boolean valor1 = true || false;
        
        //retorna false
        valor1 = true && false;
        
        /*
            Operaciones ternarias
        */
        
        // asignara valor 1 si cumple con el criterio (true) o 2 si el criterio es (false)
        
        int valor_ternario = (5>5)?1:2;
        
        /*
            Operaciones bit a bit
        */
        
        int valora = 0x0005;
        int valorb = 0x0007;
        
        // 0101 & 0111=0101
        int resultado = valora&valorb;
        
        // 0101 | 0111=0111
        resultado = valora|valorb;
        
        //0101 ^ 0111=0010
        resultado = valora^valorb;
        
        //~0101=1010
        resultado = ~valora;
        
        
        /*
            Operaciones shift
        */
        int valora1 = 0x0005;
        int valorb1 = -10;
        
        //0000 0101<<2 =0001 0100(20) ->(es decir [5*(2^2)])
        resultado = valora1 << 2;
        
        //0000 0101<<2 =0001 0100(20) ->(es decir [5/(2^2)])
        resultado = valora1 >> 2;
    }
    
}
