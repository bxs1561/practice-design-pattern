package Mediator;

public class MediatorDemo {
    public static void main(String []args){

        RTPOMediator rtpoMediator = new RTPOMediator();
        Vehicle honda = new Vehicle(rtpoMediator);
        Road road = new Road(rtpoMediator);

        rtpoMediator.registerVehicle(honda);
        rtpoMediator.registerRoad(road);
        honda.getReady();
        road.start();
        honda.start();
        honda.stop();

    }
}
