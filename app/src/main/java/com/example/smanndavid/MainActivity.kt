package com.example.smanndavid;

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        bottomNav.setOnNavigationItemReselectedListener{
            when (it.itemId) {
                R.id.mnu_home -> {
                    showFragment(HomeFragment())
                }
                R.id.mnu_categories -> {
                    showFragment(CategoryFragment())
                }
                R.id.mnu_search -> {
                    showFragment(SearchFragment())
                }
                else -> {
                    showFragment(AccountFragment())
                }
            }
            true
        }
    }
    fun showFragment(fragment: Fragment){
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.lytFragmentContainer, fragment)
        fragmentTransaction.commit()
    }
}