package Airport;

public class SportBasicPlane extends BasicPlane implements SportPlaneFunction{
    private String aerobaticFigure;


    public SportBasicPlane(String planeName, String takeoff, String landing, String afterburner, int takeoffSpeed, int maxSpeed, int landingSpeed, String aerobaticFigure) {
        super(planeName, takeoff, landing, afterburner, takeoffSpeed, maxSpeed, landingSpeed);
        this.aerobaticFigure = aerobaticFigure;

    }

    @Override
    public void doAerobatic() {
        System.out.println(aerobaticFigure);
    }


}
