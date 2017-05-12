package numbertwo.app.com.gameobjects;

import android.app.Activity;
import android.app.Application;

import java.util.List;

import numbertwo.app.com.numbertwo.SingleGame;

/**
 * Created by kfreyerm on 12/05/2017.
 */

public class Player {

    private String name;
    private List<String> rules;
    private Board boardGame;



    /**
     * Constructeur
     */
    public Player(String playerName, Application app){



        name = playerName;
        boardGame = boardGame;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
