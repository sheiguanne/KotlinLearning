package com.tqy.mykt.controller

import com.fasterxml.jackson.databind.ObjectMapper
import com.tqy.mykt.entity.Point
import com.tqy.mykt.service.*


fun main(args: Array<String>) {
    var controller = Controller()
    var jsonstr = controller.handleRequest1()
    println(jsonstr)

    var d = controller.handleRequest2()
    println(d)

    //新的


}


class Controller(private val service: Service = Service()) {
    fun handleRequest1() :String {
        var p = service.getPoint()
        var om = ObjectMapper()
        return om.writeValueAsString(p)
    }
    fun handleRequest2() :Double {
        var p1 = Point(3, 0)
        var p2 = Point(0, 4)
        return service.getDistance(p1, p2)
    }
}

