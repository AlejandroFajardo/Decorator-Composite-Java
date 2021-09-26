package testApp.testModel;

import model.scales.DefaultScale;
import model.scales.Scale;
import model.scales.ScaleADecorator;
import model.scales.ScaleBDecorator;
import model.scales.ScaleCDecorator;
import model.scales.ScaleDDecorator;

public class test {
    
    public static void main(String[] args) {
        
        Scale defaultScale = new DefaultScale();
        Scale defaultScale2 = new DefaultScale();
        Scale defaultScale3 = new DefaultScale();
        Scale defaultScale4 = new DefaultScale();
        ScaleADecorator scaleA = new ScaleADecorator(defaultScale);
        ScaleBDecorator scaleB = new ScaleBDecorator(defaultScale2);
        ScaleCDecorator scaleC = new ScaleCDecorator(defaultScale3);
        ScaleDDecorator scaleD = new ScaleDDecorator(defaultScale4);
        
        
        System.out.println(defaultScale.calculateGrade());
        System.out.println(scaleA.calculate(1));
        System.out.println(scaleA.calculate(2) + "\n");
 
        System.out.println(defaultScale2.calculateGrade());
        System.out.println(scaleB.calculate(1));
        System.out.println(scaleB.calculate(2));
        System.out.println(scaleB.calculate(3));
        System.out.println(scaleB.calculate(4) + "\n");
        
        System.out.println(defaultScale3.calculateGrade());
        System.out.println(scaleC.calculate(1));
        System.out.println(scaleC.calculate(2));
        System.out.println(scaleC.calculate(3) + "\n");
        
        System.out.println(defaultScale4.calculateGrade());
        System.out.println(scaleD.calculate(1));
        System.out.println(scaleD.calculate(2) + "\n");
        
    }
}
