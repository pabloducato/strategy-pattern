package pl.kocan.strategy.pattern.egg;

public class SoftBoiledEggCooker implements EggCooker {

    @Override
    public void cookEgg() {
        System.out.println("Gotuję jajka na miękko!");
    }
}
