package day04;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Teacher {
    private String name;
    private String type;
    private String classes;
    private int workingHours;

    public Teacher(String name, String type, String classes, int workingHours) {
        this.name = name;
        this.type = type;
        this.classes = classes;
        this.workingHours = workingHours;
    }

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", classes='" + classes + '\'' +
                ", workingHours=" + workingHours +
                '}';
    }
}
