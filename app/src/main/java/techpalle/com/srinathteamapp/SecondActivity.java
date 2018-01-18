package techpalle.com.srinathteamapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
EditText et1,et2,et3,et4,et5;
    TextInputLayout tv1,tv2,tv3,tv4,tv5;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        et1 = (EditText) findViewById(R.id.editText1);
        et2 = (EditText) findViewById(R.id.editText2);
        et3 = (EditText) findViewById(R.id.editText3);
        et4 = (EditText) findViewById(R.id.editText4);
        et5 = (EditText) findViewById(R.id.editText5);
        tv1 = (TextInputLayout) findViewById(R.id.text1);
        tv2 = (TextInputLayout) findViewById(R.id.text2);
        tv3 = (TextInputLayout) findViewById(R.id.text3);
        tv4 = (TextInputLayout) findViewById(R.id.text4);
        tv5 = (TextInputLayout) findViewById(R.id.text5);
        b1 = (Button) findViewById(R.id.button1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
