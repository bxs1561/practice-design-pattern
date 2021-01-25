package Mediator;

//This is concrete mediator
public class RTPOMediator implements RoadTrafficPoliceOfficerMediator {
    private Vehicle vehicle;

    private Road road;

    public Boolean start, stop;
    @Override
    public void registerRoad(Road road) {
        this.road = road;
    }

    @Override
    public void registerVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public boolean isStarted() {
        return start;
    }

    @Override
    public boolean isStopped() {
        return stop;
    }

    @Override
    public void setStartedStatus(boolean status) {
        start=status;

    }

    @Override
    public void setStoppedStatus(boolean status) {
        stop = status;
    }
}
