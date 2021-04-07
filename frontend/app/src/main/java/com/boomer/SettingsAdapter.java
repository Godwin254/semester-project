package com.boomer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class SettingsAdapter extends ArrayAdapter<Settings> {
    private Fragment mFragment;
    private int mResource;
    public SettingsAdapter(@NonNull SettingsFragment context, String resource, @NonNull ArrayList<Settings> object) {
        super(context, resource, object);
        this.mFragment = context;
        this.mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        convertView = layoutInflater.inflate(mResource, parent, false);

        //ImageView imageView = convertView.findViewById(R.id.sIcon);
        TextView sTitle = convertView.findViewById(R.id.sTitle);
        TextView sDesc = convertView.findViewById(R.id.sDesc);

        //imageView.setImageResource(getItem(position).getIcon());
        sTitle.setText(getItem(position).getTitle());
        sDesc.setText(getItem(position).getDesc());

        return convertView;
    }
}
