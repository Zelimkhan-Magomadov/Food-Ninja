package zelimkhan.magomadov.foodninja.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

data class FoodNinjaShape(
    val button: Shape,
    val textField: Shape,
    val container: Shape
)

val DefaultShape = FoodNinjaShape(
    button = RoundedCornerShape(16.dp),
    textField = RoundedCornerShape(16.dp),
    container = RoundedCornerShape(16.dp),
)