from Libreria import Libreria


class Main:
    libreria = Libreria()
    while True:
        print("\nMenu:\n1. Registrar usuario\n2. Mostrar usuarios\n3. Usuarios que han comprado\n4. Mostrar libros\n5. Mostrar libros disponibles\n6. Mostrar libros rentados\n7. Registrar libro\n8. Rentar libro\n9. Comprar libro\n10. Devolver libro\n11. Salir")
        opcion = int(input("Ingrese una opción: "))
        if opcion == 1:
            libreria.registrar_usuario()
        elif opcion == 2:
            libreria.mostrar_usuarios()
        elif opcion == 3:
            libreria.usuarios_que_han_comprado()
        elif opcion == 4:
            libreria.mostrar_libros()
        elif opcion == 5:
            libreria.mostrar_libros_disponibles()
        elif opcion == 6:
            libreria.mostrar_libros_rentados()
        elif opcion == 7:
            libreria.registrar_libro()
        elif opcion == 8:
            libreria.rentar_libro()
        elif opcion == 9:
            libreria.comprar_libro()
        elif opcion==10:
            libreria.devolver_libro()
        elif opcion==11:
            print("Gracias por usar la libreria")