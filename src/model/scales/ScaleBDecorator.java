package model.scales;

import java.util.ArrayList;

public class ScaleBDecorator extends ScaleDecorator{

    private ArrayList<Option> options;
    public ScaleBDecorator(Scale scale) {
        super(scale);
        this.options = new ArrayList<>();
        this.options.add(new Option("OP1", 0));
        this.options.add(new Option("OP2", 40));
        this.options.add(new Option("OP3", 70));
        this.options.add(new Option("OP4", 100));
    }

    
    public double calculate(int option){
        return (calculateGrade() * options.get(option - 1).getPercentage())/100;
    }

    public ArrayList<Option> getOptions() {
        return options;
    }

    @Override
    public double calculateGrade() {
        return this.scale.calculateGrade();
    }
}
