package dev.lucide.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.lucide.Lucide

public val Lucide.Laptop2: ImageVector
    get() {
        if (_laptop2 != null) {
            return _laptop2!!
        }
        _laptop2 = Builder(name = "Laptop2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 4.0f)
                lineTo(19.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 6.0f)
                lineTo(21.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 16.0f)
                lineTo(5.0f, 16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 14.0f)
                lineTo(3.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 20.0f)
                lineTo(22.0f, 20.0f)
            }
        }
        .build()
        return _laptop2!!
    }

private var _laptop2: ImageVector? = null