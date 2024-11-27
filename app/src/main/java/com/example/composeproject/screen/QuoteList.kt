package com.example.composeproject.screen

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.composeproject.model.Quote

@Composable
fun QuoteList(data: Array<Quote>,onClick:()->Unit) {

    LazyColumn(content = {
        items(data){
            QuoteListItems(quote = it) {
                onClick()
            }
        }
    })

}