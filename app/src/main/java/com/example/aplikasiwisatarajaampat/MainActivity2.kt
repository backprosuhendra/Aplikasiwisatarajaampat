package com.example.aplikasiwisatarajaampat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.aplikasiwisatarajaampat.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(HomeFragment())

        binding.bottomNavigationView.setOnItemReselectedListener {
            when(it.itemId){
                R.id.bottom_cari ->replaceFragment(HomeFragment())
                R.id.bottom_favorit ->replaceFragment(FavoritFragment())
                R.id.bottom_pemesanan ->replaceFragment(PemesananFragment())
                R.id.bottom_profil ->replaceFragment(ProfilFragment())

                else ->{

                }
            }
            true

        }
    }

    private  fun replaceFragment(fragment : Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransction = fragmentManager.beginTransaction()
        fragmentTransction.replace(R.id.framelayout,fragment)
        fragmentTransction.commit()
    }
}