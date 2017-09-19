package kr.hs.emirim.progh2.firebasedbexample;

import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private TextView mNameTextView;
    private TextView mGithubTextView;
    private ImageView mProfilImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNameTextView = (TextView) findViewById(R.id.profile_name);
        mGithubTextView = (TextView) findViewById(R.id.profile_github);
        mProfilImageView = (ImageView) findViewById(R.id.profile_image);

        Picasso.with(this)
                .load("http://i.imgur.com/DvpvklR.png")
                .centerCrop()
                .resize(100,100)
                .into(mProfilImageView);


    }
}


