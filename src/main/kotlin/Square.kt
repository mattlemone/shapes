class Square(
    var topLeft: Point,
    var sideLength: Double,
) {
    init {
        require(sideLength > 0) { "Side length must be positive" }
    }

    fun getArea(): Double {
        return sideLength * sideLength
    }

    fun move(deltaX: Double, deltaY: Double) {
        topLeft.move(deltaX, deltaY)
    }
}