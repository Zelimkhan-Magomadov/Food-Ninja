package zelimkhan.magomadov.foodninja.core.view.button

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import zelimkhan.magomadov.foodninja.ui.theme.AppTheme
import zelimkhan.magomadov.foodninja.ui.theme.FoodNinjaTheme

@Composable
fun PrimaryButton(
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    contentPadding: PaddingValues = PaddingValues(),
    onClick: () -> Unit,
    content: @Composable RowScope.() -> Unit = {}
) {
    Button(
        onClick = onClick,
        contentPadding = contentPadding,
        shape = AppTheme.shape.button,
        enabled = enabled,
        colors = ButtonDefaults.buttonColors(Color.Transparent),
        modifier = modifier
            .height(IntrinsicSize.Max)
            .width(IntrinsicSize.Max)
            .background(brush = AppTheme.colors.primaryGradient, shape = AppTheme.shape.button),
        content = content
    )
}

@Preview
@Composable
private fun Preview() {
    FoodNinjaTheme {
        PrimaryButton(onClick = {})
    }
}