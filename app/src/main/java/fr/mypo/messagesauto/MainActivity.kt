package fr.mypo.messagesauto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SmsManager
import fr.mypo.messagesauto.fragments.HomeFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //injection du fragment dans notre boite( fragment_container )
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, HomeFragment())
        transaction.addToBackStack(null)
        transaction.commit()



    }
}