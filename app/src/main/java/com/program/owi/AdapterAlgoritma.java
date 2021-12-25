package com.program.owi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.program.owi.model.DataAlgoritma;

import java.util.ArrayList;

public class AdapterAlgoritma extends ArrayAdapter {
    ArrayList<DataAlgoritma> dataAlgoritmas = new ArrayList();
    LayoutInflater layoutInflater;
    Context context;

    public AdapterAlgoritma(Context context, ArrayList<DataAlgoritma> dataAlgoritmas) {
        super(context, R.layout.daftar_algoritma, dataAlgoritmas);
        this.dataAlgoritmas = dataAlgoritmas;
        layoutInflater = LayoutInflater.from(context);
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = layoutInflater.inflate(R.layout.daftar_algoritma, parent, false);
        DataAlgoritma dataAlgoritma = this.dataAlgoritmas.get(position);

        TextView titleListview = convertView.findViewById(R.id.titleListview);
        ImageView imageView = convertView.findViewById(R.id.imgListview);

        Glide
                .with(context)
                .load(dataAlgoritma.getImage())
                .placeholder(R.drawable.ic_refres_foreground)
                .into(imageView);

        titleListview.setText(dataAlgoritma.getJenisAlgoritma());

        return convertView;
    }
}
