package com.studentschedulleapp.androidclient.presentation.ui.components.lists.daysofweek

import android.graphics.Paint.Style
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.AbsoluteCutCornerShape
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun DayOfWeekCard(isSelected: Boolean = false) {
    Box (modifier = Modifier
        .size(50.dp)
        .background(Color(if(!isSelected) 0xFF376D8F else 0xFF2980B9), AbsoluteRoundedCornerShape(15.dp))
    ){
        Column(modifier = Modifier.align(Alignment.Center)){
            Text(modifier = Modifier
                .align(Alignment.CenterHorizontally),
                style = TextStyle(
                    color = Color.White,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold
                ),
                text = "1",
            )

            Text(modifier = Modifier
                .align(Alignment.CenterHorizontally),
                style = TextStyle(
                    color = Color.White,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold
                ),
                text = "ПН",
            )
        }
    }
}