package br.com.actor.demo.microserviceaddress

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.ResponseBody

@FeignClient("addressService", url = "http://viacep.com.br")
interface AddressService {

    @GetMapping("/ws/{zipCode}/json/", consumes = ["application/json"])
    @ResponseBody
    fun findAddressByZipCode(@PathVariable("zipCode") zipCode: String): Map<String, Any>
}
