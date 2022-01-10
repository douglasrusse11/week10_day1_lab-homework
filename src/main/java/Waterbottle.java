public class Waterbottle {
    public Waterbottle(int volume) {
        this.volume = volume;
    }

    private int volume;

    public int getVolume() {
        return this.volume;
    }

    public void drink() {
        volume -= 10;
    }

    public void empty() {
        volume -= volume;
    }

    public void fill() {
        volume = 100;
    }
}
