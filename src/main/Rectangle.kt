class Rectangle(
    val topLeft: Point,
    val bottomRight: Point,
) {
    init {
        require(topLeft.x() != bottomRight.x() && topLeft.y() != bottomRight.y()) { "Rectangle cannot have 0 width or height" }
    }

    fun getArea(): Double {
        return (bottomRight.x() - topLeft.x()) * (bottomRight.y() - topLeft.yY())
    }

    fun move(deltaX: Double, deltaY: Double) {
        topLeft.move(deltaX, deltaY)
        bottomRight.move(deltaX, deltaY)
    }
}