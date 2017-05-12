package numbertwo.app.com.numbertwo;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

import numbertwo.app.com.gameobjects.Player;


public class MainActivity extends AppCompatActivity {

    public static String EXTRA_MESSAGE;
    private EditText editTxt;
    private Button btn;
    private ListView list;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> arrayList;
    private Button btnValidation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("MainActicity","Creation");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Récupère le contexte de l'application
        final SingleGame app = (SingleGame) getApplicationContext();
        app.setPlayers(new ArrayList<Player>());


        editTxt = (EditText) findViewById(R.id.editText);
        btn = (Button) findViewById(R.id.button);
        btnValidation = (Button) findViewById(R.id.button2);
        list = (ListView) findViewById(R.id.listView);
        arrayList = new ArrayList<String>();

        // Adapter: You need three parameters 'the context, id of the layout (it will be where the data is shown),
        // and the array that contains the data
        adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item, arrayList);

        // Here, you set the data in your ListView
        list.setAdapter(adapter);

        btn.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {

                                       // this line adds the data of your EditText and puts in your array
                                       arrayList.add(editTxt.getText().toString());

                                       // Crée le joueur
                                       Player player = new Player(editTxt.getText().toString(),app);
                                       app.getPlayers().add(player);
                                       editTxt.getText().clear();
                                       // next thing you have to do is check if your adapter has changed
                                       adapter.notifyDataSetChanged();
                                   }
    });

        /*btnValidation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("My app", app.getPlayers().get(2).getClass().getName());
                Log.d("My app", app.getPlayers().get(2).getClass().getName());



            }
        });*/
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {

        SingleGame app = (SingleGame) getApplicationContext();

        Intent intent = new Intent(this, DisplayMessageActivity.class);
        /*EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();*/
        String message = app.getPlayers().get(2).getName();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
