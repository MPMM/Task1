package ru.marakhov.academ_android.task1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class SecondScreenActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener
{

	private ScaleTypeAdapter mAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second_screen);
		//ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item);
		//adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
		mAdapter = new ScaleTypeAdapter(this);
		//for (ImageView.ScaleType scaleType : ImageView.ScaleType.values()) adapter.add(scaleType.name());
		Spinner spinner = (Spinner) findViewById(R.id.second_screen_spinner);
		spinner.setAdapter(mAdapter);
		spinner.setOnItemSelectedListener(this);
		spinner.setSelection(0);
	}

	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
	{
		ImageView imageView = (ImageView) findViewById(R.id.second_screen_image_view_w);
	//	imageView.setScaleType(ImageView.ScaleType.valueOf((String) parent.getItemAtPosition(position)));
		imageView.setScaleType(mAdapter.getItem(position));
	}

	@Override
	public void onNothingSelected(AdapterView<?> parent)
	{

	}
}
