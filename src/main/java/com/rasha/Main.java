package com.rasha;
import java.util.ArrayList;
//1. Skriv ut "Hello World" i konsolen.

//2. Skriv 4 olika variabler som har datatyperna int, double, String, boolean

//3. Skriv en if-sats som kollar om värdet på din tidigare skapade int är ett värde över 5.
//Om värdet är större än 5 skriv ut i konsolen: "Siffran är mer än 5"

//4. Skriv en for loop som repeteras 5 gånger och skriver i varje iteration ut i (antalet iterationer).

//5. Skapa en Array som har 5 ints.

//6. Skapa en Array med 5 Strings.

//7. Loopa igenom din andra array med strängar för att skriva ut samtliga texter i Arrayen i var sin rad i konsolen.

//8. Skapa en ArrayList av Integers som innehåller 5 integer som du väljer själv.

//9. Öka den fjärde siffrans värde med 4.
//9.1 Skriv ut hela ArrayListen i Konsolen.
//10. Skriv en metod som skriver ut "Jag har skapat en metod i Java" metoden ska inte returnera ett värde.
//Kalla på metoden

//11. Skriv en metod vid namn add som tar emot 2 integers och returnerar deras summa (int).
//11.1 Använd metoden och skriv ut resultatet i konsolen.

//12.1 Skriv en klass som heter Animal. Animal ska ha en namnvariabel (String).
//12.2 Skapa en metod som skriver ut i konsolen när man kallar på metoden. Döp metoden makeSound.
//12.3 Instansiera klassen och kalla på objektets metod makeSound.



//13.1 Skapa en subklass som ärver från Animal. Subklassen ska vara en valfri djurart.
//13.2 Med hjälp av polymorfism skriv över makeSound metoden från superklassen Animal och få ditt nya djur att göra ett nytt ljud.
//13.3 Instansiera din subklass och kalla på metoden makeSound.
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //1. Skriv ut "Hello World" i konsolen.
        System.out.println("Hello World");

        //2. Skriv 4 olika variabler som har datatyperna int, double, String, boolean

        int age = 36;
        double length = 1.58;
        String name = "Rasha";
        boolean isStudent = true;

        //3. Skriv en if-sats som kollar om värdet på din tidigare skapade int är ett värde över 5.
        //Om värdet är större än 5 skriv ut i konsolen: "Siffran är mer än 5"

        if (age > 5) {

            System.out.println("siffran är mer än 5");

        }


        //4. Skriv en for loop som repeteras 5 gånger och skriver i varje iteration ut i (antalet iterationer).

        for( int i = 0;i < 5 ; i++ ) {
            System.out.println(i);
        }

        //5. Skapa en Array som har 5 ints.

        int[] myNumbers = {1,2,3,4,5};

        //6. Skapa en Array med 5 Strings.

        String[] myFamily = {"Rasha","Saer","Asmahan","Mohamad","Fadel"};

        //7. Loopa igenom din andra array med strängar för att skriva
        // ut samtliga texter i Arrayen i var sin rad i konsolen.

        for(int i=0;i<myFamily.length;i++) {
            System.out.println(myFamily[i]);
        }

        //8. Skapa en ArrayList av Integers som innehåller 5 integer som du väljer själv.

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(19);
        numbers.add(3);
        numbers.add(22);
        numbers.add(27);
        numbers.add(5);

        System.out.println(numbers);

        //9. Öka den fjärde siffrans värde med 4.

        int okadnum = numbers.get(3) + 4;
        numbers.set(3, okadnum);

        //9.1 Skriv ut hela ArrayListen i Konsolen.
        System.out.println(numbers);

        //10. Skriv en metod som skriver ut "Jag har skapat en metod i Java" metoden ska inte returnera ett värde.
       //Kalla på metoden

        skrivMetod();

        //11.1 Använd metoden och skriv ut resultatet i konsolen.

        int sum = add(10,5);
        System.out.println("sum="+ sum);

        //12.3 Instansiera klassen och kalla på objektets metod makeSound.

        Animal cat = new Animal("LOLO");
        cat.makesound();

        Cow cow = new Cow("soso");
        cow.makesound();

        }
    //10. Skriv en metod som skriver ut "Jag har skapat en metod i Java" metoden ska inte returnera ett värde.
    public static void skrivMetod(){
        System.out.println("Jag har skapat en metod i Java");
    }
    //11. Skriv en metod vid namn add som tar emot 2 integers och returnerar deras summa (int).

    public static int add(int a,int b){
        return a+b;
    }

        }

