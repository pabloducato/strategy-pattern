package pl.kocan.strategy.pattern.chef;

import pl.kocan.strategy.pattern.egg.EggCooker;

public class Chef {

    private String name;
    private EggCooker eggCooker;

    public void cook() {
        this.eggCooker.cookEgg();
    }

    public Chef(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EggCooker getEggCooker() {
        return eggCooker;
    }

    public void setEggCooker(EggCooker eggCooker) {
        this.eggCooker = eggCooker;
    }
}
