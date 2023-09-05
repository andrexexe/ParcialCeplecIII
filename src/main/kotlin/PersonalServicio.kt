class PersonalServicio (nombre:String,  apellido:String, identificacion:String,  estadocivil:String, var seccion:String)
    :Persona(nombre, apellido, identificacion,estadocivil)

{

  fun trasladoSeccion(nuevoTraslado: String) {
      seccion = nuevoTraslado
  }

    fun ver3() {
        println(
            """
                Personal de Servicioo
            nombre = ${nombre}
            apellido =${apellido}
            identificacion=${identificacion}
            estadocivil=${estadocivil}
            seccion=${seccion}
            
            
            
            
        """.trimIndent()
        )
    }


    }