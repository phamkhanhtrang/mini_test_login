package com.example.loigin

import android.os.Bundle
import android.provider.CalendarContract.Colors
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loigin.ui.theme.LoiginTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoiginTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "Đăng Nhập",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Serif


            )
        TextField()
        password()
        button()
    }

}
@Composable
fun TextField(){
    var name by remember{
        mutableStateOf("")
    }
   TextField(value = name, onValueChange ={newValue->name=newValue  },
       textStyle = TextStyle(color = Color.Black,
           fontSize = 16.sp, fontWeight = FontWeight.Bold),

       placeholder = { Text(text = "Enter username")},
       shape = RoundedCornerShape(16.dp),


       )


}
@Composable
fun password(){
    var password by remember{
        mutableStateOf("")
    }
    OutlinedTextField(value = password, onValueChange ={
        password=it
    },
        label ={ Text(text = "Password")},
        placeholder = { Text(text = "Nhập password")},
        leadingIcon = {Icon(Icons.Default.Lock, contentDescription = null)},
        trailingIcon = {Icon(Icons.Filled.Face, contentDescription = null)},
        visualTransformation = PasswordVisualTransformation()
       )


}
@Composable
fun button(){
    Button(onClick = { /*TODO*/ },
       
        shape= RoundedCornerShape(topStart = 12.dp, bottomEnd = 12.dp),

    ) {
        Text(text = "Đăng nhập")
    }
    }

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LoiginTheme {
      Greeting()
    }
}