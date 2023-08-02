package zelimkhan.magomadov.foodninja.ui.theme

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

data class FoodNinjaColorScheme(
    val primaryGradient: Brush,
    val background: Color,
    val onPrimaryGradient: Color,
    val onBackground: Color,
    val container: Color,
    val onContainer: Color,
    val unfocusedContainerBorder: Color,
    val focusedContainerBorder: Color,
    val disabledContainerBorder: Color,
    val errorContainerBorder: Color,
    val unfocusedContainer: Color,
    val focusedContainer: Color,
    val disabledContainer: Color,
    val errorContainer: Color,
    val hint: Color,
    val shadow: Color,
)

val LightColorScheme = FoodNinjaColorScheme(
    primaryGradient = Brush.horizontalGradient(listOf(Color(0xFF53E88B), Color(0xFF15BE77))),
    background = Color(0xFFFFFFFF),
    onPrimaryGradient = Color(0xFFFFFFFF),
    onBackground = Color(0xFF09051C),
    container = Color(0xFFFFFFFF),
    onContainer = Color(0xFF000000),
    unfocusedContainerBorder = Color.LightGray,
    focusedContainerBorder = Color(0xFF34D381),
    disabledContainerBorder = Color.Transparent,
    errorContainerBorder = Color(0xFF970404),
    unfocusedContainer = Color(0xFFFFFFFF),
    focusedContainer = Color(0xFFFFFFFF),
    disabledContainer = Color(0xFFFFFFFF),
    errorContainer = Color(0xFFFFFFFF),
    hint = Color(0xFF3B3B3B),
    shadow = Color(0xFF595083),
)

val DarkColorScheme = FoodNinjaColorScheme(
    primaryGradient = Brush.horizontalGradient(listOf(Color(0xFF53E88B), Color(0xFF15BE77))),
    background = Color(0xFF000000),
    onPrimaryGradient = Color(0xFFFFFFFF),
    onBackground = Color(0xFFFFFFFF),
    container = Color(0xFF252525),
    onContainer = Color(0xFFFFFFFF),
    unfocusedContainerBorder = Color.Transparent,
    focusedContainerBorder = Color.Transparent,
    disabledContainerBorder = Color.Transparent,
    errorContainerBorder = Color(0xFF970404),
    unfocusedContainer = Color(0xFF252525),
    focusedContainer = Color(0xFF252525),
    disabledContainer = Color(0xFF252525),
    errorContainer = Color(0xFF252525),
    hint = Color(0xFFA0A0A0),
    shadow = Color(0xFF595083)
)