package com.cathy.aspectjdemo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.cathy.aspectjdemo.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        testAspectJMethod();
        testAspectJGetResult();
    }


    private void testAspectJMethod(){
        System.out.println("AspectJ:this is a test of aspectJ");
    }
    private String testAspectJGetResult(){
        System.out.println("AspectJ: this is test AspectJ get Result");
        return "AspectJ:How are you doing right now?";
    }
}
