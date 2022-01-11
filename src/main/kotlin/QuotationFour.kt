class QuotationFour(vowelsList : MutableList<String>) {

    var vowelsList = mutableListOf<String>();

    init {
        this.vowelsList = vowelsList
    }


    fun showOutPut(){
        var newVowelsList = mutableListOf<String>()
        vowelsList.map { word ->
            word.map { c ->
                when (c) {
                    'a', 'e', 'i', 'o', 'u' -> vowelsCount++
                    else -> {}
                }
            }
            //if (vowelsCount >= 2)  newVowelsList.add(word) else 0
            when (vowelsCount >= 2) {
                true -> newVowelsList.add(word)
            }
            vowelsCount = 0
        }
        println(newVowelsList)
    }
}