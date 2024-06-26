
class Line(
    var start: Point,
    var end: Point,
) {
    init {
        require(start.x() != end.x() || start.y() != end.y()) { "Line cannot have 0 length" }
    }

    fun getSlope(): Double {
        return (end.getY() - start.getY()) / (end.getX() - start.getX())
    }

    fun getLength(): Double {
        return Math.sqrt(Math.pow((end.getX() - start.getX()), 2.0) + Math.pow((end.getY() - start.getY()), 2.0))
    }

    fun move(deltaX: Double, deltaY: Double) {
        start.move(deltaX, deltaY)
        end.move(deltaX, deltaY)
    }
}