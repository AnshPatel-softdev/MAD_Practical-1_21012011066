fun Add(a:Int,b:Int,c:Int){
    var res=a+b+c
    println("Addition of $a,$b and $c is:$res")
}
fun sub(a:Int,b:Int,c:Int){
    var res=a-b-c
    println("Subtraction of $a,$b and $c is:$res")
}
fun mul(a:Int,b:Int,c:Int){
    var res=a*b*c
    println("Multiplication of $a,$b and $c is:$res")
}
fun div(a:Int,b:Int)
{
    var res=a/b
    println("Division of $a and $b is:$res")
}
fun main()
{
    Add(111,2222,-222)
    sub(111,2222,-222)
    mul(111,2222,-222)
    div(2222,111)
}