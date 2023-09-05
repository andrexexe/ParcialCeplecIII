open class Persona(var nombre:String, var apellido:String, var identificacion:String, var estadocivil:String) {





    fun  cambioestadocivil(nuevoEstadoCivil: String) {
        estadocivil = nuevoEstadoCivil
    }


    open  fun ver() {
        println(
            """
               Persona
            nombre = ${nombre}
            apellido =${apellido}
            identificacion=${identificacion}
            estadocivil=${estadocivil}
            
        """.trimIndent()
        )
    }



}



