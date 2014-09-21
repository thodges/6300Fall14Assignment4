package edu.gatech.seclass.unitconvertor;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class DistanceActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_distance);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.distance, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public String kmToMiles(double km) {
		double miles = km / 1.609;
		return String.valueOf(miles);
	}
	
	public String milesToKM(double miles) {
		double km = miles * 1.609;
		return String.valueOf(km);
	}
	
	public void click1 (View view) {
		EditText txt = (EditText) findViewById(R.id.editText);
		double input = Double.parseDouble(txt.getText().toString());
		txt.setText(milesToKM(input));
	}
	
	public void click2 (View view) {
		EditText txt = (EditText) findViewById(R.id.editText);
		double input = Double.parseDouble(txt.getText().toString());
		txt.setText(kmToMiles(input));
	}
}