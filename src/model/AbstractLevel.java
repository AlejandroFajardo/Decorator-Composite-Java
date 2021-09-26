package model;

public abstract class AbstractLevel {

    private String name;
    private double percertage;
    private double grade;

    public AbstractLevel(String name, double percentage, double grade) {
        this.name = name;
        this.percertage = percentage;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public double getPercertage() {
        return percertage;
    }

    public double getGrade() {
        return grade;
    }

    public void setPercertage(double percertage) {
        this.percertage = percertage;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
