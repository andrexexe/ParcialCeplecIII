class  Estudiantes (nombre:String,  apellido:String, identificacion:String,  estadocivil:String, var curso:String)
    : Persona( nombre, apellido, identificacion,estadocivil){

    fun nuevoCurso(  nuevoCurso: String) {
        curso = nuevoCurso



    }

    override fun ver(){
        println("""
            Estudiante
            nombre = ${nombre}
            apellido =${apellido}
            identificacion=${identificacion}
            estadocivil=${estadocivil}
            curso=${curso}
            
            
            
            
        """.trimIndent())



    }






}