
fun ShowMenu(){
    println(":: Bienvenido a Recipe Maker ::")
    println("Selecciona la opcion deseada")
    println("1. Hacer una receta")
    println("2. Ver mis recetas")
    println("3. Salir")
}
fun main(args : Array<String>){
    val ingredientsList  =  listOf("Agua","Leche","Carne","Verduras", "Frutas", "Cereal","Huevos","Aceite")
    var ListaReceta :MutableList<String> = mutableListOf()
    var opcion : Int? = null
    do{
        ShowMenu()
        println(":: Ingrese la opcion 1 - 3 ::")
        opcion = readLine()!!.toInt()
        when(opcion){
            in 1..1 -> {
                println("Agrege un ingrediente a la nueva receta")
                for((index, valor) in ingredientsList.withIndex()){
                    println("Clave : $index  Nombre : $valor")
                }
                do{
                    println(":::: Ingrese un ingrediente 0 - 8 :::")
                    val elemento : Int? = readLine()?.toInt()
                    when(elemento){
                        in 0..8 -> {
                            for((index, ingrediente) in ingredientsList.withIndex()){
                                if(elemento == index) {
                                    ListaReceta.add(ingredientsList[index])
                                }
                            }
                        }
                        !in 0..8 ->{
                            println("Lista de la receta nueva")
                            ListaReceta.forEach(){ println( it ) }
                        }
                    }
                }while (elemento!! <= 8)
            }
            in 2..2 -> {
                println("Lista de ingredientes")
                ingredientsList.forEach(){
                    println(it)
                }
            }
            !in 1..3 -> println("Ha elejido una opcion no valida")
        }
    }while(opcion!! != 3)
}