package kardikoanando.mi2a.latihan_5

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BilGanjilGenap : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bil_ganjil_genap)

        val edtBilangan = findViewById<EditText>(R.id.edt_bilangan)
        val btnCek = findViewById<Button>(R.id.btn_cek_bilangan)
        val tvHasil = findViewById<TextView>(R.id.tv_hasil)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnCek.setOnClickListener {
            val bilangan = edtBilangan.text.toString().toInt()
            if (bilangan % 2 == 0) {
                tvHasil.text = "Bilangan $bilangan adalah bilangan genap"
            } else {
                tvHasil.text = "Bilangan $bilangan adalah bilangan ganjil"
            }
        }
    }
}