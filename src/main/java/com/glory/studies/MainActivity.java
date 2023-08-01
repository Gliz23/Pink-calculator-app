package com.glory.studies;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    Button button1 = findViewById(R.id.button1);
    Button button2 = findViewById(R.id.button2);
    Button button3 = findViewById(R.id.button3);
    Button button4 = findViewById(R.id.button4);
    Button button5 = findViewById(R.id.button5);
    Button button6 = findViewById(R.id.button6);
    Button button7 = findViewById(R.id.button7);
    Button button8 = findViewById(R.id.button8);
    Button button9 = findViewById(R.id.button9);
    Button button0 = findViewById(R.id.button0);
    Button addbutton = findViewById(R.id.add_button);
    Button minusbutton = findViewById(R.id.minus_button);
    Button timesbutton = findViewById(R.id.times_button);
    Button dividebutton = findViewById(R.id.divide_button);
    Button equalsbutton = findViewById(R.id.equals_button);
    Button deletebutton = findViewById(R.id.delete_button);


    EditText inputText = findViewById(R.id.question);
    inputText.setSelection(inputText.getText().length());

    EditText outputText = findViewById(R.id.answer);
    outputText.setSelection(inputText.getText().length());

    inputText.setFocusable(false);

    inputText.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            inputText.setFocusableInTouchMode(true);
            inputText.requestFocus();
        }
    });




    button1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String currentText = inputText.getText().toString();
            String appendedText = currentText + button1.getText().toString();
            inputText.setText(appendedText);
            inputText.setTextColor(Color.BLACK);
        }

    }) ;

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = inputText.getText().toString();
                String appendedText = currentText + button2.getText().toString();
                inputText.setText(appendedText);
                inputText.setTextColor(Color.BLACK);
            }

        }) ;

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = inputText.getText().toString();
                String appendedText = currentText + button3.getText().toString();
                inputText.setText(appendedText);
                inputText.setTextColor(Color.BLACK);
            }

        }) ;

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = inputText.getText().toString();
                String appendedText = currentText + button4.getText().toString();
                inputText.setText(appendedText);
                inputText.setTextColor(Color.BLACK);
            }

        }) ;

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = inputText.getText().toString();
                String appendedText = currentText + button5.getText().toString();
                inputText.setText(appendedText);
                inputText.setTextColor(Color.BLACK);
            }

        }) ;

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = inputText.getText().toString();
                String appendedText = currentText + button6.getText().toString();
                inputText.setText(appendedText);
                inputText.setTextColor(Color.BLACK);
            }

        }) ;

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = inputText.getText().toString();
                String appendedText = currentText + button7.getText().toString();
                inputText.setText(appendedText);
                inputText.setTextColor(Color.BLACK);
            }

        }) ;

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = inputText.getText().toString();
                String appendedText = currentText + button8.getText().toString();
                inputText.setText(appendedText);
                inputText.setTextColor(Color.BLACK);
            }

        }) ;

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = inputText.getText().toString();
                String appendedText = currentText + button9.getText().toString();
                inputText.setText(appendedText);
                inputText.setTextColor(Color.BLACK);
            }

        }) ;

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = inputText.getText().toString();
                String appendedText = currentText + button0.getText().toString();
                inputText.setText(appendedText);
                inputText.setTextColor(Color.BLACK);
            }

        }) ;

        addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = inputText.getText().toString();
                String appendedText = currentText + addbutton.getText().toString();
                inputText.setText(appendedText);
                inputText.setTextColor(Color.BLACK);
            }

        }) ;

        minusbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = inputText.getText().toString();
                String appendedText = currentText + minusbutton.getText().toString();
                inputText.setText(appendedText);
                inputText.setTextColor(Color.BLACK);
            }

        }) ;

        timesbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = inputText.getText().toString();
                String appendedText = currentText + timesbutton.getText().toString();
                inputText.setText(appendedText);
                inputText.setTextColor(Color.BLACK);
            }

        }) ;

        dividebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = inputText.getText().toString();
                String appendedText = currentText + dividebutton.getText().toString();
                inputText.setText(appendedText);
                inputText.setTextColor(Color.BLACK);
            }

        }) ;

        equalsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = inputText.getText().toString();
                String[] tokens = currentText.split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)");
                double result = 0;
                String operator = "";

                for (int i = 0; i < tokens.length; i++) {
                    String token = tokens[i];
                    if (token.equals("+") || token.equals("-") || token.equals("×") || token.equals("÷")) {
                        operator = token;
                    } else {
                        double operand = Double.parseDouble(token);
                        if (operator.equals("")) {
                            result = operand;
                        } else if (operator.equals("+")) {
                            result += operand;
                        } else if (operator.equals("-")) {
                            result -= operand;
                        } else if (operator.equals("*")) {
                            result *= operand;
                        } else if (operator.equals("%")) {
                            result /= operand;
                        }
                    }
                }

                String resultText = String.format("%.2f", result);
                outputText.setText(resultText);
                outputText.setTextColor(Color.BLACK);
            }
        });

        deletebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = inputText.getText().toString();
                int cursorPosition = inputText.getSelectionStart();
                if ( cursorPosition > 0){
                    String newText = currentText.substring(0, cursorPosition -1);
                    inputText.setText(newText);
                    inputText.setSelection(cursorPosition - 1);
                }
            }

        }) ;



         ;
















    }
}