package fr.mypo.messagesauto.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import fr.mypo.messagesauto.AlertModel
import fr.mypo.messagesauto.R
import fr.mypo.messagesauto.adapter.AlertAdapter

class HomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view=inflater?.inflate(R.layout.home_fragment, container, false)

        // creation d'une liste qui stock les alertes
        val alertList = arrayListOf<AlertModel>()

        alertList.add(
            AlertModel(
            "Site Web",
            " https://mypo.fr",
           false

        ))
        alertList.add(AlertModel(
            "WIFI",
            " Mot de passe du wifi: 0000",
            false

        ))

        val verticalRecyclerView = view.findViewById<RecyclerView>(R.id.vertical_recycler_view)
        verticalRecyclerView.adapter = AlertAdapter(alertList,R.layout.item_vertical_alert)

        return view
    }

}