package com.cssweb.trade.counter

import akka.actor.Actor
import com.cssweb.trade.common.Message

/**
 * Created by chenhf on 2015/1/24.
 */
class HelloActor extends Actor{

  def receive = {
    case Message(msg) =>
      println(s"received msg is '$msg'")
      sender ! Message("msg from remote")
      
    case _ => println("quit")

  }

}
