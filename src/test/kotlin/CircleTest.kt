package org.example

import Circle
import Point
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.math.PI

class CircleTest {

    @Test
    fun testCircleCreation() {
        val center = Point(0.0, 0.0)
        val radius = 5.0
        val circle = Circle(center, radius)
        assertEquals(center, circle.center)
        assertEquals(radius, circle.radius)
    }

    @Test
    fun testInvalidCircleCreation() {
        val center = Point(0.0, 0.0)
        val radius = -5.0
        assertThrows(IllegalArgumentException::class.java) {
            Circle(center, radius)
        }
    }

    @Test
    fun testGetArea() {
        val center = Point(0.0, 0.0)
        val radius = 5.0
        val circle = Circle(center, radius)
        assertEquals(PI * radius * radius, circle.getArea())
    }

    @Test
    fun testMove() {
        val center = Point(0.0, 0.0)
        val radius = 5.0
        val circle = Circle(center, radius)
        circle.move(3.0, 4.0)
        assertEquals(3.0, circle.center.x)
        assertEquals(4.0, circle.center.y)
    }
}
