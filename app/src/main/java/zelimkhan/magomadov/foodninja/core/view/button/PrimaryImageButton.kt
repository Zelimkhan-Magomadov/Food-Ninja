package zelimkhan.magomadov.foodninja.core.view.button

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import zelimkhan.magomadov.foodninja.ui.theme.FoodNinjaTheme

@Composable
fun PrimaryImageButton(
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    icon: ImageVector,
    onClick: () -> Unit,
) {
    PrimaryButton(
        modifier = modifier,
        enabled = enabled,
        onClick = onClick,
        content = { Icon(imageVector = icon, contentDescription = null) }
    )
}

@Preview
@Composable
private fun Preview() {
    FoodNinjaTheme {
        PrimaryImageButton(icon = Icons.Rounded.Email, onClick = {})
    }
}