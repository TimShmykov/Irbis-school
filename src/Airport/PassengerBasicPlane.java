package Airport;

public class PassengerBasicPlane extends BasicPlane implements PassengerAirplaneFunction {
    private String welcomePassenger;
    private String goodbyePassenger;
    private int numberOfPassenger;

    public PassengerBasicPlane(String planeName, String welcomePassenger, String goodbyePassenger, String takeoff, String landing, String afterburner, int takeoffSpeed, int maxSpeed, int landingSpeed, int numberOfPassenger) {
        super(planeName, takeoff, landing, afterburner, takeoffSpeed, maxSpeed, landingSpeed);
        this.welcomePassenger = welcomePassenger;
        this.goodbyePassenger = goodbyePassenger;
        this.numberOfPassenger = numberOfPassenger;
    }


    @Override
    public void getPassengers() {
        System.out.println(welcomePassenger + numberOfPassenger);
    }

    @Override
    public void releasePassengers() {
        System.out.println(goodbyePassenger + numberOfPassenger);
    }
}
