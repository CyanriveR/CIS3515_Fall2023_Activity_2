package edu.temple.inclassuiacvitivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import android.widget.AdapterView.OnItemSelectedListener


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.spinner)
        val displayTextView = findViewById<TextView>(R.id.textDisplay)
        val numberArray = Array(21){it*5}
        spinner.adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, numberArray)
        spinner.onItemSelectedListener = object: OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                p0?.run{
                    displayTextView.textSize= numberArray.get(p2).toFloat()
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }

        }

}
}