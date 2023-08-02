package zelimkhan.magomadov.foodninja.auth

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import zelimkhan.magomadov.foodninja.R
import zelimkhan.magomadov.foodninja.auth.view.EmailTextField
import zelimkhan.magomadov.foodninja.auth.view.PasswordTextField
import zelimkhan.magomadov.foodninja.core.view.CommonTextField
import zelimkhan.magomadov.foodninja.core.view.button.PrimaryTextButton
import zelimkhan.magomadov.foodninja.onboarding.LogoScreen
import zelimkhan.magomadov.foodninja.ui.theme.AppTheme
import zelimkhan.magomadov.foodninja.ui.theme.FoodNinjaTheme

@OptIn(ExperimentalTextApi::class)
@Composable
fun RegisterScreen() {
    Column(
        modifier = Modifier.verticalScroll(rememberScrollState())
    ) {
        LogoScreen()

        Column(
            modifier = Modifier.padding(horizontal = 32.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = stringResource(R.string.register_title),
                style = AppTheme.typography.title,
                fontSize = 20.sp,
            )

            Spacer(modifier = Modifier.height(40.dp))

            CommonTextField(
                modifier = Modifier.fillMaxWidth(),
                placeholder = "Nickname",
                onValueChange = {},
                keyboardOptions = KeyboardOptions(
                    capitalization = KeyboardCapitalization.Sentences,
                    imeAction = ImeAction.Next
                ),
                leadingIcon = painterResource(id = R.drawable.person)
            )

            Spacer(modifier = Modifier.height(16.dp))

            EmailTextField(modifier = Modifier.fillMaxWidth(), onValueChange = {})

            Spacer(modifier = Modifier.height(16.dp))

            PasswordTextField(modifier = Modifier.fillMaxWidth(), onValueChange = {})

            Spacer(modifier = Modifier.height(64.dp))

            PrimaryTextButton(
                text = "Create account",
                onClick = {})

            Spacer(modifier = Modifier.height(16.dp))

            TextButton(onClick = { }) {
                Text(
                    text = "Already have an account?",
                    style = AppTheme.typography.label.copy(brush = AppTheme.colors.primaryGradient),
                    textDecoration = TextDecoration.Underline,
                    fontSize = 13.sp
                )
            }

            Spacer(modifier = Modifier.height(16.dp))
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
            RegisterScreen()
        }
    }
}