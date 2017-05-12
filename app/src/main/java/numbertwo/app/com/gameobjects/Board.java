package numbertwo.app.com.gameobjects;

import java.util.List;

/**
 * Created by kfreyerm on 12/05/2017.
 */

public class Board {

    private List<Square> gameSquares;
    private List<String> generalRules;
    private Dice dice;

    public Board(){

        // Initialiser plateau à 15 cases avec cases simples
        for (int i = 0; i < 15; i++) {
            gameSquares.add(i, new Square(i));
        }
    }

}
