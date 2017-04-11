package com.example.chuckhu.buyticket;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txv;
    private RadioGroup ticketType;

    /*class MyOnClickListener implements View.OnClickListener {
        public void onClick(View v) {
            int id = ticketType.getCheckedRadioButtonId();
            RadioButton select = (RadioButton) findViewById(id);
            txv.setText("買"+select.getText());
        }*/

    //View.OnClickListener myListener = new MyOnClickListener();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txv = (TextView) findViewById(R.id.txv);
        ticketType = (RadioGroup) findViewById(R.id.ticketType);
        Button btn = (Button) findViewById(R.id.confirm);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = ticketType.getCheckedRadioButtonId();
                RadioButton select = (RadioButton) findViewById(id);
                txv.setText("買"+select.getText());
            }
        });
    }
}
