package intent.example.com.iitbhuvan;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class Music extends AppCompatActivity {
    ImageButton img;
    ImageView btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_music);
        final MediaPlayer mp = MediaPlayer.create(Music.this,R.raw.raabta);
        img=findViewById(R.id.play);
        btn=findViewById(R.id.pause);
        btn.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.pause();
            }
        });

      /*  @SuppressLint("WrongViewCast") final ImageButton playStopButton = (ImageButton) this.findViewById(R.id.play);
        playStopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (playStopButton.isActivated()) {

                    mp.start();
                }
                else {

                    mp.pause();
                }
            }
        }); */
    }
}
