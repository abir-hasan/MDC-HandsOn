package com.example.abirhasan.mdc_handson

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.shr_product_card.view.*

class ProductCardRecyclerViewAdapter(private val productList: List<ProductEntry>) :
    RecyclerView.Adapter<ProductCardRecyclerViewAdapter.ProductCardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductCardViewHolder {
        val layoutView = LayoutInflater.from(parent.context).inflate(R.layout.shr_product_card, parent, false)
        return ProductCardViewHolder(layoutView)
    }

    override fun onBindViewHolder(holder: ProductCardViewHolder, position: Int) {
        if (position < productList.size) {
            val product = productList[position]
            holder.productTitle.text = product.title
            holder.productPrice.text = product.price
            Picasso
                .get()
                .load(product.url)
                .placeholder(R.drawable.shr_menu)
                .error(R.drawable.shr_logo)
                .into(holder.productImage)
        }
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    inner class ProductCardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var productImage: ImageView = itemView.product_image
        var productTitle: TextView = itemView.product_title
        var productPrice: TextView = itemView.product_price
    }
}