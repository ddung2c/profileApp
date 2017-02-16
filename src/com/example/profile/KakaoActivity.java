package com.example.profile;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class KakaoActivity extends Activity {
    	String dwnload_file_path = "https://lh3.googleusercontent.com/-YLfcQjavK7o/VgKPeWdIrcE/AAAAAAAAABk/2IcKkcm7l4g/s64-c-Ic42/September23201502.jpg";

	    String dest_file_path = "/sdcard/download/cat1.png";

	    Button b1;

	    ProgressDialog dialog = null;
	    
		@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_kakao);	         

			        b1 = (Button)findViewById(R.id.catbutton);

			        b1.setOnClickListener(new OnClickListener() {

			            @Override

			            public void onClick(View v) {

			                 

			                dialog = ProgressDialog.show(KakaoActivity.this, "", "Downloading file...", true);

			                 new Thread(new Runnable() {

			                        public void run() {

			                             downloadFile(dwnload_file_path, dest_file_path);

			                        }

			                      }).start();               

			            }

			        });

			    }

			     

			    public void downloadFile(String url, String dest_file_path) {

			          try {

			              File dest_file = new File(dest_file_path);

			              URL u = new URL(url);

			              URLConnection conn = u.openConnection();

			              int contentLength = conn.getContentLength();



			              DataInputStream stream = new DataInputStream(u.openStream());



			              byte[] buffer = new byte[contentLength];

			              stream.readFully(buffer);

			              stream.close();



			              DataOutputStream fos = new DataOutputStream(new FileOutputStream(dest_file));

			              fos.write(buffer);

			              fos.flush();

			              fos.close();

			              hideProgressIndicator();

			               

			          } catch(FileNotFoundException e) {

			              hideProgressIndicator();

			              return; 

			          } catch (IOException e) {

			              hideProgressIndicator();

			              return; 

			          }

			    }

			     

			    void hideProgressIndicator(){

			        runOnUiThread(new Runnable() {

			            public void run() {

			                dialog.dismiss();

			            }

			        });  

		}
}