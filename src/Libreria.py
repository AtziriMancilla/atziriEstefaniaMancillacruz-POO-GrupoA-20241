from Libro import Libro
from Usuario import Usuario


class Libreria:
    def __init__(self):
        self.usuarios = []
        self.libros = []

    def registrarUsuario(self):
        print("Ingrese el nombre: ")
        nombre = input()
        print("Ingrese el apellido: ")
        apellido = input()
        print("Ingrese la dirección: ")
        direccion = input()
        self.usuarios.append(Usuario(nombre, apellido, direccion))

    def mostrarUsuarios(self):
        if not self.usuarios:
            print("No hay usuarios registrados")
        else:
            for i, usuario in enumerate(self.usuarios):
                print(f"{i + 1} |Nombre: {usuario.getNombre()} Apellido: {usuario.getApellido()} Dirección: {usuario.getDireccion()}")

    def usuariosQueHanComprado(self):
        count = 0
        j=0
        for usuario in self.usuarios:
            if usuario.getLibrosComprados():
                print(f"{count + 1} |Nombre: {usuario.getNombre()} Apellido: {usuario.getApellido()} Dirección: {usuario.getDireccion()}")
                j += 1
            count+=1
        if j == 0:
            print("Ningún usuario ha comprado")

    def mostrarLibros(self):
        if not self.libros:
            print("No hay libros registrados")
        else:
            for i, libro in enumerate(self.libros):
                print(f"{i + 1} |Título: {libro.getTitulo()} Autor: {libro.getAutor()}")

    def mostrarLibrosDisponibles(self):
        count = 0
        j=0
        for libro in self.libros:
            if libro.isDisponible():
                print(f"{count + 1} |Título: {libro.getTitulo()} Autor: {libro.getAutor()}")
                j += 1
            count+=1
        if j == 0:
            print("No hay libros disponibles")

    def mostrarLibrosRentados(self):
        count = 0
        j=0
        for libro in self.libros:
            if not libro.isDisponible():
                print(f"{count + 1} |Título: {libro.getTitulo()} Autor: {libro.getAutor()}")
                j += 1
            count += 1
        if j == 0:
            print("No hay libros rentados")

    def registrarLibro(self):
        print("Ingrese el título: ")
        titulo = input()
        print("Ingrese el autor: ")
        autor = input()
        self.libros.append(Libro(titulo, autor))

    def rentarLibro(self):
        print("Seleccione el usuario: ")
        self.mostrarUsuarios()
        opcionUs = int(input()) - 1
        print("Seleccione el libro: ")
        self.mostrarLibrosDisponibles()
        opcionLib = int(input()) - 1
        self.usuarios[opcionUs].getLibrosRentados().append(self.libros[opcionLib])
        self.libros[opcionLib].setDisponible(False)
        print(f"El usuario: {self.usuarios[opcionUs].getNombre()} ha rentado: {self.libros[opcionLib].getTitulo()}")

    def comprarLibro(self):
        print("Seleccione el usuario: ")
        self.mostrarUsuarios()
        opcionUs = int(input()) - 1
        print("Seleccione el libro: ")
        self.mostrarLibrosDisponibles()
        opcionLib = int(input()) - 1
        self.usuarios[opcionUs].getLibrosComprados().append(self.libros[opcionLib])
        self.libros.pop(opcionLib)

    def devolverLibro(self):
        print("Seleccione el usuario: ")
        self.mostrarUsuarios()
        opcionUs = int(input()) - 1
        print("Seleccione el libro: ")
        self.mostrarLibrosRentados()
        opcionLib = int(input()) - 1
        self.usuarios[opcionUs].getLibrosRentados().remove(self.libros[opcionLib])
        self.libros[opcionLib].setDisponible(True)
        print(f"El usuario: {self.usuarios[opcionUs].getNombre()} ha devuelto: {self.libros[opcionLib].getTitulo()}")


