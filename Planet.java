class Planet{
    private String name;
    private int radius;
    private int mass;

    public Planet(String planetName, int planetRadius, int planetMass){
        name = planetName;
        radius = planetRadius;
        mass = planetMass;
    }

    public String getName(){
        return name;
    }

    public int getRadius(){
        return radius;
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
}