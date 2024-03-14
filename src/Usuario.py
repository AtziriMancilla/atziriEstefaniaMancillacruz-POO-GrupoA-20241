class Usuario:
    def __init__(self, nombre, apellido, direccion):
        self.nombre = nombre
        self.apellido = apellido
        self.direccion = direccion
        self.librosRentados = []
        self.librosComprados = []

    def getNombre(self):
        return self.nombre

    def getApellido(self):
        return self.apellido

    def getDireccion(self):
        return self.direccion

    def getLibrosRentados(self):
        return self.librosRentados

    def getLibrosComprados(self):
        return self.librosComprados