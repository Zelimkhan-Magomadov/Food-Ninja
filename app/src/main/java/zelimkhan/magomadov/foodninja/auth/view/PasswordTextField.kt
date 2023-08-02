package zelimkhan.magomadov.foodninja.auth.view

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import zelimkhan.magomadov.foodninja.R
import zelimkhan.magomadov.foodninja.core.view.CommonTextField

@Composable
fun PasswordTextField(modifier: Modifier, onValueChange: () -> Unit, showLength: Boolean = false) {
    var passwordLength by remember { mutableStateOf(0) }
    val supportingText = stringResource(R.string.length, passwordLength)
    CommonTextField(
        modifier = modifier,
        leadingIcon = painterResource(id = R.drawable.lock),
        placeholder = stringResource(R.string.password),
        supportingText = if (passwordLength > 0 && showLength) supportingText else null,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        visualTransformation = PasswordVisualTransformation('*'),
        onValueChange = { passwordLength = it.length; onValueChange() }
    )
}