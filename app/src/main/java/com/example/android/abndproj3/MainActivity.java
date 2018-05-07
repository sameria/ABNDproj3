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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method calculates the score for the first question, a radio button.
     */
    private int calcQuest1(boolean selectB) {
        int quizScore = 0;
        int quest1Score = 0;
        if (selectB) {
            quest1Score = quest1Score + 20;
        }
        return quest1Score + quizScore;
    }

    /**
     * This method calculates the score for the second question, a radio button.
     */
    private int calcQuest2(boolean selectA) {
        int quizScore = 0;
        int quest1Score = 0;
        if (selectA) {
            quest1Score = quest1Score + 20;
        }
        return quest1Score + quizScore;
    }

    /**
     * This method calculates the score for the third question, a checkbox group button.
     *
     */
    private int calcQuest3() {
        int quizScore = 0;
        int quest3Score = 0;

        CheckBox selectA3 = findViewById(R.id.chOptionOne20);
        CheckBox selectB3 = findViewById(R.id.chOptionTwo21);
        CheckBox selectC3 = findViewById(R.id.chOptionThree22);
        CheckBox selectD3 = findViewById(R.id.chOptionFour23);
        if (selectA3.isChecked() && selectB3.isChecked() && !selectC3.isChecked() && !selectD3.isChecked()) {
            quest3Score = quest3Score + 20;
        }
        return quest3Score + quizScore;
    }
    /**
     * This method calculates the score for the fourth question, a checkbox group button.
     */
    private int calcQuest4() {
        int quizScore = 0;
        int quest4Score = 0;

        CheckBox selectA4 = findViewById(R.id.chOptionOne160);
        CheckBox selectB4 = findViewById(R.id.chOptionOne161);
        CheckBox selectC4 = findViewById(R.id.chOptionOne162);
        CheckBox selectD4 = findViewById(R.id.chOptionOne163);

        if (selectA4.isChecked() && selectB4.isChecked() && !selectC4.isChecked() && !selectD4.isChecked()) {
            quest4Score = quest4Score + 20;
        }
        return quest4Score + quizScore;
    }

    /**
     * This method calculates the score for the fifth question, a text entry question.
     */
    private int calcQuest5() {
        int quizScore = 0;

        String quest5Answer = "Telnet";

        EditText select5 = findViewById(R.id.q5_TextEntry);
        String questionFiveAnswer = select5.getText().toString();
        if (questionFiveAnswer.equalsIgnoreCase(quest5Answer)) {
            quizScore = quizScore + 20;
        } else
            quizScore = 0;

        return quizScore;
    }

    /**
     * This method is called when the submit button is pressed. The toast displays the overall score.
     */
    public void displayToast(View view) {

        EditText nameField = findViewById(R.id.name);
        Editable nameEditable = nameField.getText();
        String name = nameEditable.toString();

        //Radio-group one
        RadioButton answerB = findViewById(R.id.rbOptionTwo80Correct);
        boolean selectB1 = answerB.isChecked();

        //Radio-group two
        RadioButton answerA2 = findViewById(R.id.rbOptionOne143Correct);
        boolean selectA2 = answerA2.isChecked();

        //First checkbox group
        CheckBox quest3Option1 = findViewById(R.id.chOptionOne20);
        quest3Option1.isChecked();
        CheckBox quest3Option2 = findViewById(R.id.chOptionTwo21);
        quest3Option2.isChecked();
        CheckBox quest3Option3 = findViewById(R.id.chOptionThree22);
        quest3Option3.isChecked();
        CheckBox quest3Option4 = findViewById(R.id.chOptionFour23);
        quest3Option4.isChecked();

        //Second checkbox group
        CheckBox quest4Option1 = findViewById(R.id.chOptionOne160);
        quest4Option1.isChecked();
        CheckBox quest4Option2 = findViewById(R.id.chOptionOne161);
        quest4Option2.isChecked();
        CheckBox quest4Option3 = findViewById(R.id.chOptionOne162);
        quest4Option3.isChecked();
        CheckBox quest4Option4 = findViewById(R.id.chOptionOne163);
        quest4Option4.isChecked();

        //Calculates the grade
        int score1 = calcQuest1(selectB1);
        int score2 = calcQuest2(selectA2);
        int score3 = calcQuest3();
        int score4 = calcQuest4();
        int score5 = calcQuest5();

        int overallScore = (score1 + score2 + score3 + score4 + score5);

        if (overallScore < 75) {
            Toast.makeText(MainActivity.this, " Your grade is: " + overallScore + "  Please try again " + name, Toast.LENGTH_LONG).show();
        }// Displays the toast message
        else
            Toast.makeText(MainActivity.this, " Your grade is:  " + overallScore + " Good Job " + name + "!", Toast.LENGTH_LONG).show();
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

        //Reset Question5 editText field
        EditText quest5Field = findViewById(R.id.q5_TextEntry);
        quest5Field.setText(null);

    }
}