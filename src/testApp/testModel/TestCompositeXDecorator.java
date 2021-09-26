package testApp.testModel;

import model.CompositeLevel;
import model.FinalLevel;
import model.scales.DefaultScale;
import model.scales.Scale;
import model.scales.ScaleADecorator;
import model.scales.ScaleBDecorator;
import model.scales.ScaleCDecorator;
import model.scales.ScaleDDecorator;

public class TestCompositeXDecorator {

    public static void main(String[] args) {
        
        //Creacion de las notas
        Scale defaultScale1 = new DefaultScale();
        ScaleADecorator scale1 = new ScaleADecorator(defaultScale1);
        Scale defaultScale2 = new DefaultScale();
        ScaleADecorator scale2 = new ScaleADecorator(defaultScale2);
        Scale defaultScale3 = new DefaultScale();
        ScaleDDecorator scale3 = new ScaleDDecorator(defaultScale3);
        Scale defaultScale4 = new DefaultScale();
        ScaleBDecorator scale4 = new ScaleBDecorator(defaultScale4);
        Scale defaultScale5 = new DefaultScale();
        ScaleBDecorator scale5 = new ScaleBDecorator(defaultScale5);
        Scale defaultScale6 = new DefaultScale();
        ScaleADecorator scale6 = new ScaleADecorator(defaultScale6);
        Scale defaultScale7 = new DefaultScale();
        ScaleBDecorator scale7 = new ScaleBDecorator(defaultScale7);
        Scale defaultScale8 = new DefaultScale();
        ScaleCDecorator scale8 = new ScaleCDecorator(defaultScale8);
        Scale defaultScale9 = new DefaultScale();
        ScaleADecorator scale9 = new ScaleADecorator(defaultScale9);
        Scale defaultScale10 = new DefaultScale();
        ScaleADecorator scale10 = new ScaleADecorator(defaultScale10);
        Scale defaultScale11 = new DefaultScale();
        ScaleBDecorator scale11 = new ScaleBDecorator(defaultScale11);
        Scale defaultScale12 = new DefaultScale();
        ScaleBDecorator scale12 = new ScaleBDecorator(defaultScale12);
        Scale defaultScale13 = new DefaultScale();
        ScaleDDecorator scale13 = new ScaleDDecorator(defaultScale13);
        Scale defaultScale14 = new DefaultScale();
        ScaleBDecorator scale14 = new ScaleBDecorator(defaultScale14);
        Scale defaultScale15 = new DefaultScale();
        ScaleCDecorator scale15 = new ScaleCDecorator(defaultScale15);
        Scale defaultScale16 = new DefaultScale();
        ScaleCDecorator scale16 = new ScaleCDecorator(defaultScale16);
        Scale defaultScale17 = new DefaultScale();
        ScaleBDecorator scale17 = new ScaleBDecorator(defaultScale17);
        Scale defaultScale18 = new DefaultScale();
        ScaleADecorator scale18 = new ScaleADecorator(defaultScale18);

        //Creacion de las hojas (Nivel 3)
        CompositeLevel level3_1 = new CompositeLevel("Nivel 3-1", 5, scale1.calculate(2));
        CompositeLevel level3_2 = new CompositeLevel("Nivel 3-2", 5, scale2.calculate(1));
        CompositeLevel level3_3 = new CompositeLevel("Nivel 3-3", 5, scale3.calculate(2));
        CompositeLevel level3_4 = new CompositeLevel("Nivel 3-4", 10, scale4.calculate(4));
        CompositeLevel level3_5 = new CompositeLevel("Nivel 3-5", 5, scale5.calculate(2));
        CompositeLevel level3_6 = new CompositeLevel("Nivel 3-6", 3, scale6.calculate(2));
        CompositeLevel level3_7 = new CompositeLevel("Nivel 3-7", 4, scale7.calculate(3));
        CompositeLevel level3_8 = new CompositeLevel("Nivel 3-8", 3, scale8.calculate(1));
        CompositeLevel level3_9 = new CompositeLevel("Nivel 3-9", 5, scale9.calculate(2));
        CompositeLevel level3_10 = new CompositeLevel("Nivel 3-10", 5, scale10.calculate(2));
        CompositeLevel level3_11 = new CompositeLevel("Nivel 3-11", 10, scale11.calculate(4));
        CompositeLevel level3_12 = new CompositeLevel("Nivel 3-12", 5, scale12.calculate(2));
        CompositeLevel level3_13 = new CompositeLevel("Nivel 3-13", 5, scale13.calculate(1));
        CompositeLevel level3_14 = new CompositeLevel("Nivel 3-14", 2, scale14.calculate(2));
        CompositeLevel level3_15 = new CompositeLevel("Nivel 3-15", 4, scale15.calculate(1));
        CompositeLevel level3_16 = new CompositeLevel("Nivel 3-16", 4, scale16.calculate(3));
        CompositeLevel level3_17 = new CompositeLevel("Nivel 3-17", 10, scale17.calculate(3));
        CompositeLevel level3_18 = new CompositeLevel("Nivel 3-18", 10, scale18.calculate(1));

        //Creacion del nivel 2
        CompositeLevel level2_1 = new CompositeLevel("Nivel 2-1", 0, 0);
        level2_1.addLevel(level3_1);
        level2_1.addLevel(level3_2);
        level2_1.addLevel(level3_3);
        level2_1.setPercertage(level2_1.getPercentage());
        level2_1.setGrade(level2_1.calculateGrade());
        
        CompositeLevel level2_2 = new CompositeLevel("Nivel 2-2", 0, 0);
        level2_2.addLevel(level3_4);
        level2_2.addLevel(level3_5);
        level2_2.setPercertage(level2_2.getPercentage());
        level2_2.setGrade(level2_2.calculateGrade());
        
        CompositeLevel level2_3 = new CompositeLevel("Nivel 2-3", 0, 0);
        level2_3.addLevel(level3_6);
        level2_3.addLevel(level3_7);
        level2_3.addLevel(level3_8);
        level2_3.setPercertage(level2_3.getPercentage());
        level2_3.setGrade(level2_3.calculateGrade());
        
        CompositeLevel level2_4 = new CompositeLevel("Nivel 2-4", 0, 0);
        level2_4.addLevel(level3_9);
        level2_4.addLevel(level3_10);
        level2_4.setPercertage(level2_4.getPercentage());
        level2_4.setGrade(level2_4.calculateGrade());
        
        CompositeLevel level2_5 = new CompositeLevel("Nivel 2-5", 0, 0);
        level2_5.addLevel(level3_11);
        level2_5.addLevel(level3_12);
        level2_5.addLevel(level3_13);
        level2_5.setPercertage(level2_5.getPercentage());
        level2_5.setGrade(level2_5.calculateGrade());
        
        CompositeLevel level2_6 = new CompositeLevel("Nivel 2-6", 0, 0);
        level2_6.addLevel(level3_14);
        level2_6.addLevel(level3_15);
        level2_6.addLevel(level3_16);
        level2_6.setPercertage(level2_6.getPercentage());
        level2_6.setGrade(level2_6.calculateGrade());
        
        CompositeLevel level2_7 = new CompositeLevel("Nivel 2-7", 0, 0);
        level2_7.addLevel(level3_17);
        level2_7.addLevel(level3_18);
        level2_7.setPercertage(level2_7.getPercentage());
        level2_7.setGrade(level2_7.calculateGrade());
        
        //Creacion del nivel 1
        CompositeLevel level1_1 = new CompositeLevel("Nivel 1-1", 0, 0);
        level1_1.addLevel(level2_1);
        level1_1.addLevel(level2_2);
        level1_1.setPercertage(level1_1.getPercentage());
        level1_1.setGrade(level1_1.calculateGrade());
        
        CompositeLevel level1_2 = new CompositeLevel("Nivel 1-2", 0, 0);
        level1_2.addLevel(level2_3);
        level1_2.addLevel(level2_4);
        level1_2.addLevel(level2_5);
        level1_2.setPercertage(level1_2.getPercentage());
        level1_2.setGrade(level1_2.calculateGrade());
        
        CompositeLevel level1_3 = new CompositeLevel("Nivel 1-3", 0, 0);
        level1_3.addLevel(level2_6);
        level1_3.addLevel(level2_7);
        level1_3.setPercertage(level1_3.getPercentage());
        level1_3.setGrade(level1_3.calculateGrade());
        
        //Creacion del nivel 0
        CompositeLevel level0_1 = new CompositeLevel("Nivel 0-1", 0, 0);
        level0_1.addLevel(level1_1);
        level0_1.addLevel(level1_2);
        level0_1.addLevel(level1_3);
        level0_1.setPercertage(level0_1.getPercentage());
        level0_1.setGrade(level0_1.calculateGrade());
        
        FinalLevel finalLevel = new FinalLevel("Ultimo nivel", level0_1.getPercentage(), level0_1.getGrade());
        
        
        
        
        System.out.println("Nivel 3 notas / porcentajes");
        System.out.println(level3_1.getGrade() + " / " + level3_1.getPercertage());
        System.out.println(level3_2.getGrade() + " / " + level3_2.getPercertage());
        System.out.println(level3_3.getGrade() + " / " + level3_3.getPercertage());
        System.out.println(level3_4.getGrade() + " / " + level3_4.getPercertage());
        System.out.println(level3_5.getGrade() + " / " + level3_5.getPercertage());
        System.out.println(level3_6.getGrade() + " / " + level3_6.getPercertage());
        System.out.println(level3_7.getGrade() + " / " + level3_7.getPercertage());
        System.out.println(level3_8.getGrade() + " / " + level3_8.getPercertage());
        System.out.println(level3_9.getGrade() + " / " + level3_9.getPercertage());
        System.out.println(level3_10.getGrade() + " / " + level3_10.getPercertage());
        System.out.println(level3_11.getGrade() + " / " + level3_11.getPercertage());
        System.out.println(level3_12.getGrade() + " / " + level3_12.getPercertage());
        System.out.println(level3_13.getGrade() + " / " + level3_13.getPercertage());
        System.out.println(level3_14.getGrade() + " / " + level3_14.getPercertage());
        System.out.println(level3_15.getGrade() + " / " + level3_15.getPercertage());
        System.out.println(level3_16.getGrade() + " / " + level3_16.getPercertage());
        System.out.println(level3_17.getGrade() + " / " + level3_17.getPercertage());
        System.out.println(level3_18.getGrade() + " / " + level3_18.getPercertage()+ "\n");
        System.out.println("Nivel 3 nota ponderada");
        System.out.println((level3_1.getGrade() * level3_1.getPercertage())/100);
        System.out.println((level3_2.getGrade() * level3_2.getPercertage())/100);
        System.out.println((level3_3.getGrade() * level3_3.getPercertage())/100);
        System.out.println((level3_4.getGrade() * level3_4.getPercertage())/100);
        System.out.println((level3_5.getGrade() * level3_5.getPercertage())/100);
        System.out.println((level3_6.getGrade() * level3_6.getPercertage())/100);
        System.out.println((level3_7.getGrade() * level3_7.getPercertage())/100);
        System.out.println((level3_8.getGrade() * level3_8.getPercertage())/100);
        System.out.println((level3_9.getGrade() * level3_9.getPercertage())/100);
        System.out.println((level3_10.getGrade() * level3_10.getPercertage())/100);
        System.out.println((level3_11.getGrade() * level3_11.getPercertage())/100);
        System.out.println((level3_12.getGrade() * level3_12.getPercertage())/100);
        System.out.println((level3_13.getGrade() * level3_13.getPercertage())/100);
        System.out.println((level3_14.getGrade() * level3_14.getPercertage())/100);
        System.out.println((level3_15.getGrade() * level3_15.getPercertage())/100);
        System.out.println((level3_16.getGrade() * level3_16.getPercertage())/100);
        System.out.println((level3_17.getGrade() * level3_17.getPercertage())/100);
        System.out.println((level3_18.getGrade() * level3_18.getPercertage())/100 + "\n\n");
        System.out.println("--------------------------------------------------");
        System.out.println("Nivel 2 notas");
        System.out.println(level2_1.getGrade());
        System.out.println(level2_2.getGrade());
        System.out.println(level2_3.getGrade());
        System.out.println(level2_4.getGrade());
        System.out.println(level2_5.getGrade());
        System.out.println(level2_6.getGrade());
        System.out.println(level2_7.getGrade() + "\n");
        System.out.println("Nivel 2 porcent");
        System.out.println(level2_1.getPercentage());
        System.out.println(level2_2.getPercentage());
        System.out.println(level2_3.getPercentage());
        System.out.println(level2_4.getPercentage());
        System.out.println(level2_5.getPercentage());
        System.out.println(level2_6.getPercentage());
        System.out.println(level2_7.getPercentage() + "\n\n");
        System.out.println("--------------------------------------------------");
        System.out.println("Nivel 1 notas");
        System.out.println(level1_1.getGrade());
        System.out.println(level1_2.getGrade());
        System.out.println(level1_3.getGrade() + "\n");
        System.out.println("Nivel 1 porcent");
        System.out.println(level1_1.getPercentage());
        System.out.println(level1_2.getPercentage());
        System.out.println(level1_3.getPercentage() + "\n\n");
        System.out.println("--------------------------------------------------");        
        System.out.println(finalLevel.getName() + " " + finalLevel.getGrade() + " " + finalLevel.getPercertage());
    }

}
