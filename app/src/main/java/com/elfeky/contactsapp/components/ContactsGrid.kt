package com.elfeky.contactsapp.components

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.elfeky.contactsapp.data.DataSource
import com.elfeky.contactsapp.model.Contact

@Composable
fun ContactsGrid(
    modifier: Modifier = Modifier,
    contacts: List<Contact>
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
        modifier = modifier
    ) {
        items(contacts) { item: Contact ->
            ContactItem(contact = item)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ContactsGridPreview() {
    ContactsGrid(contacts = DataSource().getContactsData())
}