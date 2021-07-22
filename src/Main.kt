fun main() {
    print(alphabeticShift("crazy"))
}

fun alphabeticShift(inputString: String): String {
    var newString=""
    for(i in 0 until inputString.length){
        if(inputString[i]=='z')
            newString=newString.plus("a")
        else{
            var myCharAsci=inputString[i].toInt()
            myCharAsci+=1
            var newChar=myCharAsci.toChar()
            newString=newString.plus(newChar.toString())
        }
    }
    return newString

}
