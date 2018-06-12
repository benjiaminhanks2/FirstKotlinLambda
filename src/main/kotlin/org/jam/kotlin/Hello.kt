package org.jam.kotlin

import spark.Spark.get
import org.apache.log4j.BasicConfigurator

fun main(args: Array<String>) {
    BasicConfigurator.configure()
    get("/hello") {req,res -> "Hello World"}
}

