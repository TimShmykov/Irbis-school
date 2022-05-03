package Airport;

public interface PlaneFunction { // он стал ругаться когда я захотел запихнуть не конкретные тейкофф и тейкоф спид, а уникальные для каждого самолета
  //   default void takeoff(String takeoff, int takeoffSpeed) {
  //
  //       }

  //   default void landing(String landing, int landingSpeed) {
  //       }

  //   default void afterburningFlight(String afterburner, int maxSpeed) {
  // }

       void takeoff();

       void landing();

       void afterburningFlight();


}

