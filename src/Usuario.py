class Usuario:
    def __init__(self, nombre, apellido, direccion):
        self.nombre = nombre
        self.apellido = apellido
        self.direccion = direccion
        self.libros_rentados = []
        self.libros_comprados = []

    def get_nombre(self):
        return self.nombre

    def get_apellido(self):
        return self.apellido

    def get_direccion(self):
        return self.direccion

    def get_libros_rentados(self):
        return self.libros_rentados

    def get_libros_comprados(self):
        return self.libros_comprados