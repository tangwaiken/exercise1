package com.example.exercise1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calculateButton: Button = findViewById(R.id.buttonCalculate)
        calculateButton.setOnClickListener {calculate()}

        val resetButton: Button = findViewById(R.id.buttonReset)
        resetButton.setOnClickListener {reset()}

    }
    private fun reset(){
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()
        val carprice: EditText = findViewById(R.id.editTextCarPrice)
        val downpayment: EditText = findViewById(R.id.editTextDownPayment)
        val loanperiod: EditText  = findViewById(R.id.editTextLoanPeriod)
        val interestrate: EditText  = findViewById(R.id.editTextInterestRate)
        val loan: TextView  = findViewById(R.id.textViewLoan)
        val interest: TextView = findViewById(R.id.textViewInterest)
        val monthlyrepayment: TextView = findViewById(R.id.textViewMonthlyRepayment)

        carprice.setText("")
        downpayment.setText("")
        loanperiod.setText("")
        interestrate.setText("")
        loan.text = "Loan : "
        interest.text = "Interest : "
        monthlyrepayment.text = "Monthly Repayment : "
    }
    private fun calculate(){
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()
        val carprice: EditText = findViewById(R.id.editTextCarPrice)
        val downpayment: EditText = findViewById(R.id.editTextDownPayment)
        val loanperiod: EditText  = findViewById(R.id.editTextLoanPeriod)
        val interestrate: EditText  = findViewById(R.id.editTextInterestRate)
        val loan: TextView  = findViewById(R.id.textViewLoan)
        val interest: TextView = findViewById(R.id.textViewInterest)
        val monthlyrepayment: TextView = findViewById(R.id.textViewMonthlyRepayment)

        if(carprice!=null && downpayment!=null && loanperiod!=null && interestrate!=null){
            val cprice: Double = carprice.text.toString().toDouble()
            val dpayment: Double = downpayment.text.toString().toDouble()
            val lperiod: Double = loanperiod.text.toString().toDouble()
            val irate: Double = interestrate.text.toString().toDouble()
            val l: Double = cprice - dpayment
            val i: Double = l * irate * lperiod
            val m: Double = (l + irate) / lperiod / 12
            loan.text = "Loan : " + l.toString()
            interest.text = "Interest : " + i.toString()
            monthlyrepayment.text = "Monthly Repayment : " + m.toString()
        }
    }
}
