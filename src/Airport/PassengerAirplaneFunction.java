package Airport;

public interface PassengerAirplaneFunction {
    default void getPassengers(String welcomePassenger, int numberOfPassenger) {
        System.out.println(welcomePassenger + numberOfPassenger);
    }

    default void releasePassengers(String goodbyePassenger, int numberOfPassenger) {
        System.out.println(goodbyePassenger + numberOfPassenger);
    }

}


