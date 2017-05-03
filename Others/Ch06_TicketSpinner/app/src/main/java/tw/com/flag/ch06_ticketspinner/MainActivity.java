package tw.com.flag.ch06_ticketspinner;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txv;
    Spinner cinema;    // 戲院清單物件
    Button order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txv = (TextView) findViewById(R.id.txv);
        cinema = (Spinner) findViewById(R.id.cinema);
        order = (Button) findViewById(R.id.button);
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] cinemas = getResources().             // 取得字串資源中
                        getStringArray(R.array.cinemas);      // 的字串陣列

                int index = cinema.getSelectedItemPosition();    // 取被選取的項目
                txv.setText("訂" + cinemas[index] + "的票");    // 顯示選取的項目
            }
        });
    }

    /*public void order(View v) {
        String[] cinemas = getResources().             // 取得字串資源中
                getStringArray(R.array.cinemas);      // 的字串陣列

        int index = cinema.getSelectedItemPosition();    // 取被選取的項目
        txv.setText("訂" + cinemas[index] + "的票");    // 顯示選取的項目
    }*/
}
