package dimaxru.example.domain.repository

import dimaxru.example.domain.entity.Customer
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository:CrudRepository<Customer, Long> {
}