package Airport;

public class BasicPlaneClass implements BasicPlaneFunctional {
    private String planeName;
    private String takeoff;
    private String landing;
    private String afterburner;
    private int takeoffSpeed;
    private int maxSpeed;
    private int landingSpeed;

    public BasicPlaneClass(String planeName, String takeoff, String landing, String afterburner, int takeoffSpeed, int maxSpeed, int landingSpeed) {
        this.planeName = planeName;
        this.takeoff = takeoff;
        this.landing = landing;
        this.takeoffSpeed = takeoffSpeed;
        this.maxSpeed = maxSpeed;
        this.landingSpeed = landingSpeed;
        this.afterburner = afterburner;
    }

    @Override // ¯\_(ツ)_/¯ задача выводить сразу значения в самолете, но все-равно приходиться прописывать стринг и инт, хотя они беруться из объекта plane. ?!
    public void takeoff(String takeoff, int takeoffSpeed) {
        BasicPlaneFunctional.super.takeoff(this.takeoff, this.takeoffSpeed);

    }

    @Override
    public void landing(String landing, int landingSpeed) {
        BasicPlaneFunctional.super.landing(this.landing, this.landingSpeed);
    }

    @Override
    public void afterburningFlight(String afterburner, int maxSpeed) {
        BasicPlaneFunctional.super.afterburningFlight(this.afterburner, this.maxSpeed);
    }
}
