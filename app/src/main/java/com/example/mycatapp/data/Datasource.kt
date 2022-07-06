package com.example.mycatapp.data

import com.example.mycatapp.R
import com.example.mycatapp.model.MyCat

class Datasource {

    fun loadMyCat(): List<MyCat> {
        return listOf<MyCat>(
            MyCat(R.string.catquote1, R.drawable.img01),
            MyCat(R.string.catquote2, R.drawable.img02),
            MyCat(R.string.catquote3, R.drawable.img03),
            MyCat(R.string.catquote4, R.drawable.img04),
            MyCat(R.string.catquote5, R.drawable.img05),
            MyCat(R.string.catquote6, R.drawable.img06),
            MyCat(R.string.catquote7, R.drawable.img07),
            MyCat(R.string.catquote9, R.drawable.img09),
            MyCat(R.string.catquote10, R.drawable.img10),
            MyCat(R.string.catquote11, R.drawable.img11)
        )

    }
}