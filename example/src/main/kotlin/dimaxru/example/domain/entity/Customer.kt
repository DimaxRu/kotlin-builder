package dimaxru.example.domain.entity

import org.springframework.data.annotation.Id
import org.springframework.data.annotation.Transient

data class Customer(
        @Id
        val CUSTOMER_ID: Long,
        val CUSTOMER_NAME: String?,
        val CUSTOMER_ADDRESS: String?,
        val CUSTOMER_CITY: String?,
        val CUSTOMER_STATE: String?,
        val CUSTOMER_ZIP_POSTAL: String?,
        @Transient
        var TRANSIENT_FIELD: String?,
)
