package day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScheduleTest {

    @Test
    void readInTheFileTest() {
        Schedule schedule = new Schedule();
        schedule.readInTheFile();
        System.out.println(schedule.findTeacher("Poloska Polli"));
    }
}