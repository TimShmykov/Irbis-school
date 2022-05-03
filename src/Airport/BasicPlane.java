package Airport;

public class BasicPlane implements PlaneFunction {
    private String planeName;
    private String takeoff;
    private String landing;
    private String afterburner;
    private int takeoffSpeed;
    private int maxSpeed;
    private int landingSpeed;

    public BasicPlane(String planeName, String takeoff, String landing, String afterburner, int takeoffSpeed, int maxSpeed, int landingSpeed) {
        this.planeName = planeName;
        this.takeoff = takeoff;
        this.landing = landing;
        this.takeoffSpeed = takeoffSpeed;
        this.maxSpeed = maxSpeed;
        this.landingSpeed = landingSpeed;
        this.afterburner = afterburner;
    }

    @Override
    public void takeoff() {
        System.out.println(takeoff + "При скорости = " + takeoffSpeed);

    }

    @Override
    public void landing() {
        System.out.println(landing + "При скорости =  " + landingSpeed);
    }

    @Override
    public void afterburningFlight() {
        System.out.println(afterburner + maxSpeed);
    }
}
