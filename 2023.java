public class 2023 {
    private String name;
    private int strength;
    private String origin;

    public 2023(String name, int strength, String origin) {
        this.name = name;
        this.strength = strength;
        this.origin = origin;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public String getOrigin() {
        return origin;
    }

    @Override
    public String toString() {
        return "2023{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", origin='" + origin + '\'' +
                '}';
    }
}
