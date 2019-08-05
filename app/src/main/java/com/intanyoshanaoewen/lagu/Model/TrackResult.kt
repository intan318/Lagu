package com.intanyoshanaoewen.lagu.Model

data class RequestResult(
    @SerializedName("message")
    @Expose
    val message: Message
)

data class Message(
    @SerializedName("header")
    @Expose
    val header: Header,
    @SerializedName("body")
    @Expose
    val body: Body
)


data class Header(
    @SerializedName("status_code")
    @Expose
    val status: Int,
    @SerializedName("execute_time")
    @Expose
    val exectueTime: Double,
    @SerializedName("available")
    @Expose
    val avialble: Int)

data class Body(
    @SerializedName("track_list")
    @Expose
    val tracks: List<TrackItem>? = null)

data class TrackItem(
    @SerializedName("track")
    @Expose
    val track: Track)

data class MessageEvent(
    @SerializedName("tag")
    @Expose
    val tag: String,
    @SerializedName("object")
    @Expose
    val objects: Any
)
