class Libro:
    def __init__(self, titulo, autor):
        self.__titulo = titulo
        self.__autor = autor
        self.__disponible = True

    def get_titulo(self):
        return self.__titulo

    def get_autor(self):
        return self.__autor

    def esta_disponible(self):
        return self.__disponible

    def set_disponible(self, disponible):
        self.__disponible = disponible