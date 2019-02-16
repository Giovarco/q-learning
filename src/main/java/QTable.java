import environment.Tile;

public class QTable {

    double[][] qualities;

    public QTable() {
        int states = Tile.values().length;
        int actions = Action.values().length;
        qualities = new double[actions][states];
    }
}
