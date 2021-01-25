package Mediator;

//This is colleague mediator
public interface RoadTrafficPoliceOfficerMediator {
    //Road is concrete colleague class that use Statement interface
    public void registerRoad(Road road);

    //Vehicle is concrete colleague class that use Statement interface
    public void registerVehicle(Vehicle vehicle);

    public boolean isStarted();

    public boolean isStopped();

    public void setStartedStatus(boolean status);

    public void setStoppedStatus(boolean status);

}
