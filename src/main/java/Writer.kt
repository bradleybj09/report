import kotlinx.html.*
import kotlinx.html.dom.create
import org.w3c.dom.Element
import java.io.OutputStream
import java.io.OutputStreamWriter
import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.transform.OutputKeys
import javax.xml.transform.TransformerFactory
import javax.xml.transform.dom.DOMSource
import javax.xml.transform.stream.StreamResult

object Writer {

    val observations = arrayListOf<Observation>()

    fun write() {

        val document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument()
        val html = document.create.html {
            body {
                style { unsafe {
                    raw("""
    table, th, td {
    border: 1px solid black;
    border-collapse: collapse;
    padding: 5px;
    text-align: center;
    size: letter;
    }
    """)
                } }
                table {
                    style = """width: 100%"""
                    tbody {
                        tr {
                            th {
                                style = """width: 100%"""
                                +"Primary Trunk - 27-06 to 27-05, Points of Interest"
                                colSpan = "7"
                            }
                        }
                        tr {
                            th {
                                style = """width: 12.50%"""
                                +"Chainage (m)"
                                colSpan = "2"
                            }
                            th {
                                style = """width: 6.25%"""
                                +"Defect"
                                rowSpan = "2"
                            }
                            th {
                                style = """width: 6.25%"""
                                +"Delta (mm)"
                                rowSpan = "2"
                            }
                            th {
                                style = """width: 25%"""
                                +"2015 Image"
                                rowSpan = "2"
                            }
                            th {
                                style = """width: 25%"""
                                +"2017 Image"
                                rowSpan = "2"
                            }
                            th {
                                style = """width: 25%"""
                                +"Point Cloud"
                                rowSpan = "2"
                            }
                        }
                        tr {
                            th {
                                +"2015"
                            }
                            th {
                                +"2017"
                            }
                        }
                        val base = if (observations.size > 2) 1 else observations.size-1
                        for (obs in 0..base) {
                            tr {
                                td { +observations[obs].preChainage }
                                td { +observations[obs].postChainage }
                                td { +observations[obs].defect }
                                td { +observations[obs].delta }
                                td { img("",observations[obs].preImagePath) { style = """width:304px;height:228px""" } }
                                td { img("",observations[obs].postImagePath) { style = """width:304px;height:228px""" } }
                                td { img("",observations[obs].pointCloudPath) { style = """width:304px;height:228px""" } }
                            }
                        }
                    }
                }
                for (triple in 0..((observations.size-2)/3)-1) {
                    div("page-break") { }
                    p { style = "page-break-before: always" }
                    val base = ((triple + 1) * 3)-1
                    table {
                        style = """width: 100%"""
                        tbody {
                            tr {
                                th {
                                    style = """width: 12.50%"""
                                    +"Chainage (m)"
                                    colSpan = "2"
                                }
                                th {
                                    style = """width: 6.25%"""
                                    +"Defect"
                                    rowSpan = "2"
                                }
                                th {
                                    style = """width: 6.25%"""
                                    +"Delta (mm)"
                                    rowSpan = "2"
                                }
                                th {
                                    style = """width: 25%"""
                                    +"2015 Image"
                                    rowSpan = "2"
                                }
                                th {
                                    style = """width: 25%"""
                                    +"2017 Image"
                                    rowSpan = "2"
                                }
                                th {
                                    style = """width: 25%"""
                                    +"Point Cloud"
                                    rowSpan = "2"
                                }
                            }
                            tr {
                                th {
                                    +"2015"
                                }
                                th {
                                    +"2017"
                                }
                            }
                            for (obs in 0..2) {
                                tr {
                                    td { +observations[obs + base].preChainage }
                                    td { +observations[obs + base].postChainage }
                                    td { +observations[obs + base].defect }
                                    td { +observations[obs + base].delta }
                                    td { img("",observations[obs + base].preImagePath) { style = """width:304px;height:228px""" } }
                                    td { img("",observations[obs + base].postImagePath) { style = """width:304px;height:228px""" } }
                                    td { img("",observations[obs + base].pointCloudPath) { style = """width:304px;height:228px""" } }
                                }
                            }
                        }
                    }
                }
                div("page-break") {  }
                p { style = "page-break-before: always" }
                table {
                    style = """width: 100%"""
                    tbody {
                        tr {
                            th {
                                style = """width: 12.50%"""
                                +"Chainage (m)"
                                colSpan = "2"
                            }
                            th {
                                style = """width: 6.25%"""
                                +"Defect"
                                rowSpan = "2"
                            }
                            th {
                                style = """width: 6.25%"""
                                +"Delta (mm)"
                                rowSpan = "2"
                            }
                            th {
                                style = """width: 25%"""
                                +"2015 Image"
                                rowSpan = "2"
                            }
                            th {
                                style = """width: 25%"""
                                +"2017 Image"
                                rowSpan = "2"
                            }
                            th {
                                style = """width: 25%"""
                                +"Point Cloud"
                                rowSpan = "2"
                            }
                        }
                        tr {
                            th {
                                +"2015"
                            }
                            th {
                                +"2017"
                            }
                        }
                        //leftovers
                        val base = (((observations.size-2)/3)*3)+2
                        for (obs in 0..((observations.size - 2) % 3)-1) {
                            tr {
                                td { +observations[obs + base].preChainage }
                                td { +observations[obs + base].postChainage }
                                td { +observations[obs + base].defect }
                                td { +observations[obs + base].delta }
                                td { img("",observations[obs + base].preImagePath) { style = """width:304px;height:228px""" } }
                                td { img("",observations[obs + base].postImagePath) { style = """width:304px;height:228px""" } }
                                td { img("",observations[obs + base].pointCloudPath) { style = """width:304px;height:228px""" } }
                            }
                        }
                    }
                }
            }
        }
        intoStream(html,System.out)
    }

    fun intoStream(doc: Element, out: OutputStream) {
        with(TransformerFactory.newInstance().newTransformer()) {
            setOutputProperty(OutputKeys.OMIT_XML_DECLARATION,"no")
            setOutputProperty(OutputKeys.METHOD,"xml")
            setOutputProperty(OutputKeys.INDENT, "yes")
            setOutputProperty(OutputKeys.ENCODING, "UTF-8")
            setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4")
            transform(DOMSource(doc),
                    StreamResult(OutputStreamWriter(out, "UTF-8")))
        }
    }
}