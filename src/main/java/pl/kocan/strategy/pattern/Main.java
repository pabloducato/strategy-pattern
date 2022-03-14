package pl.kocan.strategy.pattern;

import pl.kocan.strategy.pattern.chef.Chef;
import pl.kocan.strategy.pattern.egg.HardBoiledEggCooker;
import pl.kocan.strategy.pattern.egg.SoftBoiledEggCooker;

public class Main {

    public static void main(String[] args) {

        // new order - hard eggs

        final Chef chef = new Chef("Gordon Gessler");

        chef.setEggCooker(new HardBoiledEggCooker());

        chef.cook();

        // new order - soft eggs
//        chef.cook();

        chef.setEggCooker(new SoftBoiledEggCooker());

        chef.cook();

    }
}
