package com.example.abirhasan.mdc_handson.fragment

import android.os.Bundle
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.abirhasan.mdc_handson.adapters.ProductCardRecyclerViewAdapter
import com.example.abirhasan.mdc_handson.models.ProductEntry
import com.example.abirhasan.mdc_handson.R
import kotlinx.android.synthetic.main.fragment_product_grid.view.*

class ProductGridFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_product_grid, container, false)
        (activity as AppCompatActivity).setSupportActionBar(view.app_bar)
        initRecyclerView(view)
        return view
    }

    private fun initRecyclerView(view: View) {
        // Set up the RecyclerView
        view.recycler_view.setHasFixedSize(true)
        view.recycler_view.layoutManager = GridLayoutManager(
            context, 2, RecyclerView.VERTICAL, false
        )
        val adapter = ProductCardRecyclerViewAdapter(
            ProductEntry.initProductEntryList()
        )
        view.recycler_view.adapter = adapter
    }

    override fun onCreateOptionsMenu(menu: Menu?, menuInflater: MenuInflater?) {
        menuInflater!!.inflate(R.menu.shr_toolbar_menu, menu)
        super.onCreateOptionsMenu(menu, menuInflater)
    }

}
