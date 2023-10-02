package com.example.a160720056_w4.view
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.a160720056_w4.R
import com.example.a160720056_w4.model.Plane
import com.example.a160720056_w4.model.Student

class PlaneListAdapter (val plane:ArrayList<Plane>)
    :RecyclerView.Adapter<PlaneListAdapter.PlanesViewHolder>(){
        class PlanesViewHolder(v: View):RecyclerView.ViewHolder(v)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlanesViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view=inflater.inflate(R.layout.plane_list_item,parent,false)
        return PlanesViewHolder(view)
    }

    override fun getItemCount(): Int {
        return plane.size
    }

    override fun onBindViewHolder(holder: PlanesViewHolder, position: Int) {
        var txtResult=holder.itemView.findViewById<TextView>(R.id.txtResult)
        var manufacturer=plane[position].manufacturer
        var model=plane[position].model
        var year=plane[position].year
        var color=plane[position].color
        var fuelType=plane[position].fuelType
        var maxPassengers=plane[position].maxPassengers
        var features=plane[position].features
        txtResult.text=manufacturer+" "+model+" "+year+" "+color+" "+fuelType+" "+maxPassengers+" "+features

    }
    fun updatePlanes(newPlanes: ArrayList<Plane>) {
        plane.clear()
        plane.addAll(newPlanes)
        notifyDataSetChanged()
    }


}