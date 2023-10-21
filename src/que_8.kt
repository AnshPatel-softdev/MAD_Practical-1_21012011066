import java.util.*
fun sortarray(arr:IntArray,n:Int):IntArray
{
    for (i in 0 until n - 1) {
        for (j in 0 until n - i - 1) {
            if (arr[j] > arr[j + 1]) {
                // Swap the elements
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }
    return arr
}
val arr = { size:Int-> Array<Int>(size){index->index}}
fun main()
{
    var a= arrayOf<Int>(10,90,60,80,100)
    println("Create Array-1 using arrayOf() method:")
    println(Arrays.deepToString(a))
    var a1=Array<Int>(5){0}
    println("Create Array-2 using Array<> method:")
    println(Arrays.deepToString(a1))
    val a2=arr(5)
    println("Create Array-3 using Array<> and lambda function:")
    println(Arrays.deepToString(a2))
    var a3=IntArray(5){0}
    println("Create Array-4 using IntArray() method:")
    println(a3.joinToString())
    println("Create Array-5 using intArrayOf() method:")
    var a4= intArrayOf(1,2,3,4,5)
    println(a4.joinToString())
    var a5= arrayOf(intArrayOf(1,3), intArrayOf(4,5), intArrayOf(6,7))
    println("Create 2D Array-6 using arrayOf() and intArrayOf():")
    println(a5.contentDeepToString())
    var a6=IntArray(5)
    for(i in a6.indices)
    {
        print("a[$i]=")
        a6[i]=readLine()!!.toInt()
    }
    println(a6.contentToString())
    a6.sort()
    println("After sorting by Built-in Function:")
    println(a6.contentToString())
    var a7=sortarray(a6,5)
    println("Before sorting Without Built-in Function:")
    println(a6.contentToString())
    println("After sorting Without Built-in Function:")
    println(a7.contentToString())
}