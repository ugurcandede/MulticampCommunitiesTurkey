package com.ugurcandede.multicampcommunitiesturkey

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import coil.load
import kotlinx.android.synthetic.main.fragment_single_multicamp.*

class SingleMulticampFragment : Fragment(R.layout.fragment_single_multicamp) {
    private val args by navArgs<SingleMulticampFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        avatar.load(args.MulticampData.leader?.photo)
        tv_SMC_name.text = args.MulticampData.leader?.name
        tv_SMC_dept.text = args.MulticampData.name
        tv_SMC_desc.text = args.MulticampData.description

        iv_SMC_mcDep.load(args.MulticampData.banner)

        iv_SMC_web.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse(args.MulticampData.links?.participation)
                )
            )
        }
        iv_SMC_instagram.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse(args.MulticampData.links?.instagram)
                )
            )
        }
        iv_SMC_twitter.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse(args.MulticampData.links?.twitter)
                )
            )
        }
        iv_SMC_youtube.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse(args.MulticampData.links?.youtube)
                )
            )
        }
        tv_SMC_cpyrght.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://github.com/ugurcandede")
                )
            )
        }

    }
}