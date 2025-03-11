import random
import string  # Importamos string para obtener caracteres alfanuméricos

# Función para generar una contraseña aleatoria
def generar_contraseña(longitud=8):
    caracteres = string.ascii_letters + string.digits + string.punctuation
    return ''.join(random.choice(caracteres) for _ in range(longitud))

# Mostramos la contraseña generada
print("Contraseña generada:", generar_contraseña(12))
