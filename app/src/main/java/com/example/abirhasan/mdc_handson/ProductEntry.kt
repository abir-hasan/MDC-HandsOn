package com.example.abirhasan.mdc_handson

data class ProductEntry(
    val title: String,
    val price: String,
    val url: String
) {
    companion object {
        fun initProductEntryList(): List<ProductEntry> {
            val list = ArrayList<ProductEntry>()
            list.add(ProductEntry("Bag", "$50", "https://cdn-img-3.wanelo.com/p/be6/96d/288/a071565854f2b0d338ad523/x354-q80.jpg"))
            list.add(ProductEntry("Bag", "$50", "https://www.lestyle.com.au/wp-content/uploads/2017/09/VersacePalazzoEmpireBagLargeBeige-600x600.jpg"))
            list.add(ProductEntry("Bag", "$50", "https://www.lestyle.com.au/wp-content/uploads/2017/09/VersacePalazzoEmpireBagLargeBeige-600x600.jpg"))
            list.add(ProductEntry("Bag", "$50", "https://www.lestyle.com.au/wp-content/uploads/2017/09/VersacePalazzoEmpireBagLargeBeige-600x600.jpg"))
            list.add(ProductEntry("Bag", "$50", "https://www.lestyle.com.au/wp-content/uploads/2017/09/VersacePalazzoEmpireBagLargeBeige-600x600.jpg"))
            list.add(ProductEntry("Bag", "$50", "https://www.lestyle.com.au/wp-content/uploads/2017/09/VersacePalazzoEmpireBagLargeBeige-600x600.jpg"))
            list.add(ProductEntry("Bag", "$50", "https://www.lestyle.com.au/wp-content/uploads/2017/09/VersacePalazzoEmpireBagLargeBeige-600x600.jpg"))
            list.add(ProductEntry("Bag", "$50", "https://www.lestyle.com.au/wp-content/uploads/2017/09/VersacePalazzoEmpireBagLargeBeige-600x600.jpg"))
            list.add(ProductEntry("Bag", "$50", "https://www.lestyle.com.au/wp-content/uploads/2017/09/VersacePalazzoEmpireBagLargeBeige-600x600.jpg"))
            list.add(ProductEntry("Bag", "$50", "https://www.lestyle.com.au/wp-content/uploads/2017/09/VersacePalazzoEmpireBagLargeBeige-600x600.jpg"))
            list.add(ProductEntry("Bag", "$50", "https://www.lestyle.com.au/wp-content/uploads/2017/09/VersacePalazzoEmpireBagLargeBeige-600x600.jpg"))
            return list
        }
    }
}