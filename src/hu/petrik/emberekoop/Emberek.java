package hu.petrik.emberekoop;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.List;

public class Emberek {
    private List<Ember> emberek;

    public Emberek(Ember[] emberekTomb){
        this.emberek = new ArrayList<>();
        this.emberek.addAll(Arrays.asList(emberekTomb));
        /*for (Ember e: Em) {

        }*/
    }

    public Emberek(String fajlNev) throws IOException {
        FileReader fr = new FileReader(fajlNev);
        BufferedReader br = new BufferedReader(fr);
        this.emberek = new ArrayList<>();
        String sor = br.readLine();
        while(sor != null && !sor.equals("")){
            String[] adatok = sor.split("-");
            Ember ember = new Ember(adatok[0], adatok[1], adatok[2]);
            this.emberek.add(ember);
        }
        fr.close();
    br.close();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Ember e: this.emberek) {
            sb.append(e.toString()).append(System.lineSeparator());
        }
        return sb.toString();
    }
}