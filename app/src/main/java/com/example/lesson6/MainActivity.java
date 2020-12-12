package com.example.lesson6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.lesson6.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private Math math;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View v = binding.getRoot();
        setContentView(v);
        actions();
    }

    public void actions() {
        math = new Math();
        binding.btnAddition.setOnClickListener(v -> {
                    int result = math.addition(Integer.valueOf(binding.et1stNum.getText().toString()), Integer.valueOf(binding.et2ndNum.getText().toString()));
                    binding.tvResult.setText(String.valueOf(result));
                }
        );

        binding.btnSubtraction.setOnClickListener(v -> {
            int result = math.subtraction(Integer.valueOf(binding.et1stNum.getText().toString()), Integer.valueOf(binding.et2ndNum.getText().toString()));
                    binding.tvResult.setText(String.valueOf(result));
                }
        );

        binding.btnMultiply.setOnClickListener(v ->{
                    int result = math.multiply(Integer.valueOf(binding.et1stNum.getText().toString()), Integer.valueOf(binding.et2ndNum.getText().toString()));
                    binding.tvResult.setText(String.valueOf(result));
                }
        );

        binding.btnDivision.setOnClickListener(v ->{
                    int result = math.division(Integer.valueOf(binding.et1stNum.getText().toString()), Integer.valueOf(binding.et2ndNum.getText().toString()));
                    binding.tvResult.setText(String.valueOf(result));
                }
        );
    }
}