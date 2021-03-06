package ru.netology.nmedia.data

import androidx.lifecycle.LiveData

interface PostRepository {
    val data: LiveData<List<Post>>
    fun like(postID: Long)
    fun share(postID: Long)
    fun delete(postID: Long)
    fun save(post: Post)

    companion object {
        const val NEW_POST_ID = 0L
    }
}