package com.example.assignment_2_21012021107

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    private lateinit var btnAdd: Button
    private lateinit var btnSub: Button
    private lateinit var btnMul: Button
    private lateinit var btnDiv: Button
    private lateinit var edtNo1: EditText
    private lateinit var edtNo2: EditText
    private lateinit var txtResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd = findViewById(R.id.btnAdd)
        btnSub = findViewById(R.id.btnSub)
        btnMul = findViewById(R.id.btnMul)
        btnDiv = findViewById(R.id.btnDiv)
        edtNo1 = findViewById(R.id.edtNo1)
        edtNo2 = findViewById(R.id.edtNo2)
        txtResult = findViewById(R.id.txtResult)

        btnAdd.setOnClickListener{
            if(edtNo1.text.toString()!="" && edtNo2.text.toString()!=""){

                val no1 = edtNo1.text.toString().toInt()
                val no2 = edtNo2.text.toString().toInt()

                val sum = no1+no2

                txtResult.text = "$sum"

            }else {
                Toast.makeText(this,"Please Fill all the Required Blanks.", Toast.LENGTH_LONG).show();
            }
        }

        btnSub.setOnClickListener{
            if(edtNo1.text.toString()!="" && edtNo2.text.toString()!=""){

                val no1 = edtNo1.text.toString().toInt()
                val no2 = edtNo2.text.toString().toInt()

                val sub = no1-no2

                txtResult.text = "$sub"

            }else {
                Toast.makeText(this,"Please Fill all the Required Blanks.", Toast.LENGTH_LONG).show();
            }
        }

        btnMul.setOnClickListener{
            if(edtNo1.text.toString()!="" && edtNo2.text.toString()!=""){

                val no1 = edtNo1.text.toString().toInt()
                val no2 = edtNo2.text.toString().toInt()

                val mul = no1*no2

                txtResult.text = "$mul"

            }else {
                Toast.makeText(this,"Please Fill all the Required Blanks.", Toast.LENGTH_LONG).show();
            }
        }

        btnDiv.setOnClickListener{
            if(edtNo1.text.toString()!="" && edtNo2.text.toString()!=""){

                val no1 = edtNo1.text.toString().toDouble()
                val no2 = edtNo2.text.toString().toDouble()

                val div = no1/no2

                txtResult.text = "$div"

            }else {
                Toast.makeText(this,"Please Fill all the Required Blanks.", Toast.LENGTH_LONG).show();
            }
        }

    }
}


