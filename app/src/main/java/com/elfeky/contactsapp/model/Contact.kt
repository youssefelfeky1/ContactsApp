package com.elfeky.contactsapp.model

import androidx.annotation.DrawableRes

data class Contact(
    val name:String,
    val phone: String,
    @DrawableRes val picture:Int
)
