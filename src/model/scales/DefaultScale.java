package model.scales;

public class DefaultScale implements Scale{

    public DefaultScale() {
    }
    
    @Override
    public double calculateGrade() {
        return 3.0;
    }
}
