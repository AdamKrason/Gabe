class Main{

    public static void main(String[] args){
        Planet earth = new Planet("Earth", 10000, 20000);
        Star sun = new Star("Sun", 2000, 3000, 4000);
        PlanetSystem system1 = new PlanetSystem("Solar system", sun);
        Planet mars = new Planet("Mars", 20000, 50000);
        system1.addPlanet(mars);
    }
}