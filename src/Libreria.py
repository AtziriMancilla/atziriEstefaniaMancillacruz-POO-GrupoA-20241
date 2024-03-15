from Libro import Libro
from Usuario import Usuario


class Libreria:
    def __init__(self):
        self.__usuarios = []
        self.__libros = []

    def registrar_usuario(self):
        print("Ingrese el nombre: ")
        nombre = input()
        print("Ingrese el apellido: ")
        apellido = input()
        print("Ingrese la dirección: ")
        direccion = input()
        self.__usuarios.append(Usuario(nombre, apellido, direccion))

    def mostrar_usuarios(self):
        if not self.__usuarios:
            print("No hay usuarios registrados")
        else:
            for i, usuario in enumerate(self.__usuarios):
                print(f"{i + 1} |Nombre: {usuario.get_nombre()} Apellido: {usuario.get_apellido()} Dirección: {usuario.get_direccion()}")

    def usuarios_que_han_comprado(self):
        count = 0
        j=0
        for usuario in self.__usuarios:
            if usuario.get_libros_comprados():
                print(f"{count + 1} |Nombre: {usuario.get_nombre()} Apellido: {usuario.get_apellido()} Dirección: {usuario.get_direccion()}")
                j += 1
            count+=1
        if j == 0:
            print("Ningún usuario ha comprado")

    def mostrar_libros(self):
        if not self.__libros:
            print("No hay libros registrados")
        else:
            for i, libro in enumerate(self.__libros):
                print(f"{i + 1} |Título: {libro.get_titulo()} Autor: {libro.get_autor()}")

    def mostrar_libros_disponibles(self):
        count = 0
        j=0
        for libro in self.__libros:
            if libro.esta_disponible():
                print(f"{count + 1} |Título: {libro.get_titulo()} Autor: {libro.get_autor()}")
                j += 1
            count+=1
        if j == 0:
            print("No hay libros disponibles")

    def mostrar_libros_rentados(self):
        count = 0
        j=0
        for libro in self.__libros:
            if not libro.esta_disponible():
                print(f"{count + 1} |Título: {libro.get_titulo()} Autor: {libro.get_autor()}")
                j += 1
            count += 1
        if j == 0:
            print("No hay libros rentados")

    def posicion_libro(self, lib):
        pos = -1
        for i in range(len(self.__libros)):
            if lib == self.__libros[i]:
                pos = i
        return pos
                
        
    def registrar_libro(self):
        print("Ingrese el título: ")
        titulo = input()
        print("Ingrese el autor: ")
        autor = input()
        self.__libros.append(Libro(titulo, autor))

    def rentar_libro(self):
        print("Seleccione el usuario: ")
        self.mostrar_usuarios()
        opcionUs = int(input()) - 1
        print("Seleccione el libro: ")
        self.mostrar_libros_disponibles()
        opcionLib = int(input()) - 1
        self.__usuarios[opcionUs].get_libros_rentados().append(self.__libros[opcionLib])
        self.__libros[opcionLib].set_disponible(False)
        print(f"El usuario: {self.__usuarios[opcionUs].get_nombre()} ha rentado: {self.__libros[opcionLib].get_titulo()}")

    def comprar_libro(self):
        print("Seleccione el usuario: ")
        self.mostrar_usuarios()
        opcionUs = int(input()) - 1
        print("Seleccione el libro: ")
        self.mostrar_libros_disponibles()
        opcionLib = int(input()) - 1
        self.__usuarios[opcionUs].get_libros_comprados().append(self.__libros[opcionLib])
        self.__libros.pop(opcionLib)
    
    def devolver_libro(self):
        print("Seleccione el usuario: ")
        self.mostrar_usuarios()
        opcionUs = int(input()) - 1
        print("Seleccione el libro: ")
        self.mostrar_libros_rentados()
        opcionLib = int(input()) - 1
        lib=self.__usuarios[opcionUs].get_libros_rentados()[opcionLib]
        self.__usuarios[opcionUs].get_libros_rentados().remove(lib)
        pos_libro=self.posicion_libro(lib)
        self.__libros[pos_libro].set_disponible(True)
        print(f"El usuario: {self.__usuarios[opcionUs].get_nombre()} ha devuelto: {self.__libros[opcionLib].get_titulo()}")



