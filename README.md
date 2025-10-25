# 🏦 Sistema Web Banking

Un sistema de banca en línea desarrollado en Java con interfaz gráfica Swing que simula las funcionalidades básicas de una aplicación bancaria moderna.

## 📋 Descripción

Este proyecto es una aplicación de escritorio que permite a los usuarios gestionar sus cuentas bancarias, realizar transacciones, pagar servicios y administrar tarjetas de crédito de manera digital. Desarrollado como proyecto académico para demostrar conceptos avanzados de Programación Orientada a Objetos.

## ✨ Características Principales

- 🔐 **Sistema de autenticación seguro** con control de intentos
- 💰 **Gestión de cuentas** (Corriente y Caja de Ahorro)
- 🔄 **Transferencias** entre cuentas
- 💳 **Manejo de tarjetas de crédito**
- 🧾 **Pago de servicios** públicos (ESSAP, ANDE, COPACO)
- 📊 **Historial de transacciones**
- 🎨 **Interfaz gráfica moderna** y fácil de usar

## 🛠️ Tecnologías Utilizadas

- **Lenguaje:** Java 1.8+ (compatible hasta Java 18)
- **GUI:** Java Swing con NetBeans Form Designer
- **Persistencia:** En memoria (datos de prueba predefinidos)
- **Build Tool:** Apache Ant
- **IDE:** NetBeans (recomendado)

## 📁 Estructura del Proyecto

```
📁 GUIWebBanking/
├── 📁 src/
│   ├── 📁 clasesSWB/          # Modelo de datos y lógica de negocio
│   │   ├── Cliente.java
│   │   ├── Cuenta.java
│   │   ├── Transaccion.java
│   │   ├── Transferencia.java
│   │   ├── TarjetaCredito.java
│   │   ├── Servicios.java
│   │   └── PersistenceManager.java
│   ├── 📁 Contenidos/         # Paneles de funcionalidades
│   │   ├── Inicio.java
│   │   ├── PanelMiCuenta.java
│   │   ├── PanelDeposito.java
│   │   ├── PanelTransferencia.java
│   │   ├── PanelPagos.java
│   │   └── PanelHistorial.java
│   ├── 📁 guiwebbanking/      # Ventanas principales
│   │   ├── GUI.java
│   │   ├── Login.java
│   │   └── VentanaPrincipal.java
│   ├── 📁 Interfaces/         # Interfaces del sistema
│   └── 📁 imagenes/           # Recursos gráficos
├── 📁 nbproject/              # Configuración NetBeans
├── 📁 build/                  # Clases compiladas
├── build.xml                  # Script de construcción Ant
└── README.md                  # Este archivo
```

## 🚀 Instalación y Ejecución

### Prerrequisitos

- ☕ **Java JDK 8 o superior** instalado
- 🐜 **Apache Ant** (opcional, para build automático)
- 🖥️ **NetBeans IDE** (recomendado)

### Opción 1: Ejecutar desde NetBeans (Recomendado)

1. Abre NetBeans IDE
2. Ve a `File → Open Project`
3. Navega a la carpeta del proyecto y selecciónala
4. Haz clic en `Open Project`
5. Presiona `F6` o haz clic en el botón ▶️ `Run Project`

### Opción 2: Compilar y ejecutar manualmente

1. **Clonar/Descargar el proyecto:**
   ```bash
   # Navegar a la carpeta del proyecto
   cd "ruta/al/proyecto/GUIWebBanking"
   ```

2. **Compilar las clases:**
   ```bash
   # Crear directorio para clases compiladas
   mkdir -p build/classes
   
   # Compilar todos los archivos Java
   javac -d build/classes -sourcepath src src/clasesSWB/*.java src/guiwebbanking/*.java src/Contenidos/*.java src/Interfaces/*.java
   ```

3. **Ejecutar la aplicación:**
   ```bash
   java -cp "build/classes;src" guiwebbanking.GUI
   ```

### Opción 3: Usar Apache Ant

```bash
# Compilar el proyecto
ant compile

# Ejecutar el proyecto
ant run
```

## 👤 Credenciales de Prueba

El sistema viene con datos predefinidos para pruebas. Puedes usar cualquiera de estas cuentas:

### Cliente 1: Maria Cielito Melgarejo Baez
| Número de Cuenta | PIN  | Tipo de Cuenta   | Saldo |
|------------------|------|------------------|-------|
| `111`            | `2222` | Cuenta Corriente | 6,000 |
| `444`            | `5555` | Caja de Ahorro   | 3,000 |

