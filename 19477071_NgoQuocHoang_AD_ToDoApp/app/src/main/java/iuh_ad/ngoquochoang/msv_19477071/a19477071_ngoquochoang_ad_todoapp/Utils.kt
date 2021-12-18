package iuh_ad.ngoquochoang.msv_19477071.a19477071_ngoquochoang_ad_todoapp

object Utils {

    fun getStatus(status: Boolean) : String {
        return when (status) {
            true -> "Completed"
            else -> "Not Completed"
        }
    }

}