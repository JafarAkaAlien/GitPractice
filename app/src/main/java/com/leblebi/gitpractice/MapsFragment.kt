package com.leblebi.gitpractice

import androidx.fragment.app.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.leblebi.gitpractice.databinding.FragmentMapsBinding

class MapsFragment : Fragment() {

        interface FragmentListener{
            fun onFragmentInteraction(data:String):String
        }


        private lateinit var binding: FragmentMapsBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        binding =  FragmentMapsBinding.inflate(inflater,container,false)


        return binding?.root

    }
    fun yaziniYaz(yazi:String , interaction : FragmentListener){

        binding.textView2?.text = interaction.onFragmentInteraction(yazi)
        
    }
    fun simpleYaz(yazi:String){
        binding.textView2.text=yazi
    }

}