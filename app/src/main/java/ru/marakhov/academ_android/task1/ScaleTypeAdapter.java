package ru.marakhov.academ_android.task1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


import static android.widget.ImageView.ScaleType;

/**
 * Created by ALEM on 07.11.2015.
 */
public class ScaleTypeAdapter extends BaseAdapter
{
	private Context mContext;
	public ScaleTypeAdapter(Context mContext)
	{
		this.mContext=mContext;
	}

	static class ViewHolder {
		TextView txtItem;
	}
	@Override
	public int getCount()
	{
		return ScaleType.values().length;
	}

	@Override
	public ScaleType getItem(int position)
	{
		return ScaleType.values()[position];
	}

	@Override
	public long getItemId(int position)
	{
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent)
	{
		ViewHolder viewHolder;

		if (convertView == null){
			LayoutInflater inflater = (LayoutInflater) mContext
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = inflater.inflate(R.layout.spinner_item, parent, false);
			viewHolder = new ViewHolder();
			viewHolder.txtItem = (TextView) convertView.findViewById(R.id.spinner_item_text_view_txt);
			convertView.setTag(viewHolder);
		} else {
			viewHolder = (ViewHolder) convertView.getTag();
		}

		viewHolder.txtItem.setText(getItem(position).name());

		// Задание со звездочкой:
		viewHolder.txtItem.setBackgroundColor(position%2==0? 0xFFAAAAAA:0xFFB1B5CE);

		return convertView;
	}

}
