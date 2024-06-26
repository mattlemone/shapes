class Triangle(
    var pointA: Point,
    var pointB: Point,
    var pointC: Point,
) {
    init {
        require(!areCollinear(pointA, pointB, pointC)) { "Triangle cannot have an area of 0" }
    }

    private fun areCollinear(p1: Point, p2: Point, p3: Point): Boolean {
        return (p2.y() - p1.y()) * (p3.x() - p2.x()) == (p3.y() - p2.y()) * (p2.x() - p1.x())
    }

    fun getArea(): Double {
        return Math.abs(pointA.x() * (pointB.y() - pointC.y()) + pointB.x() * (pointC.y() - pointA.y()) + pointC.x() * (pointA.y() - pointB.y())) / 2.0
    }

    fun move(deltaX: Double, deltaY: Double) {
        pointA.move(deltaX, deltaY)
        pointB.move(deltaX, deltaY)
        pointC.move(deltaX, deltaY)
    }
}