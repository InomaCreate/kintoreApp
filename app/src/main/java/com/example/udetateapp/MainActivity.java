package com.example.udetateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btClear;
    Button btCounter;
    private int Cnt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 各ボタンのIDを取得する
        btClear = findViewById(R.id.button_clear);
        btCounter = findViewById(R.id.button_counter);

        // カウンターボタンのテキストサイズを設定する
        btCounter.setTextSize(56f);

        // 各ボタンのリスナークラスを登録
        btClear.setOnClickListener(new clearListener());
        btCounter.setOnClickListener(new counterListener());


    }


    // クリアーボタンのリスナークラス
    private class clearListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Cnt=0;  // カウンタークリア
            btCounter.setText(String.valueOf(Cnt));
        }
    }

    // カウンターボタンのリスナークラス
    private class counterListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Cnt++;  // カウンターインクリメント
            btCounter.setText(String.valueOf(Cnt));
        }
    }


}
