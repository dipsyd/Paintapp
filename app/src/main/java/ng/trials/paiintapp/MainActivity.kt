package ng.trials.paiintapp

import android.graphics.Color
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import ng.trials.paiintapp.Paintview.Companion.colorList
import ng.trials.paiintapp.Paintview.Companion.currentBrush
import ng.trials.paiintapp.Paintview.Companion.pathList
import java.nio.file.Path

class MainActivity : AppCompatActivity() {

    companion object{
        var path = android.graphics.Path()
        var paintBrush = Paint()
    }




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val redBtn = findViewById<ImageButton>(R.id.redcolor)
        val blueBtn = findViewById<ImageButton>(R.id.bluecolor)
        val blackBtn = findViewById<ImageButton>(R.id.blackcolor)
        val eraser = findViewById<ImageButton>(R.id.whitecolor)

        redBtn.setOnClickListener {
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.RED
            currentColor(paintBrush.color)
        }

        blueBtn.setOnClickListener {
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.BLUE
            currentColor(paintBrush.color)
        }

        blackBtn.setOnClickListener {
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.BLACK
            currentColor(paintBrush.color)
        }

        eraser.setOnClickListener {
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            pathList.clear()
            colorList.clear()
            path.reset()
        }
    }

    private fun currentColor(color : Int){
        currentBrush = color
        path = android.graphics.Path()
    }
}