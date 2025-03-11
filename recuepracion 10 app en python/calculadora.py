# Definimos la función que realizará las operaciones
def calcular(a, b, operacion):
    if operacion == "+":  # Suma
        return a + b
    elif operacion == "-":  # Resta
        return a - b
    elif operacion == "*":  # Multiplicación
        return a * b
    elif operacion == "/":  # División con verificación para evitar división por cero
        return a / b if b != 0 else "Error: División por cero"
    else:
        return "Operación no válida"

# Solicitamos los datos al usuario
a = float(input("Ingrese el primer número: "))
b = float(input("Ingrese el segundo número: "))
op = input("Ingrese la operación (+, -, *, /): ")

# Mostramos el resultado llamando a la función
print("Resultado:", calcular(a, b, op))
