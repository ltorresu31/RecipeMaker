fun main(args: Array<String>) {
    println(":::Bienvenido a Recipe Maker:::")
    do
    {
        println("\n\nSelecciona la opción deseada")
        println("1. Hacer una receta")
        println("2. Ver mis recetas")
        println("3. Salir")
        val resp: String? = readLine()
        val recetas: List<String> = listOf<String> ("Receta 1","Receta 2", "Receta 3")
        when (resp)
        {
            "1" -> println("¡Haz hecho una receta!")
            "2" -> println(recetas)
            "3" -> println("¡Vuelve pronto!")
        }
    } while (resp!="3")
}