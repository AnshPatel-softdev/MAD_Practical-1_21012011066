fun fact(a:Int):Int
{
    if(a==1 || a==0)
        return 1

    var res=a*fact(a-1)
    return res
}

tailrec fun factorial(n: Int, run: Int = 1): Long {
    return if (n == 1){
        run.toLong()
    } else {
        factorial(n-1, run*n)
    }
}

fun main()
{
    println("Enter the Number:")
    var n= readLine()!!.toInt()
    var res=factorial(n)
    var res1=fact(n)
    println("Tailrec Factorial of $n is:$res")
    println("Factorial of $n is:$res1")
}