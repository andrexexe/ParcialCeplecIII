class Empleado(nombre:String,  apellido:String, identificacion:String,  estadocivil:String,var añoFacultad:Int,var numeroDespacho:String)
    :Persona(nombre, apellido, identificacion,estadocivil){

        fun reasignacionDespacho(nuevoDespacho: String) {
            numeroDespacho = nuevoDespacho
        }

    fun ver1() {
        println(
            """
                Empleado
            nombre = ${nombre}
            apellido =${apellido}
            identificacion=${identificacion}
            estadocivil=${estadocivil}
            añoFacultad=${añoFacultad}
            numero Despacho=${numeroDespacho}
            
            
        """.trimIndent()
        )
    }





    }