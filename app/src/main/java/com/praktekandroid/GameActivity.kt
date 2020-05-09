package com.praktekandroid

import android.graphics.Color
import android.media.AsyncPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_game.*
import kotlin.random.Random as Random

private  const val Gunting = 1
private  const val Batu = 2
private  const val Kertas = 3

class GameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        var pilihanKomputer: Int
        var pilihanPlayer: Int

        buttonGunting.setOnClickListener {
            textPlayer.text = "Gunting"
            pilihanPlayer = Gunting
            pilihanKomputer = getPilihanKomputer()
            textKomputer.text = ""
            Handler().postDelayed( {
                textHasil.text = suwit(pilihanPlayer, pilihanKomputer)
                showPilihanKomputer(pilihanKomputer)
            },2000)
        }

        buttonBatu.setOnClickListener {
            textPlayer.text = "Batu"
            pilihanPlayer = Batu
            pilihanKomputer = getPilihanKomputer()
            textKomputer.text = ""
            Handler().postDelayed( {
                textHasil.text = suwit(pilihanPlayer, pilihanKomputer)
                textPlayer.text = "Batu"
                showPilihanKomputer(pilihanKomputer)
            },2000)
        }

        buttonKertas.setOnClickListener {
            textPlayer.text = "Kertas"
            pilihanPlayer = Kertas
            pilihanKomputer = getPilihanKomputer()
            textKomputer.text = ""
            Handler().postDelayed( {
                textHasil.text = suwit(pilihanPlayer, pilihanKomputer)
                showPilihanKomputer(pilihanKomputer)
            },2000)

        }
    }
    fun getPilihanKomputer():Int{
        return java.util.Random().nextInt(3) + 1;
    }

    fun suwit(pilihanPlayer: Int, pilihanKomputer: Int): String {
        var hasil: String = ""
        if (pilihanPlayer == pilihanKomputer){
            hasil = "SERI"
            textHasil.setTextColor(Color.BLUE)
        }
        else if ((pilihanPlayer == Gunting && pilihanKomputer == Kertas) ||
            (pilihanPlayer == Batu && pilihanKomputer == Gunting) ||
            (pilihanPlayer == Kertas && pilihanKomputer == Batu)) {
            hasil = "YOU LOSE"
            textHasil.setTextColor(Color.RED)
        }
        else{
            hasil = "YOU WIN"
        textHasil.setTextColor(Color.GREEN)
        }
        return hasil
    }

    fun showPilihanKomputer(pilihanKomputer: Int){
        when(pilihanKomputer){
            1 -> textKomputer.text = "Komputer milih Gunting"
            2 -> textKomputer.text = "Komputer milih Batu"
            3 -> textKomputer.text = "Komputer milih Kertas"
        }
    }
}