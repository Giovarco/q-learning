import environment.Tile;

public class QTable {

    double[][] qualities;

    double explorationRate;

    public QTable() {
        int states = Tile.values().length;
        int actions = Action.values().length;
        qualities = new double[actions][states];

        explorationRate = 1;
    }
}
