# ImageViewer MVC

## Descripción
`ImageViewer` es una aplicación diseñada para la visualización de imágenes. Esta aplicación sigue el patrón arquitectónico Model-View-Controler.

## ¿Qué es Model-View-Control?
La arquitectura MVC (Modelo-Vista-Controlador) es un patrón arquitectónico de software que se utiliza para organizar el código de una manera que separa la lógica de negocio de la interfaz de usuario. 
Esto facilita la gestión del desarrollo, la prueba y el mantenimiento de aplicaciones complejas. Aquí te explico cada componente de la arquitectura MVC:

### Modelo
El Modelo representa la estructura de datos de la aplicación, así como las reglas de negocio que gobiernan el acceso a y las modificaciones de estos datos. En muchas aplicaciones, 
el modelo notifica a sus observadores (usualmente, las vistas) cuando ha habido un cambio en su estado para que puedan reaccionar actualizándose. En resumen, el modelo es responsable de:

- Acceder a la capa de almacenamiento de datos (como una base de datos).
- Definir las reglas de negocio (por ejemplo, qué usuario puede acceder a qué información).
- Mantener los datos actualizados y consistentes.

### Vista
La **Vista** es responsable de presentar los datos al usuario y, por tanto, de toda la representación gráfica de la información. 
La vista observa el modelo y se actualiza automáticamente cuando el estado del modelo cambia. Las vistas suelen incluir elementos de la interfaz de usuario como botones, menús y otros componentes con los que el usuario puede interactuar. 
No maneja la lógica de negocio ni el acceso directo a la base de datos, sino que simplemente muestra la información y envía las acciones del usuario al controlador.

### Controlador
El Controlador actúa como intermediario entre el modelo y la vista. Responde a las entradas del usuario (generalmente a través de la vista), 
procesa esas entradas (posiblemente modificando el estado del modelo) y devuelve los resultados apropiados para mostrar en la vista. 
En esencia, el controlador maneja la lógica de la aplicación y toma decisiones sobre qué acción tomar dependiendo de las señales del usuario. 
Para cumplir con esto se apoya en el patrón de diseño `Command`. Este es un patrón de diseño de comportamiento que convierte una solicitud en un objeto independiente que contiene toda la información sobre la solicitud. 
Esta transformación te permite parametrizar los métodos con diferentes solicitudes, retrasar o poner en cola la ejecución de una solicitud y soportar operaciones que no se pueden realizar.

## Características
- **Carga y visualización de imágenes**: Soporta diversos formatos de imagen para carga y visualización. (".png", ".jpeg", ".png")
- **Interfaz intuitiva**: Interfaz gráfica amigable y fácil de usar.
- **Navegación entre imágenes**: Permite a los usuarios navegar entre imágenes almacenadas en un directorio de manera circular (Cuando se llega a la útlima foto la siguiente sería la primera en la que se comenzo).

## Capturas de Pantalla
Aquí algunas capturas de pantalla de la aplicación en acción:

### Especificación del directorio
![image](https://github.com/XxMARRExX/ImageViewer_MVC/assets/95377322/11403323-d573-4a82-9976-3eaf9b0c035c)

### Navegación por los directorios
![image](https://github.com/XxMARRExX/ImageViewer_MVC/assets/95377322/9463d844-06c7-4012-bbdb-13bfb3a42952)

### Visualización de imágenes
![image](https://github.com/XxMARRExX/ImageViewer_MVC/assets/95377322/f8d2c5c1-46aa-44c6-ae54-6c78e9327999)


## Tecnologías Utilizadas
- **Java**: Lenguaje de programación usado para la lógica de la aplicación.
- **Swing**: Biblioteca de java para la interfaz gráfica de usuario.
- **Maven**: Herramienta de gestión y construcción de proyectos.
- **IntelliJ**: Entorno de desarrollo integrado.
- **Git**: Control de versiones.

## Cómo Empezar
Para ejecutar `ImageViewer MVC` en tu entorno local, sigue estos pasos:

### Prerrequisitos
- Java JDK 11 o superior.
- Maven para la construcción y gestión del proyecto.

### Instalación
1. Clona el repositorio en tu máquina local:
   ```bash
   git clone https://github.com/XxMARRExX/ImageViewer_MVC.git
   cd ImageViewer_MVC
2. Ejecuta en tu consola el comando:
   ```bash
   java -jar .\out\artifacts\ImageViewer_MVC_jar\ImageViewer_MVC.jar
