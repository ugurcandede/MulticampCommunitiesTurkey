package com.ugurcandede.multicampcommunitiesturkey

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.ugurcandede.multicampcommunitiesturkey.data.RetrofitProvider
import kotlinx.android.synthetic.main.fragment_all_multicamps.*
import kotlinx.coroutines.launch

class MulticampsFragment : Fragment(R.layout.fragment_all_multicamps) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        lifecycleScope.launch {
            val resp = RetrofitProvider.mccApi.getMulticampCommunities("communities")
            rwMulticamps.adapter = MulticampAdapter(resp.orEmpty().toMutableList()) {
                val dir= MulticampsFragmentDirections.actionMulticampsFragmentToSingleMulticampFragment(it)
                findNavController().navigate(dir)
            }

        }
        tv_cpyrght.setOnClickListener {startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/ugurcandede")))}


    }
}