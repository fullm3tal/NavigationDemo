package com.example.navigationdemo

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_four.*


/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [FourFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [FourFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FourFragment : Fragment() {

    var navController: NavController? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_four, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
      navController = Navigation.findNavController(view)

        bt_four.setOnClickListener {
            navController!!.navigate(R.id.action_fourFragment_to_fiveFragment)
        }

    }

}
