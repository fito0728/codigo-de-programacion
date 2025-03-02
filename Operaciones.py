# Solicitar valores al usuario y convertirlos en enteros
A = int(input('Ingrese el primer valor: '))
B = int(input('Ingrese el segundo valor: '))

# Realizar operaciones matemáticas básicas
suma = A + B
resta = A - B
multi = A * B

# Manejo de división para evitar error si B es 0
if B != 0:
    div = A / B
else:
    div = "No se puede dividir por 0"

# Comparaciones entre los números
igual = A == B
mayor = A > B
menor = A < B

# Mostrar los resultados en consola
print('\n--- Resultados ---')
print(f'La suma de los números es: {suma}')
print(f'La resta de los números es: {resta}')
print(f'La multiplicación de los números es: {multi}')
print(f'La división de los números es: {div}')

if igual:
    print('Ambos números son iguales.')
else:
    print(f'El número menor es: {A if menor else B}')
    print(f'El número mayor es: {A if mayor else B}')


