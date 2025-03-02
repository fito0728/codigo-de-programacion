# Solicitar al usuario el valor del voltaje del circuito y convertirlo a entero
Voltaje = int(input('Ingrese el valor del voltaje del circuito: '))

# Solicitar al usuario el valor de la resistencia del circuito y convertirlo a entero
Resistencia = int(input('Ingrese el valor de la resistencia del circuito: '))

# Calcular la intensidad de corriente (Amperaje) usando la Ley de Ohm: I = V / R
Intensidad = Voltaje / Resistencia  

# Mostrar el resultado con el formato adecuado
print(f'Al conectar un resistor de R {Resistencia} ohm a una fuente de V {Voltaje} volts, circulará una corriente de {Intensidad} amperios.')
