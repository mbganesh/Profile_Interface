package mb.ganesh.youtube_integrate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void gotoProfile(View view) {
        startActivity(new Intent(this , Profile.class));
    }
}




/* we should add these dependencies

   implementation 'de.hdodenhof:circleimageview:3.1.0'
    implementation 'androidx.cardview:cardview:1.0.0'
 */