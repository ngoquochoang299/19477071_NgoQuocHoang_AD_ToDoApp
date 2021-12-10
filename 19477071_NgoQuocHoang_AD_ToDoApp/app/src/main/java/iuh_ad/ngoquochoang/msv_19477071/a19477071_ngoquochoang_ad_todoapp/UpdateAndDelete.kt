package iuh_ad.ngoquochoang.msv_19477071.a19477071_ngoquochoang_ad_todoapp

interface UpdateAndDelete{
    fun modifyItem(itemUID : String , isDone : Boolean)
    fun onItemDelete(itemUID : String)
}