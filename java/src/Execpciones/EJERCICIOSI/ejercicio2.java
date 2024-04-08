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
 

    *No se ejecutará statement4 dentro del bloque finally ya que el control de flujo salta directamente al bloque catch correspondiente.
    *Se ejecutará statement5 después de salir del bloque finally.
    
    *Se ejecutará statement4 dentro del bloque finally.
    *Se ejecutará statement5 después de salir del bloque finally.
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

//Se ejecutará statement4 dentro del bloque finally. 
// Se ejecutará statement5 después de salir del bloque finally.

// Se ejecutará statement4 dentro del bloque finally.


// Se ejecutará statement4 dentro del bloque finally.
}
