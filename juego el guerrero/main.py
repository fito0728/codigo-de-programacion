from guerrero import Guerrero
from hechicero import Hechicero
from espada import Espada
from conjuro import Conjuro

# Crear personajes
guerrero = Guerrero("Thorg", 100)
hechicero = Hechicero("Merlin", 80)

# Crear objetos
espada = Espada("Espada del Valor", 25)
conjuro = Conjuro("Bola de Fuego", 30)

# Equipar objetos
guerrero. equipar_arma(espada)
hechicero.aprender_conjuro(conjuro)

# Acciones del juego
guerrero. atacar(hechicero)
hechicero. lanzar_conjuro(guerrero)
