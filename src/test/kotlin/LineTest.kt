package org.example

import Line
import Point
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.math.sqrt

class LineTest {

    @Test
    fun testLineCreation() {
        val start = Point(0.0, 0.0)
        val end = Point(3.0, 4.0)
        val line = Line(start, end)
        assertEquals(start, line.start)
        assertEquals(end, line.end)
    }

    @Test
    fun testInvalidLineCreation() {
        val start = Point(1.0, 1.0)
        val end = Point(1.0, 1.0)
        assertThrows(IllegalArgumentException::class.java) {
            Line(start, end)
        }
    }

    @Test
    fun testGetSlope() {
        val start = Point(0.0, 0.0)
        val end = Point(3.0, 3.0)
        val line = Line(start, end)
        assertEquals(1.0, line.getSlope())
    }

    @Test
    fun testGetLength() {
        val start = Point(0.0, 0.0)
        val end = Point(0.0, 4.0)
        val line = Line(start, end)
        assertEquals(4.0, line.getLength())
    }

    @Test
    fun testMove() {
        val start = Point(0.0, 0.0)
        val end = Point(3.0, 4.0)
        val line = Line(start, end)
        line.move(1.0, 1.0)
        assertEquals(1.0, line.start.x)
        assertEquals(1.0, line.start.y)
        assertEquals(4.0, line.end.x)
        assertEquals(5.0, line.end.y)
    }
}
