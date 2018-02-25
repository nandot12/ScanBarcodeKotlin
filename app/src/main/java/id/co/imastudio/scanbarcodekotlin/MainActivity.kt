package id.co.imastudio.scanbarcodekotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var textView : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.tvresult)





        btn?.setOnClickListener {
            val intent = Intent(this@MainActivity,ScanActivity ::class.java)
            startActivity(intent)
        }
    }

}
