class Star{
    private String name;
    private int radius;
    private int mass;
    private int effectiveTemp;

    public Star(String starName, int starRadius, int starMass, int starTemp){
        name = starName;
        radius = starRadius;
        mass = starMass;
        effectiveTemp = starTemp;
    }

    public String getName(){
        return name;
    }

    public int getRadius(){
        return radius;
    }

    public int getEffectiveTemp(){
        return effectiveTemp;
    }

    public int getMass(){
        return mass;
    }

    public void setRadius(int newRadius){
        radius = newRadius;
    }

    public void setMass(int newMass){
        mass = newMass;
    }

    public void setEffectiveTemp(int newTemp){
        effectiveTemp = newTemp;
    }
}