package com.studentschedulleapp.androidclient.presentation.ui.components.lists.outlines

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.studentschedulleapp.androidclient.presentation.ui.components.lists.specificlessons.SpecificLessonCard


@Preview
@Composable
fun GroupedOutlinesList() {

    LazyColumn {
        items(listOf(0, 1, 2, 3, 4, 5, 6)){
            if(it != 0)
                Spacer(modifier = Modifier.height(20.dp))
            Box(modifier = Modifier.shadow(4.dp)){
                GroupedOutlinesCard()
            }
        }
    }

}