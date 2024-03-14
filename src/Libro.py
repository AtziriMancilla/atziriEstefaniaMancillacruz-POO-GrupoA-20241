class Libro:
    def __init__(self, titulo, autor):
        self.titulo = titulo
        self.autor = autor
        self.disponible = True

    def getTitulo(self):
        return self.titulo

    def getAutor(self):
        return self.autor

    def isDisponible(self):
        return self.disponible

    def setDisponible(self, disponible):
        self.disponible = disponible