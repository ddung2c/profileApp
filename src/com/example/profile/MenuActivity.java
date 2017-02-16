package com.example.profile;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MenuActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
		
		 Button button1 = (Button)findViewById(R.id.kakaotalkbutton);
         button1.setOnClickListener(new OnClickListener() {
           
           @Override
           public void onClick(View v) {
              // TODO Auto-generated method stub
              Intent intent = new Intent(MenuActivity.this, KakaoActivity.class);
              startActivity(intent);
              
           }
        });
      Button button2 = (Button)findViewById(R.id.instagramlkbutton);
          button2.setOnClickListener(new OnClickListener() {

           @Override
           public void onClick(View v) {
              // TODO Auto-generated method stub
              Intent intent2 = new Intent(MenuActivity.this, InstaActivity.class);
              startActivity(intent2);
           }
            
         });
       Button button3 = (Button)findViewById(R.id.linekbutton2);
          button3.setOnClickListener(new OnClickListener() {

           @Override
           public void onClick(View v) {
              // TODO Auto-generated method stub
              Intent intent3 = new Intent(MenuActivity.this, LineActivity.class);
              startActivity(intent3);
           }
            
         });
        Button button4 = (Button)findViewById(R.id.facebookbutton);
          button4.setOnClickListener(new OnClickListener() {

           @Override
           public void onClick(View v) {
              // TODO Auto-generated method stub
              Intent intent4 = new Intent(MenuActivity.this, FacebookActivity.class);
              startActivity(intent4);
           }
            
         });  
        
	}
}
