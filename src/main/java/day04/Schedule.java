package day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;

public class Schedule {
    private List<Teacher> blocks = new LinkedList<>();

    public void readInTheFile() {
        try (BufferedReader bf = new BufferedReader(Files.newBufferedReader(Path.of("src/main/resources/beosztas.txt")))) {

            String line;
            while ((line = bf.readLine()) != null) {
                blocks.add(new Teacher(line, bf.readLine(), bf.readLine(), Integer.parseInt(bf.readLine().trim())));
            }
        } catch (IOException e) {
            throw new IllegalStateException("no file");
        }
    }

    public List<Teacher> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<Teacher> blocks) {
        this.blocks = blocks;
    }

    public int findTeacher(String name) {
        int sum = 0;
        for (Teacher t : blocks) {
            if (t.getName().equals(name)) {
                sum += t.getWorkingHours();
            }
        }
        return sum;
    }
}
