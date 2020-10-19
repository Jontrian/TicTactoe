package com.example.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_draw_bot_play.*

class DrawBotPlay : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_draw_bot_play)

        val bu5ttagain : Button = findViewById(R.id.bu5again)

        bu5ttagain.setOnClickListener {

            // Made a "bu5ttagain" that will be able to click on.

            val builder = AlertDialog.Builder(this)

            // Made a "builder" variable to add the context in the "AlertDialog".

            builder.setTitle("Play again?")

            builder.setIcon(R.drawable.smilebpww)

            builder.setMessage("Menu or Restart?")

            // Added the Title an icon and a message in the dialog.

            builder.setPositiveButton("Menu") {
                    dialog, which ->

                val intent = Intent(this, welcome :: class.java)

                startActivity(intent)
            }

            // When you click on "Menu" you will get back to the "welcome" activity, that is the same as "menu".


            builder.setNegativeButton("Restart") {
                    dialog, which ->

                val intent = Intent(this, BotPlay :: class.java)

                startActivity(intent)

            }

            // When you click on "Restart" the "BotPlay" activity will start again restored.


            val dialog : AlertDialog = builder.create()
            dialog.show()

            // Makes all "builder" work together to make everything work properly.


        }



        quitbutt.setOnClickListener {

            // Made a "quitbutt" that will be able to click on.

            val builder = AlertDialog.Builder(this)

            // Made a "builder" variable to add the context in the "AlertDialog".

            builder.setTitle("Exit game")

            builder.setIcon(R.drawable.ic_action_warning)

            builder.setMessage("Are you sure?")

            // Added the Title an icon and a message in the dialog.

            builder.setPositiveButton("Yes") {
                    dialog, which ->
                finishAffinity()
            }

            // When you click "Yes" the app will shut down.

            builder.setNegativeButton("No") {
                    dialog, which ->
            }
            // When you click "No" nothing will happen and the alert window will disappear.

            val dialog : AlertDialog = builder.create()
            dialog.show()

            // Makes all "builder" work together to make everything work properly.

        }
    }
}
