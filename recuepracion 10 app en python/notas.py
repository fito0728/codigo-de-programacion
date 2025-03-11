# Función para evaluar la nota de un estudiante
def evaluar_nota(nota):
    return "Aprobado" if nota >= 60 else "Reprobado"

# Pedimos la nota al usuario
nota = float(input("Ingrese la nota del estudiante: "))

# Mostramos el resultado
print("Resultado:", evaluar_nota(nota))
