class Square(
    var topLeft: Point,
    var sideLength: Double,
) {
    fun getArea(): Double {
        return sideLength * sideLength
    }

    fun move(deltaX: Double, deltaY: Double) {
        topLeft.move(deltaX, deltaY)
    }
}