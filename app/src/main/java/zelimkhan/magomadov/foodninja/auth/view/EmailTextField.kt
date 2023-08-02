package zelimkhan.magomadov.foodninja.auth.view

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import zelimkhan.magomadov.foodninja.R
import zelimkhan.magomadov.foodninja.core.view.CommonTextField

@Composable
fun EmailTextField(modifier: Modifier, onValueChange: (value: String) -> Unit) {
    CommonTextField(
        modifier = modifier,
        leadingIcon = painterResource(id = R.drawable.email),
        placeholder = stringResource(R.string.email),
        onValueChange = onValueChange,
        keyboardOptions = KeyboardOptions(
            capitalization = KeyboardCapitalization.Sentences,
            keyboardType = KeyboardType.Email,
            imeAction = ImeAction.Next
        )
    )
}