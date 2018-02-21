# Tarea No 1 De Modelos de programación 1
En esta carpeta se reunen 3 proyectos Segregación de interfaces, responsabilidad única y sustitución LISKOV
## Problemas planteados 
1. Segregación de interfaces
En una tienda de CD's de música se debe modelar los productos y cada producto tiene unas propiedades en especifico que deberá sobrescribir cada clase de CD, el problema radica 
en los DVD's ya que a parte de tener las mismas propiedades de los CDs tambien debe tener una clasificación por edades para saber que no vendes peliculas a clientes con edades
no adecuadas, pero si se utiliza la misma interface que se creo para los CDs y agregamos el nuevo metodo de edadApropiada obligaremos a los CDs a utilizar un metodo que no 
utilizará para esto será mejor crear una nueva interface que tenga este metodo y se implemente solo en la clase DVD's 

2. Responsabilidad única 
En un concesionario necesita mostrar información de sus vehiculos y de diferentes elementos que vende en él, se aplico el principio de diseño Responsabilidad única para poder 
sobre escribir el metodo de impresión y que este pueda mostrar un mensaje diferente para los vehiculos

3. Principio de sustitución de Liskov 
Se ultiliza sustitución de Liskov para solucionar el problema de que un cuadrado y un rectangulo es diferente en temas de lados.

## Integrantes
Edwin Hernández Cabrera - 20152020013
John Eddy Malagon - 20151020021
