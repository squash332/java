package glupostijava;
/* Napisati višenitni program koji se sastoji od klase Test i od klase Brojac koja nasljeđuje klasu
Thread. Klasa Brojac(konstruktor) kao parametar prima parametar (0 ili 1)
Ako primi (0) nit treba ispisivati parne brojeve 15 sekundi. U slučaju da parametar primi (1)
treba ispisivati neparne brojeve 10 sekundi.*/

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        int broj=input.nextInt();


        Brojac nit = new Brojac(broj);
        nit.start();

    }
}
