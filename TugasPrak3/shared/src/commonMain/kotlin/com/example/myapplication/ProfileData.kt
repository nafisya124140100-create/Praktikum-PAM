package com.example.myapplication

data class ProfileData(
    val name: String,
    val bio: String,
    val email: String,
    val phone: String,
    val location: String
)

val myProfile = ProfileData(
    name = "Nafisya Ghalia",
    bio = "Mahasiswa Teknik Informatika angkatan 2024 Institut Teknologi Sumatera.",
    email = "nafisya.124140100@student.itera.ac.id",
    phone = "081234567890",
    location = "Bandar Lampung"
)
