package fr.mypo.messagesauto.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import fr.mypo.messagesauto.AlertModel
import fr.mypo.messagesauto.R

class AlertAdapter(private val alertList: List<AlertModel>,private val layoutId: Int) : RecyclerView.Adapter<AlertAdapter.ViewHolder>(){

    // cette classe va porter la view, c'est une boite pour ranger tout les composants a controle
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){

        val alertName=view.findViewById<TextView>(R.id.name_item)
        val alertDescription=view.findViewById<TextView>(R.id.description_item)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(layoutId, parent,false)

        return ViewHolder(view)
    }

    //mettre a jour chaque modele avec
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        // recuperer les informations de l'alerte
        val currentAlert=alertList[position]

        holder.alertName.text=currentAlert.name
        holder.alertDescription.text=currentAlert.description
    }

    //combien d'items on souhaite afficher dynamiquement
    override fun getItemCount(): Int = alertList.size



}