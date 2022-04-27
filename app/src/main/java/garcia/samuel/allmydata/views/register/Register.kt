package garcia.samuel.allmydata.views.register

import android.graphics.ColorFilter
import android.graphics.Paint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.*
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.ViewCompat

@Composable
fun Register(){

    val userValue = remember { mutableStateOf("") }
    val focusManager = LocalFocusManager.current

    Box(
        modifier = Modifier.fillMaxWidth()
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .verticalScroll(rememberScrollState())
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(
                    onClick = {

                    }
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Back Icon",
                        tint = MaterialTheme.colors.primary
                    )
                }
                Text(
                    text = "Crear una cuenta",
                    style = MaterialTheme.typography.h5.copy(
                        color = MaterialTheme.colors.primary
                    )
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                TextField(
                    value = userValue.value,

                    onValueChange = {
                        userValue.value = it
                    },
                    colors = TextFieldDefaults.textFieldColors(
                        focusedIndicatorColor = Color(0xFF71b2f2),
                        textColor = Color(0xFF7e4dd7),
                        backgroundColor = Color.Transparent
                    ),
                    placeholder = { Text(text = "Usuario") }
                )
                TextField(
                    value = userValue.value,

                    onValueChange = {
                        userValue.value = it
                    },
                    colors = TextFieldDefaults.textFieldColors(
                        focusedIndicatorColor = Color(0xFF71b2f2),
                        textColor = Color(0xFF7e4dd7),
                        backgroundColor = Color.Transparent
                    ),
                    placeholder = { Text(text = "Correo") }
                )
                TextField(
                    value = userValue.value,

                    onValueChange = {
                        userValue.value = it
                    },
                    colors = TextFieldDefaults.textFieldColors(
                        focusedIndicatorColor = Color(0xFF71b2f2),
                        textColor = Color(0xFF7e4dd7),
                        backgroundColor = Color.Transparent
                    ),
                    placeholder = { Text(text = "Contraseña") }
                )
                TextField(
                    value = userValue.value,

                    onValueChange = {
                        userValue.value = it
                    },
                    colors = TextFieldDefaults.textFieldColors(
                        focusedIndicatorColor = Color(0xFF71b2f2),
                        textColor = Color(0xFF7e4dd7),
                        backgroundColor = Color.Transparent
                    ),
                    placeholder = { Text(text = "Repetir contraseña") }
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(8.dp)
            ){

            }
            Spacer(modifier = Modifier.height(16.dp))

            Button(onClick = { /*TODO*/ }) {
                Text(text = "Registrarse")
            }
            ClickableText(
                text = buildAnnotatedString {
                    append("¿Ya tienes una cuenta?")
                    withStyle(
                        style = SpanStyle(
                            color = MaterialTheme.colors.primary,
                            fontWeight = FontWeight.Bold
                        )
                    ){
                            append("Iniciar Sesión")
                        }
                },
                onClick = {
                    // TODO
                }
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        
        Column(verticalArrangement = Arrangement.spacedBy(2.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Divider(
                    modifier = Modifier.width(24.dp),
                    thickness = 1.dp,
                    color = Color.Gray
                )

                Text(
                    modifier = Modifier.padding(8.dp),
                    text = "O",
                    style = MaterialTheme.typography.h6.copy(
                        fontWeight = FontWeight.Black
                    )
                )

                Divider(
                    modifier = Modifier.width(24.dp),
                    thickness = 1.dp,
                    color = Color.Gray
                )
            }
        }
    }
}


