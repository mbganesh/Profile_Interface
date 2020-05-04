package mb.ganesh.youtube_integrate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    public void gotoWebSite(View view){
        Uri UT_link = Uri.parse("https://www.youtube.com/c/GaneshJDev");
        Intent i = new Intent(Intent.ACTION_VIEW , UT_link);
        startActivity(i);
    }
}
