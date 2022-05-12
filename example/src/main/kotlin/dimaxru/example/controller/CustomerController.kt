package dimaxru.example.controller

import dimaxru.example.domain.entity.Customer
import dimaxru.example.domain.repository.CustomerRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/client")
class CustomerController constructor(val customerRepository: CustomerRepository){
    @GetMapping
    fun getAll():Iterable<Customer>{
        return customerRepository.findAll()
    }
}