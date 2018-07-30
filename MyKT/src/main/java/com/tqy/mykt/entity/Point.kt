package com.tqy.mykt.entity

/**
 * kotlin可以直接在类名之后定义属性，并给定默认值
 */
data class Point(private var x: Int = 0,
                 var y: Int = 0,
                 var name: String = "p") {
    constructor(s: Int, t: Int) : this(x = s, y = t)

    fun setX(x: Int) { this.x=x }
    fun getX(): Int = x
}