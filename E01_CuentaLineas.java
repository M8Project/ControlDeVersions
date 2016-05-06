/*



*/

// linia editada por Adonis Gomez Correia 2.0
// hola// hola// hola// hola// hola// hola// hola// hola// hola// hola// hola// hola// hola// hola// hola


//Prueba desde el IDE

import java.io.*;

public class E01_CuentaLineas {

  public static void main(String[] args) throws IOException {

/* Fitxero que utilizaremos */

      String filename = "prueba.txt";
      FileInputStream fitxer=null;
      
      try {
      
    	  fitxer = new FileInputStream(filename);
      }
      catch (FileNotFoundException e) {
    	  System.err.println("No existeix el fitxer "+filename);
    	  return;
      }
      catch (SecurityException e) {
    	  System.err.println("No es tenen drets d'accés al fitxer "+filename);
    	  return;
      }
      
      BufferedReader text = new BufferedReader(new InputStreamReader(fitxer));

      int cont = 0;
      while ( text.ready()) {
    	  text.readLine();
          cont++;
      }
      text.close();
      fitxer.close();

      System.out.println( "El fichero " + filename + " tiene " + cont + " lineas");

  }
}
