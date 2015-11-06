package ru.marakhov.academ_android.task1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class FirstScreenActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.first_screen);
		RadioButton rb;
		RadioGroup radioGroup = (RadioGroup) findViewById(R.id.first_screen_radio);
		radioGroup.setOnCheckedChangeListener(this);
		for (ImageView.ScaleType scaleType : ImageView.ScaleType.values())
		{
			rb = new RadioButton(this);
			rb.setText(scaleType.name());
			radioGroup.addView(rb, RadioGroup.LayoutParams.WRAP_CONTENT, RadioGroup.LayoutParams.WRAP_CONTENT);
		}
		rb = (RadioButton) radioGroup.getChildAt(0);
		rb.setChecked(true);
	}

	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId)
	{
		ImageView imageView = (ImageView) findViewById(R.id.first_screen_image_view_w);
		RadioButton radioButton = (RadioButton) findViewById(checkedId);
		imageView.setScaleType(ImageView.ScaleType.valueOf(radioButton.getText().toString()));
	}
}
