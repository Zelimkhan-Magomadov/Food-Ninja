package zelimkhan.magomadov.foodninja.auth

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import zelimkhan.magomadov.foodninja.R
import zelimkhan.magomadov.foodninja.auth.view.EmailTextField
import zelimkhan.magomadov.foodninja.auth.view.PasswordTextField
import zelimkhan.magomadov.foodninja.core.view.button.PrimaryTextButton
import zelimkhan.magomadov.foodninja.onboarding.LogoScreen
import zelimkhan.magomadov.foodninja.ui.theme.AppTheme
import zelimkhan.magomadov.foodninja.ui.theme.FoodNinjaTheme

@OptIn(ExperimentalTextApi::class)
@Composable
fun LoginScreen() {
    Column(
        modifier = Modifier.verticalScroll(rememberScrollState())
    ) {
        LogoScreen()

        Column(
            modifier = Modifier.padding(horizontal = 32.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = stringResource(R.string.login_title),
                style = AppTheme.typography.title,
                fontSize = 20.sp,
            )

            Spacer(modifier = Modifier.height(40.dp))

            EmailTextField(modifier = Modifier.fillMaxWidth(), onValueChange = {})

            Spacer(modifier = Modifier.height(16.dp))

            PasswordTextField(
                modifier = Modifier.fillMaxWidth(),
                onValueChange = {},
                showLength = true
            )

            Spacer(modifier = Modifier.height(32.dp))

            Text(
                text = stringResource(R.string.or_continue_with),
                style = AppTheme.typography.title,
                fontSize = 15.sp
            )

            Spacer(modifier = Modifier.height(16.dp))

            Row {
                SignInButton(logo = painterResource(id = R.drawable.google_logo), label = "Google")

                Spacer(modifier = Modifier.width(20.dp))

                SignInButton(logo = painterResource(id = R.drawable.vk_logo), label = "VK")
            }

            Spacer(modifier = Modifier.height(32.dp))

            PrimaryTextButton(text = stringResource(id = R.string.login), onClick = {})

            Spacer(modifier = Modifier.height(16.dp))

            TextButton(onClick = { }) {
                Text(
                    text = stringResource(R.string.forgot_your_password),
                    style = AppTheme.typography.label.copy(brush = AppTheme.colors.primaryGradient),
                    textDecoration = TextDecoration.Underline,
                    fontSize = 13.sp
                )
            }

            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun SignInButton(
    logo: Painter,
    label: String
) {
    Card(
        modifier = Modifier.width(120.dp),
        onClick = {},
        shape = AppTheme.shape.container,
        colors = CardDefaults.cardColors(containerColor = AppTheme.colors.container),
        border = BorderStroke(
            width = 1.dp,
            color = AppTheme.colors.unfocusedContainerBorder
        )
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                modifier = Modifier.size(24.dp),
                painter = logo,
                contentDescription = null
            )

            Spacer(modifier = Modifier.width(8.dp))

            Text(text = label, style = AppTheme.typography.label)
        }
    }
}

@Preview
@Composable
private fun Preview() {
    FoodNinjaTheme(darkTheme = false) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = AppTheme.colors.background
        ) {
            LoginScreen()
        }
    }
}