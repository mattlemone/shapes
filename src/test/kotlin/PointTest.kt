import org.junit.jupiter.api.Assertions.assertNotSame
import kotlin.test.Test
import kotlin.test.assertEquals

class PointTest {
    @Test
    fun testPointCreation() {
        val point = Point(3.0, 4.0)
        assertEquals(3.0, point.x)
        assertEquals(4.0, point.y)
    }
    @Test
    fun testClone() {
        val point = Point(5.0, 6.0)
        val clonedPoint = point.clone()
        assertEquals(point.x, clonedPoint.x)
        assertEquals(point.y, clonedPoint.y)
        assertNotSame(point, clonedPoint) // Ensure the cloned point is a different object
    }
    @Test
    fun testMove() {
        val point = Point(0.0, 0.0)
        point.move(3.0, 4.0)
        assertEquals(3.0, point.x)
        assertEquals(4.0, point.y)
    }
}