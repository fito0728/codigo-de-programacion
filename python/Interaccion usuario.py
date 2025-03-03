# Solicitar al usuario su nombre completo y almacenarlo en la variable 'a'
a = str(input('Escriba sus nombres completos: '))

# Solicitar al usuario su apellido completo y almacenarlo en la variable 'b'
b = str(input('Escriba sus Apellidos completos: '))

# Solicitar al usuario su profesión y almacenarla en la variable 'c'
c = str(input('Escriba su profesión: '))

# Solicitar al usuario su año de nacimiento y almacenarlo en la variable 'd' como entero
d = int(input('Escriba su año de nacimiento: '))

# Calcular la edad restando el año de nacimiento al año actual (2025)
e = 2025 - d

# Imprimir el resultado con el formato adecuado
print('El (La)', c, a, b, 'tiene', e, 'años')
