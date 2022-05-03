package Airport;

public interface SpaceShipFunction {
    default void hyperJump (String Jump){
        System.out.println(Jump);
    }

    default void attackMode (String attack){
        System.out.println(attack);
    }

    default void shieldUp (String deflectorOn){
        System.out.println(deflectorOn);
    }
}
