class Model {

    fun getData() : ArrayList<Observation> {
        val fetcher = DataFetcher()
        return fetcher.fetch()
    }
}