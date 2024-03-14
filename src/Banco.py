from Employee import Employee

class Banco:
    __empleados=[]
        
    def agregar_empleado(self):
        nombre=input("Ingrese el nombre: ")
        apellido=input("Ingrese el apellido: ")
        account=int(input("Ingrese el numero de cuenta: "))
        type=input("Ingrese el tipo de cuenta: ")[0]
        self.__empleados.append(Employee(nombre,apellido,account,type))
    
    def eliminar_empleado(self,empleado):
        self.__empleados.remove(empleado)
    
    def mostrar_usuarios(self):
        if len(self.__empleados)==0:
            print("No hay usuarios registrados")
        else:
            for i in range(0,len(self.__empleados)):
                self.mostrar_usuario(i)  
                
    def mostrar_usuario(self, entero):
        print("Nombre:",self.__empleados[entero].get_name(), "\nApellido:",self.__empleados[entero].get_last_name(),"\nCuentas:")
        for i in range(0,len(self.__empleados[entero].get_accounts())):
            print(self.__empleados[entero].get_accounts()[i].get_account_number())
            print("Dinero en cuenta: $",self.__empleados[entero].get_accounts()[i].get_amount())
    
    def buscar_nombre(self,nombre):
        band=True
        for i in range(0,len(self.__empleados)):
            if self.__empleados[i].get_name()==nombre:
                self.mostrar_usuario(i)
                band=False
        if band:
            print("No se encontro este usuario")
                
    def buscar_apellido(self,apellido):
        band=True
        for i in range(0,len(self.__empleados)):
            if self.__empleados[i].get_last_name()==apellido:
                self.mostrar_usuario(i)
                band=False
        if band:
            print("No se encontro este usuario")   
             
    def buscar_cuenta(self,cuenta):
        band=True
        for i in range(0,len(self.__empleados)):
            for j in range(0,len(self.__empleados[i].get_accounts())):
                self.mostrar_usuario(i)
                band=False
        if band:
            print("No se encontro la cuenta")
            
    def posicion_empleado_matriz(self,account):
        pos=[]
        for i in range(0,len(self.__empleados)):
            for j in range(0,len(self.__empleados[i].get_accounts())):
                if self.__empleados[i].get_accounts()[j].get_account_number()==account:
                    pos[0]=i
                    pos[1]=j
                    break
        return pos
    
    def posicion_empleado(self,name):
        pos=-1
        for i in range(0,len(self.__empleados)):
            for j in range(0,len(self.__empleados[i].get_accounts())):
                if self.__empleados[i].get_name()==name:
                    pos=i
                    break
        return pos  
    def buscar_empleado(self):
        opcion=int(input("Como desea buscar?\n1.Nombre\n2.Apellido\n3.Cuenta"))
        if opcion==1:
            name=input("Ingrese el nombre: ")
            self.buscar_nombre(name)
        elif opcion==2:
            apellido=input("Ingrese el nombre: ")
            self.buscar_apellido(apellido)  
        elif opcion==3:
            account=int(input("Ingrese el numero de cuenta: "))   
            self.buscar_cuenta(account)
            
    def agregar_retirar(self):
        opcion=int(input("¿De sea agregar o retirar dinero?\n1.Agregar\n2.Retirar\n3.Volver al menu"))
        if opcion==1:
            account=int(input("Ingrese la cuenta: "))
            posicion=self.posicion_empleado_matriz(account)
            cantidad=float(input("¿Cuanto desea agregar?"))
            self.__empleados[posicion[0]].get_accounts()[posicion[1]].agregar_dinero(cantidad)
        elif opcion==2:
            account=int(input("Ingrese la cuenta: "))
            posicion=self.posicion_empleado_matriz(account)
            cantidad=float(input("¿Cuanto desea retirar?"))
            self.__empleados[posicion[0]].get_accounts()[posicion[1]].retirar_dinero(cantidad)
        
    def editar_usuarios(self):
        opcion=int(input("¿Que desea hacer?: \n1.Agregar a cuenta bancaria\n2.Eliminar usuario"))
        if opcion==1:
            name=input("Ingrese el nombre del usuario")
            pos=self.posicion_empleado(name)
            account=int(input("Ingrese el numero de cuenta"))
            type=input("Ingrese el tipo de cuenta")[0]
            self.__empleados[pos].agregar_cuenta(account,type)
        elif opcion==2:         
            name=input("Ingrese el usuario que desea eliminar")
            pos=self.posicion_empleado(name)
            empleado=self.__empleados[pos]
            self.eliminar_empleado(empleado)
            print("Empleado: ",name," eliminado")