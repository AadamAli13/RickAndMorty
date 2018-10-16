package com.saam.rickandmorty.nav.characters.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.saam.rickandmorty.R
import com.saam.rickandmorty.nav.characters.presentation.CharactersPresenter
import com.saam.rickandmorty.nav.characters.presentation.CharactersView
import com.saam.rickandmorty.util.extensions.showToast
import com.saam.rickandmorty.util.extensions.ui
import dagger.android.support.AndroidSupportInjection
import kotlinx.android.synthetic.main.fragment_main.*
import javax.inject.Inject

fun newInstance(): Fragment {
    return CharactersFragment()
}

class CharactersFragment: Fragment(), CharactersView, View.OnClickListener {
    @Inject
    lateinit var presenter: CharactersPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidSupportInjection.inject(this)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_main, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViews()
    }

    override fun getCharacters() {

    }

    override fun showLoading() {
        ui {
            loading_bar.visibility = View.VISIBLE
        }
    }

    override fun hideLoading() {
        ui {
            loading_bar.visibility = View.GONE
        }
    }

    override fun showMessage(resId: Int) {
        ui {
            showToast(resId)
        }
    }

    override fun showMessage(message: String) {
        ui {
            showToast(message)
        }
    }

    override fun showGenericErrorMessage() {
        ui {
            showToast(getString(R.string.error_generic_message))
        }
    }

    override fun onClick(view: View?) {
        val usernameValue = username.text.toString()
        val passwordValue = password.text.toString()

        if (usernameValue.isEmpty() && passwordValue.isEmpty())
            showMessage(getString(R.string.error_missing_user_and_pass))
        else if (usernameValue.isEmpty())
            showMessage(getString(R.string.error_missing_username))
        else if (passwordValue.isEmpty())
            showMessage(getString(R.string.error_missing_password))
        else
            presenter.loginWithPassword(usernameValue, passwordValue)
    }

    private fun setupViews() {
        login.setOnClickListener(this)
    }
}
