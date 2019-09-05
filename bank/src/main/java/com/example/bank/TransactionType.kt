package com.example.bank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.firebase.ui.auth.AuthUI
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_transaction_type.*

class TransactionType : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transaction_type)

        // transaction cancelled button
        cancelTransactions.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            Toast.makeText(applicationContext, "Transaction Cancelled", Toast.LENGTH_SHORT).show()
        })
    }
}
