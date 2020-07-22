package com.example.smanndavid

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import kotlinx.android.synthetic.main.fragement_home.*

class HomeFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragement_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val layoutManager = LinearLayoutManager(activity)
    }

    private fun loadProduct(){
        showLoading(true)

        val queue = Volley.newRequestQueue(activity)
        val url = "http://ite-rupp.ap-southeast-1.elasticbeanstalk.com/products.php"

    }

    private fun showLoading(state: Boolean){
        if (state) {
            progress_bar.visibility = View.VISIBLE
            recycler_view.visibility = View.INVISIBLE
        }else
            progress_bar.visibility = View.INVISIBLE
        recycler_view.visibility = View.VISIBLE
    }
}