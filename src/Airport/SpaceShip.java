package Airport;

public class SpaceShip extends BasicPlaneClass implements SpaceShipFunction {
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
    public void hyperJump(String jump) {
        SpaceShipFunction.super.hyperJump(this.jump);
    }

    @Override
    public void attackMode(String attack) {
        SpaceShipFunction.super.attackMode(this.attack);
    }

    @Override
    public void shieldUp(String deflectorOn) {
        SpaceShipFunction.super.shieldUp(this.deflectorOn);
    }
}
