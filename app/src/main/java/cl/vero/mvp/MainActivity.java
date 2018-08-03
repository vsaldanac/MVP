package cl.vero.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements TipsCallback{

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = findViewById(R.id.valueEt);
        Button button = findViewById(R.id.resultBtn);
        textView = findViewById(R.id.totalTv);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String value = editText.getText().toString();
                new TipsCalculator(MainActivity.this).calculator(value);

            }
        });
    }

    @Override
    public void blankInput() {

        Toast.makeText(this, "Ingresa un número", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void succes(String value) {

        textView.setText(value);

    }
}
