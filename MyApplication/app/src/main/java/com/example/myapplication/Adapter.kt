package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import java.util.ArrayList

class Adapter(
    // Declare Variables

    internal var mContext: Context
) : BaseAdapter() {
    internal var inflater: LayoutInflater
    private val arraylist: ArrayList<Livre>

    init {
        inflater = LayoutInflater.from(mContext)
        this.arraylist = ArrayList()
        this.arraylist.addAll(Liste.moviesList)
    }

    inner class ViewHolder {

        internal var image: ImageView? = null
    }

    override fun getCount(): Int {
        return Liste.moviesList.size
    }

    override fun getItem(position: Int):Livre {
        return Liste.moviesList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        var view = view
        val holder: ViewHolder
        if (view == null) {
            holder = ViewHolder()
            view = inflater.inflate(R.layout.livre, null)
            holder.image = view!!.findViewById(R.id.image) as ImageView
            view.tag = holder
        } else {
            holder = view.tag as ViewHolder
        }
        // Set the results into TextViews
        holder.image!!.setImageResource(Liste.moviesList[position].getImage())

        return view
    }



}