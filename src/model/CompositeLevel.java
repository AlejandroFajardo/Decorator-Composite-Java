package model;

import java.util.ArrayList;

public class CompositeLevel extends AbstractLevel {

    ArrayList<AbstractLevel> sublevels;

    public CompositeLevel(String name, double percentage, double grade) {
        super(name, percentage, grade);
        sublevels = new ArrayList<AbstractLevel>();
    }

    public void addLevel(AbstractLevel newLevel) {
        this.sublevels.add(newLevel);
    }
    
    public double calculateGrade(){
        double grade = 0;
        for (AbstractLevel sublevel : sublevels) {
            grade += (sublevel.getGrade() * getPercertage()) / 100;
        }
        return grade;
    }
    
    public int getPercentage(){
        int percentage = 0;
        for (AbstractLevel sublevel : sublevels) {
            percentage += sublevel.getPercertage();
        }
        return percentage;
    }
}
