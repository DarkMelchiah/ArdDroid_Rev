package br.com.pwempire.fireactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;





public class FireActivity extends Activity {

	Button fireB;
	public int OnOff = 0;
	

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final Button button = (Button) findViewById(R.id.fireB);
        
        button.setOnClickListener(new View.OnClickListener() {
            
        	public void onClick(View arg0) {
    				// TODO Auto-generated method stub
    				Intent it = new Intent(FireActivity.this,SerialTest.class);
    				if(OnOff == 0){
    					it.putExtra("OnOff", 1);
    				}	else{
    					it.putExtra("OnOff", 0);
    				}
    				startActivity(it);
    			}
            });
         
        
    }
}