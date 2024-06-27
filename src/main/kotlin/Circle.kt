class Circle(
    var center: Point,
    var radius: Double,
) {
    init {
        require(radius > 0) { "Circle radius must be positive" }
    }

    fun getArea(): Double {
        return Math.PI * radius * radius
    }

    fun move(deltaX: Double, deltaY: Double) {
        center.move(deltaX, deltaY)
    }
}