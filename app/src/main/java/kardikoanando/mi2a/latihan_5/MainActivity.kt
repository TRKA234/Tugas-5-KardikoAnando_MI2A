package kardikoanando.mi2a.latihan_5

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var btnKonversi : Button
    private lateinit var btnTotal : Button
    private lateinit var btnLuasVolume : Button
    private lateinit var btnGanjilGenap : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnKonversi= findViewById(R.id.btnKonversiSuhu)
        btnTotal= findViewById(R.id.btnTotalBelanja)
        btnLuasVolume= findViewById(R.id.btnLuasdanVolume)
        btnGanjilGenap= findViewById(R.id.btnBilGanjilGenap)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnKonversi.setOnClickListener(){
            val intent1= Intent(this@MainActivity, KonversiSuhu::class.java)
            startActivity(intent1)
        }

        btnTotal.setOnClickListener(){
            val intent2 = Intent(this@MainActivity, TotalBelanja::class.java)
            startActivity(intent2)
        }

        btnLuasVolume.setOnClickListener(){
            val intent3 = Intent(this@MainActivity, LuasVolume::class.java)
            startActivity(intent3)
        }

        btnGanjilGenap.setOnClickListener(){
            val intent4 = Intent(this@MainActivity, BilGanjilGenap::class.java)
            startActivity(intent4)
        }

    }
}