package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


import android.text.Editable
import android.text.TextWatcher

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edit1 = findViewById<EditText>(R.id.var1)
        val edit2 = findViewById<EditText>(R.id.var2)
        val stext = findViewById<TextView>(R.id.text)
        stext.text = "Nie zostałem jeszcze kliknięty"

        val btn = findViewById<Button>(R.id.Btn)

        // Dodaj TextWatcher do obu pól tekstowych
        edit1.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                updateResult()
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                // Niepotrzebne w tym przypadku
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                // Niepotrzebne w tym przypadku
            }
        })

        edit2.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                updateResult()
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                // Niepotrzebne w tym przypadku
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                // Niepotrzebne w tym przypadku
            }
        })

        // Dodaj OnClickListener do przycisku
        btn.setOnClickListener {
            updateResult()
        }
    }

    private fun updateResult() {
        val edit1 = findViewById<EditText>(R.id.var1)
        val edit2 = findViewById<EditText>(R.id.var2)
        val stext = findViewById<TextView>(R.id.text)

        val edit1Value = edit1.text.toString()
        val edit2Value = edit2.text.toString()

        val edit1Int = edit1Value.toIntOrNull() ?: 0
        val edit2Int = edit2Value.toIntOrNull() ?: 0
        val stextInt = stext.text.toString().toIntOrNull() ?: 0

        val resultInt = edit1Int + edit2Int
        val resultStr = resultInt.toString()

        stext.text = resultStr
    }
}
