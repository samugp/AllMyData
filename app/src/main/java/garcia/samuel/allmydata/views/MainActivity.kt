package garcia.samuel.allmydata.views

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import garcia.samuel.allmydata.ui.theme.AllMyDataTheme
import garcia.samuel.allmydata.views.login.Login

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AllMyDataTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "Login"){
                    composable("Login"){
                        Login()
                    }
                }
            }
        }
    }
}