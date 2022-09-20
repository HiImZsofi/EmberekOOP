package hu.petrik.emberekoop;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Ember human1 = new Ember("Ads", "2000-01-01", "asddsa");
        Ember human2 = new Ember("Jakab", "2002-07-18", "Miskolc");
        Ember human3 = new Ember("András", "2016-06-15", "Budapest");
        Ember human4 = new Ember("Vince", "2012-07-27", "Sopron");
        Ember human5 = new Ember("Krisztián", "2005-12-12", "Győr");
        Emberek emberek = new Emberek(new Ember[]{human1, human2, human3, human4 ,human5});

        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);

        System.out.println(human3.szuletesEv());

        System.out.printf("Három születési év: %d, %d, %d", human1.szuletesEv(), human2.szuletesEv(), human3.szuletesEv());

        try{
            Emberek emberek2 = new Emberek("emberek.txt");
        } catch (IOException e){
            System.out.println("Nincs ilyen fájl");
        }

    }
}
