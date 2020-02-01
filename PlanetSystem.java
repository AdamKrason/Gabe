import java.util.ArrayList;

class PlanetSystem{
    private String name;
    private Star centerStar;
    private ArrayList<Planet> planets = new ArrayList<Planet>();

    public PlanetSystem(String psName, Star psCenterStar){
        name = psName;
        centerStar = psCenterStar;
    }

    public String getName(){
        return name;
    }

    public Star getCenterStar(){
        return centerStar;
    }

    public Planet[] getPlanets(){
        return (Planet[]) planets.toArray();
    }

    public void setCenterStar(Star newStar){
        centerStar = newStar;
    }

    public void addPlanet(Planet planet){
        planets.add(planet);
    }
}