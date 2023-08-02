package zelimkhan.magomadov.foodninja.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.luminance
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import zelimkhan.magomadov.foodninja.R

@Composable
fun FoodNinjaTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme
    val systemUiController = rememberSystemUiController()

    SideEffect {
        systemUiController.setStatusBarColor(
            color = Color.Transparent,
            darkIcons = colorScheme.background.luminance() > 0.5f
        )
    }

    val typography = FoodNinjaTypography(
        title = TextStyle(
            fontFamily = FontFamily(Font(R.font.benton_sans_bold)),
            fontWeight = FontWeight(400),
            color = colorScheme.onBackground,
        ),
        subtitle = TextStyle(
            fontFamily = FontFamily(Font(R.font.benton_sans_book)),
            fontWeight = FontWeight(400),
            color = colorScheme.onBackground,
            lineHeight = 21.sp
        ),
        textField = TextStyle(
            fontFamily = FontFamily(Font(R.font.benton_sans_regular)),
            fontWeight = FontWeight(400),
            fontSize = 16.sp,
            letterSpacing = 0.5.sp,
        ),
        label = TextStyle(
            fontSize = 15.sp,
            fontFamily = FontFamily(Font(R.font.benton_sans_medium)),
            fontWeight = FontWeight(400),
            color = colorScheme.onBackground,
            letterSpacing = 0.5.sp,
        )
    )

    CompositionLocalProvider(
        LocalFoodNinjaColorScheme provides colorScheme,
        LocalFoodNinjaTypography provides typography,
        LocalFoodNinjaShape provides DefaultShape,
        content = content
    )
}

object AppTheme {
    val colors: FoodNinjaColorScheme
        @Composable get() = LocalFoodNinjaColorScheme.current

    val typography: FoodNinjaTypography
        @Composable get() = LocalFoodNinjaTypography.current

    val shape: FoodNinjaShape
        @Composable get() = LocalFoodNinjaShape.current
}

val LocalFoodNinjaColorScheme = staticCompositionLocalOf<FoodNinjaColorScheme> {
    error("No colors provided")
}

val LocalFoodNinjaTypography = staticCompositionLocalOf<FoodNinjaTypography> {
    error("No colors provided")
}

val LocalFoodNinjaShape = staticCompositionLocalOf<FoodNinjaShape> {
    error("No colors provided")
}