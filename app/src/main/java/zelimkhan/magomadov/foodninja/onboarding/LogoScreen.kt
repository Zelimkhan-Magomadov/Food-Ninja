package zelimkhan.magomadov.foodninja.onboarding

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import zelimkhan.magomadov.foodninja.core.view.FoodPattern
import zelimkhan.magomadov.foodninja.core.view.Logo
import zelimkhan.magomadov.foodninja.ui.theme.AppTheme
import zelimkhan.magomadov.foodninja.ui.theme.FoodNinjaTheme

@Composable
fun LogoScreen() {
    Box(modifier = Modifier.fillMaxWidth()) {
        FoodPattern()
        Logo(modifier = Modifier.align(Alignment.Center))
    }
}

@Preview
@Composable
private fun Preview() {
    FoodNinjaTheme(darkTheme = false) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = AppTheme.colors.background,
        ) {
            LogoScreen()
        }
    }
}