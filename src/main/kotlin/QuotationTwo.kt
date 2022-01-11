class QuotationTwo(listOfArrayTwo: MutableList<String>) {

    var listOfArrayTwo = mutableListOf<String>();

    init {
        this.listOfArrayTwo = listOfArrayTwo
    }


    fun showOutput(){
        var newListOfArrayTwo = mutableListOf<String>()
        listOfArrayTwo.forEachIndexed { index, item -> newListOfArrayTwo.add(""""$item" : $index""") }
        println(newListOfArrayTwo.toString().replace("[", "{").replace("]", "}"))
    }
}