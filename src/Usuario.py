class Usuario:
    def __init__(self, nombre, apellido, direccion):
        self.__nombre = nombre
        self.__apellido = apellido
        self.__direccion = direccion
        self.__libros_rentados = []
        self.__libros_comprados = []

    def get_nombre(self):
        return self.__nombre

    def get_apellido(self):
        return self.__apellido

    def get_direccion(self):
        return self.__direccion

    def get_libros_rentados(self):
        return self.__libros_rentados

    def get_libros_comprados(self):
        return self.__libros_comprados