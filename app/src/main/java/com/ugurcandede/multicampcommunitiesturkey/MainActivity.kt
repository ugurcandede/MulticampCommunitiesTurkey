package com.ugurcandede.multicampcommunitiesturkey

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
   /*
        lifecycleScope.launch {
            val resp = RetrofitProvider.mccApi.getMulticampCommunities("communities")
            println(resp[0].name)
            tw.text = "${resp[0].name} \n ${resp[0].leader?.name}"
        }
    */
    }
}