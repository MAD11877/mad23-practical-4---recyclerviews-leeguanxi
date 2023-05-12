package sg.edu.np.mad.week2practical_pleaseworkimdesperate;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    User user = new User();
    boolean followed = user.followed;
    public void onFollowClick(View v) {
        Log.v("HELLO", "Button Clicked!");
        if (followed){
            Toast.makeText(getBaseContext(),"Unfollowed", Toast.LENGTH_SHORT).show();
            Button button = (Button)findViewById(R.id.btnFollow);
            button.setText("FOLLOW");
            followed = false;
        }
        else {
            Toast.makeText(getBaseContext(),"Followed", Toast.LENGTH_SHORT).show();
            Button button = (Button)findViewById(R.id.btnFollow);
            button.setText("UNFOLLOW");
            followed = true;
        }

    }

    public void onMessageClick(View v) {
        // MainActivity to MessageGroup
        Intent intent = new Intent(MainActivity.this, MessageGroup.class);
        startActivity(intent);
    }

    protected void onResume() {
        super.onResume();
        // receive data from ListActivity
        Intent intent = getIntent();
        int randomInt = intent.getIntExtra("random_integer", 0);
        TextView textview = findViewById(R.id.textView);
        textview.setText("MAD " + randomInt);
    }
}