package ru.marakhov.academ_android.task1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findViewById(R.id.activity_main_button_first).setOnClickListener(this);
		findViewById(R.id.activity_main_button_second).setOnClickListener(this);
	}

	@Override
	public void onClick(View v)
	{
		Intent intent;
		switch (v.getId()){
			case R.id.activity_main_button_first:
				intent = new Intent(MainActivity.this, FirstScreenActivity.class);
				startActivity(intent);
				break;
			case R.id.activity_main_button_second:
				intent = new Intent(MainActivity.this, SecondScreenActivity.class);
				startActivity(intent);
				break;
		}
	}
}
