package memegenerator.catingub.com.memegenerator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MemeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meme);
        meme();
    }
    private TextView mTop;
    private TextView mBottom;
    private ImageView mPhoto;

    public void meme(){
        try{
            mTop = (TextView) findViewById(R.id.txtTop);
            mBottom = (TextView) findViewById(R.id.txtBottom);
            mPhoto = (ImageView) findViewById(R.id.ivPhoto);
            Intent intent = getIntent();
            if (intent != null) {
                String Top = intent.getStringExtra("TOP_MESSAGE");
                String Bottom = intent.getStringExtra("BOTTOM_MESSAGE");
                mTop.setText(Top);
                mBottom.setText(Bottom);
            }
        }catch(Exception e) {
            mTop.setText("");
            mBottom.setText("");
        }
    }
}
