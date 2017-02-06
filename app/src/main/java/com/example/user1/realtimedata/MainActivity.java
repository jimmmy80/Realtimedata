package com.example.user1.realtimedata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final int PICK_IMAGE_REQUEST = 2478;
    private Button Upload, Choose;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Upload = (Button) findViewById(R.id.btnUpload);
        Choose = (Button) findViewById(R.id.btnChoose);

        image = (ImageView) findViewById(R.id.imageViewd);

        Upload.setOnClickListener(this);
        Choose.setOnClickListener(this);

    }
  public void showFile(){
       Intent inten = new Intent();
      inten.setType("image/*");
      inten.setAction(inten.ACTION_GET_CONTENT);
      startActivityForResult(inten.createChooser(inten,"Select image"),PICK_IMAGE_REQUEST);
  }
    @Override
    public void onClick(View v) {
        if (v == Choose) {
            showFile();
        }
    }
}