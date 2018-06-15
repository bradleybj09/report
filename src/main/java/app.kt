fun main(args: Array<String>) {

    val model = Model()
    val observationList = model.getData()
    for (obs in observationList) Writer.observations.add(obs)
    Writer.write()

}