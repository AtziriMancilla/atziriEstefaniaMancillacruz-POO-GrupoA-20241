from Banco import Banco
class Main:
    bank = Banco()
    band = True
    print("Bienvenido al banco")
    while band:
        print("")
        print("Menu:\n1.Añadir usuarios\n2.Buscar usuario\n3.Ver todos los usuarios\n" +
              "4.Agregar/Retirar dinero\n5.Editar usuario\n6.Salir")
        opcion = int(input("Ingrese una opción: "))
        if opcion == 1:
            bank.agregar_empleado()
        elif opcion == 2:
            bank.buscar_empleado()
        elif opcion == 3:
            bank.mostrar_usuarios()
        elif opcion == 4:
            bank.agregar_retirar()
        elif opcion == 5:
            bank.editar_usuarios()
        elif opcion == 6:
            print("Gracias por usar el banco")
            band = False
        else:
            print("Ingrese una opción válida")