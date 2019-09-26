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
import kotlinx.android.synthetic.main.fragment_five.*


/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [FiveFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [FiveFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FiveFragment : Fragment() {
    // TODO: Rename and change types of parameters

    var navController: NavController? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_five, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    navController = Navigation.findNavController(view)

        bt_five.setOnClickListener {
            navController!!.navigate(R.id.action_fiveFragment_to_sixFragment)
        }

    }
}
