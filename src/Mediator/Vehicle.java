package Mediator;

//This is concrete Colleague class
public class Vehicle implements Statement{
    private RoadTrafficPoliceOfficerMediator rtpoMediator;

    public Vehicle(RoadTrafficPoliceOfficerMediator rtpoMediator){
        this.rtpoMediator = rtpoMediator;
    }

    @Override
    public void start() {
        if(rtpoMediator.isStarted()){
            System.out.println("Started.....");
            rtpoMediator.setStartedStatus(true);
            rtpoMediator.setStoppedStatus(false);

        }
        else {
            System.out.println("Wait to start");
        }

    }

    @Override
    public void stop() {
        if(rtpoMediator.isStopped()){
            System.out.println("stopped...");
            rtpoMediator.setStoppedStatus(true);
            rtpoMediator.setStartedStatus(false);

        }
        else {
            System.out.println("wait to stop");
        }

    }

    public void getReady(){
        System.out.println("Getting ready....");
    }
}
