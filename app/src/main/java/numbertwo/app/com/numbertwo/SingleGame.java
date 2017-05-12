package numbertwo.app.com.numbertwo;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import numbertwo.app.com.gameobjects.Board;
import numbertwo.app.com.gameobjects.Player;

/**
 * Singleton Application lancé automatiquement au démarrage pour gérer les différentes paramètres de l'appli
 * (joueurs, plateau, cases, etc..)
 *
 * Created by kfreyerm on 12/05/2017.
 */

public class SingleGame extends Application  {
    private Board gameBoard;
    private List<Player> players;

    public void setGameBoard(Board gameBoard) {
        this.gameBoard = gameBoard;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Board getGameBoard() {
        return gameBoard;

    }

    public List<Player> getPlayers() {
        return players;
    }

  }
