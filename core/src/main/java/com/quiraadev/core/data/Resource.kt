package com.quiraadev.core.data

sealed class Resource<T>(val data: T?, val message: String? = null) {
	class Success<T>(data: T? = null) : Resource<T>(data = data)
	class Loading<T>(data: T? = null) : Resource<T>(data = data)
	class Error<T>(message: String?, data: T? = null) : Resource<T>(data = data, message = message)
}