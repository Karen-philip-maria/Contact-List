package com.example.mycontacts

import android.os.Bundle
import android.view.inputmethod.InputBinding
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvContacts.layoutManager= GridLayoutManager(this,2)

        displayContacts()
    }
    fun displayContacts(){
        val contact1= Contact("Abraham", "0797985806","abraham@gmail.com","")
        val contact2= Contact("Brian", "079798589849","brian@gmail.com","")
        val contact3= Contact("Karen", "0797985808","karen@gmail.com","")
        val contact4= Contact("Pearl", "0796985806","pearl@gmail.com","")
        val contact5= Contact("Gloria", "0787985806","gloria@gmail.com","")
        val contact6= Contact("Bridget", "0797775806","gloria@gmail.com","")
        val contact7= Contact("Andrew", "0797987806","andrew@gmail.com","")
        val contact8= Contact("Grace", "0797912806","grace@gmail.com","")
        val contact9= Contact("Andrea", "0747987806","andrea@gmail.com","")
        val contact10= Contact("Agnes", "0797957806","agnes@gmail.com","")
        val contact11= Contact("Abel", "0797981806","abel@gmail.com","")
        val contact12= Contact("Amanda", "0797987801","amanda@gmail.com","")

        val  contactList = listOf(contact1, contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10,contact11,contact12)
        val contactsAdapter= ContactsAdapter(contactList)

        binding.rvContacts.adapter= contactsAdapter
    }

}


