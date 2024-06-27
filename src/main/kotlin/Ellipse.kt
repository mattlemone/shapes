class Ellipse(
    var center: Point,
    var radiusX: Double,
    var radiusY: Double,
) {
    init {
        require(radiusX > 0 && radiusY > 0) { "Ellipse radii must be positive" }
    }

    fun getArea(): Double {
        return Math.PI * radiusX * radiusY
    }

    fun move(deltaX: Double, deltaY: Double) {
        center.move(deltaX, deltaY)
    }
}