package com.tqy.mykt

import com.tqy.mykt.entity.Point


fun main(args: Array<String>) {
    fun3()
}

//统计某个字符串中各个字母的数量
fun fun2() {
//    var str = "abcdab"
//    val mymap = HashMap<String ,Integer>()
//    str.forEach { c->
//        mymap.takeIf { mymap.containsKey(""+c) }?.put("" + c, 1 + mymap["" + c])
//    }
//    println(mymap)
}

fun fun3() {
    val p = Point()
    println(p.getX())
    println(p.y)
    println(p.name)

    p.setX(1)
    println(p.getX())
}

