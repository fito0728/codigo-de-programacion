class CuentaBancaria:
    def __init__(self, saldo=0):
        self.saldo = saldo

    def depositar(self, monto):
        self.saldo += monto
        print(f"Has depositado ${monto}. Saldo actual: ${self.saldo}")

    def retirar(self, monto):
        if monto > self.saldo:
            print("Fondos insuficientes")
        else:
            self.saldo -= monto
            print(f"Has retirado ${monto}. Saldo actual: ${self.saldo}")

# Creamos una cuenta con saldo inicial
cuenta = CuentaBancaria(100)

while True:
    opcion = input("Elige: (1) Consultar saldo (2) Depositar (3) Retirar (4) Salir: ")
    if opcion == "1":
        print(f"Saldo actual: ${cuenta.saldo}")
    elif opcion == "2":
        monto = float(input("Ingrese el monto a depositar: "))
        cuenta.depositar(monto)
    elif opcion == "3":
        monto = float(input("Ingrese el monto a retirar: "))
        cuenta.retirar(monto)
    elif opcion == "4":
        break
    else:
        print("Opción no válida")
