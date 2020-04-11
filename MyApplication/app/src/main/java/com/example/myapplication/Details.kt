package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class Details  : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView= inflater.inflate(R.layout.details, container, false)
        val bundle = this.arguments
        val image = rootView.findViewById<ImageView>(R.id.image)
        val description = rootView.findViewById<TextView>(R.id.description)
        val auteur=rootView.findViewById<TextView>(R.id.auteur)
        val pays=rootView.findViewById<TextView>(R.id.pays)
        val genre=rootView.findViewById<TextView>(R.id.genre)

        if (bundle != null) {
            val index = bundle.getInt("amount", android.R.attr.defaultValue)
            auteur.text=resources.getStringArray(R.array.auteur_array)[index]
            pays.text=resources.getStringArray(R.array.pays_array)[index]
            description.text=resources.getStringArray(R.array.description_array)[index]
            genre.text=resources.getStringArray(R.array.genre_array)[index]


            var images = resources.obtainTypedArray(R.array.images)
            var i= resources.getIntArray(R.array.images)[index]
            image.setImageResource(images.getResourceId(index,-1))
        }

        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //you can set the title for your toolbar here for different fragments different titles
        activity!!.title = "Détails"
    }
}
