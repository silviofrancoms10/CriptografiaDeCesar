/*Instrução para executar este código Kotlin sem necessidade de configurar o ambiente
* 1. copie o código deste arquivo
* 2. cole no Playground neste link: https://play.kotlinlang.org/
* */

fun main() {

    fun criptografar(texto: String): String {
        var textoCriptografado = ""
        for (caractere in texto) {
            if (caractere.isLetter()) {
                var codigo = caractere.code
                codigo += 3
                if (caractere.isLowerCase()) {
                    if (codigo > 'z'.code) {
                        codigo -= 26
                    }
                } else {
                    if (codigo > 'Z'.code) {
                        codigo -= 26
                    }
                }
                textoCriptografado += codigo.toChar()
            } else {
                textoCriptografado += caractere
            }
        }
        return textoCriptografado
    }

    fun decriptografar(texto: String): String {
        var textoDecriptografado = ""
        for (caractere in texto) {
            if (caractere.isLetter()) {
                var codigo = caractere.code
                codigo -= 3
                if (caractere.isLowerCase()) {
                    if (codigo < 'a'.code) {
                        codigo += 26
                    }
                } else {
                    if (codigo < 'A'.code) {
                        codigo += 26
                    }
                }
                textoDecriptografado += codigo.toChar()
            } else {
                textoDecriptografado += caractere
            }
        }
        return textoDecriptografado
    }

    println(criptografar("Alo, voce me ouve zz"))

    println(decriptografar("Dor, yrfh ph rxyh cc"))

}
