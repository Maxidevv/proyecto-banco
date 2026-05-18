# Sistema Bancario

## Descripción
Sistema de gestión bancaria que permite administrar clientes, cuentas, transacciones, registro de empleado, control completo, etc.

## Características
- Gestión de clientes con información personal
- Tipo de cuenta (Caja de Ahorro: Pesos y dolares)
- Sistema de transacciones
- Gestión de créditos (tarjetas)
- Control de empleados del banco
- Registro de todas las operaciones
- Validación de datos y operaciones

## Estructura del Proyecto

```
src/models/
├── Banco.java            Clase principal del banco
├── Persona.java          Clase base con datos personales
├── Cliente.java          Clientes del banco
├── Empleado.java         Empleados del banco
├── Cuenta.java           Clase base para cuentas
├── CajaDeAhorro.java     Cuenta de ahorro
├── Credito.java          Gestión de créditos
├── Transaccion.java      Registro de transacciones
├── Registro.java         Registro general del sistema
└── diagramaClasesUML.wsd Diagrama UML de clases del proyecto
```

## Clases Principales

- **Banco**: Entidad principal que gestiona todas las operaciones
- **Persona**: Clase base con datos personales (nombre, DNI, etc.)
- **Cliente**: Hereda de Persona, representa clientes del banco
- **Empleado**: Hereda de Persona, representa empleados del banco
- **Cuenta**: Clase base abstracta para las cuentas bancarias
- **CajaDeAhorro**: Tipo de cuenta de ahorro con beneficios especiales
- **Credito**: Gestión de créditos otorgados a clientes
- **Transaccion**: Registro de cada transacción realizada
- **Registro**: Sistema centralizado de registro de operaciones (datos de la cuenta y transacciones)

## Relaciones entre Clases

- Un **Banco** gestiona múltiples **Clientes**, **Empleados** y **Cuentas**
- Un **Cliente** puede tener múltiples **Cuentas**
- Cada **Cuenta** registra sus **Transacciones**
- Un **Cliente** puede tener uno o más **Créditos**
- Todas las operaciones se registran en el **Registro**

## Cómo Compilar y Ejecutar

### Compilar todas las clases:
```bash
javac -d bin/ src/models/*.java
```

### Ejecutar el programa:
```bash
java -cp bin/ src.models.Banco
```

## Requisitos
- Java 8 o superior
- JDK instalado y configurado en el PATH

## Instrucciones de Uso

1. Compilar el proyecto usando los comandos anteriores
2. Ejecutar la aplicación
3. Acceder a las funcionalidades del banco a través de la interfaz disponible (Consola)
4. Las operaciones se registran automáticamente en el sistema

## Diagrama UML

Consulte el archivo `diagramaClasesUML.wsd` para visualizar la estructura de clases y sus relaciones.

## Notas de Desarrollo

- El proyecto implementa herencia.
- Se utiliza encapsulación para proteger los datos sensibles.
- El sistema valida todas las operaciones.
- Se mantiene un registro centralizado de todas las transacciones

## Licencia
Proyecto académico

## Autores
Maxi Moncada
Matias Moyano
Maximo Zalazar
Farid Darull