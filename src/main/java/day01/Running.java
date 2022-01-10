package day01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Running {
    private List<String> dailyActivity = new ArrayList<>();
    private List<Day> days = new ArrayList<>();


    public double getAllKm(int year, int month) {
        double summer = 0;
        String[] temp;
        for (Day d : days) {
            if (d.getDate().getMonth().getValue() == month && d.getDate().getYear() == year) {
                temp = d.getKm().split(" ");
                summer += Double.parseDouble(temp[0]);
            }
        }
        return summer;
    }


    public void readIn(Path path) {
        List<String> diary;
        File file = new File(String.valueOf(path));
        System.out.println(file);
        try (BufferedReader bf = Files.newBufferedReader(path)) {
            //diary = Files.readAllLines(path);
            diary = new ArrayList<>();
            String line;
            bf.readLine();
            while ((line = bf.readLine()) != null) {
                diary.add(line);
            }

        } catch (IOException e) {
            throw new IllegalStateException("no file", e);


        }
        diary.remove(0);
        String[] temp;
        String[] temp2;

        for (String s : diary) {
            temp = s.split(";");
            //temp2 = temp[1].split("-");
            //days.add(new Day(temp[0], LocalDate.of(Integer.parseInt(temp2[0]), Integer.parseInt(temp2[1]), Integer.parseInt(temp2[2]))));
            days.add(new Day(temp[0], LocalDate.parse(temp[1])));
        }
    }
}
