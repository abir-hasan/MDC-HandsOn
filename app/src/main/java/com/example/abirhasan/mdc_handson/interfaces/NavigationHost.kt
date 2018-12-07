package com.example.abirhasan.mdc_handson.interfaces

import androidx.fragment.app.Fragment

interface NavigationHost {
    fun navigateTo(fragment: Fragment, addToBackStack: Boolean)
}