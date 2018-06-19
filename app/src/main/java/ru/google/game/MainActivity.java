package ru.google.game;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // Объявление TextView.
    TextView titleTextView;

    public void onClick(View view) {
        // Генерация случайного числа. (Что загадал компьютер).
        int mNumber = new Random().nextInt(3) + 1;

        // Выбранное пользователем число.
        int mChoosedNumber = 0;

        switch (view.getId()) {
            case R.id.button1:
                mChoosedNumber = 1;
                break;
            case R.id.button2:
                mChoosedNumber = 2;
                break;
            case R.id.button3:
                mChoosedNumber = 3;
                break;
            default:
                break;
        }

        if (mNumber == mChoosedNumber) {
            // Мы угадали число.
            titleTextView.setText("Поздравляем, Вы угадали! Загаданное число было: " + mNumber);
            titleTextView.setTextColor(Color.argb(255, 0, 255, 0));
        } else {
            titleTextView.setText("Вы не угадали. Я загадал: " + mNumber);
            titleTextView.setTextColor(Color.argb(255, 255, 0, 0));
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Инициализация TextView.
        titleTextView = findViewById(R.id.textView);
        titleTextView.setText("Выберите число:");
    }
}
