package com.example.addedtask

import android.content.Context
import android.widget.Toast

class Toaster() {

    fun createToast(context: Context ,message: String) {
        Toast.makeText(context,message, Toast.LENGTH_SHORT).show()
    }
}