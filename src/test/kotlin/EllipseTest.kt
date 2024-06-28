package org.example

import Ellipse
import Point
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.math.PI

class EllipseTest {

    @Test
    fun testEllipseCreation() {
        val center = Point(0.0, 0.0)
        val radiusX = 3.0
        val radiusY = 4.0
        val ellipse = Ellipse(center, radiusX, radiusY)
        assertEquals(center, ellipse.center)
        assertEquals(radiusX, ellipse.radiusX)
        assertEquals(radiusY, ellipse.radiusY)
    }

    @Test
    fun testInvalidEllipseCreation() {
        val center = Point(0.0, 0.0)
        assertThrows(IllegalArgumentException::class.java) {
            Ellipse(center, -3.0, 4.0)
        }
        assertThrows(IllegalArgumentException::class.java) {
            Ellipse(center, 3.0, -4.0)
        }
        assertThrows(IllegalArgumentException::class.java) {
            Ellipse(center, -3.0, -4.0)
        }
    }

    @Test
    fun testGetArea() {
        val center = Point(0.0, 0.0)
        val radiusX = 3.0
        val radiusY = 4.0
        val ellipse = Ellipse(center, radiusX, radiusY)
        assertEquals(PI * radiusX * radiusY, ellipse.getArea())
    }

    @Test
    fun testMove() {
        val center = Point(0.0, 0.0)
        val radiusX = 3.0
        val radiusY = 4.0
        val ellipse = Ellipse(center, radiusX, radiusY)
        ellipse.move(2.0, 3.0)
        assertEquals(2.0, ellipse.center.x)
        assertEquals(3.0, ellipse.center.y)
    }
}
