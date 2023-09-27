import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*//Opgave 1
            int count = 0;
            while (count < 100){
            System.out.println("Alex");
            count++;*/


        /*//Opgave 2
            Scanner input = new Scanner(System.in);
            int i = 0; //hedder en tælle variabel her bruger du tit navnet "i"

            System.out.println("Hvad er dit navn?");
            String navn = input.nextLine();

            System.out.println("Hvor gammel er du?");
            int alder = input.nextInt();

            while (i < 15){
                 System.out.println(navn + alder );
                i++;*/

        /*//Opgave 3
            int i = 0;
            int tabel = 10;
            while(i < tabel){
                i++;
                System.out.println(i * 5);*/

        /*//Opgave 4
            Scanner input = new Scanner(System.in);
            System.out.println("Skriv en tabel du vil have løst 10 gange");
            int tabel = 10;
            int tabeltal = input.nextInt();
            for(int i=0; i < tabel; i++){
                System.out.println(i * tabeltal);
                }*/


        /*//Opgave 5
            Scanner input = new Scanner(System.in);
            System.out.println("Hvor mange tal vil du have?");
            int x = input.nextInt();
            int[] numbers = new int[x];
            System.out.println("giv mig " + x  + " tal!");
            for (int i =0; i < x; i++){
                numbers[i] = input.nextInt();
            }
            Arrays.sort(numbers);
            String answer = Arrays.toString(numbers);

            System.out.println(answer);*/

        /*//Opgave 6
            Scanner input = new Scanner(System.in);
            System.out.println("Hvor mange tal vil du have?");
            int x = input.nextInt();
            int[] numbers = new int[x];
            System.out.println("giv mig " + x + " tal!");
            for (int i = 0; i < x; i++) {
                numbers[i] = input.nextInt();
        }

        Arrays.sort(numbers);
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }*/


       /* //Opgave 7 og 8 og 9
        Scanner input = new Scanner(System.in);
        System.out.println("hvor mange tal skal der udregnes");
        int tal = 0;
        int antal = input.nextInt();
        System.out.println("skriv " + antal + " tal der skal udregnes");
        for (int i = 0; i < antal; i++) {
            tal += input.nextInt();
        }
        System.out.println("summen er " + tal);
        double average = (double)tal/antal;

        System.out.println("gennemsnit er " + average);*/


        /*//Opgave 10 og 11
            Scanner input = new Scanner(System.in);
            System.out.println("hvor mange tal skal der udregnes");
            System.out.println("slut program med [0]");
            int tal = input.nextInt();
            int sum = 0;
            int antal = 0;
            while (tal != 0 ){
                sum += tal;
                tal = input.nextInt();
                antal++;
            }
            System.out.println("summen er " + sum);
            double average = (double)sum/antal;

            System.out.println("gennemsnit er " + average);*/

        //Opgave 12 og 13
        int rigtige = 0;
        for (int i = 0; i < 5; i++) {
            int tal1 = (int) (Math.random() * 10 + 1);
            int tal2 = (int) (Math.random() * 10 + 1);
            System.out.println("Hvad er " + tal1 + " + " + tal2);
            Scanner input = new Scanner(System.in);
            int answer = tal1 + tal2;
            int guess = input.nextInt();


            if (guess == answer){
                System.out.println("Yay du gættede det");
                rigtige++;}

            else  System.out.println("Det forkert");
        }
        System.out.println("Du fik " + rigtige + " Rigige");



    }
}





