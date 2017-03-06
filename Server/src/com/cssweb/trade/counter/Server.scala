package com.cssweb.trade.counter

import akka.actor.{Props, ActorSystem}
import com.cssweb.trade.common.Message


object Server extends App{
	
		val actorSystem = ActorSystem("HelloRemoteSystem");

		val actorHello = actorSystem.actorOf(Props[HelloActor], name = "HelloRemoteActor");
    
		actorHello ! Message("server is running...")

	
}


