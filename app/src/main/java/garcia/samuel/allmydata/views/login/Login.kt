package garcia.samuel.allmydata.views.login

import android.graphics.ColorFilter
import android.graphics.Paint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import garcia.samuel.allmydata.R
import java.util.*

@Composable
fun GradientButton(
    text: String,
    gradient : Brush,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = { },
) {
    Button(
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),
        contentPadding = PaddingValues(),
        onClick = { onClick() },
    ) {
        Box(
            modifier = Modifier
                .background(gradient)
                .then(modifier),
            contentAlignment = Alignment.Center,
        ) {
            Text(text = text, color = Color.White, fontSize = 19.sp)
        }
    }
}

@Composable
fun Login(){
    val userEmail = remember{ mutableStateOf("")}
    val userPassword = rememberSaveable{ mutableStateOf("")}
    val gradient = Brush.horizontalGradient(listOf(Color(0xFF7f3ed5), Color(0xFF71b2f2)))
    var hidden by remember { mutableStateOf(true) }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Column(
            verticalArrangement = Arrangement.Top
        ) {
                Spacer(modifier = Modifier.padding(20.dp))
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "Logo"
                )
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            TextField(
                value = userEmail.value,
                onValueChange = {
                    userEmail.value = it
                },
                colors = TextFieldDefaults.textFieldColors(
                    focusedIndicatorColor = Color(0xFF71b2f2),
                    textColor = Color(0xFF7e4dd7),
                    backgroundColor = Color.Transparent
                ),
                leadingIcon = { Icon(imageVector = Icons.Filled.Email, contentDescription = "Email", modifier = Modifier.size(24.dp),tint = Color(0xFF7e4dd7))},
                placeholder = { Text(text = "Email") })
            Spacer(modifier = Modifier.padding(10.dp))
            TextField(
                value = userPassword.value,
                onValueChange = {userPassword.value = it},
                colors = TextFieldDefaults.textFieldColors(
                    focusedIndicatorColor = Color(0xFF71b2f2),
                    textColor = Color(0xFF7e4dd7),
                    backgroundColor = Color.Transparent
                ),
                leadingIcon = { Icon(painter = painterResource(id = R.drawable.password), contentDescription = "Email", modifier = Modifier.size(24.dp),tint = Color(0xFF7e4dd7))},
                placeholder = { Text(text = "Password") },
                visualTransformation = if (hidden) PasswordVisualTransformation() else VisualTransformation.None,
                trailingIcon = {
                    IconButton(onClick = { hidden = !hidden }) {
                        val vector = painterResource(
                            if (hidden) R.drawable.invisible

                            else R.drawable.visible
                        )
                        val description = if (hidden) "Ocultar contraseña" else "Revelar contraseña"
                        Icon(painter = vector, contentDescription = description)
                    }
                }
            )
            Spacer(modifier = Modifier.padding(10.dp))
            GradientButton(
                text = "Iniciar Sesión",
                gradient = gradient,
                modifier = Modifier
                    .wrapContentWidth()
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            )
            Spacer(modifier = Modifier.padding(10.dp))
            Text(text = "O", color = Color(0xFF7e4dd7))
            Spacer(modifier = Modifier.padding(10.dp))
            ClickableText(
                text = buildAnnotatedString {
                    append("Registrarse")
                },
                style = TextStyle(
                    color = Color(0xFF71b2f2),
                    fontWeight = FontWeight.Bold,
                    textDecoration = TextDecoration.Underline,
                    fontSize = 17.sp
                )
                ){
                //TODO
            }
        }
    }
}


