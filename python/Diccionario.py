# Diccionario (estructura clave-valor)
# Creación de un diccionario para representar un coche con varias propiedades
coche = {'marca': 'Ford', 'color': 'rojo', 'modelo': 'sedan', 'placa': 'ROS227'}

# Imprimir el color actual del coche
print(coche['color'])  

# Cambiar el valor del color
coche['color'] = 'verde'
print(coche['color'])  # Ahora el color es verde

# Imprimir la marca actual del coche
print(coche['marca'])

# Cambiar el valor de la marca
coche['marca'] = 'Renault'
print(coche['marca'])  # Ahora la marca es Renault

# Mostrar el diccionario completo con los cambios realizados
print(coche)
