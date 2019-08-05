package com.intanyoshanaoewen.lagu.Model
data class User(
    @SerializedName("id")
    @Expose
    var id: String?,
    @SerializedName("name")
    @Expose
    var name: String?,
    @SerializedName("email")
    @Expose
    var email: String?,
    @SerializedName("photo")
    @Expose
    var photo: String?,
    @SerializedName("gender")
    @Expose
    var gender: String?,
    @SerializedName("type")
    @Expose
    var type: String?) {
    constructor() : this("", "", "", "", "", "")
    constructor(id: String?, name: String?, email: String?, photo: String?, type: String?) : this() {
        this.id = id
        this.name = name
        this.email = email
        this.photo = photo
        this.type = type
    }
}