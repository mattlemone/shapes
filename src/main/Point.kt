
class Point (
    var x: double,
    var y: double,
){
    fun clone(){

    }
    fun changex(x){
        Point.x = x
    }
    fun changey(y){
        Point.y = y
    }
}