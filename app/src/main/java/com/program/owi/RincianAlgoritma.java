package com.program.owi;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.program.owi.model.DataAlgoritma;

public class RincianAlgoritma extends AppCompatActivity {
    DataAlgoritma AlgoritmaSelected;
    ImageView imgProfile;
    TextView titleProfile, officialWeb, descProfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rincian_algoritma);

        Intent intent = getIntent();
        AlgoritmaSelected = (DataAlgoritma) intent.getSerializableExtra("ALGORITMA_SELECTED");
        inisialisasi();
    }

    void inisialisasi() {
        imgProfile = findViewById(R.id.imgProfile);
        titleProfile = findViewById(R.id.titleProfile);
        descProfile = findViewById(R.id.descProfile);
        officialWeb = findViewById(R.id.officialWeb);

        titleProfile.setText(AlgoritmaSelected.getJenisAlgoritma());
        officialWeb.setText(AlgoritmaSelected.getLink_website());
        descProfile.setText(AlgoritmaSelected.getDeskripsi());
        Glide
                .with(this)
                .load(AlgoritmaSelected.getImage())
                .placeholder(R.drawable.ic_refres_foreground)
                .into(imgProfile);
    }

    public void actionToLink(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse(AlgoritmaSelected.getLink_website()));
        startActivity(intent);
    }
}
