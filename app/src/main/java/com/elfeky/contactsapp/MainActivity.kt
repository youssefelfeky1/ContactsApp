package com.elfeky.contactsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.elfeky.contactsapp.components.ContactsGrid
import com.elfeky.contactsapp.components.MyTopAppBar
import com.elfeky.contactsapp.data.DataSource
import com.elfeky.contactsapp.ui.theme.ContactsAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ContactsAppTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = { MyTopAppBar() }
                ) { innerPadding ->
                    ContactsGrid(
                        contacts = DataSource().getContactsData(),
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

