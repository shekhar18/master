class QuotationFive(vowelsListTwo : MutableList<String>) {
    var vowelsListTwo = mutableListOf<String>();
    var stringWord = ""
    init {
        this.vowelsListTwo = vowelsListTwo
    }

    fun showOutPut(){
        var newVowelsListTwo = mutableListOf<String>()
        vowelsListTwo.map { word ->
            word.map { c ->
                when (c) {
                    'a', 'e', 'i', 'o', 'u' -> stringWord = stringWord + "(" + c + ")"
                    else -> {
                        stringWord = stringWord + c
                    }
                }
            }
            //if (vowelsCount >= 2)  newVowelsList.add(word) else 0
            newVowelsListTwo.add(stringWord.toString().replace(")(", ""))
            stringWord = ""
        }
        println(newVowelsListTwo)
    }
}