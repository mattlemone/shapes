package org.example

import Point
import Square
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SquareTest {

    @Test
    fun testSquareCreation() {
        val topLeft = Point(0.0, 5.0)
        val sideLength = 5.0
        val square = Square(topLeft, sideLength)
        assertEquals(topLeft, square.topLeft)
        assertEquals(sideLength, square.sideLength)
    }

    @Test
    fun testInvalidSquareCreation() {
        val topLeft = Point(0.0, 5.0)
        val sideLength = -5.0
        assertThrows(IllegalArgumentException::class.java) {
            Square(topLeft, sideLength)
        }
    }

    @Test
    fun testGetArea() {
        val topLeft = Point(0.0, 5.0)
        val sideLength = 5.0
        val square = Square(topLeft, sideLength)
        assertEquals(25.0, square.getArea())
    }

    @Test
    fun testMove() {
        val topLeft = Point(0.0, 5.0)
        val sideLength = 5.0
        val square = Square(topLeft, sideLength)
        square.move(2.0, -2.0)
        assertEquals(2.0, square.topLeft.x)
        assertEquals(3.0, square.topLeft.y)
    }
}
