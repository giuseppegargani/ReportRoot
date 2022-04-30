package com.example.reportroot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.addedtask.Toaster

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toaster().createToast(this, "ecco il messaggio")
    }
}