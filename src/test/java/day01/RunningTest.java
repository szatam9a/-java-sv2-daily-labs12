package day01;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class RunningTest {

    Running running;

    @org.junit.jupiter.api.Test
    void getAllKmTest() {
        running = new Running();
        running.readIn(Path.of("src/main/resources/running.csv"));
        System.out.println(running.getAllKm(2021,12));

    }

    @org.junit.jupiter.api.Test
    void readInTest() {

    }
}