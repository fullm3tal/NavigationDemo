package com.example.navigationdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_six.*

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [SixFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [SixFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SixFragment : Fragment() {

    var navController: NavController? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_six, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        bt_six.setOnClickListener {
            navController!!.navigate(R.id.action_sixFragment_to_sevenFragment)
        }
    }

}
