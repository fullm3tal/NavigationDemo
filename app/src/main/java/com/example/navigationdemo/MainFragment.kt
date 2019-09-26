package com.example.navigationdemo

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_main.*

/**
 * A simple [Fragment] subclass.
 */
class MainFragment : Fragment() {

    private var navController: NavController? = null
    var drawerLocker: DrawerLocker? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        drawerLocker = context as DrawerLocker
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        setClicks()
    }

    private fun setClicks() {
        bt_frag_main.setOnClickListener {
            navController!!.navigate(R.id.action_mainFragment_to_oneFragment)
            drawerLocker!!.lockDrawer()
        }
    }

    override fun onResume() {
        super.onResume()
       drawerLocker!!.unlockDrawer()
    }
}
