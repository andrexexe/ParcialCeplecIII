class Profesor (nombre:String,  apellido:String, identificacion:String,  estadocivil:String ,var departamento:String)
    :Persona(nombre, apellido, identificacion,estadocivil){

   fun cambioDepartamento(nuevoDepartamento: String) {
       departamento = nuevoDepartamento
   }


    fun ver2() {
        println(
            """
                Profesor
            nombre = ${nombre}
            apellido =${apellido}
            identificacion=${identificacion}
            estadocivil=${estadocivil}
            departamento=${departamento}
            
            
            
            
        """.trimIndent()
        )
    }


}