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

// This program code is general purpose basic example that setups up an array in Kotlin. This code works as is and has been run
// successfully. This program will run within the IntelliJ IDEA IDE(Integration Development Environment). This code is written on
// IntelliJ IDEA Community 2020.1 Runtime version: 11.0.6+8-b765.40 amd64 and will run on other similar versions as is.
// Make an empty Kotlin Project and put in an empty Kotlin file/class, paste this code into the empty class and
// select Run... from the Run menu and pick this program. The program should run in a Run window which is a JVM (Java Virtual Machine)
// A person familiar with the IntelliJ IDEA IDE or books on the topic may be helpful in getting this code to run (to check details and nuances).
// In computing it is common to be one or two keystrokes away from having a program run. A person that already knows the computing system
// can usually figure out fast how to get a program running.
// Whether you never programmed or are an expert you learn the most when you teach others.
