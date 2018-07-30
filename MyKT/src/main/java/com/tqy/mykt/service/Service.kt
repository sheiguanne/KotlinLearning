package com.tqy.mykt.service

import com.tqy.mykt.entity.Point

class Service {

    //获得点(3, 4)
    fun getPoint() : Point = Point(3, 4)

    //获得两点之间的距离
    fun getDistance(p1:Point, p2:Point) : Double = p1?.let {
        var dx = it.getX() - p2.getX()
        var dy = it.y - p2.y
        var dx2 = dx.toDouble()
        var dy2 = dy.toDouble()
        var d = dx2*dx2+dy2*dy2
        return Math.sqrt(d)
    }

}

