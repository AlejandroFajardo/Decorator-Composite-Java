package model.scales;

public abstract class ScaleDecorator implements Scale{
    
    protected Scale scale;
    
    public ScaleDecorator(Scale scale) {
        this.scale = scale;
    }

    protected Scale getScale() {
        return scale;
    }

}
