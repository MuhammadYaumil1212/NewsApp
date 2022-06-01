package com.edelweiss.edelnews.data

import java.util.Date

data class NewsData(
    private var id: Int,
    private var username: String,
    private var newImage: String,
    private var userImage: String,
    private var content: String,
    private var bgColor: String,
    private var dateCreation: Int,
    private var viewType: Int = 0,
    private var videoUrl: String,
    private var isFav: Boolean
    ){
}