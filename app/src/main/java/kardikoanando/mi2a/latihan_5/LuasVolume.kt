package kardikoanando.mi2a.latihan_5

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LuasVolume : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_luas_volume)

        val edtPanjang = findViewById<EditText>(R.id.edt_panjang)
        val edtLebar = findViewById<EditText>(R.id.edt_lebar)
        val edtTinggi = findViewById<EditText>(R.id.edt_tinggi)
        val btnHitung = findViewById<Button>(R.id.btn_hitung)
        val tvLuasPermukaan = findViewById<TextView>(R.id.tv_luas_permukaan)
        val tvVolume = findViewById<TextView>(R.id.tv_volume)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnHitung.setOnClickListener {
            val panjang = edtPanjang.text.toString().toInt()
            val lebar = edtLebar.text.toString().toInt()
            val tinggi = edtTinggi.text.toString().toInt()

            val luasPermukaan = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi)
            val volume = panjang * lebar * tinggi

            tvLuasPermukaan.text = "Luas Permukaan: $luasPermukaan"
            tvVolume.text = "Volume: $volume"
        }

    }
}