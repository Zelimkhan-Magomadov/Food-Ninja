package zelimkhan.magomadov.foodninja.core.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import zelimkhan.magomadov.foodninja.R
import zelimkhan.magomadov.foodninja.ui.theme.AppTheme
import zelimkhan.magomadov.foodninja.ui.theme.FoodNinjaTheme

@OptIn(ExperimentalTextApi::class)
@Composable
fun Logo(modifier: Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = null,
            modifier = Modifier.size(125.dp)
        )
        Text(
            text = stringResource(id = R.string.app_name),
            style = TextStyle(
                fontSize = 40.sp,
                fontFamily = FontFamily(Font(R.font.viga)),
                fontWeight = FontWeight(400),
                brush = AppTheme.colors.primaryGradient,
                letterSpacing = 0.5.sp
            )
        )
        Text(
            text = stringResource(R.string.logo_subtitle),
            style = TextStyle(
                fontSize = 13.sp,
                fontFamily = FontFamily(Font(R.font.inter)),
                fontWeight = FontWeight(600),
                color = AppTheme.colors.onBackground,
                letterSpacing = 1.sp
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun Preview() {
    FoodNinjaTheme {
        Logo(modifier = Modifier)
    }
}