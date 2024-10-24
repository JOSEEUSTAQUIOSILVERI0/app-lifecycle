package com.br.eustaquio.app_lifecycle



import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Tag para o Logcat
    private val TAG = "CicloDeVida"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate chamado")
        Toast.makeText(this, "onCreate chamado", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart chamado")
        Toast.makeText(this, "onStart chamado", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume chamado")
        Toast.makeText(this, "onResume chamado", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause chamado")
        Toast.makeText(this, "onPause chamado", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop chamado")
        Toast.makeText(this, "onStop chamado", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy chamado")
        Toast.makeText(this, "onDestroy chamado", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart chamado")
        Toast.makeText(this, "onRestart chamado", Toast.LENGTH_SHORT).show()
    }
}
