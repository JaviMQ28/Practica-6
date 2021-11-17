/**
 * Clase Practica6 que representa los resultados de una multiplicacion por 
 * paso de parametros por valor y paso de parametros por referencia
 * 
 * @author Javier Alejandro Mancera Quiroz
 * @version 1.0
 * */
public class Practica6{
    /**
     * Metodo que recibe un numero de tipo entero 
     * 
     * @param n El numero entero
     * */
    public static void multiplicar(int n){
	// Multiplica el valor de n por 2, n * 2 = 2
	n=n*2;
	// Imprime el resultado de la multiplicacion dentro del metodo 
	System.out.println("Valor de n en el método después incrementar: " + n);
    }

    /**
     * Metodo que recibe una referencia de un arreglo con valor de un tipo entero  
     * 
     * @param x El arreglo
     * */
    public static void multiplicar(int[] x){
	// Multiplica el valor que tenga esa referencia x[0] por 2, como x[0] = n entonces x[0] * 2 = 2
	x[0]=x[0]*2;
	// Imprime el resultado de la multiplicacion dentro del metodo 
	System.out.println("Valor de n en el método después incrementar: " + x[0]);
    }

    /**
     * Metodo que recibe un numero de tipo entero y devuelve el resultado de la multiplicacion 
     * 
     * @param m El numero entero
     * @return El resultado de la multiplicacion m * 2 
     * */
    public static int multiplicar2(int m){
	// Devuelve el resultado de m por 2, m * 2 = 2
	return m=m*2;
    }

    /**
     * Metodo principal main para poder ejecutar la clase Practica6 
     * 
     * @param args Los argumentos
     * */
    public static void main(String[] args){

	// Imprime una linea vacia
	System.out.println(" ");
	// Imprime Paso de parametros por Valor
	System.out.println("-----Paso de parámetros por Valor-----");
	// Imprime una linea vacia
	System.out.println(" ");

	// Declarar una variable n de tipo entero con valor de 1
	int n = 1;
	// Imprime el valor de n antes de llamar al metodo
	System.out.println("Valor de n en main antes de llamar al método: " + n);
	// Aplicar el metodo multiplicar a n que recibe un numero entero 
	multiplicar(n);
	// Imprime el valor de n despues de llamar al metodo
	System.out.println("Valor de n en main después de llamar al método: " + n);

	// Imprime una linea vacia
	System.out.println(" ");
        // Imprime Paso de parametros por Referencia
	System.out.println("-----Paso de parámetros por Referencia-----");
	// Imprime una linea vacia
	System.out.println(" ");

	// Declarar un arreglo x de tipo entero con tamaño de 1
	int[] x = new int[1];
	// Imprime el valor de n antes de llamar al metodo
	System.out.println("Valor de n en main antes de llamar al método: " + n);
	// Declarar que el arreglo x en la posicion 0 le asigna el valor de n
	x[0] = n;
	// Aplicar el metodo multiplicar, que recibe un arreglo de tipo entero, al arreglo x 
	multiplicar(x);
	// Volver a declarar ahora a n la referencia del arreglo x[0] con valor de 2
	n = x[0];
	// Imprime el valor de n despues de llamar al metodo
	System.out.println("Valor de n en main después de llamar al método: " + n);

	// Imprime una linea vacia
	System.out.println(" ");
	// Imprime Paso de parametros por Valor ( Cambio de valor )
	System.out.println("-----Paso de parámetros por Valor ( Cambio de valor )-----");
	// Imprime una linea vacia
	System.out.println(" ");

	// Declarar una variable m de tipo entero con valor de 1
	int m = 1;
	// Imprime el valor de m antes de llamar al metodo
	System.out.println("Valor de m en main antes de llamar al método: " + m);
	// Aplicar el metodo multiplicar2 a m que recibe un numero entero 
	multiplicar2(m);
	// Imprime el valor de m generado en el metodo multiplicar2
	System.out.println("Valor de m en main después de llamar al método: " + multiplicar2(m));
	
    } // Cierre del metodo main
    
} // Cierre de la clase Practica6
