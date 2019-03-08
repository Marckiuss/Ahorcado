import java.util.*;
import java.util.Random;
import java.util.ArrayList;

/**
El metodo jugar elige una palabra aleatoria de una lista de posibles
palabras y permite al usuario o bien ir indicando letras o bien
intentar averiguar la palabra. Si la letra indicada por el usuario no esta
en la palabra el jugador va perdiendo vida. Si si esta, se muestra la palabra
con las letras que el usuario haya indicado. Si la palabra que el usuario
introduce es incorrecta pierde uno de vida y sigue el juego.
Si el jugador pierde toda su vida se acaba el juego. Si acierta la palabra
antes de que se le acabe la vida se le concede un bonus de vida y 
se vuelve a empezar con una nueva palabra.
 */ 
public class Juego {
    public void jugar() {
        ArrayList<String> palabras = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        Random aleatorio = new Random();
        int puntuacionInicial = 100000;
        boolean acierto = false;
        boolean esCorrecto = false;
        int intentosMax = 5;
        int intentos = 0;
        int letrasEncontradas = 0;
        boolean repetir = true;

        //Añadiendo palabras al arraylist
        palabras.add("perro");
        palabras.add("gato");
        palabras.add("barco");
        palabras.add("vaca");
        palabras.add("guitarra");
        palabras.add("ordenador");
        palabras.add("microfono");
        palabras.add("paisaje");
        palabras.add("extintor");
        palabras.add("tiempo");

        while(intentos < intentosMax || repetir){
            System.out.println("Introduce tu nombre");
            String nombre = scanner.next();

            System.out.println("Di un numero del 1 al " + (10 - intentos) + " para seleccionar una palabra de la lista");
            int palabraAlAzar = scanner.nextInt();

            String palabraAuxiliar = palabras.get(palabraAlAzar);
            while(letrasEncontradas < palabras.get(palabraAlAzar).length()){
                System.out.println("Escribe una letra para ver si se encuentra en la palabra, o más de una para resolver");
                String letra = scanner.next();
                //comprueba si está intentando adivinar una letra o resolver 
                if(letra.length() == 1){
                    //Comprueba si la palabra a resolver contiene la letra introducida
                    if(palabras.get(palabraAlAzar).contains(letra)){
                        //Sustituye los guiones por las letras que coinciden en su posición correspondiente
                        for(int contador = 0; contador < palabras.get(palabraAlAzar).length(); contador ++ ){
                            if(letra == palabras.get(palabraAlAzar).substring(contador, contador +1)){

                            }
                        }
                    }
                    else{
                        System.out.println("Esa letra no se encuentra en la palabra a descifrar");
                        intentos ++;
                    }
                }
                //Comprueba si la palabra introducida coincide con la palabra a descifrar
                else{
                    if(palabras.get(palabraAlAzar).equals(letra)){
                        System.out.println("Enhorabuena! Has acertado!");
                    }
                    else{
                        System.out.println("Error!");
                        intentos ++;
                    }
                }
            }
        }
    }

}
