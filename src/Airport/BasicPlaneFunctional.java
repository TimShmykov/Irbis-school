package Airport;

public interface BasicPlaneFunctional { // он стал ругаться когда я захотел запихнуть не конкретные тейкофф и тейкоф спид, а уникальные для каждого самолета
    default void takeoff(String takeoff, int takeoffSpeed) {
        System.out.println(takeoff + "При скорости = " + takeoffSpeed);
    }

    default void landing(String landing, int landingSpeed) {
        System.out.println(landing + "При скорости =  " + landingSpeed);
    }

    default void afterburningFlight(String afterburner, int maxSpeed) {
        System.out.println(afterburner + maxSpeed);
    }

    //   void takeoff();
//
    //   void landing();
    //
    //   void afterburningFlight();


}

