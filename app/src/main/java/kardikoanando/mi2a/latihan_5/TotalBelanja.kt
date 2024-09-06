package kardikoanando.mi2a.latihan_5

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TotalBelanja : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_total_belanja)

        val edtTotalBelanja = findViewById<EditText>(R.id.edt_total_belanja)
        val btnHitungDiskon = findViewById<Button>(R.id.btn_hitung_diskon)
        val tvDiskon = findViewById<TextView>(R.id.tv_diskon)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnHitungDiskon.setOnClickListener {
            val totalBelanja = edtTotalBelanja.text.toString().toDouble()

            var diskon = 0.0
            if (totalBelanja < 100000) {
                diskon = 0.0
            } else if (totalBelanja >= 100000 && totalBelanja < 500000) {
                diskon = 0.1
            } else if (totalBelanja >= 500000 && totalBelanja < 1000000) {
                diskon = 0.2
            } else {
                diskon = 0.3
            }

            val diskonRupiah = totalBelanja * diskon
            tvDiskon.text = "Diskon: Rp. $diskonRupiah"
        }
    }
}