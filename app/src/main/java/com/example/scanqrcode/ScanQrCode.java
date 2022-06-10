package com.example.scanqrcode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ScanQrCode extends AppCompatActivity {

    Button btnScan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_qr_code);

        btnScan = findViewById(R.id.btn_scan);
        hideNavbar();


        btnScan.setOnClickListener(view -> {
            startActivity(new Intent(getApplicationContext(), MediaBarcode.class));

        });
    }

    private void hideNavbar() {
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION |
                        View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
    }
}