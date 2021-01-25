package Mediator;

//Concrete Colleague class
public class Road implements Statement {
    private RoadTrafficPoliceOfficerMediator rtpoMediator;

    public Road(RoadTrafficPoliceOfficerMediator rtpoMediator){
        this.rtpoMediator = rtpoMediator;
        rtpoMediator.setStartedStatus(true);
    }
    @Override
    public void start() {
        System.out.println("Starting permission granted.....");
        rtpoMediator.setStartedStatus(true);

    }

    @Override
    public void stop() {
        System.out.println("Stopping permission granted......");
        rtpoMediator.setStoppedStatus(true);
    }
}
