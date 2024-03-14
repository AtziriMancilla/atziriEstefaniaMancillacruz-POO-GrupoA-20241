class BanckAccount:
    __amount=0
    def __init__(self,account_number,type):
        self.__account_number=account_number
        self.__type=type
    
        
    def get_account_number(self):
        return self.__account_number 

    def get_type(self):
        return self.__type

    def get_amount(self):
        return self.__amount

    def agregar_dinero(self,amount):
        if self.__type=='A':
            self.agregar_dinero_a(amount)
        elif self.__type=='B':
            self.agregar_dinero_b(amount)
        else:
            self.__amount += amount
            print("Se ha agregado",amount,"a su cuenta")

    def agregar_dinero_a(self,amount):
        if self.__amount+amount<=50000:
            self.__amount+=amount
            print("Se ha agregado",amount,"a su cuenta")
        else:
            print("No se puede tener mas de 50,000 en cuenta A")

    def agregar_dinero_b(self,amount):
        if self.__amount+amount<=100000:
            self.__amount+=amount
            print("Se ha agregado",amount,"a su cuenta")
        else:
            print("No se puede tener mas de 100,000 en cuenta B")
        
    def retirar_dinero(self,amount):
        if self.__type=='A':
            self.retirar_dinero_a(amount)
            print("Se ha retirado",amount,"de su cuenta, su nuevo saldo es:",self.__amount)
        elif self.__type=='B':
            self.retirar_dinero_b(amount)
            print("Se ha retirado",amount,"de su cuenta, su nuevo saldo es:",self.__amount)
        elif self.__type=='C':
            self.retirar_dinero_c(amount)
            print("Se ha retirado",amount,"de su cuenta, su nuevo saldo es:",self.__amount)
             
    def retirar_dinero_a(self,retiro):
        if self.__amount<1000:
            print("Saldo insuficiente para retirar")
        elif self.__amount<retiro:
            print("El dinero a retirar es mayor al saldo disponible")
        else:
            self.__amount-=retiro
    
    def retirar_dinero_b(self,retiro):
        if self.__amount<5000:
            print("Saldo insuficiente para retirar")
        elif self.__amount<retiro:
            print("El dinero a retirar es mayor al saldo disponible")
        else:
            self.__amount-=retiro
    
    def retirar_dinero_c(self,retiro):
        if self.__amount<10000:
            print("Saldo insuficiente para retirar")
        elif self.__amount<retiro:
            print("El dinero a retirar es mayor al saldo disponible")
        else:
            self.__amount-=retiro