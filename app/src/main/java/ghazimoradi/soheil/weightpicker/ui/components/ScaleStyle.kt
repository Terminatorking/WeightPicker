package ghazimoradi.soheil.weightpicker.ui.components

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ghazimoradi.soheil.weightpicker.ui.theme.Black
import ghazimoradi.soheil.weightpicker.ui.theme.Green
import ghazimoradi.soheil.weightpicker.ui.theme.SmoothGrey

data class ScaleStyle(
    val scaleWidth: Dp = 100.dp,
    val radius: Dp = 550.dp,
    val normalLineLength: Dp = 15.dp,
    val fiveStepLineLength: Dp = 25.dp,
    val tenStepLineLength: Dp = 35.dp,
    val scaleIndicatorLength: Dp = 60.dp,
    val textSize: TextUnit = 18.sp,
    val normalLineColor: Color = SmoothGrey,
    val fiveStepLineColor: Color = Green,
    val tenStepLineColor: Color = Black,
    val scaleIndicatorColor: Color = Green,
)