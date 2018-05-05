package com.example.android.abndproj3;

import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.widget.RadioButton;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    /**
     * Initialize Variables
     */
    int quizScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method calculates the score for the first question, a radio button.
     */
    private int calcQuest1(boolean selectA, boolean selectB, boolean selectC, boolean selectD) {
        int quest1Score = 0;
        if (selectA) {
            quest1Score = quest1Score + 0;
        }
        if (selectB) {
            quest1Score = quest1Score + 25;
        }
        if (selectC) {
            quest1Score = quest1Score + 0;
        }
        if (selectD) {
            quest1Score = quest1Score + 0;
        }
        return quest1Score + quizScore;
    }

    /**
     * This method calculates the score for the second question, a radio button.
     */
    private int calcQuest2(boolean selectA, boolean selectB, boolean selectC, boolean selectD) {
        int quest1Score = 0;
        if (selectA) {
            quest1Score = quest1Score + 25;
        }
        if (selectB) {
            quest1Score = quest1Score + 0;
        }
        if (selectC) {
            quest1Score = quest1Score + 0;
        }
        if (selectD) {
            quest1Score = quest1Score + 0;
        }
        return quest1Score + quizScore;
    }

    /**
     * This method calculates the score for the third question, a checkbox group button.
     */
    private int calcQuest3(boolean selectA3, boolean selectB3, boolean selectC3, boolean selectD3) {

        int quest3Score = 0;
        int quest3bScore = 0;

        if (selectA3) {
            quest3Score = quest3bScore + 25;
        }
        if (selectB3) {
            quest3Score = quest3bScore + 25;
        }
        if (selectC3) {
            quest3Score = quest3bScore + 0;
        }
        if (selectD3) {
            quest3Score = quest3bScore + 0;
        }
        if (quest3bScore > 6) ;
        return (quest3bScore * 0) + quest3Score + quizScore;
    }


    /**
     * This method calculates the score for the third question, a checkbox group button.
     */
    private int calcQuest4(boolean selectA4, boolean selectB4, boolean selectC4, boolean selectD4) {

        int quest4Score = 0;
        int quest4bScore = 0;

        if (selectA4) {
            quest4Score = quest4bScore + 25;
        }
        if (selectB4) {
            quest4Score = quest4bScore + 25;
        }
        if (selectC4) {
            quest4Score = quest4bScore + 0;
        }
        if (selectD4) {
            quest4Score = quest4bScore + 0;
        }
        if (quest4bScore > 25) ;
        return (quest4bScore * 0) + quest4Score + quizScore;
    }

    /**
     * This method is called when the submit button is pressed. The toast displays the overall score.
     */
    public void displayToast(View view) {

        EditText nameField = findViewById(R.id.name);
        Editable nameEditable = nameField.getText();
        String name = nameEditable.toString();

        //Radio-group one
        RadioButton answerA = findViewById(R.id.rbOptionOne433);
        boolean selectA1 = answerA.isChecked();
        RadioButton answerB = findViewById(R.id.rbOptionTwo80Correct);
        boolean selectB1 = answerB.isChecked();
        RadioButton answerC = findViewById(R.id.rbOptionThree143);
        boolean selectC1 = answerC.isChecked();
        RadioButton answerD = findViewById(R.id.rbOptionFour70);
        boolean selectD1 = answerD.isChecked();

        //Radio-group two
        RadioButton answerA2 = findViewById(R.id.rbOptionOne143Correct);
        boolean selectA2 = answerA2.isChecked();
        RadioButton answerB2 = findViewById(R.id.rbOptionTwo443);
        boolean selectB2 = answerB2.isChecked();
        RadioButton answerC2 = findViewById(R.id.rbOptionThree179);
        boolean selectC2 = answerC2.isChecked();
        RadioButton answerD2 = findViewById(R.id.rbOptionFour123);
        boolean selectD2 = answerD2.isChecked();

        //First checkbox group
        CheckBox quest3Option1 = findViewById(R.id.chOptionOne20);
        boolean selectA3 = quest3Option1.isChecked();
        CheckBox quest3Option2 = findViewById(R.id.chOptionTwo21);
        boolean selectB3 = quest3Option2.isChecked();
        CheckBox quest3Option3 = findViewById(R.id.chOptionThree22);
        boolean selectC3 = quest3Option3.isChecked();
        CheckBox quest3Option4 = findViewById(R.id.chOptionFour23);
        boolean selectD3 = quest3Option4.isChecked();

        //Second checkbox group
        CheckBox quest4Option1 = findViewById(R.id.chOptionOne160);
        boolean selectA4 = quest4Option1.isChecked();
        CheckBox quest4Option2 = findViewById(R.id.chOptionOne161);
        boolean selectB4 = quest4Option2.isChecked();
        CheckBox quest4Option3 = findViewById(R.id.chOptionOne162);
        boolean selectC4 = quest4Option3.isChecked();
        CheckBox quest4Option4 = findViewById(R.id.chOptionOne163);
        boolean selectD4 = quest4Option4.isChecked();

        //Calculates the grade
        int score1 = calcQuest1(selectA1, selectB1, selectC1, selectD1);
        int score2 = calcQuest2(selectA2, selectB2, selectC2, selectD2);
        int score3 = calcQuest3(selectA3, selectB3, selectC3, selectD3);
        int score4 = calcQuest4(selectA4, selectB4, selectC4, selectD4);

        // Displays the toast message
        Toast.makeText(MainActivity.this, name + " Your grade is: " + (score1 + score2 + score3 + score4), Toast.LENGTH_LONG).show();
    }

    /**
     * Method called when reset button is clicked. Resets all fields to Null.
     */
    public void resetToZero(View v) {
        //Reset Name field
        EditText nameField = findViewById(R.id.name);
        nameField.setText(null);

        //Reset radio-group one
        RadioButton answerA1 = findViewById(R.id.rbOptionOne433);
        answerA1.setChecked(false);
        RadioButton answerB1 = findViewById(R.id.rbOptionTwo80Correct);
        answerB1.setChecked(false);
        RadioButton answerC1 = findViewById(R.id.rbOptionThree143);
        answerC1.setChecked(false);
        RadioButton answerD1 = findViewById(R.id.rbOptionFour70);
        answerD1.setChecked(false);

        //Reset radio-group two
        RadioButton answerA2 = findViewById(R.id.rbOptionOne143Correct);
        answerA2.setChecked(false);
        RadioButton answerB2 = findViewById(R.id.rbOptionTwo443);
        answerB2.setChecked(false);
        RadioButton answerC2 = findViewById(R.id.rbOptionThree179);
        answerC2.setChecked(false);
        RadioButton answerD2 = findViewById(R.id.rbOptionFour123);
        answerD2.setChecked(false);

        //Reset checkbox group1
        CheckBox answerA3 = findViewById(R.id.chOptionOne20);
        answerA3.setChecked(false);
        CheckBox selectB3 = findViewById(R.id.chOptionTwo21);
        selectB3.setChecked(false);
        CheckBox selectC3 = findViewById(R.id.chOptionThree22);
        selectC3.setChecked(false);
        CheckBox selectD3 = findViewById(R.id.chOptionFour23);
        selectD3.setChecked(false);

        //Reset checkbox group2
        CheckBox answerA4 = findViewById(R.id.chOptionOne160);
        answerA4.setChecked(false);
        CheckBox selectB4 = findViewById(R.id.chOptionOne161);
        selectB4.setChecked(false);
        CheckBox selectC4 = findViewById(R.id.chOptionOne162);
        selectC4.setChecked(false);
        CheckBox selectD4 = findViewById(R.id.chOptionOne163);
        selectD4.setChecked(false);

    }
}