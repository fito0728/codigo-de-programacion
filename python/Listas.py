# Definir una lista con los días de la semana
Lista = ['Lunes', 'Martes', 'Miércoles', 'Jueves', 'Viernes', 'Sábado']

# Imprimir el quinto elemento de la lista (índice 4, ya que las listas en Python comienzan desde 0)
print(Lista[4])  # Salida: Viernes

# Volver a definir la lista y mostrar todos los elementos
Lista = ['Lunes', 'Martes', 'Miércoles', 'Jueves', 'Viernes', 'Sábado']
print(Lista)  # Salida: Lista completa

# Imprimir los primeros 3 elementos (índices del 0 al 2)
Lista = ['Lunes', 'Martes', 'Miércoles', 'Jueves', 'Viernes', 'Sábado']
print(Lista[0:3])  # Salida: ['Lunes', 'Martes', 'Miércoles']

# Crear una lista con distintos tipos de datos, incluyendo una sublista
Lista = ['Lunes', 'Martes', 'Miércoles', 'Jueves', 'Viernes', 'Sábado', 1, 2, 3, ['Esteban', 0.2, 2.25, True]]

# Imprimir los primeros 4 elementos y los primeros 3 elementos de la sublista en la posición 9
print(Lista[0:4], Lista[9][0:3])  
# Salida: ['Lunes', 'Martes', 'Miércoles', 'Jueves'] ['Esteban', 0.2, 2.25]
