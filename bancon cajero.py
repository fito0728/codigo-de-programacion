class figura: # se define la clase figura
    def __init__(salf, num_lados, longitud):# metodo constructor, inicialliza atrivuto
        self.num = num_lados  #almacena el numero de lados de la figura
        self.longitud = longitud # almacena la longitud de cada lado


class usuario: #se defines la clasa usuario
 def __init__(self, nombre, pin, saldo): #constructor con 3 atrivutos
    self.nombre = nombre # Nombre del usuario
    self.pin = pin # pin del usuario
    self.saldo = saldo #saldo en cuenta 
class banco: # se define la clase banco  
    def __init__(self, usuario=[]):# constructor que recibe una lista de usuario
        self.usuario = usuario # lista que almacena los clientes del banco
    def autenticar(self, nombre , pin): #metodo para autenticar usuario
        for usuario in self.usuario:# recorre la lista de usuarios
            if usuario.nombre == nombre: #si el nombre coincide
                if usuario.pin == pin: #verifica que le pin también sea correcto
                    print("Estas loqueado")
                    return True # retorna true si la autenticacion es correcta
                else:
                    print("pin incorrecto") #mansaje de error si el pin es incorrecto 
                    return False
            else:
                print("el usuario no existe")# mensaje de error usuario no existente 
                return False
            def retirar_dinero(self, nombre, saldo): #metodo para retirar el dinemro
                for usuario in self,usuario: # recorre la lista de usuario
                    if usuario.nombre == nombre: #encontrar el usuario por su nombre
                        if usuario.saldo < saldo:# si hay saldo suficiente
                            print("el saldo disponible es", usuario.saldo)# muestra el saldo actulizado
                            break
                        elif usuario.saldo >= saldo: #si hay saldo suficiente 
                            usuario.saldo -= saldo # resta el saldo solicitado
                            print("el saldo disponible es", usuario.saldo)# muesta el saldo actulizado
            
ana = usuario('ana', 9872, 450) #usuario ana con 450 de saldo
pablo = usuario('pablo', 5555, 200 )# usuario pable con saldo 200
rodrigo = usuario('rodrigo', 2222, 900) #usuario rodrigo con saldo 900

banco = banco(usuario=[ana, pablo, rodrigo])# se crea con los usuario registrado
while True: # bucle infinito para que el sistemas siga funcionado 
    print('bienvenido al banco. por favor, identifiquese.')
    print('introduzca el nombre')
    nombre =input() #se solicita el nombre
    print('introduzca el pin')
    pin = int(input())# se solicita el pin (convertido a entero)
    if banco.autenticar(nombre, pin):# si el usuario se autentica correctamente
        while True:
            print('por porfavor, elija una de estas opciones. \n1. sacar retirar dinero.terminat sesion')
            opcion = input() # se solicita una opcion al usuario 

            if opcion == '1': # si elige retirar dinero
                print("introduce cantidad a retirar")
                saldo = int(input())# se solicita cantidad
                banco.retirar_dinero(nombre, saldo)# se intenta retirar dinero 
            if opcion == '2': # si elige salir 
                print("salida del sistema")
                break #rompe el bucle interno y vuelve al inicio
            else:
                print('error pin incorrecto intente de nuevo')   

                        
    else:
                print('error usuario no exisite intente de nuevo')   
   
