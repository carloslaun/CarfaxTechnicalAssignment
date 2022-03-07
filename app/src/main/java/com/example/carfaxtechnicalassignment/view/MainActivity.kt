package com.example.carfaxtechnicalassignment.view

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.Glide
import com.example.carfaxtechnicalassignment.R
import com.example.carfaxtechnicalassignment.databinding.ActivityMainBinding
import com.google.firebase.ktx.Firebase
import com.google.firebase.database.ktx.database


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setContentView(binding.root)

        //offline support
        Firebase.database.setPersistenceEnabled(true)


    }

    fun showToast(view: View) {
        val text = "No Call Permission"
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(applicationContext, text, duration)
        toast.show()
        //requestPermission()
    }
/*    private fun requestPermission(){
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            when{
                ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED -> {
                    call()
                }

                else -> requestPermissionLauncher.launch(Manifest.permission.CALL_PHONE)

            }

        }else{
            call()
        }
    }
    private val requestPermissionLauncher = registerForActivityResult(
        ActivityResultContracts.requestPermission()

    ){ isGranted ->
        if(isGranted){
            call()
        }else{
            val text = "No Call Permission"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
        }

    }
    private fun call(){
        startActivity(Intent(Intent.ACTION_CALL, Uri.parse(phoneNumber)))

    }*/
}