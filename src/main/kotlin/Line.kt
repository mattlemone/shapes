import kotlin.math.sqrt

class Line(
    var start: Point,
    var end: Point,
) {
    init {
        require(start.x != end.x || start.y != end.y) { "Line cannot have 0 length" }
    }

    fun getSlope(): Double {
        return (end.y - start.y) / (end.y - start.y)
    }

    fun getLength(): Double {
        return sqrt(Math.pow((end.x - start.x), 2.0) + Math.pow((end.y - start.y), 2.0))
    }

    fun move(deltaX: Double, deltaY: Double) {
        start.move(deltaX, deltaY)
        end.move(deltaX, deltaY)
    }
}