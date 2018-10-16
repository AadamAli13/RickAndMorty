package com.saam.rickandmorty.util.extensions

import android.os.Looper
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import kotlinx.coroutines.experimental.Dispatchers
import kotlinx.coroutines.experimental.GlobalScope
import kotlinx.coroutines.experimental.Job
import kotlinx.coroutines.experimental.launch

fun Fragment.showToast(message: String) {
    Toast.makeText(this.context, message, Toast.LENGTH_LONG).show()
}

fun Fragment.showToast(resId: Int) {
    Toast.makeText(this.context, resId, Toast.LENGTH_LONG).show()
}

inline fun Fragment.ui(crossinline block: (activity: FragmentActivity) -> Unit): Job? {
    if (activity != null && view != null && context != null) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            block(activity!!)
            return null
        } else {
            GlobalScope.launch(Dispatchers.Main) {
                if (activity != null && view != null && context != null)
                    block(activity!!)
            }
        }
    }

    return null
}