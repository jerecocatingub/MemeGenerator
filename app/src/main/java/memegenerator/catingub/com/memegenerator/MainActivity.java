package memegenerator.catingub.com.memegenerator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generate();
    }

    private EditText mTop;
    private EditText mBottom;
    private Button mGenerate;

    public void generate(){
        mTop = (EditText) findViewById(R.id.txtTop);
        mBottom = (EditText) findViewById(R.id.txtBottom);
        mGenerate = (Button) findViewById(R.id.btnGenerate);

        mGenerate.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                try{
                    String Top = mTop.getText().toString();
                    String Bottom = mBottom.getText().toString();

                    Intent intent = new Intent(MainActivity.this,MemeActivity.class);
                    intent.putExtra("TOP_MESSAGE",Top);
                    intent.putExtra("BOTTOM_MESSAGE",Bottom);
                    startActivity(intent);
                }catch(Exception e){
                    mTop.setText("");
                    mBottom.setText("");
                }
            }
        });
    }
}
