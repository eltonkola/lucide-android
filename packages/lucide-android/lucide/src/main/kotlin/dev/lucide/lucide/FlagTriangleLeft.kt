package dev.lucide.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.lucide.Lucide

public val Lucide.FlagTriangleLeft: ImageVector
    get() {
        if (_flagTriangleLeft != null) {
            return _flagTriangleLeft!!
        }
        _flagTriangleLeft = Builder(name = "FlagTriangleLeft", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 22.0f)
                verticalLineTo(2.0f)
                lineTo(7.0f, 7.0f)
                lineToRelative(10.0f, 5.0f)
            }
        }
        .build()
        return _flagTriangleLeft!!
    }

private var _flagTriangleLeft: ImageVector? = null