class QuotationOne(listOfArray: MutableList<String>) {

    var listOfArray = mutableListOf<String>();

    init {
        this.listOfArray = listOfArray
    }


    fun showOutput(){
        var newListOfArray = mutableListOf<String>()
        this.listOfArray.map {
            newListOfArray.add("""{"name": "$it"}""")
        }
        newListOfArray.let {
            println(newListOfArray)
        }
    }


}