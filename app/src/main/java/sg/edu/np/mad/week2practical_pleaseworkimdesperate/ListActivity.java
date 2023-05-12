package sg.edu.np.mad.week2practical_pleaseworkimdesperate;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ImageView image = findViewById(R.id.imageBtn);

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // display Alert Dialog
                AlertDialog.Builder alert = new AlertDialog.Builder(ListActivity.this);
                alert.setTitle("Profile")
                        .setMessage("ImVeryMAD")
                        .setPositiveButton("View", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                // generate random int
                                Random random = new Random();
                                int randomInt = random.nextInt(9999);

                                // pass data to MainActivity
                                Intent intent = new Intent(ListActivity.this, MainActivity.class);
                                intent.putExtra("random_integer", randomInt);
                                startActivity(intent);
                            }
                        })
                        .setNegativeButton("Close", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                // handle close button click
                            }
                        });
                AlertDialog dialog = alert.create();
                dialog.show();
            }
        });
    }


}