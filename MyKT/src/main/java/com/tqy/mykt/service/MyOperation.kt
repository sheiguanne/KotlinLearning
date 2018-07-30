package com.tqy.mykt.service

/**
 *
 * 日报：完成了把手网模拟登陆操作；学习了kotlin的高阶函数，把通用操作写在高阶函数体里，把不同的操作放在参数函数里（以lambda表达式形式给出），更具灵活性。
 * 明白了一个实体类既可以被jpa的注解标注，也可以被elasticsearch的注解标注
 *
 * 高阶函数用法：通用操作写在函数体里，不同的操作放在参数函数里（lambda表达式形式）
 * 高阶函数写法：
 * inline fun <泛型> 泛型.操作名(参数) : 返回值 {
 *      函数体
 * }
 *
 */
inline fun <T, R> T.mylet(f: (T) -> R): R {
    return f(this)
}

/**
 *示例1: 返回两个数和的平方 (x+y)^2，  调用方法是:
var sum = square(3, 17, {
    a, b->
    a+b
})
println("$sum")
若是求差的平方，
var sum = square(3, 17, {
    a, b->
    a-b
})
 */
inline fun square(x:Int, y:Int, f:(Int,Int)->Int): Int {//f是一个函数，传入两个Int类型参数，返回一个Int类型参数
    return f(x, y)*f(x, y)
}

/**
 *示例2: 返回点p到原点的距离，  调用方法是:
var p1 = Point(1, 2)
var dis = p1.dToO { it->
    var x = it.getX().toDouble()
    var y = it.y.toDouble()
    var d = x*x+y*y
    Math.sqrt(d)
}
println(dis)
 */
inline fun <Point, Double> Point.dToO(f:(Point)->Double): Double {
    return f(this)
}