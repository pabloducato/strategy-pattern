package pl.kocan.strategy.pattern.egg;

public class HardBoiledEggCooker implements EggCooker {

    @Override
    public void cookEgg() {
        System.out.println("Gotuję jajka na twardo!");
    }
}
