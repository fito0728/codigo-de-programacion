# Clase para representar un producto
class Producto:
    def __init__(self, nombre, precio):
        self.nombre = nombre
        self.precio = precio

    def mostrar(self):
        print(f"{self.nombre}: ${self.precio}")

# Lista de productos disponibles
productos = [Producto("Camisa", 20), Producto("Pantalón", 30), Producto("Zapatos", 50)]

print("Lista de productos:")
for p in productos:
    p.mostrar()

# Solicitar al usuario el producto que desea comprar
opcion = input("Ingrese el producto que desea comprar: ").lower()

# Buscar el producto en la lista
for p in productos:
    if p.nombre.lower() == opcion:
        print(f"Has comprado {p.nombre} por ${p.precio}")
        break
else:
    print("Producto no encontrado")


