package br.com.actor.demo.microserviceaddress

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients


@EnableFeignClients
@SpringBootApplication
class MicroserviceAddressApplication

fun main(args: Array<String>) {
	runApplication<MicroserviceAddressApplication>(*args)
}
