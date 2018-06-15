object Report {

    var reportTitle = ""
    var observations = ArrayList<Observation>()
    var preYear = ""
    var postYear = ""
    var chainageTitle = "Chainage"
    var preImageTitle = ""
    var postImageTitle = ""
    var defectTitle = "Defect"
    var deltaTitle = "Delta"
    var pointCloudTitle = "Point Cloud"
    var chainageUnit = "m"
    var deltaUnit = "mm"
    var chainageUnitInParentheses = ""
    var deltaUnitInParentheses = ""
    var imageTitle = "Image"
    val space = " "
    val openParen = "("
    val closeParen = ")"

    fun shortSetup(reportTitle: String,
                   observations: ArrayList<Observation>,
                   preYear: String,
                   postYear: String) {
        this.reportTitle = reportTitle
        this.observations = observations
        this.preYear = preYear
        this.postYear = postYear
        doConcats()
    }

    fun fullSetup(reportTitle: String,
              observations: ArrayList<Observation>,
              preYear: String,
              postYear: String,
              chainageUnit: String = "m",
              deltaUnit:  String = "mm",
              chainageTitle: String = "Chainage",
              defectTitle: String = "Defect",
              deltaTitle: String = "Delta",
              pointCloudTitle: String = "Point Cloud",
              imageTitle: String = "Image"
              ) {
        this.reportTitle = reportTitle
        this.observations = observations
        this.preYear = preYear
        this.postYear = postYear
        this.chainageUnit = chainageUnit
        this.defectTitle = defectTitle
        this.deltaUnit = deltaUnit
        this.chainageTitle = chainageTitle
        this.deltaTitle = deltaTitle
        this.pointCloudTitle = pointCloudTitle
        this.imageTitle = imageTitle
        doConcats()
    }

    fun doConcats() {
        preImageTitle = preYear + space + imageTitle
        postImageTitle = postYear + space + imageTitle
        chainageUnitInParentheses = openParen + chainageUnit + closeParen
        deltaUnitInParentheses = openParen + deltaUnit + closeParen
    }
}