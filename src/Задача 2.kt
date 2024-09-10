fun main() {
    var valstring = readln()
    var countchar = 0
    val uniqchar = ArrayList<Char>()
    val map = hashMapOf<String,Int>()

    for (i in 0 .. valstring.length - 1)
    {
        if (!uniqchar.contains(valstring[i])) {
            uniqchar.add(valstring[i])
            countchar = 0
            for (j in 0 .. valstring.length - 1) {
                if (uniqchar[uniqchar.indexOf(valstring[i])] == valstring[j]) {
                    countchar++
                }
            }
            map[uniqchar[uniqchar.indexOf(valstring[i])].toString()] = countchar
        }
    }
    map.toSortedMap().forEach{(char, count) -> println("$char - $count")}
}