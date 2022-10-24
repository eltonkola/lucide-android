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

public val Lucide.FileHeart: ImageVector
    get() {
        if (_fileHeart != null) {
            return _fileHeart!!
        }
        _fileHeart = Builder(name = "FileHeart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                verticalLineTo(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(8.5f)
                lineTo(20.0f, 7.5f)
                verticalLineTo(20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineTo(4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 2.0f)
                lineToRelative(0.0f, 6.0f)
                lineToRelative(6.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.29f, 10.7f)
                arcToRelative(2.43f, 2.43f, 0.0f, false, false, -2.66f, -0.52f)
                curveToRelative(-0.29f, 0.12f, -0.56f, 0.3f, -0.78f, 0.53f)
                lineToRelative(-0.35f, 0.34f)
                lineToRelative(-0.35f, -0.34f)
                arcToRelative(2.43f, 2.43f, 0.0f, false, false, -2.65f, -0.53f)
                curveToRelative(-0.3f, 0.12f, -0.56f, 0.3f, -0.79f, 0.53f)
                curveToRelative(-0.95f, 0.94f, -1.0f, 2.53f, 0.2f, 3.74f)
                lineTo(6.5f, 18.0f)
                lineToRelative(3.6f, -3.55f)
                curveToRelative(1.2f, -1.21f, 1.14f, -2.8f, 0.19f, -3.74f)
                close()
            }
        }
        .build()
        return _fileHeart!!
    }

private var _fileHeart: ImageVector? = null
