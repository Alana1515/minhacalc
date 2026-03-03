//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Primeiro número de 0 a 9: ")
    val op = readLine()!!.replace("","")

    if(op.contains("+")){
        val soma = op.split("+")
        println(soma[0].toInt() + soma[1].toInt())
    }else if (op.contains("-")){
        val soma = op.contains('-')
        println(soma[0].toInt() + soma[1].toInt())
    }else if (op.contains("*")){
        val soma = op.contains("*")
        println(soma[0].toInt() + soma[1].toInt())
    }else if (op.contains("/")){
        val soma = op.contains("/")
        println(soma[0].toInt() + soma[1].toInt())
    }else {
    println("Operador inválido")
}

    }



