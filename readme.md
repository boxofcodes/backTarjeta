## Spring Challenge ELDAR

#### Ejecutalo

    mvwn spring-boot:run

Entrar a localhost:8083

### Introducción

Se ha solicitado el diseño de un sistema para procesar operaciones con tarjetas de crédito para una organización. Dicho sistema debe disponer de un módulo que permita con las siguientes consideraciones, desarrollar un aplicativo:

> Una tarjeta se identifica de acuerdo a:

    1) la marca.
    2) número de tarjeta.
    3) cardholder(nombre y apellido)
    4) fecha de vencimiento

> Una operación es válida en el sistema si la persona que opera en el mismo consume menos de 1000 pesos

> Una tarjeta es válida para operar si su fecha de vencimiento es mayor al presente día

> Hoy en día, existen tres marcas de tarjeta de crédito, a saber: “VISA”, “NARA”,“AMEX” y es posible que en los siguientes meses existan nuevas marcas.

> Cada marca tiene un modo de calcular una tasa por el servicio que es desde 0.3% hasta 5%, a saber:
>
> > Tasa VISA = año / mes (Ejemplo: 20/12)
> > Tasa NARA = dia del mes _0.5 (Ejemplo: 27 _ 0.5)
> > Tasa AMEX = mes*0.1 (Ejemplo: 9*0.1)

### Ejercitación

1. Crear una clase ejecutable con 3 objetos que haga lo siguiente:
   Invocar un método que devuelva toda la información de una tarjeta
   Informar si una operación es valida
   Informar si una tarjeta es válida para operar
   Identificar si una tarjeta es distinta a otra
   Obtener por medio de un método la tasa de una operación informando marca e importe
   IMPORTANTE: Realizar el correspondiente manejo de excepciones en casos de error.

2. Implementar una API REST, que responda y reciba en formato JSON, que permita:

   > Consultar la tasa de una operación, informando marca de la tarjeta e importe.

   > Hostear solución en algún cloud computing libre e indicar URL

   IMPORTANTE: Compartir código en GIT con la solución de ambos ejercicios

### Swagger

> Swagger view
> http://localhost:8083/swagger-ui.html

### Dockerizando

Limpiar el Proyecto

> Maven clean

    > $ mvn clean

    > $ mvn install

> Create Dockerfile (In source Proyect)

> Lanzar el Docker Build

    > $ docker build -t "eldar-java" .

    > $ docker run --name eldar-springboot-docker -p 8083:8083 eldar-java

### Observe el Funcionamiento del Backend

    > $ docker logs -f --tail 50 eldar-springboot-docker

# BoxOfCodes.com

#### Este es mi Dominio con el cual realizare el deploy

#### Con la IMAGEN que creamos del proyecto procedemos a comprimirla para enviarla a nuestro hosting.

$ docker save -o /home/sebastian/Desktop/ELDAR/dockerimages/eldar-java.tar eldar-java

#### Envio al server a la carpeta designada

$ rsync -avz eldar-java.tar root@boxofcodes.com:/root/dockerImages

#### Accedemos por terminal a nuestro Hosting y descomprimimos la imagen que enviamos

$ docker load -i eldar-java.tar

> Una ves descomprimida; verificamos con el siguiente comando

    > $ docker image ls

> Construimos nuestro nuevo contenedor para comenzar su utilizacion

    > $ docker run --name eldar-springboot-docker -p 8083:8083 eldar-java

#### Esta API se conectara directamente a otro container MYSQL que levante para este Challenge.

### Subdominio de Prueba

> http://api.boxofcodes.com

### Swagger en el siguiente Link para revisar nuestra API

> http://api.boxofcodes.com/swagger-ui.html

### IONIC

#### Subdominio de Prueba

> http://app.boxofcodes.com/

> docker build -t eldar-ionic .

> docker run --name eldar-ionic-docker -p 8084:80 eldar-ionic

> docker save -o /home/sebastian/Desktop/ELDAR/dockerimages/eldar-ionic.tar eldar-ionic

> rsync -avz eldar-ionic.tar root@boxofcodes.com:/root/dockerImages

> docker load -i eldar-java.tar

> docker run --name eldar-ionic-docker -p 8084:80 eldar-ionic

