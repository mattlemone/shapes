package org.example

import Circle
import Ellipse
import Line
import Point
import Rectangle
import Square

fun main() {
    // Initialize points
    val point1 = Point(5.5, 5.0)
    val point2 = Point(0.0, 5.0)
    val point3 = Point(1.0, 1.0)
    val point4 = Point(4.0, 4.0)

    // Initialize shapes
    val line = Line(point1, point2)
    println(line.getLength())
    println(line.getSlope())
    val rectangle = Rectangle(point1, point3)
    println(rectangle.getArea())
    val square = Square(point1, 2.0)
    println(square.getArea())
    val ellipse = Ellipse(point1, 3.0, 2.0)
    println(ellipse.getArea())
    val circle = Circle(point1, 2.5)
    println(circle.getArea())
}