package iuh_ad.ngoquochoang.msv_19477071.a19477071_ngoquochoang_ad_todoapp

class ToDoModel {
    companion object Factory{
        fun createList(): ToDoModel = ToDoModel()
    }
    var UID : String? = null
    var itemDataText : String? = null
    var done : Boolean? = false
}