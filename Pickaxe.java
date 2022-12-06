import java.util.ArrayList;

public class Pickaxe {

    public void RemoveRock(ArrayList<Tile> array, int x, Player p) {

        if (array.get(x).getRockState() == 0) {
            System.out.println("Sorry. There seems to be no rock present on this tile.");
        } else if (array.get(x).getRockState() == 1 && p.getOcoins() >= 50) {
            array.get(x).setRockState(0);
            p.setOcoins(p.getOcoins() - 50);
            System.out.println(
                    "Rock has successfully been removed from selected tile. Deducting 50 Objectcoins from player's inventory ("
                            + p.getOcoins() + " Objectcoins remaining.");
            array.get(x).getPlayerExp().GainExp(15, array.get(x).getPlayerExp());
        } else {
            System.out.println("Sorry. You do not seem to have enough Objectcoins to remove rocks from tiles.");
        }
    }
}
