
class Point (
    var x: Double,
    var y: Double,
){
    fun clone(): Point {
        return Point(x, y)
    }

    fun move(deltaX: Double, deltaY: Double) {
        x += deltaX
        y += deltaY
    }
}