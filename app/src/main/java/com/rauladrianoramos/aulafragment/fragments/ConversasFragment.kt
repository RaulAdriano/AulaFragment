package com.rauladrianoramos.aulafragment.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.rauladrianoramos.aulafragment.R

//class ConversasFragment : Fragment(R.layout.fragment_conversas) { para construir mais simples, telas simples
class ConversasFragment : Fragment() {

    private lateinit var buttonExecutar : Button
    private lateinit var editNome : EditText
    private lateinit var textNome : TextView

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("ciclo_vida", "Fragment OnAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("ciclo_vida", "Fragment onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("ciclo_vida", "Fragment onCreateView")
        val view = inflater.inflate(
            R.layout.fragment_conversas,
            container,
            false
        )

        //processamento da visualização
        buttonExecutar = view.findViewById(R.id.buttonExecutar)
        editNome = view.findViewById(R.id.editNome)
        textNome = view.findViewById(R.id.textNome)

        buttonExecutar.setOnClickListener {
            textNome.text = editNome.text.toString()
        }

        return view
    }

    //depreciado
//    override fun onActivityCreated(savedInstanceState: Bundle?) {
//        super.onActivityCreated(savedInstanceState)
//    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("ciclo_vida", "Fragment onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.i("ciclo_vida", "Fragment OnAttach")
    }

    override fun onResume() {
        super.onResume()
        Log.i("ciclo_vida", "Fragment OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("ciclo_vida", "Fragment OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("ciclo_vida", "Fragment OnStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("ciclo_vida", "Fragment onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("ciclo_vida", "Fragment OnDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i("ciclo_vida", "Fragment OnDetach")
    }
}