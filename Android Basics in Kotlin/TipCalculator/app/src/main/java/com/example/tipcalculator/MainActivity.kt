package com.example.tipcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tipcalculator.databinding.ActivityMainBinding
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayTip(0.00)

        binding.calculateButton.setOnClickListener{ calculateTip() }
    }

    private fun calculateTip() {
        // Get the decimal value from the cost of service text field
        val cost = binding.costOfServiceEditText.text.toString().toDoubleOrNull()

        // If the cost is null or 0, then display 0 tip and exit the function early
        if (cost == null || cost == 0.0) {
            displayTip(0.0)
            return
        }

        // Get the selected RadioButton and get the corresponding percentage
        val tipPercentage = when (binding.tipOptions.checkedRadioButtonId) {
            R.id.option_twenty_percent -> 0.20
            R.id.option_eighteen_percent -> 0.18
            else -> 0.15
        }

        // Calculate the tip
        var tip = tipPercentage * cost

        // Check if RoundItUp Button is switched
        if (binding.roundUpSwitch.isChecked) {
            tip = kotlin.math.ceil(tip)
        }

        // Display the formatted tip value
        displayTip(tip)
    }

    private fun displayTip(tip : Double) {
        val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
        binding.tipResult.text = getString(R.string.tip_amount, formattedTip)
    }
}