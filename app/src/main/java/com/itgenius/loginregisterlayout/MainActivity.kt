package com.itgenius.loginregisterlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // การเรียกใช้ตัวแปรจาก XML
        // จะทำผ่านคำสั่ง findViewById
        // แล้วเก็บลงตัวแปร
        // var / val
        // var เป็นการประกาศตัวแปรแบบเปลี่ยนแปลงค่าได้
        // val เป็นการประกาศตัวแปรแบบค่าคงที่ ไม่สามารถเปลี่ยนแปลงค่าได้
        // var name = "samit"
        // name = "jame"
        // var value_abc = "abc"
        // val value_xyz = 30
        val btnGetStart = findViewById<Button>(R.id.btnGetStart)

        // ใส่ Event Click ให้กับปุ่ม btnGetStart
        btnGetStart.setOnClickListener {
            // แสดง Popup ใน Android
            Toast.makeText(this, "You click getStart", Toast.LENGTH_LONG).show()

            // ส่งไปหน้า LoginActivity
            // ใน Android จะใช้คำสั่ง Intent ในการเปลี่ยนหน้าจอ
            // Intent(คลาสต้นทาง,คลาสปลายทาง)
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)

        }

    }

}