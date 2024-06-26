class Square(
    val topLeft: Point,
    val sideLength: Double,
) {
    fun getArea(): Double {
        return sideLength * sideLength
    }

    fun move(deltaX: Double, deltaY: Double) {
        topLeft.move(deltaX, deltaY)
    }
}