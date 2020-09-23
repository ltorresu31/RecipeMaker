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
            "1" -> makeRecipe()
            "2" -> viewRecipe()
            "3" -> println("¡Vuelve pronto!")
        }
    } while (resp!="3")
}

fun makeRecipe()
{

    do {
        println("Hacer receta")
        val ingredientes = listOf<String>("Agua", "Leche", "Carne",
                "Verduras", "Frutas", "Ceral", "Huevos", "Aceites")
        println("\nSelecciona por categoría el ingrediente que buscas o escribe 9 para salir")
        for((i, ing) in ingredientes.withIndex())
        {
            println("${i.plus(1)}. $ing")
        }

        val resp: String? = readLine()

        bucle1@ for((i, ing) in ingredientes.withIndex())
        {
            val index=i.plus(1)
            if (index.toString()==resp){
               println("Elegiste $ing")
                break@bucle1
            }
        }
    } while (resp?.toInt() in 1..8)
}

fun viewRecipe()
{
    println("Ver mis recetas")
}