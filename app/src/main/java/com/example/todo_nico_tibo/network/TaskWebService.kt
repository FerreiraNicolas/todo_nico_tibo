package com.example.todo_nico_tibo.network

import com.example.todo_nico_tibo.tasklist.Task
import retrofit2.Response
import retrofit2.http.*

interface TaskWebService {
    @GET("tasks")
    suspend fun getTasks(): Response<List<Task>>
    @POST("tasks")
    suspend fun create(@Body task: Task): Response<Task>
    @PATCH("tasks/{id}")
    suspend fun update(@Body task: Task, @Path("id") id: String = task.id): Response<Task>
    @DELETE("tasks")
    suspend fun delete(@Path("id") id:String ): Response<Task>

}