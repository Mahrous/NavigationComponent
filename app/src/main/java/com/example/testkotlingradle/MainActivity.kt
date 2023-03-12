package com.example.testkotlingradle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.onNavDestinationSelected
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.testkotlingradle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //view binding
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //To setup fragment  as the navigation Host
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nave_host_fragment) as NavHostFragment

        //to navigate between home and search by bottom navigation
        // without saving navigate between them inside stack
        appBarConfiguration = AppBarConfiguration(
            setOf(R.id.homeFragment2, R.id.searchFragment)
        )

        // To find navigation controller -> (@navigation/nav_component.xml)
        navController = navHostFragment.findNavController()

        //To setup the tool bare
        setSupportActionBar(binding.toolbare)


        //setup action bare cases that care about navigation between (bottom nav tabs )
        // and navigation between others fragments at home
        setupActionBarWithNavController(navController, appBarConfiguration)

        //set up bottom navigation controller to bottom navigation component at XML
        binding.nav.setupWithNavController(navController)


    }

    //set up me nave controller
    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }

    //set up menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.options_menu, menu)

        return true
    }

    //set up menu click
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return if (item.itemId == R.id.termsAndCondition) {
            val action = NavComponentDirections.actionGlobalTerms()
            navController.navigate(action)
            true
        } else {
            item.onNavDestinationSelected(navController) || super.onOptionsItemSelected(item)
        }

    }
}