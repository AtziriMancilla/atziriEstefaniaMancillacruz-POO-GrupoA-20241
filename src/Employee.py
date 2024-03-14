from BankAccount import BankAccount


class Employee:
    __accounts = []
    
    def __init__(self, name, lastName, accountNumber, type):
        type = type.upper()
        if type not in ['A', 'B', 'C']:
            print("Tipo de cuenta no válido")
            return
        else:
            self.__name = name
            self.__lastName = lastName
            self.__accounts.append(BankAccount(accountNumber, type))
            print("Usuario creado con éxito")

    def get_name(self):
        return self.__name

    def get_last_name(self):
        return self.__lastName

    def get_accounts(self):
        return self.__accounts

    def agregar_cuenta(self, account, type):
        type = type.upper()
        if type not in ['A', 'B', 'C']:
            print("Tipo de cuenta no válido")
            return
        
        else:
            self.__accounts.append(BankAccount(account, type))