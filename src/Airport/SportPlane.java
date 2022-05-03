package Airport;

public class SportPlane extends BasicPlaneClass implements SportPlaneFunction{
    private String aerobaticFigure;


    public SportPlane(String planeName, String takeoff, String landing, String afterburner, int takeoffSpeed, int maxSpeed, int landingSpeed, String aerobaticFigure) {
        super(planeName, takeoff, landing, afterburner, takeoffSpeed, maxSpeed, landingSpeed);
        this.aerobaticFigure = aerobaticFigure;

    }

    @Override
    public void doAerobatic(String aerobaticFigure) {
        SportPlaneFunction.super.doAerobatic(this.aerobaticFigure);
    }
}
