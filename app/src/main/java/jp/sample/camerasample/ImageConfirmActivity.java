package jp.sample.camerasample;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_image_confirm)
public class ImageConfirmActivity extends AppCompatActivity {

    @ViewById(R.id.image_view)
    protected ImageView imageView;

    private Uri imageUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle extras = getIntent().getExtras();
        imageUri =  Uri.parse(extras.getString("imageUri"));
    }

    @AfterViews
    protected void afterViews() {
        imageView.setImageURI(imageUri);
    }

}
