# Función para calcular el IMC
def calcular_imc(peso, altura):
    imc = peso / (altura ** 2)  # Fórmula del IMC
    if imc < 18.5:
        estado = "Bajo peso"
    elif 18.5 <= imc < 24.9:
        estado = "Peso normal"
    elif 25 <= imc < 29.9:
        estado = "Sobrepeso"
    else:
        estado = "Obesidad"
    return imc, estado

# Solicitamos datos al usuario
peso = float(input("Ingrese su peso en kg: "))
altura = float(input("Ingrese su altura en metros: "))

# Calculamos y mostramos el resultado
imc, estado = calcular_imc(peso, altura)
print(f"Tu IMC es {imc:.2f} - Estado: {estado}")

