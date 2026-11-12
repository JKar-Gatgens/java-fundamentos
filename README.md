# java-fundamentos

Ejercicios de fundamentos de Java escritos a mano entre agosto y noviembre de 2026, como práctica paralela a la carrera de Ingeniería en Sistemas de Computación (Universidad Fidélitas). Cada clase tiene su propio `main` y se corre por separado.

## `fundamentos/` — Maven, Java 25

| Paquete | Clase | Qué practica |
|---|---|---|
| `strings` | `ContarVocales` | Recorrer una cadena y contar vocales con `indexOf` |
| `strings` | `InvertirPalabra` | Invertir una cadena recorriéndola desde el final |
| `strings` | `Palindromo` | Comparar con `equals` y con `equalsIgnoreCase` |
| `arreglos` | `PromedioArreglo` | Recorrer un arreglo y calcular el promedio |
| `colecciones` | `ListaEspecialidades` | `ArrayList`: `add`, `contains`, `indexOf`, `remove`, `size` |
| `colecciones` | `MenuEspecialidades` | `ArrayList` y `Scanner`: menú con validación de rango |
| `colecciones` | `PacientesHashMap` | `HashMap`: `get`, `containsKey`, `put` que reemplaza, recorrido con `entrySet` |
| `colecciones` | `ContarPalabras` | Contar apariciones con `HashMap` y `getOrDefault` |
| `pilasycolas` | `ColaPacientes` | `Queue` (FIFO): `offer`, `peek`, `poll` |
| `pilasycolas` | `InvertirConPila` | `Deque` como pila (LIFO) para invertir una palabra |
| `pilasycolas` | `PilaContraCola` | La misma secuencia en una pila y en una cola |
| `excepciones` | `ValidarNumero` | `try/catch` con `InputMismatchException` y el buffer de `Scanner` |

## `spring-boot-hola/`

Primer endpoint REST con Spring Boot: `@RestController`, `@GetMapping` y `@PathVariable`. Corre en el puerto 8081: `/hola` y `/saludo/{nombre}`.

## Cómo correrlo

Abrir la carpeta `fundamentos` en IntelliJ IDEA y ejecutar el `main` de cualquier clase.

## Próximos pasos

- Extraer en métodos el código repetido (por ejemplo, `Palindromo` invierte dos cadenas con el mismo ciclo).
- Programación orientada a objetos.
- Listas enlazadas y recursión.
