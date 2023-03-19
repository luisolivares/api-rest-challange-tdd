# CRM Code Challenge

El challenge consiste en hacer correr los unit test implementando las funcionalidades por medio de TDD (test driven development).

El proyecto se corre con las siguientes tecnologías:

#### Maven 3.8.1
Download: https://archive.apache.org/dist/maven/maven-3/3.8.1/binaries/

#### Java 11

Amazon jdk linux: https://docs.aws.amazon.com/corretto/latest/corretto-11-ug/generic-linux-install.html

Amazon jdk windows: https://docs.aws.amazon.com/corretto/latest/corretto-11-ug/windows-7-install.html

Amazon jdk Mac: https://docs.aws.amazon.com/corretto/latest/corretto-11-ug/macos-install.html


### Se pide modificar el micro-servicio actual para:

1. Hacer un método en el controller que cree un producto nuevo en caso que no exista. En caso de intentar crear un producto existente debe retornar bad request.

2. Hacer un método para actualizar un producto. Siendo modificables los campos retail_price, discounted_price y availability. En caso de intentar modificar un producto NO existente debe retornar bad request.

3. Hacer un método para obtener un producto por id. En caso que no exista retornar not found.

4. Hacer un método para obtener productos por categoría ordenados por los campos: availability (primero los productos disponibles), por discounted_price y por id. En el caso de que no se hayan encontrado productos retornar un array vacío.

5. Hacer un método para obtener todos los productos ordenados por id.

6. Hacer un método para eliminar un producto por id.

7. Existe un método en ProductService llamado "someLongOperation", se necesita ejecutarlo en forma asíncrona con una uri ```/products/job```.
   > TIP: usar spring async con el pool de threads creado en la clase Application.


### Se recomienda seguir los siguientes lineamientos generales de REST

- POST se utiliza para crear un nuevo recurso, en caso de éxito devuelve status code CREATED (201) y sin body.

- POST se utiliza para correr un proceso asíncrono (batch, bulk), en caso de éxito devuelve status code ACCEPTED (202).

- PUT se utiliza para actualizar o crear (si no existiese) un recurso, en caso de éxito devuelve status code NO_CONTENT (204) si se actualizó el recurso o CREATED (201) si se creó uno nuevo y en ambos casos sin body.

- PATCH se utiliza para actualizar parcialmente un recurso, en caso de éxito devuelve status code NO_CONTENT (204) y sin body.

- DELETE se utiliza para eliminar un recurso, en caso de éxito devuelve status code NO_CONTENT (204) y sin body.

- GET (sin parametros) se utiliza para obtener la colección de recursos, en caso de éxito devuelve status code OK (200) y la collection en el body.

- GET (con parametros) se utiliza para obtener un recurso en particular, en caso de éxito devuelve status code OK (200) y el recurso en el body.
