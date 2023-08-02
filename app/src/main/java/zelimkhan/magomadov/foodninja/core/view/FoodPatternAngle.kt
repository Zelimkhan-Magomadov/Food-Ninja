package zelimkhan.magomadov.foodninja.core.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import zelimkhan.magomadov.foodninja.R
import zelimkhan.magomadov.foodninja.ui.theme.FoodNinjaTheme

@Composable
fun FoodPatternAngle() {
    Image(
        painter = painterResource(id = R.drawable.food_pattern_angle),
        contentDescription = null,
        alignment = Alignment.TopEnd,
        alpha = 0.25f,
        modifier = Modifier.fillMaxWidth(),
    )
}

@Preview(showBackground = true)
@Composable
private fun Preview() {
    FoodNinjaTheme {
        Box(modifier = Modifier.fillMaxSize()) {
            FoodPatternAngle()
        }
    }
}