package sundarchaupal.camera;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {
    ImageButton btn1, btn2, btn3, btn4;
    Button viewgallery;
    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewgallery = findViewById(R.id.btn_viewgallery);
        editText = (EditText) findViewById(R.id.entevillagename);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);

         viewgallery.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this,Camera.class);
        startActivity(intent);

            }
});

        btn4.setOnClickListener(new View.OnClickListener() {//Input text of edit text.
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().length() == 0) {
                    editText.setError("fill village name");
                } else {
                    Intent intent = new Intent(MainActivity.this,Camera.class);
                        startActivity(intent);

                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() { //Input text of edit text.
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().length() == 0) {
                    editText.setError("fill village name");
                } else {
                    //Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                    Intent intent = new Intent(MainActivity.this,Camera.class);
                    startActivity(intent);
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() { //Input text of edit text.
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().length() == 0) {
                    editText.setError("fill it");
                } else {
                   // Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                    Intent intent = new Intent(MainActivity.this, Camera.class);
                    startActivity(intent);
                }
            }
        });


        btn1.setOnClickListener(new View.OnClickListener() {  //Input text of edit text.
            @Override
            public void onClick(View v) {

                if (editText.getText().toString().length() == 0) {
                    editText.setError("fill it");
                } else {
                     Intent intent = new Intent(MainActivity.this, Camera.class);
                    startActivity(intent);
                }
            }
        });

        viewgallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"View Gallery",Toast.LENGTH_SHORT).show();
            }
        });

    }

}