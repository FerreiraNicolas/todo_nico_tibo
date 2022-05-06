package com.example.todo_nico_tibo.tasklist

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Task(
    @SerialName("id")
    val id:String,
    @SerialName("title")
    val title:String,
    @SerialName("description")
    val description:String = "valeur par defaut"):java.io.Serializable
