package com.studentschedulleapp.androidclient.presentation.ui.components.lists.roles

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun DaysOfWeekList() {

    LazyRow {
        items(listOf(0, 1, 2, 3, 4, 5, 6)){
            if(it != 0)
                Spacer(modifier = Modifier.width(8.dp))
            RoleCard()
        }
    }
}