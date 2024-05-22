package com.studentschedulleapp.androidclient.presentation.ui.components.lists.outlines

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun GroupedOutlinesCard() {
    Column(modifier = Modifier
        .height(135.dp)
        .background(Color(0xFFE9E9E9), AbsoluteRoundedCornerShape(30.dp))
        .padding(18.dp, 9.dp)
    ) {

        Text(
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            text = "Title",
            color = androidx.compose.ui.graphics.Color.Black,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            maxLines = 1
        )
        LazyRow(modifier = Modifier.align(Alignment.CenterHorizontally)) {
            items(listOf(0, 1, 2, 3, 4, 5, 6)){
                if(it != 0)
                    Spacer(modifier = Modifier.width(9.dp))
                UserOutlineCard()
            }
        }
    }
}