### Cliente 2: Manuel Agüero
| Número de Cuenta | PIN  | Tipo de Cuenta   | Saldo |
|------------------|------|------------------|-------|
| `222`            | `6666` | Cuenta Corriente | 9,000 |
| `333`            | `8888` | Caja de Ahorro   | 4,000 |

## 🎮 Cómo Usar el Sistema

1. **Iniciar Sesión:**
   - Ejecuta la aplicación
   - Ingresa un número de cuenta (ej: `111`)
   - Ingresa el PIN correspondiente (ej: `2222`)
   - Haz clic en "Ingresar"

2. **Navegar por las Funcionalidades:**
   - **Inicio:** Dashboard con información general
   - **Mi Cuenta:** Detalles personales y de la cuenta
   - **Depósito:** Agregar dinero a tu cuenta
   - **Transferencia:** Enviar dinero a otras cuentas
   - **Pagos:** Pagar tarjetas y servicios
   - **Historial:** Ver todas tus transacciones

3. **Realizar Transacciones:**
   - Selecciona la operación deseada
   - Ingresa los datos requeridos
   - Confirma con tu PIN de transacción
   - ¡Listo! La operación se procesará inmediatamente

## 🔒 Características de Seguridad

- **Autenticación de doble factor:** PIN de cuenta + PIN de transacción
- **Control de intentos:** Máximo 3 intentos fallidos antes del bloqueo
- **Validación de fondos:** Verificación automática de saldo suficiente
- **Mensajes de error informativos** para guiar al usuario

## 🏗️ Arquitectura del Sistema

### Patrones de Diseño Implementados:
- **MVC (Modelo-Vista-Controlador):** Separación clara entre lógica y presentación
- **Composición:** TarjetaCredito contiene PagoTarjeta
- **Herencia:** Transferencia extiende Transaccion
- **Interface:** Estandarización de paneles con Interface_Panel

### Componentes Principales:
- **PersistenceManager:** Gestiona todos los datos en memoria
- **GUI:** Punto de entrada de la aplicación
- **Login:** Sistema de autenticación
- **VentanaPrincipal:** Ventana principal con navegación por pestañas

## 🐛 Solución de Problemas

### Problema: "ant no se reconoce como comando"
**Solución:** Instala Apache Ant y agrégalo al PATH del sistema.

### Problema: Error de versión de Java
**Solución:** Asegúrate de tener JDK 8 o superior instalado.

### Problema: Error al cargar imágenes
**Solución:** Ejecuta desde NetBeans o asegúrate de incluir `src` en el classpath.

### Problema: Cuenta bloqueada
**Solución:** Reinicia la aplicación (los datos se resetean al ser un sistema en memoria).

## 📚 Funcionalidades Detalladas

### 💰 Gestión de Depósitos
- Agregar dinero a tu cuenta
- Validación de montos positivos
- Actualización inmediata del saldo

### 🔄 Sistema de Transferencias
- Transferir entre cuentas del sistema
- Agregar comentarios opcionales
- Validación de cuentas de destino

### 🧾 Pago de Servicios
- **ESSAP** (Empresa de Servicios Sanitarios del Paraguay)
- **ANDE** (Administración Nacional de Electricidad)
- **COPACO** (Compañía Paraguaya de Comunicaciones)

### 💳 Gestión de Tarjetas
- Pagar tarjetas propias
- Pagar tarjetas de terceros
- Control de límites y deudas

## 🤝 Contribuciones

Este es un proyecto académico, pero las contribuciones son bienvenidas:

1. Fork el proyecto
2. Crea una rama para tu feature (`git checkout -b feature/nueva-funcionalidad`)
3. Commit tus cambios (`git commit -am 'Agregar nueva funcionalidad'`)
4. Push a la rama (`git push origin feature/nueva-funcionalidad`)
5. Abre un Pull Request

## 📄 Licencia

Este proyecto es de uso académico y educativo. Desarrollado como parte del curso de Lenguajes de Programación 2 (LP2).

## 👥 Autores

- **MAN-U** - Desarrollo principal
- **Maria Melgarejo** - PersistenceManager y gestión de datos
- **Iván Figueredo** - Módulo de servicios

## 📞 Soporte

Si tienes problemas con la ejecución del proyecto:

1. Verifica que tienes Java instalado correctamente
2. Asegúrate de que la versión de Java sea compatible
3. Revisa que todas las rutas estén correctas
4. Consulta la sección de solución de problemas

---

⭐ **¡No olvides dar una estrella si este proyecto te fue útil!** ⭐

---

**Última actualización:** Octubre 2025