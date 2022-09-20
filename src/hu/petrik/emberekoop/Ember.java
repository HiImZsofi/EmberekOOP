package hu.petrik.emberekoop;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

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
    public int szuletesHonap(){
        String datum = szulDatum;
        String[] parts = datum.split("-");
        int part2 = Integer.parseInt(parts[1]);
        return part2;
    }
    public int szuletesNap(){
        String datum = szulDatum;
        String[] parts = datum.split("-");
        int part3 = Integer.parseInt(parts[2]);
        return part3;
    }
    public int getKor() {
        int kor;
        LocalDateTime most = LocalDateTime.now();
        LocalDateTime birth = LocalDate.of(szuletesEv(), szuletesHonap(), szuletesNap()).atStartOfDay();
        Duration dur = Duration.between(most, birth);
        kor = (int) Math.abs(dur.toDays() / 365);
        return kor;
    }
    public int getEletkor(){
        LocalDate ma = LocalDate.now();
        return 2022 - this.szuletesEv();
    }
}
