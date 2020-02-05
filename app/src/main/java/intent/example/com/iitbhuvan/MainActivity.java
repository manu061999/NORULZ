package intent.example.com.iitbhuvan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.luseen.spacenavigation.SpaceItem;
import com.luseen.spacenavigation.SpaceNavigationView;
import com.luseen.spacenavigation.SpaceOnClickListener;

public class MainActivity extends AppCompatActivity {
    SpaceNavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        navigationView = (SpaceNavigationView) findViewById(R.id.space);
        navigationView.initWithSaveInstanceState(savedInstanceState);

        navigationView.addSpaceItem(new SpaceItem("", R.drawable.ic_cloud_circle_black_24dp));
        navigationView.addSpaceItem(new SpaceItem("", R.drawable.ic_favorite_black_24dp));
        navigationView.addSpaceItem(new SpaceItem("", R.drawable.ic_queue_music_black_24dp));
        navigationView.addSpaceItem(new SpaceItem("", R.drawable.ic_settings_black_24dp));


        navigationView.setSpaceOnClickListener(new SpaceOnClickListener() {
            @Override
            public void onCentreButtonClick() {
                Intent a= new Intent(MainActivity.this, Main2Activity.class);
                startActivity(a);
            }

            @Override
            public void onItemClick(int itemIndex, String itemName) {
                if(itemIndex==0) {

                    Intent n = new Intent(MainActivity.this, night_weather.class);
                    startActivity(n);
                }
                if(itemIndex==2) {

                    Intent i = new Intent(MainActivity.this, Music.class);
                    startActivity(i);
                }
            }

            @Override
            public void onItemReselected(int itemIndex, String itemName) {
                if(itemIndex==0) {
                    Toast.makeText(MainActivity.this, itemIndex + " " + itemName, Toast.LENGTH_SHORT).show();
                    Intent n = new Intent(MainActivity.this, night_weather.class);
                    startActivity(n);
                }
                if(itemIndex==2) {

                    Intent i = new Intent(MainActivity.this, Music.class);
                    startActivity(i);
                }
            }
        });
    }
}
