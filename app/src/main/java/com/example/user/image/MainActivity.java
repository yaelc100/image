package com.example.user.image;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn;
    ImageView imgv;
    int x;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.btn);
        imgv=(ImageView)findViewById(R.id.imgv);


    }

    public void click(View view) {
        Random rnd=new Random();
        x=rnd.nextInt(3)+1;
        if(x==1)
            imgv.setImageResource(R.drawable.game);
        if(x==2)
            imgv.setImageResource(R.drawable.field_protected_obj_2x);
         if(x==3)
             imgv.setImageResource(R.drawable.class_obj_1x);
    }
}
