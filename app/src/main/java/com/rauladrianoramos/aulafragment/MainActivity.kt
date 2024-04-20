package com.rauladrianoramos.aulafragment

import android.os.Bundle
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
}