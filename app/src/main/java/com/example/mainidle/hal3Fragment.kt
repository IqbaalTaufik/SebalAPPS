package com.example.mainidle

import android.content.Intent
import android.content.IntentSender
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.fragment_hal3.*
//NIM : 10117188
//KELAS : IF-5
//NAMA : MUHAMMAD IQBAL TAUFIK
//TGL PENGERJAAN : 05-05-2020 S/D 15-05-2020
/**
 * A simple [Fragment] subclass.
 */
class hal3Fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hal3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button222.setOnClickListener {
            val intent = Intent(context, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
