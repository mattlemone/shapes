package org.example

import Point
import Triangle
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TriangleTest {

    @Test
    fun testTriangleCreation() {
        val pointA = Point(0.0, 0.0)
        val pointB = Point(4.0, 0.0)
        val pointC = Point(2.0, 3.0)
        val triangle = Triangle(pointA, pointB, pointC)
        assertEquals(pointA, triangle.pointA)
        assertEquals(pointB, triangle.pointB)
        assertEquals(pointC, triangle.pointC)
    }

    @Test
    fun testInvalidTriangleCreation() {
        val pointA = Point(0.0, 0.0)
        val pointB = Point(4.0, 0.0)
        val pointC = Point(8.0, 0.0)
        assertThrows(IllegalArgumentException::class.java) {
            Triangle(pointA, pointB, pointC)
        }
    }

    @Test
    fun testGetArea() {
        val pointA = Point(0.0, 0.0)
        val pointB = Point(4.0, 0.0)
        val pointC = Point(2.0, 3.0)
        val triangle = Triangle(pointA, pointB, pointC)
        assertEquals(6.0, triangle.getArea())
    }

    @Test
    fun testMove() {
        val pointA = Point(0.0, 0.0)
        val pointB = Point(4.0, 0.0)
        val pointC = Point(2.0, 3.0)
        val triangle = Triangle(pointA, pointB, pointC)
        triangle.move(2.0, 3.0)
        assertEquals(2.0, triangle.pointA.x)
        assertEquals(3.0, triangle.pointA.y)
        assertEquals(6.0, triangle.pointB.x)
        assertEquals(3.0, triangle.pointB.y)
        assertEquals(4.0, triangle.pointC.x)
        assertEquals(6.0, triangle.pointC.y)
    }
}
