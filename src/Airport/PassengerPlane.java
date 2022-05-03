package Airport;

public class PassengerPlane extends BasicPlaneClass implements PassengerAirplaneFunction {
    private String welcomePassenger;
    private String goodbyePassengers;
    private int numberOfPassenger;

    public PassengerPlane(String planeName, String welcomePassenger, String goodbyePassengers, String takeoff, String landing, String afterburner, int takeoffSpeed, int maxSpeed, int landingSpeed, int numberOfPassenger) {
        super(planeName, takeoff, landing, afterburner, takeoffSpeed, maxSpeed, landingSpeed);
        this.welcomePassenger = welcomePassenger;
        this.goodbyePassengers = goodbyePassengers;
        this.numberOfPassenger = numberOfPassenger;
    }


    @Override
    public void getPassengers(String welcomePassenger, int numberOfPassenger) {
        PassengerAirplaneFunction.super.getPassengers(this.welcomePassenger, this.numberOfPassenger);
    }

    @Override
    public void releasePassengers(String goodbyePassenger, int numberOfPassenger) {
        PassengerAirplaneFunction.super.releasePassengers(this.goodbyePassengers, this.numberOfPassenger);
    }
}
