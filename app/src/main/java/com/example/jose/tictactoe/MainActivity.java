package com.example.jose.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private Button button;
    public TextView texto;
    public ArrayList<Button> botones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = (TextView) findViewById(R.id.titulo);
        botones = new ArrayList<>();

        botones.add((Button) findViewById(R.id.b1));
        botones.add((Button) findViewById(R.id.b2));
        botones.add((Button) findViewById(R.id.b3));
        botones.add((Button) findViewById(R.id.b4));
        botones.add((Button) findViewById(R.id.b5));
        botones.add((Button) findViewById(R.id.b6));
        botones.add((Button) findViewById(R.id.b7));
        botones.add((Button) findViewById(R.id.b8));
        botones.add((Button) findViewById(R.id.b9));

    }

    public void pulsar(View view){
        int cell=0;

        switch (view.getId()){
            case R.id.b1:
                    cell=1;
                    button=findViewById(R.id.b1);
                    break;
            case R.id.b2:
                    cell=2;
                    button=findViewById(R.id.b2);
                    break;
            case R.id.b3:
                    cell=3;
                    button=findViewById(R.id.b3);
                    break;
            case R.id.b4:
                    cell=4;
                    button=findViewById(R.id.b4);
                    break;
            case R.id.b5:
                    cell=5;
                    button=findViewById(R.id.b5);
                    break;
            case R.id.b6:
                    cell=6;
                    button=findViewById(R.id.b6);
                    break;
            case R.id.b7:
                    cell=7;
                    button=findViewById(R.id.b7);
                    break;
            case R.id.b8:
                    cell=8;
                    button=findViewById(R.id.b8);
                    break;
            case R.id.b9:
                    cell=9;
                    button=findViewById(R.id.b9);
                    break;
        }

        playGame(cell, button);
        //Toast.makeText(this, String.valueOf(cell),Toast.LENGTH_SHORT).show();
    }

    int currentPlayer=1;
    ArrayList<Integer> selectedButtonP1 = new ArrayList<Integer>();
    ArrayList<Integer> selectedButtonP2 = new ArrayList<Integer>();

    public void playGame(int cell, Button button){

        if (currentPlayer==1) {
            selectedButtonP1.add(cell);
            button.setText("X");
            button.setEnabled(false);
            texto.setText("Turno jugador 2");
            currentPlayer=2;
        }
        else {
            selectedButtonP2.add(cell);
            button.setText("O");
            button.setEnabled(false);
            texto.setText("Turno jugador 1");
            currentPlayer=1;
        }

        checkWinner(selectedButtonP1,selectedButtonP2);
    }

    public void endGame(){
        texto.setText("FIN DE LA PARTIDA");
        for (int i=0; i<9; i++) {
            botones.get(i).setEnabled(false);
        }
    }

    public void restartGame(View view){
        for (int i=0; i<9; i++){
            botones.get(i).setText("");
            botones.get(i).setEnabled(true);
        }
        selectedButtonP1.clear();
        selectedButtonP2.clear();
        texto.setText("Turno jugador 1");
        currentPlayer=1;
    }

    public void checkWinner(ArrayList selectedButtonP1, ArrayList selectedButtonP2){

        //GANA JUGADOR 1
        if (selectedButtonP1.contains(1) && selectedButtonP1.contains(2) && selectedButtonP1.contains(3)){
            Toast.makeText(this, "GANA JUGADOR 1",Toast.LENGTH_SHORT).show();
            endGame();
        }
        else if (selectedButtonP1.contains(4) && selectedButtonP1.contains(5) && selectedButtonP1.contains(6)){
            Toast.makeText(this, "GANA JUGADOR 1",Toast.LENGTH_SHORT).show();
            endGame();
        }
        else if (selectedButtonP1.contains(7) && selectedButtonP1.contains(8) && selectedButtonP1.contains(9)){
            Toast.makeText(this, "GANA JUGADOR 1",Toast.LENGTH_SHORT).show();
            endGame();
        }
        else if (selectedButtonP1.contains(1) && selectedButtonP1.contains(4) && selectedButtonP1.contains(7)){
            Toast.makeText(this, "GANA JUGADOR 1",Toast.LENGTH_SHORT).show();
            endGame();
        }
        else if (selectedButtonP1.contains(2) && selectedButtonP1.contains(5) && selectedButtonP1.contains(8)){
            Toast.makeText(this, "GANA JUGADOR 1",Toast.LENGTH_SHORT).show();
            endGame();
        }
        else if (selectedButtonP1.contains(3) && selectedButtonP1.contains(6) && selectedButtonP1.contains(9)){
            Toast.makeText(this, "GANA JUGADOR 1",Toast.LENGTH_SHORT).show();
            endGame();
        }
        else if (selectedButtonP1.contains(1) && selectedButtonP1.contains(5) && selectedButtonP1.contains(9)){
            Toast.makeText(this, "GANA JUGADOR 1",Toast.LENGTH_SHORT).show();
            endGame();
        }
        else if (selectedButtonP1.contains(3) && selectedButtonP1.contains(5) && selectedButtonP1.contains(7)){
            Toast.makeText(this, "GANA JUGADOR 1",Toast.LENGTH_SHORT).show();
            endGame();
        }

        //GANA JUGADOR 2
        if (selectedButtonP2.contains(1) && selectedButtonP2.contains(2) && selectedButtonP2.contains(3)){
            Toast.makeText(this, "GANA JUGADOR 2",Toast.LENGTH_SHORT).show();
            endGame();
        }
        else if (selectedButtonP2.contains(4) && selectedButtonP2.contains(5) && selectedButtonP2.contains(6)){
            Toast.makeText(this, "GANA JUGADOR 2",Toast.LENGTH_SHORT).show();
            endGame();
        }
        else if (selectedButtonP2.contains(7) && selectedButtonP2.contains(8) && selectedButtonP2.contains(9)){
            Toast.makeText(this, "GANA JUGADOR 2",Toast.LENGTH_SHORT).show();
            endGame();
        }
        else if (selectedButtonP2.contains(1) && selectedButtonP2.contains(4) && selectedButtonP2.contains(7)){
            Toast.makeText(this, "GANA JUGADOR 2",Toast.LENGTH_SHORT).show();
            endGame();
        }
        else if (selectedButtonP2.contains(2) && selectedButtonP2.contains(5) && selectedButtonP2.contains(8)){
            Toast.makeText(this, "GANA JUGADOR 2",Toast.LENGTH_SHORT).show();
            endGame();
        }
        else if (selectedButtonP2.contains(3) && selectedButtonP2.contains(6) && selectedButtonP2.contains(9)){
            Toast.makeText(this, "GANA JUGADOR 2",Toast.LENGTH_SHORT).show();
            endGame();
        }
        else if (selectedButtonP2.contains(1) && selectedButtonP2.contains(5) && selectedButtonP2.contains(9)){
            Toast.makeText(this, "GANA JUGADOR 2",Toast.LENGTH_SHORT).show();
            endGame();
        }
        else if (selectedButtonP2.contains(3) && selectedButtonP2.contains(5) && selectedButtonP2.contains(7)){
            Toast.makeText(this, "GANA JUGADOR 2",Toast.LENGTH_SHORT).show();
            endGame();
        }

        //EMPATE
        if ((selectedButtonP2.size()==4 && selectedButtonP1.size()==5) || (selectedButtonP2.size()==5 && selectedButtonP1.size()==4)) {
            Toast.makeText(this, "EMPATE",Toast.LENGTH_SHORT).show();
            endGame();
        }
    }
}