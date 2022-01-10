package day01;

import java.time.LocalDate;

public class Day {
    private String km;
    private LocalDate date;

    public Day(String km, LocalDate date) {
        this.km = km;
        this.date = date;
    }

    public String getKm() {
        return km;
    }

    public LocalDate getDate() {
        return date;
    }
}
