# Pedir al usuario que seleccione la figura para calcular su área
Figura = input('Seleccione la figura para calcular su área: \n\n'
               '1 para Rombo\n'
               '2 para Rectángulo\n'
               '3 para Cuadrado\n'
               '4 para Trapecio\n\n'
               'Ingrese el número de la figura: ')

# Definir la constante de PI
Pi = 3.1416
# Definir constante para divisiones
const = 2

# Evaluar la figura seleccionada usando 'match case'
match Figura:
    case '1':  # Opción para calcular el área del rombo
        Dmayor = int(input('Ingresa el valor de la diagonal mayor: '))
        Dmenor = int(input('Ingresa el valor de la diagonal menor: '))
        Area = (Dmayor * Dmenor) / const  # Fórmula corregida
        print('El área del rombo es:', Area)

    case '2':  # Opción para calcular el área del rectángulo
        Largo = int(input('Ingresa el valor del largo del rectángulo: '))
        Ancho = int(input('Ingresa el valor del ancho del rectángulo: '))
        Area = Largo * Ancho  # Fórmula correcta
        print('El área del rectángulo es:', Area)

    case '3':  # Opción para calcular el área del cuadrado
        Lado = int(input('Ingresa el valor del lado del cuadrado: '))
        Area = Lado * Lado  # Fórmula correcta
        print('El área del cuadrado es:', Area)

    case '4':  # Opción para calcular el área del trapecio
        Bmayor = int(input('Ingresa el valor de la base mayor: '))
        Bmenor = int(input('Ingresa el valor de la base menor: '))
        H = int(input('Ingrese la altura del trapecio: '))
        Area = ((Bmayor + Bmenor) * H) / const  # Fórmula correcta
        print('El área del trapecio es:', Area)

    case _:  # Opción por defecto si el usuario ingresa una opción inválida
        print("Opción no válida. Por favor, seleccione un número entre 1 y 4.")
