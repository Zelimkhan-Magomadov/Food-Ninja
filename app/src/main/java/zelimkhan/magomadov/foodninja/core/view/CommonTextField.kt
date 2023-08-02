package zelimkhan.magomadov.foodninja.core.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import zelimkhan.magomadov.foodninja.R
import zelimkhan.magomadov.foodninja.ui.theme.AppTheme
import zelimkhan.magomadov.foodninja.ui.theme.FoodNinjaTheme

@Composable
fun CommonTextField(
    modifier: Modifier,
    placeholder: String,
    leadingIcon: Painter? = null,
    supportingText: String? = null,
    isError: Boolean = false,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions(),
    visualTransformation: VisualTransformation = VisualTransformation.None,
    onValueChange: (String) -> Unit
) {
    var textFieldValue by remember { mutableStateOf("") }
    OutlinedTextField(
        modifier = modifier,
        singleLine = true,
        value = textFieldValue,
        shape = AppTheme.shape.textField,
        supportingText = supportingText?.let {
            { Text(text = supportingText, style = AppTheme.typography.subtitle, fontSize = 13.sp) }
        },
        isError = isError,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        visualTransformation = visualTransformation,
        textStyle = AppTheme.typography.textField.copy(color = AppTheme.colors.onContainer),
        leadingIcon = leadingIcon?.let { { Image(it, null, Modifier.size(24.dp)) } },
        onValueChange = {
            textFieldValue = it
            onValueChange(it)
        },
        placeholder = {
            Text(
                text = placeholder,
                style = AppTheme.typography.textField,
                color = AppTheme.colors.hint
            )
        },
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedBorderColor = AppTheme.colors.unfocusedContainerBorder,
            focusedBorderColor = AppTheme.colors.focusedContainerBorder,
            disabledBorderColor = AppTheme.colors.disabledContainerBorder,
            errorBorderColor = AppTheme.colors.errorContainerBorder,
            unfocusedContainerColor = AppTheme.colors.unfocusedContainer,
            focusedContainerColor = AppTheme.colors.focusedContainer,
            disabledContainerColor = AppTheme.colors.disabledContainer,
            errorContainerColor = AppTheme.colors.errorContainer,
        ),
    )
}

@Preview
@Composable
private fun Preview() {
    FoodNinjaTheme(darkTheme = false) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = AppTheme.colors.background
        ) {
            Box(
                contentAlignment = Alignment.Center
            ) {
                CommonTextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 32.dp),
                    placeholder = "Password",
                    onValueChange = {},
                    leadingIcon = painterResource(id = R.drawable.lock),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                    supportingText = "Minimum length: 8",
                    isError = false,
                    visualTransformation = PasswordVisualTransformation('*')
                )
            }
        }
    }
}