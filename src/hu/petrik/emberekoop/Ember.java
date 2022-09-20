package hu.petrik.emberekoop;

import java.time.LocalDate;

public class Ember {
    @Override
    public String toString() {
        return String.format("%30s %30s %30s", this.nev, this.szulDatum, this.szulHely);
    }

    private String nev;
    private String szulDatum;
    private String szulHely;

    public Ember(String nev, String szulDatum, String szulHely) {
        this.nev = nev;
        this.szulDatum = szulDatum;
        this.szulHely = szulHely;
    }

    public int szuletesEv(){
        String datum = szulDatum;
        String[] parts = datum.split("-");
        int part1 = Integer.parseInt(parts[0]);
        return part1;
    }

    public int getEletkor(){
        LocalDate ma = LocalDate.now();
        return 2022 - this.szuletesEv();
    }
}
