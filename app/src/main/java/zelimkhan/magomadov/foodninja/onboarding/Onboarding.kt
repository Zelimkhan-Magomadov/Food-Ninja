package zelimkhan.magomadov.foodninja.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import zelimkhan.magomadov.foodninja.R
import zelimkhan.magomadov.foodninja.core.view.button.PrimaryTextButton
import zelimkhan.magomadov.foodninja.ui.theme.AppTheme
import zelimkhan.magomadov.foodninja.ui.theme.FoodNinjaTheme

@Composable
fun Onboarding(
    image: Painter,
    title: String,
    subtitle: String,
    onButtonClick: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = image,
            contentDescription = null,
            alignment = Alignment.Center,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.60f)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = title,
                style = AppTheme.typography.title,
                fontSize = 22.sp,
                textAlign = TextAlign.Center,
                lineHeight = 28.sp,
                modifier = Modifier.padding(horizontal = 32.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = subtitle,
                style = AppTheme.typography.subtitle,
                color = AppTheme.colors.onBackground,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 64.dp)
            )
        }

        Spacer(modifier = Modifier.height(64.dp))

        PrimaryTextButton(
            modifier = Modifier.padding(horizontal = 64.dp),
            text = stringResource(id = R.string.onboarding_button),
            onClick = onButtonClick
        )

        Spacer(modifier = Modifier.height(16.dp))
    }
}

@Preview
@Composable
private fun Onboarding1() {
    FoodNinjaTheme(darkTheme = false) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = AppTheme.colors.background
        ) {
            Onboarding(
                image = painterResource(id = R.drawable.onboarding_1),
                title = stringResource(R.string.onboarding_title_1),
                subtitle = stringResource(R.string.onboarding_subtitle_1),
                onButtonClick = {}
            )
        }
    }
}

@Preview
@Composable
private fun Onboarding2() {
    FoodNinjaTheme(darkTheme = false) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = AppTheme.colors.background
        ) {
            Onboarding(
                image = painterResource(id = R.drawable.onboarding_2),
                title = stringResource(R.string.onboarding_title_2),
                subtitle = stringResource(R.string.onboarding_subtitle_2),
                onButtonClick = {}
            )
        }
    }
}