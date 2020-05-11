fun main(args: Array<String>){
    var aLightBreeze = arrayOfNulls<Int?>(4)

    for (i in 0..3){
        println("aLightBreeze[${i}] = ${aLightBreeze[i]}")
    }

    println()
    println("Please enter integer numbers for this program to run normally")

    for (i in 0..3){
        print("Enter a number ")
        aLightBreeze[i] = readLine()?.toInt()
    }

    println()

    for (i in 0..3){
        println("aLightBreeze[${i}] = ${aLightBreeze[i]}")
    }

}