package Airport;

public interface SportPlaneFunction {
    default void doAerobatic(String aerobaticFigure) {
        System.out.println(aerobaticFigure);
    }

}