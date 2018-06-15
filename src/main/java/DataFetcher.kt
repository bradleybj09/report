class DataFetcher {

    fun fetch() : ArrayList<Observation> {
        val obs1 = Observation("0","0","SSS","-8.7","C:\\Users\\bbradley\\Desktop\\Report Generator\\1.png","C:\\Users\\bbradley\\Desktop\\Report Generator\\2.png","C:\\Users\\bbradley\\Desktop\\Report Generator\\scan.png")
        val obs2 = Observation("1","1","DSF","-8.9","C:\\Users\\bbradley\\Desktop\\Report Generator\\1.png","C:\\Users\\bbradley\\Desktop\\Report Generator\\2.png","C:\\Users\\bbradley\\Desktop\\Report Generator\\scan.png")
        val obs3 = Observation("2","2","SSS","-8.7","C:\\Users\\bbradley\\Desktop\\Report Generator\\1.png","C:\\Users\\bbradley\\Desktop\\Report Generator\\2.png","C:\\Users\\bbradley\\Desktop\\Report Generator\\scan.png")
        val obs4 = Observation("3","3","DSF","-8.9","C:\\Users\\bbradley\\Desktop\\Report Generator\\1.png","C:\\Users\\bbradley\\Desktop\\Report Generator\\2.png","C:\\Users\\bbradley\\Desktop\\Report Generator\\scan.png")
        val obs5 = Observation("4","4","SSS","-8.7","C:\\Users\\bbradley\\Desktop\\Report Generator\\1.png","C:\\Users\\bbradley\\Desktop\\Report Generator\\2.png","C:\\Users\\bbradley\\Desktop\\Report Generator\\scan.png")
        val obs6 = Observation("5","5","DSF","-8.9","C:\\Users\\bbradley\\Desktop\\Report Generator\\1.png","C:\\Users\\bbradley\\Desktop\\Report Generator\\2.png","C:\\Users\\bbradley\\Desktop\\Report Generator\\scan.png")
        val obs7 = Observation("6","6","SSS","-8.7","C:\\Users\\bbradley\\Desktop\\Report Generator\\1.png","C:\\Users\\bbradley\\Desktop\\Report Generator\\2.png","C:\\Users\\bbradley\\Desktop\\Report Generator\\scan.png")
        val obs8 = Observation("7","7","DSF","-8.9","C:\\Users\\bbradley\\Desktop\\Report Generator\\1.png","C:\\Users\\bbradley\\Desktop\\Report Generator\\2.png","C:\\Users\\bbradley\\Desktop\\Report Generator\\scan.png")
        val obs9 = Observation("8","8","SSS","-8.7","C:\\Users\\bbradley\\Desktop\\Report Generator\\1.png","C:\\Users\\bbradley\\Desktop\\Report Generator\\2.png","C:\\Users\\bbradley\\Desktop\\Report Generator\\scan.png")
        val obs10 = Observation("9","9","DSF","-8.9","C:\\Users\\bbradley\\Desktop\\Report Generator\\1.png","C:\\Users\\bbradley\\Desktop\\Report Generator\\2.png","C:\\Users\\bbradley\\Desktop\\Report Generator\\scan.png")

        return arrayListOf(obs1,obs2,obs3,obs4,obs5,obs6,obs7,obs8,obs9,obs10)
    }
}