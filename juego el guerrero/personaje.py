class personaje:
    def __init__(self, nombre, salud):
        self.nombre = nombre
        self.salud = salud 

    def recibir_Herida(self,  cantidad):
        self.salud -= cantidad 
        print(F"{self.nombre} he recibido {cantidad} de daño. salud restante: {self.salud}")

