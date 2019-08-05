package com.intanyoshanaoewen.lagu.Model

open class Track(
    @PrimaryKey
    @SerializedName(TRACK_ID)
    @Expose
    var trackId: Long,

    @SerializedName(TRACK_NAME)
    @Expose
    var trackName: String?,

    @SerializedName(ALBUM_ID)
    @Expose
    var albumId: Long,

    @SerializedName(ALBUM_NAME)
    @Expose
    var albumName: String?,

    @SerializedName(ARTIST_ID)
    @Expose
    var artistId: Long,

    @SerializedName(ARTIST_NAME)
    @Expose
    var artistName: String?,

    @Ignore
    var itemType: Int) : RealmObject(){
    constructor() : this(0,"",0,"",0,"", 0)
    companion object {
        const val TRACK_ID = "track_id"
        const val TRACK_NAME = "track_name"
        const val ALBUM_ID = "album_id"
        const val ALBUM_NAME = "album_name"
        const val ARTIST_ID = "artist_id"
        const val ARTIST_NAME = "artist_name"
    }
}