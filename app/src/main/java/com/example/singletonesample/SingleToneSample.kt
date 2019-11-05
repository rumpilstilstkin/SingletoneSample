package com.example.singletonesample

class SingleToneSample {

    private var savedToken: String? = null

    val token: String?
        get() = savedToken ?: updateToken("dhsvahsgv")

    companion object {
        private val LOCK = Any()
        private var instance: SingleToneSample? = null
        fun instance(): SingleToneSample {
            synchronized(LOCK) {
                if (instance == null) {
                    instance = SingleToneSample()
                }
                return instance!!
            }
        }
    }


    fun updateToken(token: String): String? {
        savedToken = token
        return savedToken
    }
}