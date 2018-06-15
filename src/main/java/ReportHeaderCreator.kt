class ReportHeaderCreator(val title: String, val preYear: String, val postYear: String, val firstPage: Boolean) {

    lateinit var header: String

    fun createHeader() : String {
        if (firstPage) {
            createFirstPageHeader()
        } else {
            createRegularPageHeader()
        }
        return header
    }

    private fun createFirstPageHeader() {
        
    }

    private fun createRegularPageHeader() {

    }
}