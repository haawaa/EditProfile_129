package app.com.profile2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
public class Activity123 extends Activity implements OnClickListener {
private Button btn1, btn2;
private TextView txt01, txt02, txt03, txt04, txt05;
private String show1,show2,show3,show4,show5;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.layout123);
ViewMatching();

//dbcontroler_129 bdDbcontroler_129=new dbcontroler_129(this);
//bdDbcontroler_129.getWritableDatabase();






}
private void ViewMatching() {
btn1 = (Button) findViewById(R.id.btn_save_1);
btn2 = (Button) findViewById(R.id.btn_img);
btn1.setOnClickListener(this);
btn2.setOnClickListener(this);

txt01 = (TextView) findViewById(R.id.textView7);
txt02 = (TextView) findViewById(R.id.textView8);
txt03 = (TextView) findViewById(R.id.textView9);
txt04 = (TextView) findViewById(R.id.textView10);
txt05 = (TextView) findViewById(R.id.textView11);

txt01.setText("20");
txt02.setText("Haawaa");
txt03.setText("21 Nov 1993");
txt04.setText("0939411604");
txt05.setText("Haawa'a Hj");

show1 = getIntent().getStringExtra("txt01");
show2 = getIntent().getStringExtra("txt02");
show3 = getIntent().getStringExtra("txt03");
show4 = getIntent().getStringExtra("txt04");
show5 = getIntent().getStringExtra("txt05");

txt01.setText(show1);
txt02.setText(show2);
txt03.setText(show3);
txt04.setText(show4);
txt05.setText(show5);

}
@Override
public void onClick(View v) {
switch (v.getId()) {
case R.id.btn_save_1:
Intent i = new Intent(getApplicationContext(), edit_hawa.class);
startActivity(i);
break;
case R.id.btn_img:
Intent j = new Intent(getApplicationContext(), Tt.class);
startActivity(j);
break;
default:
break;
}
}
}