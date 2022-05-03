package Airport;

public class SpaceShip extends BasicPlane implements SpaceShipFunction {
    String jump;
    String attack;
    String deflectorOn;

    public SpaceShip(String planeName, String takeoff, String landing, String afterburner, String jump, String attack, String deflectorOn, int takeoffSpeed, int maxSpeed, int landingSpeed) {
        super(planeName, takeoff, landing, afterburner, takeoffSpeed, maxSpeed, landingSpeed);
        this.attack = attack;
        this.jump = jump;
        this.deflectorOn = deflectorOn;
    }

    @Override
    public void hyperJump() {
        System.out.println(jump);
    }

    @Override
    public void attackMode() {
        System.out.println(attack);

    }

    @Override
    public void shieldUp() {
        System.out.println(deflectorOn);
    }


}
