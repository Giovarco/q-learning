package environment;

import static environment.Tile.*;

public class Environment {

    Tile[][] tiles;

    public Environment() {
        tiles = new Tile[][]{
            {O, _, _},
            {G, O, S},
            {_, O, _},
            {_, _, _},
            {O, _, O}
        };
    }

}
