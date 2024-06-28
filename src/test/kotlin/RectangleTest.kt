package org.example

import Point
import Rectangle
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class RectangleTest {

    @Test
    fun testRectangleCreation() {
        val topLeft = Point(0.0, 5.0)
        val bottomRight = Point(5.0, 0.0)
        val rectangle = Rectangle(topLeft, bottomRight)
        assertEquals(topLeft, rectangle.topLeft)
        assertEquals(bottomRight, rectangle.bottomRight)
    }

    @Test
    fun testInvalidRectangleCreation() {
        val topLeft = Point(1.0, 1.0)
        val bottomRight = Point(1.0, 1.0)
        assertThrows(IllegalArgumentException::class.java) {
            Rectangle(topLeft, bottomRight)
        }
    }

    @Test
    fun testGetArea() {
        val topLeft = Point(0.0, 5.0)
        val bottomRight = Point(5.0, 0.0)
        val rectangle = Rectangle(topLeft, bottomRight)
        assertEquals(25.0, rectangle.getArea())
    }

    @Test
    fun testMove() {
        val topLeft = Point(0.0, 5.0)
        val bottomRight = Point(5.0, 0.0)
        val rectangle = Rectangle(topLeft, bottomRight)
        rectangle.move(2.0, -2.0)
        assertEquals(2.0, rectangle.topLeft.x)
        assertEquals(3.0, rectangle.topLeft.y)
        assertEquals(7.0, rectangle.bottomRight.x)
        assertEquals(-2.0, rectangle.bottomRight.y)
    }
}
