package pl.kocan.strategy.pattern;

import pl.kocan.strategy.pattern.chef.Chef;

public class Main {

    public static void main(String[] args) {

        // new order - hard eggs

        final Chef chef = new Chef("Gordon Gessler");

        chef.cook();

        // new order - soft eggs
        chef.cook();

    }
}
