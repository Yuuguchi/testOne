fun main() {
    var valstring = readln()
    var countchar = 1
    var prevChar = valstring[0]
    var result = ""
    for (i in 1 .. valstring.length -1) {
        if(prevChar == valstring[i]){
            countchar ++
        } else {
            if (countchar > 1) {
                result = result + prevChar + "$countchar"
            }
            else {
                result =result + prevChar
            }
            countchar =1
            prevChar = valstring[i]
        }
    }
    if (countchar > 1) {
        result = result + prevChar + "$countchar"
    }
    else {
        result = result + prevChar
    }

    println(result)
}
