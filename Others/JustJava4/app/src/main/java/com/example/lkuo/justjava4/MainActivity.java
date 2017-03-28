package com.example.lkuo.justjava4;

/**
 * Add your package below. Package name can be found in the project's AndroidManifest.xml file.
 * This is the package name our example uses:
 *
 * package com.example.android.justjava;
 */

import android.support.v7.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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

   /* @Override
    public void onClick(View v) {
       if (v.getId() == R.id.increment)
           increment();
        else if (v.getId() == R.id.decrement)
            decrement();
        else
            submitOrder();
    }*/

    public void increment() {

        displayＱuantity(++quantity);
    }

    public void decrement() {
        if (quantity > 0)
            displayＱuantity(--quantity);
        else
            displayＱuantity(0);
    }


    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder() {
        //int quantity = 2;
        //display(quantity);
        //displayPrice(quantity*5);
        int price = calculatePrice();
        //String priceMessage = "Total: $"+ price;
        //priceMessage += "\nThank you!";
        displayMessage(CreateOrderMessage(price));
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

    private String CreateOrderMessage(int price) {
        String priceMessage = "Name: Chuck Hu";
        priceMessage += "\nQuantity: " + quantity;
        priceMessage +=  "\nTotal: $"+ price;
        priceMessage += "\nThank you!";
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