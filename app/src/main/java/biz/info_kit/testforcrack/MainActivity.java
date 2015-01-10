package biz.info_kit.testforcrack;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    private TextView _result;
    private EditText _name;
    private Button _oldButton;
    private int mCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _result = (TextView)findViewById(R.id.result);
        _name = (EditText)findViewById(R.id.name);
        _oldButton = (Button)findViewById(R.id.buttonOldHelp);
        _oldButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _oldButton.setText(getString(R.string.message_OldHelp));
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClick(View view) {
        if(_name.getText().length() != 0) {
            _result.setText("Hello " + _name.getText() + " !!!");
        }
    }

    public void onButtonClick(View view) {
        _result.setText(getString(R.string.message_Help));
        }
}
