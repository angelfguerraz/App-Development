// Declaramos los valores de nuestras respuestas
const val RESPUESTA_AFIRMATIVA = "✅"
const val RESPUESTA_NEGATIVA = "❌"
const val RESPUESTA_DUDOSA = "?"

//Unimos las respuestas con los valores
val respuestas = mapOf(
    "Sí" to RESPUESTA_AFIRMATIVA,
    "Es cierto" to RESPUESTA_AFIRMATIVA,
    "Totalmente" to RESPUESTA_AFIRMATIVA,
    "Sin duda" to RESPUESTA_AFIRMATIVA,
    "Pregunta en otro momento" to RESPUESTA_DUDOSA,
    "No puedo decirte en este momento" to RESPUESTA_DUDOSA,
    "Puede que si o puede que no" to RESPUESTA_DUDOSA,
    "No va a suceder" to RESPUESTA_NEGATIVA,
    "No cuentes con ello" to RESPUESTA_NEGATIVA,
    "Definitivamente no" to RESPUESTA_NEGATIVA,
    "No lo creo" to RESPUESTA_NEGATIVA,
)

fun main(args: Array<String>) {
    println("""
        Hi, I'm the Kotlin 8 ball. What would you like to do?
         1. ask a question.
         2. show all answers.
         3. exit.
    """.trimIndent())

    val input = readLine()

    when (input) {
        "1" -> askQuestion()
        "2" -> checkAnswers()
        "3" -> exit()
        else -> showError()
    }
}

fun exit(){
    println("Exiting...")
}

fun showError(){
    println("Non available option!")
}

fun checkAnswers() {
    println("""
        Select an option...
        1. Check all answers
        2. Display just affirmative answers
        3. Display just negative answers
        4. Display unsure answers
    """.trimIndent())

    val input = readLine()
    when (input) {
        "1" -> displayAnswers()
        "2" -> displayAnswers(ans = RESPUESTA_AFIRMATIVA)
        "3" -> displayAnswers(ans = RESPUESTA_NEGATIVA)
        "4" -> displayAnswers(ans = RESPUESTA_DUDOSA)
        else -> showError()
    }
}

fun displayAnswers(ans : String = "ALL"){
    when (ans) {
        "ALL" -> respuestas.keys.forEach { a -> println(a) }
        RESPUESTA_AFIRMATIVA -> respuestas.keys.filter { a -> a == RESPUESTA_AFIRMATIVA }.forEach { a -> println(a) }
        RESPUESTA_DUDOSA -> respuestas.keys.filter { a -> a == RESPUESTA_DUDOSA }.forEach { a -> println(a) }
        RESPUESTA_NEGATIVA -> respuestas.keys.filter { a -> a == RESPUESTA_NEGATIVA }.forEach { a -> println(a) }
        else -> showError()
    }
}

fun askQuestion(){
    println("Please, ask...")
    readLine()
    println("To that I can only say...")

    val posAnswer = respuestas.keys.random()
    println(posAnswer)
}