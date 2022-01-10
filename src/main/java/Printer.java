public class Printer {
    private int paper;
    private int volume;

    public Printer(int volume, int paper){
        this.paper = paper;
        this.volume = volume;
    }

    public int getPaper() {
        return paper;
    }

    public void print(int pages, int copies) {
        if(paper >= pages * copies){
            paper -= (pages * copies);
            volume -= (pages * copies);
        }
    }

    public int getVolume() {
        return volume;
    }
}
