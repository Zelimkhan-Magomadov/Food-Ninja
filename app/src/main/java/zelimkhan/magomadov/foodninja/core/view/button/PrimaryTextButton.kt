package zelimkhan.magomadov.foodninja.core.view.button

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import zelimkhan.magomadov.foodninja.ui.theme.AppTheme
import zelimkhan.magomadov.foodninja.ui.theme.FoodNinjaTheme


@Composable
fun PrimaryTextButton(
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    text: String,
    onClick: () -> Unit,
) {
    PrimaryButton(
        modifier = modifier,
        enabled = enabled,
        contentPadding = PaddingValues(horizontal = 40.dp, vertical = 14.dp),
        onClick = onClick
    ) {
        Text(
            text = text,
            style = AppTheme.typography.title,
            color = AppTheme.colors.onPrimaryGradient,
            textAlign = TextAlign.Center,
            fontSize = 16.sp,
        )
    }
}

@Preview
@Composable
private fun Preview() {
    FoodNinjaTheme {
        PrimaryTextButton(text = "Next", onClick = {})
    }
}