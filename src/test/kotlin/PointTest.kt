import kotlin.test.Test
import kotlin.test.assertEquals

class PointTest {
    @Test
    fun testPointEquals(){
        val point = Point(5.0, 5.0)
        assertEquals(point, point.clone())
    }
}