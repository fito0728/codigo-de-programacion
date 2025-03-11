# Función para convertir temperaturas
def convertir_temp(grados, unidad):
    if unidad.lower() == "c":  # Convertir de Celsius a Fahrenheit
        return (grados * 9/5) + 32  
    elif unidad.lower() == "f":  # Convertir de Fahrenheit a Celsius
        return (grados - 32) * 5/9  
    else:
        return "Unidad no válida"

# Solicitamos datos al usuario
temp = float(input("Ingrese la temperatura: "))
unidad = input("Ingrese la unidad (C/F): ")

# Mostramos el resultado de la conversión
print("Temperatura convertida:", convertir_temp(temp, unidad))
