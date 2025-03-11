# Creamos la clase Contacto
class Contacto:
    def __init__(self, nombre, telefono):
        self.nombre = nombre  # Almacenamos el nombre
        self.telefono = telefono  # Almacenamos el teléfono

    def mostrar(self):
        """ Muestra la información del contacto """
        print(f"Nombre: {self.nombre}, Teléfono: {self.telefono}")

# Lista para almacenar los contactos
agenda = []
agenda.append(Contacto("Juan", "123456789"))
agenda.append(Contacto("María", "987654321"))

# Mostramos los contactos en la agenda
for contacto in agenda:
    contacto.mostrar()
