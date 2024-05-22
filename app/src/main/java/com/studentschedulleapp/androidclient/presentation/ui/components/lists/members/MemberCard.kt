package com.studentschedulleapp.androidclient.presentation.ui.components.lists.members

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview
@Composable
fun MemberCard() {
    Box(modifier = Modifier
        .height(50.dp)
        .background(Color(0xFF2980B9), AbsoluteRoundedCornerShape(15.dp))
        .padding(10.dp)
        .fillMaxWidth()
    ){
        Row(modifier = Modifier
            .align(Alignment.CenterStart)
        ){
            Image(modifier = Modifier.size(30.dp),
                imageVector = Icons.Default.Call,
                contentDescription = "desc"
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "First Name Last Name",
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                maxLines = 1,
            )
        }
        Row(modifier = Modifier.align(Alignment.CenterEnd)) {
            Text(
                modifier = Modifier
                    .align(Alignment.CenterVertically),
                text = "Administrator",
                color = Color.White,
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
                maxLines = 1,
            )
            Spacer(modifier = Modifier.width(10.dp))
            Box (modifier = Modifier
                .size(24.dp)
                .background(Color(0xFF1ABC9C), AbsoluteRoundedCornerShape(9.dp))
                .align(Alignment.CenterVertically)
            ){
                Icon(modifier = Modifier
                    .size(16.dp)
                    .align(Alignment.Center),
                    imageVector = Icons.Default.Call,
                    contentDescription = "desc",
                    tint = Color.White
                )
            }
        }
    }

}