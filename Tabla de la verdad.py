# Declaración de variables booleanas
a = True
b = False

# Operación lógica AND: Solo es True si ambas son True
print(a and b)  # False, porque b es False

# Declaración de variables numéricas
a = 2
b = 3
c = 4
d = 10

# Evaluación de condiciones con operadores lógicos
print(a == b and c < d)  
# False, porque a == b (2 == 3) es False, aunque c < d (4 < 10) es True, el AND necesita ambas condiciones True.

print(not a == b and c > d)
# False, porque not a == b (not 2 == 3) es True, pero c > d (4 > 10) es False. Con AND ambas deben ser True para que sea True.
