package com.chatter.omeglechat

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.chatter.omeglechat.ui.theme.OmegleChatTheme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.navigation.NavController

@Composable
fun OnboardingScreen(
    onContinueClicked: () -> Unit,
    navController: NavController?,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
        ) {
            Text(text = "Welcome to the Omegle app!")
            Button(
                modifier = Modifier.padding(vertical = 24.dp),
//                onClick = onContinueClicked
                onClick = {
                    navController?.navigate(Screen.HomeScreen.route)
                }
            ) {
                Text(text = "Continue")
            }
        }
    }
}

//@Preview(showBackground = true, widthDp = 400, heightDp = 400)
@Preview(showBackground = true)
@Composable
fun OnboardingPreview() {
    OmegleChatTheme() {
        // I'm passing an empty callback here, because the preview is for demonstrational purposes
        OnboardingScreen(onContinueClicked = {}, navController = null);
    }
}

