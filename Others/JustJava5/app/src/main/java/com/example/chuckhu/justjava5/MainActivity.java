package com.example.chuckhu.justjava5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.name;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    private int quantity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button order = (Button) findViewById(R.id.submit_order);
        Button increnment = (Button) findViewById(R.id.increment);
        Button decrement = (Button) findViewById(R.id.decrement);

        increnment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increment();
            }
        });
        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decrement();
            }
        });
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitOrder();
            }
        });
    }

    public void increment() {
        if (quantity == 100) {
            Toast.makeText(this, "Yoou cannot have morethan 100 coffees", Toast.LENGTH_SHORT).show();
            return;
        }
        displayＱuantity(++quantity);
    }

    public void decrement() {
        if (quantity > 1)
            displayＱuantity(--quantity);
        else {
            Toast.makeText(this, "You cannot have less than 1 coffee", Toast.LENGTH_SHORT).show();
            return;
        }
    }


    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder() {
        CheckBox whippedCreamCheckBox = (CheckBox) findViewById(R.id.whipped_cream_checkbox);
        CheckBox chocolateCheckbox = (CheckBox) findViewById(R.id.chocolate_checkbox);
        EditText nameEditText = (EditText) findViewById(R.id.name_EditText);

        boolean hasWhippedCream = whippedCreamCheckBox.isChecked();
        boolean hasChocolate = chocolateCheckbox.isChecked();
        String customerName = nameEditText.getText().toString();

        int price = calculatePrice();
        //String priceMessage = "Total: $"+ price;
        //priceMessage += "\nThank you!";
        displayMessage(CreateOrderMessage(price,hasWhippedCream,hasChocolate,customerName));
    }
    /**
     * Calculates the price of the order.
     *
     * @param quantity is the number of cups of coffee ordered
     */
    private int calculatePrice() {
        return quantity * 5;
    }

    /**
     * Create summary of the order.
     * @param price of the order
     * @return text summary
     */

    private String CreateOrderMessage(int price, boolean addWhippedCfeam, boolean addChocolate, String name) {
        String priceMessage = "Name: "+name;
        priceMessage += "\nAdd whipped cream? " + addWhippedCfeam;
        priceMessage += "\nAdd Chocalate? "+ addChocolate;
        priceMessage += "\nQuantity: " + quantity;
        priceMessage +=  "\nTotal: $"+ price;
        priceMessage += "\n"+ getString(R.string.thank_you);
        return priceMessage;
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayＱuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText(""+number);
    }

    /**
     * This method displays the given price on the screen.
     */
    /*private void displayPrice(int number)
    {
        TextView priceTextView = (TextView)findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }*/

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }
}