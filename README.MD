# Currency Converter

Este es un proyecto simple en Java para convertir monedas utilizando la API de [ExchangeRate-API](https://www.exchangerate-api.com/). El proyecto permite al usuario introducir dos monedas y una cantidad, y luego obtener la conversión de divisas en tiempo real.

## Requisitos

- Java 11 o superior
- Maven o cualquier otro sistema de construcción para gestionar dependencias (si utilizas Gson para parsear JSON)

## Dependencias

Este proyecto utiliza la librería **Gson** para analizar las respuestas JSON de la API. Puedes agregarla en tu proyecto utilizando Maven con la siguiente dependencia:

```xml
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.8</version>
</dependency>