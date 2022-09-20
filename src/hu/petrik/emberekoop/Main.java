package hu.petrik.emberekoop;

public class Main {
    public static void main(String[] args) {
        Ember human1 = new Ember("Ads", "2000-01-01", "asddsa");
        Ember human2 = new Ember("Jakab", "2002-07-18", "Miskolc");
        Ember human3 = new Ember("András", "2016-06-15", "Budapest");
        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
    }
}
