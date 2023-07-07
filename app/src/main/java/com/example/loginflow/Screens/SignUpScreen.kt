package com.example.loginflow.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.loginflow.AppComponents.ButtonComponent
import com.example.loginflow.AppComponents.HeadingTextComponent
import com.example.loginflow.AppComponents.MyTextField
import com.example.loginflow.AppComponents.NormalTextComponent
import com.example.loginflow.AppComponents.already
import com.example.loginflow.AppComponents.checkBoxComponent
import com.example.loginflow.AppComponents.divider
import com.example.loginflow.R

@Composable
fun signUpScreen() {
        Column(modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
            ) {
            NormalTextComponent(value = "Hey there, ")
            HeadingTextComponent(value = "Create an Account")
            Spacer(modifier = Modifier.height(15.dp))
            MyTextField(labelText = "First name", painterResource(id = R.drawable.baseline_perm_identity_24))
            Spacer(modifier = Modifier.height(15.dp))
            MyTextField(labelText = "Last name", painterResource(id = com.example.loginflow.R.drawable.baseline_perm_identity_24))
            Spacer(modifier = Modifier.height(15.dp))
            MyTextField(labelText = "Email", painterResource(id = com.example.loginflow.R.drawable.baseline_email_24))
            Spacer(modifier = Modifier.height(15.dp))
            MyTextField(labelText = "Password", painterResource(id = com.example.loginflow.R.drawable.baseline_https_24))
            Spacer(modifier = Modifier.height(12.dp))
            checkBoxComponent()
            Spacer(modifier = Modifier.height(25.dp))
            ButtonComponent()
            Spacer(modifier = Modifier.height(5.dp))
            divider()
            Spacer(modifier = Modifier.height(5.dp))
            already()
        }
}

@Preview
@Composable
fun DefaultPreviewOfsignUpScreen() {
    signUpScreen()
}