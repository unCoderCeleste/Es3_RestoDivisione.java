/*
Esercizio 3:
Si scriva un programma che dimostri le funzionalità dell’operatore %
(modulo, ossia resto della divisione), effettuando le seguenti attività.
● Utilizzare Scanner per leggere un numero in virgola mobile x.
● Calcolare x % 2.0 e memorizzare il risultato in y.
● Visualizzare in maniera distinta x e y.
● Effettuare una conversione di tipo di x in un valore int e memorizzare il risultato in z.
● Visualizzare in maniera distinta x, z e z % 2
*/
import java.util.Scanner;
public class Es3_RestoDivisione {
    public static void main(String[] args) {
        Scanner rest= new Scanner(System.in);
        System.out.println("OPERATORE %: RESTO DELLA DIVISIONE\n");
        System.out.print("Si ingressi un valore: ");
        float x= rest.nextFloat();
        float y= (x%2);
        System.out.print("\nfloat X= "+x +"\nint Y (x%2.0)= " +y);
        int z= (int) x;
        System.out.println("\nint Z [(int) x]= " +z + "\nZ%2= " +(z%2));
    }
}