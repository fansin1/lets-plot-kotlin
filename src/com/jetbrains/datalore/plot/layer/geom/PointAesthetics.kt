package com.jetbrains.datalore.plot.layer.geom

import com.jetbrains.datalore.plot.Options
import com.jetbrains.datalore.plot.layer.OptionsCapsule

interface PointAesthetics : OptionsCapsule {
    val x: Any?
    val y: Any?
    val alpha: Any?
    val color: Any?
    val fill: Any?
    val shape: Any?
    val size: Any?
    val stroke: Any?

    override fun seal() = Options.of(
        "x" to x,
        "y" to y,
        "alpha" to alpha,
        "color" to color,
        "fill" to fill,
        "shape" to shape,
        "size" to size,
        "stroke" to stroke
    )
}