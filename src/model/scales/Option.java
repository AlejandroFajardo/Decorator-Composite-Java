package model.scales;

public class Option {
    
    private String name;
    private int percentage;

    public Option(String name, int percentage) {
        this.name = name;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public int getPercentage() {
        return percentage;
    }
}
