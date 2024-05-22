package com.studentschedulleapp.androidclient.presentation.ui.components.lists.outlines

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.studentschedulleapp.androidclient.R

@Preview
@Composable
fun UserOutlineCard(isSelected: Boolean = false) {
    Column (modifier = Modifier
        .height(90.dp)
        .width(70.dp)
        .border(1.dp, Color(0xFF2980B9), AbsoluteRoundedCornerShape(20.dp))
    ){
        Image(modifier = Modifier
            .size(60.dp)
            .background(Color(0x00000000), AbsoluteRoundedCornerShape(20.dp))
            .align(Alignment.CenterHorizontally),
            painter = painterResource(id = androidx.core.R.drawable.ic_call_decline),
            contentDescription = "desc"
        )
        Text(
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            text = "First Name",
            color = Color.Black,
            fontSize = 8.sp,
            fontWeight = FontWeight.Bold,
            maxLines = 1
        )

        Text(
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            text = "Last Name",
            color = Color.Black,
            fontSize = 8.sp,
            fontWeight = FontWeight.Bold,
            maxLines = 1
        )
    }
}