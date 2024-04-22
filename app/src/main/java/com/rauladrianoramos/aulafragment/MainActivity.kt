package com.rauladrianoramos.aulafragment

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.rauladrianoramos.aulafragment.fragments.ChamadasFragment
import com.rauladrianoramos.aulafragment.fragments.ConversasFragment

class MainActivity : AppCompatActivity() {
    private lateinit var buttonConversas : Button
    private lateinit var buttonChamadas : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("ciclo_vida", "Activity onCreate")

//        val fragmentManager = supportFragmentManager.beginTransaction()
//
//        //diversas alteracoes no fragment
//
//        fragmentManager.add(R.id.fragment_conteudo, ConversasFragment())
//
//        fragmentManager.commit()

        buttonConversas = findViewById(R.id.button_conversas)
        buttonChamadas = findViewById(R.id.button_chamadas)

        //val conversasFragment = ConversasFragment();

        buttonConversas.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_conteudo,ConversasFragment())
                .commit()
        }

        buttonChamadas.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
               .replace(R.id.fragment_conteudo, ChamadasFragment())
                //.remove(conversasFragment)
                .commit()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("ciclo_vida", "Activity onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("ciclo_vida", "Activity onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("ciclo_vida", "Activity onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("ciclo_vida", "Activity onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("ciclo_vida", "Activity onDestroy")
    }
}