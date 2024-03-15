class Libro:
    def __init__(self, titulo, autor):
        self.titulo = titulo
        self.autor = autor
        self.disponible = True

    def get_titulo(self):
        return self.titulo

    def get_autor(self):
        return self.autor

    def esta_disponible(self):
        return self.disponible

    def set_disponible(self, disponible):
        self.disponible = disponible