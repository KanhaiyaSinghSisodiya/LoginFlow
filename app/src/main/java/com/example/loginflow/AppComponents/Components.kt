package com.example.loginflow.AppComponents

import android.graphics.drawable.PaintDrawable
import android.provider.CalendarContract.Colors
import android.support.v4.os.IResultReceiver.Default
import android.util.Log
import androidx.compose.foundation.MutatePriority
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.min
import androidx.compose.ui.unit.sp
import androidx.core.R
import androidx.compose.runtime.remember as remember1

@Composable
fun NormalTextComponent(value: String) {
     Text(
         text = value,
         style = TextStyle(
             fontSize = 24.sp,
             fontWeight = FontWeight.Normal,
             fontStyle = FontStyle.Normal
         ),
         color = Color.Black,
     )
}

@Composable
fun HeadingTextComponent(value: String) {
    Text(
        text = value,
        style = TextStyle(
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Normal
        ),
        color = Color.Black,
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTextField(labelText: String, p: Painter)
{

    var name = remember {
        mutableStateOf("")
    }
    OutlinedTextField(value = name.value, onValueChange = {
        name.value = it
    }, label = {
        Text(text = labelText)
    },
        leadingIcon = {
            Icon(painter = p, contentDescription = "")
        })
}

@Composable
fun checkBoxComponent() {
    Row {
        var isChecked = remember {
            mutableStateOf(false)
        }
        
        Checkbox(checked = isChecked.value, onCheckedChange = {
            isChecked.value = !isChecked.value
        })
        var PrivacyPolicy : String = "PrivacyPolicy"
        var annotatedString = buildAnnotatedString {
            append("By continuing, you accept our ")
            withStyle(style = SpanStyle(Color.Magenta)) {
                pushStringAnnotation(tag = PrivacyPolicy, annotation = PrivacyPolicy)
                append(PrivacyPolicy )
            }
            append(" and ")
            withStyle(style = SpanStyle(Color.Magenta)) {
                pushStringAnnotation(tag = "Terms", annotation = "Terms of use")
                append("Terms" )
            }
        }
        ClickableText(text = annotatedString, onClick = {offset -> annotatedString.getStringAnnotations(offset,offset).
                firstOrNull()?.also { span ->
                    Log.d("Clicked :",  "$span")
        }
        })
    }
}

@Composable
fun ButtonComponent() {
    Button(modifier = Modifier
        .fillMaxWidth()
        .heightIn(48.dp), onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(Color.Transparent), shape = RoundedCornerShape(50.dp)) {
        Box(modifier = Modifier
            .fillMaxWidth()
            .heightIn(48.dp)
            .background(
                brush = Brush.horizontalGradient(
                    listOf(
                        Color.Gray,
                        Color.Blue
                    )
                ),
                shape = RoundedCornerShape(50.dp)
            ),
            Alignment.Center
        ) {
            Text(text = "Register" , style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 18.sp, color = Color.White))
        }
    }
}

@Composable
fun divider(){
    Row(verticalAlignment = Alignment.CenterVertically){
        Divider(modifier = Modifier
            .fillMaxWidth()
            .weight(1F), thickness = 1.dp, color = Color.Gray )
        Text(modifier = Modifier.padding(10.dp), text = "Or", style = TextStyle(fontSize = 18.sp))
        Divider(modifier = Modifier
            .fillMaxWidth()
            .weight(1F), thickness = 1.dp, color = Color.Gray )

    }
}

@Composable
fun already() {
    var annotatedString = buildAnnotatedString {
        append("Already have an account? ")
        withStyle(style = SpanStyle(Color.Magenta)) {
            pushStringAnnotation(tag = "login", annotation = "log in.")
            append("login")
        }
    }
    ClickableText(text = annotatedString, onClick = {offset -> annotatedString.getStringAnnotations(offset,offset).
    firstOrNull()?.also { span ->
        Log.d("Clicked :",  "$span")
    }
    })
}