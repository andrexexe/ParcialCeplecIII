fun main() {

    var opcion: Int

    do {
        println(
            """
            Menu
            1.ver estudiante
            2.ver Personal Servicio
            3.Ver Profesor
            4.Ver Empleado
            5. Reasignacion de despacho
            6.nuevo curso de estudiante
            7Cambio de departamento profesor
            8.Traslado de sección de un empleado del personal de servicio.
            
       
        """.trimIndent()
        )

        opcion = readln().toInt()


        when (opcion) {


            1 -> {
                var estudiante1 = Estudiantes("Andres", "Mendez", "100", "Soltero", "Ingles")

                estudiante1.ver()


            }

            2 -> {
                var PersonalServ1 = PersonalServicio("David", "Mendez", "101", "Casado", "1")

                PersonalServ1.ver3()
            }

            3 -> {
                var profesor1 = Profesor("Brayan", "Rozo", "1003", "Viudo", "Idiomas")
                profesor1.ver2()
            }

            4 -> {
                var empleado = Empleado("Manuel", "Velandia", "1004", "Casado", 2000, "5")
                empleado.ver1()
            }
            5->{ var empleado = Empleado("Manuel", "Velandia", "1004", "Casado", 2000, "5")
                empleado.reasignacionDespacho("10")
                empleado.ver1()

            }
            6->{
                var estudiante1 = Estudiantes("Andres", "Mendez", "100", "Soltero", "Ingles")
                estudiante1.nuevoCurso("Programacion")
                estudiante1.ver()


            }
            7->{
                var profesor1 = Profesor("Brayan", "Rozo", "1003", "Viudo", "Idiomas")
                profesor1.cambioDepartamento("Programacion")
                profesor1.ver2()

            }
            8->{      var PersonalServ1 = PersonalServicio("David", "Mendez", "101", "Casado", "1")
                PersonalServ1.trasladoSeccion("15")

                PersonalServ1.ver3()

            }

        }
    } while (opcion != 9)
}


















