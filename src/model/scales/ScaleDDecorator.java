package model.scales;

import java.util.ArrayList;

public class ScaleDDecorator extends ScaleDecorator{

    private ArrayList<Option> options;
    public ScaleDDecorator(Scale scale) {
        super(scale);
        this.options = new ArrayList<>();
        this.options.add(new Option("OP1", 0));
        this.options.add(new Option("OP2", 100));
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
