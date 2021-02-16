# Tarea 3.8: Prueba del camino básico y Eclemma (3). esMayorMenorCero.

## 1. Grafo del flujo del programa.
![grafo](./mayormenorcero_grafo.png)

## 2. Complejidad ciclomática.
Siendo:

M = Complejidad ciclomática.

E = Número de aristas del grafo. Una arista conecta dos vértices si una sentencia puede ser ejecutada inmediatamente después de la primera.

N = Número de nodos del grafo correspondientes a sentencias del programa.

P = Número de componentes conexos, nodos de salida

```
M = E − N + 2P
```
M = 8 - 7 + 2 * 1 = 3

## 3. Caminos independientes. Tabla con las siguientes columnas:
| Número del camino | Nodos/aristas del camino |  Prueba (valores de las condiciones) | Entrada (variables)  |  Salida (resultado esperado) |
|:-:| :-: | :-: | :-: | :-: |
| 1 | 1-2-4-6-7 | False-False |  0 |  CERO |
| 2 | 1-2-4-5-7 | False-True |  -100 |  MENOR |
| 3 | 1-2-3-7   | False-False |  100 |  MAYOR |

## 4. Ficheros .java del código.
[Archivo .java](./Numero.java)

## 5. Pantallazo de la vista Coverage con el 100% de cobertura en los métodos implicados (herramienta Eclemma)
![coverage](./coverage.png)
