import org.json.JSONArray
import org.json.JSONObject


var vowelsCount = 0
var add = 0


fun main() {

    var listOfArray = mutableListOf<String>("a", "b", "c")
    var q1 = QuotationOne(listOfArray)
    q1.showOutput()

    //------------------//

    var listOfArrayTwo = mutableListOf<String>("a", "b", "c", "d", "e")
    var q2 = QuotationTwo(listOfArrayTwo)
    q2.showOutput()

    //-----------------------//
    //3rd Quotation solution
    //----------------------//

    val jsonObject = JSONObject("{ \"value\": 1, \"children\": [ { \"value\": 2, \"children\": [ { \"value\": 3, \"children\": [] } ] }, { \"value\": 4, \"children\": [ { \"value\": 5, \"children\": [] }, { \"value\": 6, \"children\": [] } ] } ] }")
    addition(jsonObject)
    println("total : " + add)

    //-------------------//

    var vowelsList = mutableListOf<String>("dog", "cat", "mouse", "sky", "eleven")
    var q4 = QuotationFour(vowelsList)
    q4.showOutPut()

    //-------------------//

    var vowelsListTwo = mutableListOf<String>("dog", "cat", "mouse", "sky", "eleven")
    var q5 = QuotationFive(vowelsListTwo)
    q5.showOutPut()

    //----------------------//


}

fun addition(jsonObject: JSONObject) {
    var child: JSONArray = jsonObject.get("children") as JSONArray
    var value = jsonObject.get("value") as Int
    add = value + add
    when (child.length() > 0) {
        true -> child.map { node -> addition(node as JSONObject) }
    }
}






