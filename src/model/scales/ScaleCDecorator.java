package model.scales;

import java.util.ArrayList;

public class ScaleCDecorator extends ScaleDecorator{

    private ArrayList<Option> options;
    public ScaleCDecorator(Scale scale) {
        super(scale);
        this.options = new ArrayList<>();
        this.options.add(new Option("OP1", 100));
        this.options.add(new Option("OP2", 60));
        this.options.add(new Option("OP3", 0));
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
