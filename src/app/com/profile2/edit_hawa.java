package app.com.profile2;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

	
	public class edit_hawa extends Activity implements OnClickListener {
	private Button btn_sub;
	private EditText edt01, edt02, edt03, edt04, edt05;
	private String txt01, txt02, txt03, txt04, txt05;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	setContentView(R.layout.edit_129);
	super.onCreate(savedInstanceState);
	ViewMatching();
	}
	private void ViewMatching() {
	btn_sub = (Button) findViewById(R.id.btn_sub);
	btn_sub.setOnClickListener(this); 
	edt01 = (EditText) findViewById(R.id.edt01);
	edt02 = (EditText) findViewById(R.id.edt02);
	edt03 = (EditText) findViewById(R.id.edt03);
	edt04 = (EditText) findViewById(R.id.edt04);
	edt05 = (EditText) findViewById(R.id.edt05);
	
	}
	@Override
	public void onClick(View v) {
		
		save();
		
		
		
	switch (v.getId()) {
	case R.id.btn_sub:
	txt01 = (edt01.getText().toString());
	txt02 = (edt02.getText().toString());
	txt03 = (edt03.getText().toString());
	txt04 = (edt04.getText().toString());
	txt05 = (edt05.getText().toString());
	
	Intent R = new Intent(getApplicationContext(), Activity123.class);
	R.putExtra("txt01", txt01);
	R.putExtra("txt02", txt02);
	R.putExtra("txt03", txt03);
	R.putExtra("txt04", txt04);
	R.putExtra("txt05", txt05);
	
	startActivity(R);
	break;
	default:
	break;
	}
  }
	public boolean save(){
		final AlertDialog.Builder ab = new AlertDialog.Builder(this);
		AlertDialog vv = ab.create();
		
		dbcontroler_129 dbclass = new dbcontroler_129(this);
		long savedata = dbclass.insertData(edt01.getText().toString(),edt02.getText().toString()
				,edt03.getText().toString(),edt04.getText().toString(),edt05.getText().toString());
				
		if (savedata <= 0) {
			vv.setMessage("Error !!!!");
			vv.show();
			return false;
		}		
				
		Toast.makeText(getApplicationContext(), "Add Data Successfully",Toast.LENGTH_SHORT).show();
		return true;
	}
	
	
	
	
	
	
}


