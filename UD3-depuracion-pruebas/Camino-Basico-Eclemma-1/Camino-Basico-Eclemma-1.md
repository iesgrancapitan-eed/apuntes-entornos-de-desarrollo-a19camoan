# Tarea 3.6: Prueba del camino básico y Eclemma (1) contarLetras.

## 1. Grafo del flujo del programa.
![grafo](./contarletras.png)

## 2. Complejidad ciclomática.
Siendo:

M = Complejidad ciclomática.

E = Número de aristas del grafo. Una arista conecta dos vértices si una sentencia puede ser ejecutada inmediatamente después de la primera.

N = Número de nodos del grafo correspondientes a sentencias del programa.

P = Número de componentes conexos, nodos de salida

```
M = E − N + 2P
```
M = 11 - 9 + 2 * 1 = 4

## 3. Caminos independientes. Tabla con las siguientes columnas:
| Número del camino | Nodos/aristas del camino |  Prueba (valores de las condiciones) | Entrada (variables)  |  Salida (resultado esperado) |
|:-:|:-:|:-:|:-:|:-:|
| 1 | 1-2-3-4-8-9  |  False-False |  "" / 'a' |  Entero |
| 2 | 1-2-3-5-6-8-2-3-5-7-8-9  |  True-True-True-True-False-False |  "ab" / 'a' |  Boolean |
| 3 | 1-2-3-5-8-9  |  True-True-False |  "a" / 'a' |  Entero |
| 4 | 1-2-3-5-8-9  |  True-False-False |  "b" / 'a' |  Entero |

## 4. Ficheros .java del código.
[Archivo .java](./ContarLetras.java)

## 5. Pantallazo de la vista Coverage con el 100% de cobertura en los métodos implicados (herramienta Eclemma)
![coverage](./coverage.png)
