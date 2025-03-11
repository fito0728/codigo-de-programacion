# Clase para representar un usuario
class Usuario:
    def __init__(self, nombre, contraseña):
        self.nombre = nombre
        self.contraseña = contraseña

usuarios = [Usuario("admin", "1234")]  # Lista de usuarios registrados

nombre = input("Ingrese su usuario: ")
contraseña = input("Ingrese su contraseña: ")

# Verificamos si el usuario está registrado
for usuario in usuarios:
    if usuario.nombre == nombre and usuario.contraseña == contraseña:
        print("Inicio de sesión exitoso")
        break
else:
    print("Usuario o contraseña incorrectos")
