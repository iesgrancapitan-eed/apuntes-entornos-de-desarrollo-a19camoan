# Tipos de pruebas

## Índice:
1. [Pruebas estáticas y dinámicas.](#uno)
1. [Estrategias de pruebas dinámicas: caja blanca y caja negra.](#dos)
1. [Caja blanca. En qué consiste y principales técnicas.](#tres)
1. [Caja negra. En qué consiste y principales técnicas.](#cuatro)
1. [Pruebas funcionales y no funcionales.](#cinco)
1. [Tipos de pruebas funcionales.](#seis)
1. [Tipos de pruebas no funcionales.](#siete)
1. [Pruebas unitarias. Definición y Características.](#ocho)
1. [Pruebas de regresión.](#nueve)

## 1. Pruebas estáticas y dinámicas.<a id="uno"></a>
Las estáticas son un tipo de técnicas que no ejecutan la aplicación. Se llevan a cabo a nivel de especificaciones. No ejecutan código, pero si realizarán un análisis estático del código.

Las dinámicas por el contrario son realizadas ejecutando el código. Se divide en pruebas de caja blanca y caja negra.

*[Fuente](https://moodle.iesgrancapitan.org/pluginfile.php/35834/mod_assign/introattachment/0/PFC_JOSE_MANUEL_SANCHEZ_PENO_3.pdf?forcedownload=1)*

## 2. Estrategias de pruebas dinámicas: caja blanca y caja negra.<a id="dos"></a>
## 3. Caja blanca. En qué consiste y principales técnicas.<a id="tres"></a>
Es una técnica de diseño de casos de prueba que usa la estructura de control para obtener los casos de prueba.
Principales técnicas: pruebas de ruta básica, pruebas de ciclos o bucles, pruebas de condición y condición múltiple.

## 4. Caja negra. En qué consiste y principales técnicas.<a id="cuatro"></a>
Son las que utilizan el análisis de la especificación, tanto funcional como no funcional, sin tener en cuenta la estructura interna del programa para diseñar los casos de prueba y, a diferencia de las pruebas de caja blanca, estas pruebas se suelen realizar durante las últimas etapas de la prueba.
Principales técnicas: partición de equivalencia, análisis del valor limite, pruebas de tabla de decisión, pruebas de transición de estado, pruebas de caso de uso.

## 5. Pruebas funcionales y no funcionales.<a id="cinco"></a>
Pruebas funcionales, este tipo de pruebas se basa en las funcionalidades de un sistema que se describen en la especificación de requisitos, es decir, lo que hace el sistema. También pueden no estar documentadas pero se requiere un nivel de experiencia elevado para interpretar estas pruebas.
Pruebas no funcionales, este tipo de pruebas tienen en cuenta el comportamiento externo del software, es decir cómo funciona el sistema, y se suelen utilizar técnicas de diseño de caja negra.
Al igual que las características funcionales, las características no funcionales tienen que estar definidas en las especificaciones del producto.

## 6. Tipos de pruebas funcionales.<a id="seis"></a>
Pruebas unitarias (o de unidad)
Pruebas de regresión
Pruebas de integración
Pruebas de humo (smoke test)
Pruebas del sistema
Pruebas alfa y beta
Pruebas de aceptación (validación por parte del cliente)

## 7. Tipos de pruebas no funcionales.<a id="siete"></a>
Pruebas de usabilidad
Pruebas de rendimiento
Pruebas de stress
Pruebas de seguridad
Pruebas de compatibilidad
Pruebas de portabilidad

## 8. Pruebas unitarias. Definición y Características.<a id="ocho"></a>
Hay que probar que cada unidad funcione separada de las demás unidades de código.Pruebas unitarias. Definición y Características.<a id="ocho"></a>


## 9. Pruebas de regresión.<a id="nueve"></a>
Según la regresión la podemos encontrar de tres maneras básicas.
La primera es una “regresión local” donde el cambio o corrección de errores crea un nuevo error. La segunda es una “regresión al descubierto” que ocurre cuando la modificación o corrección de errores revela un error existente. Y la tercera es una “regresión a distancia” donde una solución de un error en un componente produce otro error en otro componente del sistema.
