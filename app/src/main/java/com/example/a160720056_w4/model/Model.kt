package com.example.a160720056_w4.model

data class Student(
    val id:String?,
    val name:String?,
    val dob:String?,
    val phone:String?,
    val photoUrl:String?
)
data class Plane(
    val id:Int?,
    val manufacturer:String?,
    val model:String?,
    val year:Int?,
    val color:String?,
    val fuelType:String?,
    val maxPassengers:Int?,
    val features:List<String>?,
)
data class InsuranceDetail(
    val provider:String?,
    val policyNumber:String?,
    val expiryDate:String?,

)

