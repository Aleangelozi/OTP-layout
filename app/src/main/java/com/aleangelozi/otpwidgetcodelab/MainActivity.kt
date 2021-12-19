package com.aleangelozi.otpwidgetcodelab

import android.content.ClipData
import android.content.ClipDescription
import android.content.ClipboardManager
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val e1: EditText =  findViewById(R.id.editText1)
        val e2: EditText =  findViewById(R.id.editText2)
        val e3: EditText =  findViewById(R.id.editText3)
        val e4: EditText =  findViewById(R.id.editText4)

        e1.addTextChangedListener(object : TextWatcher {
            override fun onTextChanged(
                s: CharSequence, start: Int, before: Int,
                count: Int
            ) {
                if (e1.getText().toString().length == 1) {
                    e2.requestFocus()
                }
            }

            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(
                s: CharSequence, start: Int, count: Int,
                after: Int
            ) {
            }
        })

        e2.addTextChangedListener(object : TextWatcher {
            override fun onTextChanged(
                s: CharSequence, start: Int, before: Int,
                count: Int
            ) {
                if (e2.getText().toString().length == 1) {
                    e3.requestFocus()
                } else {
                    e1.requestFocus()
                }
            }

            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(
                s: CharSequence, start: Int, count: Int,
                after: Int
            ) {
            }
        })

        e3.addTextChangedListener(object : TextWatcher {
            override fun onTextChanged(
                s: CharSequence, start: Int, before: Int,
                count: Int
            ) {
                if (e3.getText().toString().length == 1) {
                    e4.requestFocus()
                } else {
                    e2.requestFocus()
                }
            }

            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(
                s: CharSequence, start: Int, count: Int,
                after: Int
            ) {
            }
        })

        e4.addTextChangedListener(object : TextWatcher {
            override fun onTextChanged(
                s: CharSequence, start: Int, before: Int,
                count: Int
            ) {
                if (e4.getText().toString().length == 1) {
                } else {
                    e3.requestFocus()
                }
            }

            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(
                s: CharSequence, start: Int, count: Int,
                after: Int
            ) {
            }
        })
    }
}