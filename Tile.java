import java.util.ArrayList;
// import java.util.Scanner;

public class Tile {
    private int plowState; // 0 = for no rocks and unplowed,
    // 1 = for no rocks and plowed,
    // 2 = for with rocks
    private int seedState; // 0 = unplanted, 1 = planted

    public Tile() {
        plowState = 0;
        seedState = 0;
    }

    public void Plow(ArrayList<Integer> array, int x) {
        if (array.get(x) == 0) {
            array.set(x, 1);
            System.out.println("Tile has been successfully plowed!");
        } else if (array.get(x) == 1) {
            System.out.println("Tile is already plowed!");
        } else if (array.get(x) == 2) {
            System.out.println("Tile cannot be plowed as there are rocks on it.");
        }
    }

    public Integer getPlowState() {
        return plowState;
    }

    public void setPlowState(int plowState) {
        this.plowState = plowState;
    }

    public int getSeedState() {
        return seedState;
    }

    public void setSeedState(int seedState) {
        this.seedState = seedState;
    }

}
