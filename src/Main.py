from Libreria import Libreria


class Main:
    libreria = Libreria()
    while True:
        print("\nMenu:\n1. Registrar usuario\n2. Mostrar usuarios\n3. Usuarios que han comprado\n4. Mostrar libros\n5. Mostrar libros disponibles\n6. Mostrar libros rentados\n7. Registrar libro\n8. Rentar libro\n9. Comprar libro\n10. Devolver libro\n11. Salir")
        opcion = int(input("Ingrese una opción: "))
        if opcion == 1:
            libreria.registrarUsuario()
        elif opcion == 2:
            libreria.mostrarUsuarios()
        elif opcion == 3:
            libreria.usuariosQueHanComprado()
        elif opcion == 4:
            libreria.mostrarLibros()
        elif opcion == 5:
            libreria.mostrarLibrosDisponibles()
        elif opcion == 6:
            libreria.mostrarLibrosRentados()
        elif opcion == 7:
            libreria.registrarLibro()
        elif opcion == 8:
            libreria.rentarLibro()
        elif opcion == 9:
            libreria.comprarLibro()
        elif opcion==10:
            libreria.devolverLibro()
        elif opcion==11:
            print("Gracias por usar la libreria")