from personaje import personaje

class Guerrero(personaje):
    def __init__(self, nombre, salud):
        super().__init__ (nombre, salud)
        self.arma = None

    def equipar_arma(self, arma):
        self.arma = arma
        print(f"{self.nombre} arma equipoda: { arma.nombre}")

    def atacar(self, objetivo):
         if self.arma:
            print(f"{self.nombre} atacar {self.arma.nombre}")
            objetivo.recibir_Herida(self.arma.Herida)
         else:
            print(f"{self.nombre} arma no equipada")