package EJERCICIOSI;

public class ejercicio2 {
    // public static void main(String[] args) {
    //     try{
    //         statement1; 
    //         statement2; //bloque de codigo
    //         statement23;
    //     }catch(Exception1 ex1){
    //     }
    //     catch(Exception2 ex2){
    //     }
    //     statement4;
    // }

    /*
    * statement3 no se ejecutará si statement2 causa una excepción.
    * Si no se atrapa la excepción, statement4 no se ejecutará directamente, pero se ejecutará si hay un bloque finally.
    *Si la excepción se captura en el bloque catch, statement4 no se ejecutará directamente, pero se ejecutará si hay un bloque finally.
    */

    // public static void main(String[] args) {
    //     try{
    //         statement1; 
    //         statement2; //bloque de codigo
    //         statement23;
    //     }catch(Exception1 ex1){
    //     }
    //     Finally(){
    //    statement4;
    //     }
    //     statement5;
    // }
    /*
     * Si no se produce ninguna excepción:

    *Se ejecutará statement4 dentro del bloque finally.
    *Se ejecutará statement5 después de salir del bloque finally.
    *Si la excepción es de tipo Exception1:

    *No se ejecutará statement4 dentro del bloque finally ya que el control de flujo salta directamente al bloque catch correspondiente.
    *Se ejecutará statement5 después de salir del bloque finally.
    *Si la excepción no es del tipo Exception1:

    *Se ejecutará statement4 dentro del bloque finally.
    *Se ejecutará statement5 después de salir del bloque finally.
    *Por lo tanto:

    *Si no se produce ninguna excepción o si la excepción no es de tipo Exception1, statement4 se ejecutará dentro del bloque finally.
    *Si se produce una excepción de tipo Exception1, statement4 no se ejecutará dentro del bloque finally.
    *En todos los casos, statement5 se ejecutará después de salir del bloque finally.
     */


     // public static void main(String[] args) {
    //     try{
    //         statement1; 
    //         statement2; //bloque de codigo
    //         statement23;
    //     }catch(Exception1 ex1){
    //     }
	//    }catch(Exception2 ex2){
	// 	    throw ex2;
	//    }
    //     Finally(){
    //    	statement4;
    //     }
    //     statement5;


    
// Claro, aquí están las respuestas resumidas:

// Si no se produce ninguna excepción:

// Se ejecutará statement4 dentro del bloque finally.
// Se ejecutará statement5 después de salir del bloque finally.
// Si la excepción es de tipo Exception1:

// No se ejecutará statement4 dentro del bloque finally ya que el control de flujo salta directamente al bloque catch correspondiente.
// Se ejecutará statement5 después de salir del bloque finally.
// Si la excepción es del tipo Exception2:

// Se ejecutará statement4 dentro del bloque finally.
// La excepción Exception2 se relanzará después de ejecutar statement4 en el bloque finally, lo que posiblemente cause una interrupción de la ejecución del programa y statement5 no se ejecutará.
// Si la excepción no es del tipo Exception1 ni Exception2:

// Se ejecutará statement4 dentro del bloque finally.
// La excepción no será manejada en los bloques catch y se relanzará después de ejecutar statement4 en el bloque finally, lo que posiblemente cause una interrupción de la ejecución del programa y statement5 no se ejecutará.
}
