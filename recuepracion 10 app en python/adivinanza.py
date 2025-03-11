import random  # Importamos la librería random para generar números aleatorios

def adivina_numero():
    numero = random.randint(1, 100)  # Generamos un número aleatorio entre 1 y 100
    intentos = 0  # Contador de intentos

    while True:
        intento = int(input("Adivina el número (1-100): "))
        intentos += 1

        if intento == numero:
            print(f"¡Correcto! Adivinaste en {intentos} intentos")
            break  # Salimos del bucle si el usuario acierta
        elif intento < numero:
            print("El número es mayor")
        else:
            print("El número es menor")

# Llamamos a la función para jugar
adivina_numero()

