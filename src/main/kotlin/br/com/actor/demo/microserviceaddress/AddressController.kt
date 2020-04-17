package br.com.actor.demo.microserviceaddress

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/address")
class AddressController(private val addressService: AddressService) {

    @PostMapping("/{zipCode}")
    @ResponseBody
    fun findAddress(@PathVariable("zipCode") zipCode: String) = 
        addressService.findAddressByZipCode(zipCode)
}
