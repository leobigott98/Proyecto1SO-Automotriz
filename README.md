# Proyecto 1: Mercado Automotriz en Venezuela


Problemática

Con la llegada oficial de una de las marcas de automóviles más prestigiosas del mundo a Venezuela: Ferrari, otras empresas automotrices han empezado a considerar seguir sus pasos, e incluso ir más allá, abriendo plantas de ensamblaje en el país.

Sin embargo, dado lo arriesgado de dicha decisión, las marcas han optado por contratar a desarrolladores de software que puedan crear una simulación, y así determinar la viabilidad de la apertura de una planta de ensamblaje automotriz en el país. Después de todo, marcas como Bugatti, Lamborghini y Maserati no pueden permitirse una inversión equivocada.

El objetivo de la simulación es conocer las ganancias potenciales con la producción y venta de vehículos, contrastadas con los gastos operativos que
implican mantener la planta en funcionamiento. Además, las marcas no quieren ceder ante la competencia, así que han solicitado comparar el rendimiento de su
planta de ensamblaje con la de una empresa rival, para así determinar si vale la pena realizar la inversión.

Para lograrlo, los desarrolladores de software deben presentar un Dashboard en donde se puedan visualizar los datos solicitados de forma dinámica y creativa, a su vez de permitir la manipulación del número de personal en cada planta para conocer la combinación óptima de los mismos

Lineamientos generales

1. Empleados de las plantas: A pesar de lo relevante que ha sido la automatización desde los últimos años, las plantas ensambladoras aún requieren personal especializado en cada área, al que se le debe pagar un sueldo por hora. También, cada grupo de trabajadores cuentan con una sección de almacén, la cual tiene un espacio limitado para guardar partes de vehículos ya terminadas, si la sección del almacén está llena no se pueden producir más partes. Cada planta cuenta con: último número del carnet del desarrollador + 10 empleados

Ejemplo: Desarrollador con carnet 0299, tendrá 9+10 = 19 empleados Ese número de empleados abarcan las áreas que se encuentran a continuación y a los ensambladores finales

a. Creador de chasis: Estos empleados cobran $10 la hora de trabajo (trabajen o no trabajen) y pueden generar:
i. Último número de carnet en intervalo 0 <= X < 3
1 chasis cada 2 días
ii. Último número de carnet en intervalo 3 <= X < 6
1 chasis cada 3 días
iii. Último número de carnet en intervalo 6 <= X <= 9
1 chasis cada 4 días
Su almacén tiene una capacidad máxima de 25 chasis
b. Creador de carrocería: Estos empleados cobran $13 la hora de
trabajo (trabajen o no trabajen) y pueden generar:
i. Último número de carnet en intervalo 0 <= X < 3
1 carrocería cada 2 días

ii. Último número de carnet en intervalo 3 <= X < 6
1 carrocería cada 3 días
iii. Último número de carnet en intervalo 6 <= X <= 9
1 carrocería cada 4 días
Su almacén tiene una capacidad máxima de 20 carrocerías
c. Creador de motor: Estos empleados cobran $20 la hora de trabajo
(trabajen o no trabajen) y pueden generar:
i. Último número de carnet en intervalo 0 <= X < 3
3 motores cada día
ii. Último número de carnet en intervalo 3 <= X < 6
2 motores cada día
iii. Último número de carnet en intervalo 6 <= X <= 9
1 motor cada día
Su almacén tiene una capacidad máxima de 55 motores
d. Creador de ruedas: Estos empleados cobran $8 la hora de trabajo
(trabaje o no trabaje) y pueden generar:
i. Último número de carnet en intervalo 0 <= X < 5
3 ruedas cada día
ii. Último número de carnet en intervalo 5 <= X <= 9
5 ruedas cada día
Su almacén tiene una capacidad máxima de 35 ruedas
e. Creador de accesorios: Estos empleados cobran $17 la hora de
trabajo (trabaje o no trabaje) y pueden generar:

i. Último número de carnet en intervalo 0 <= X < 5
1 set de accesorios cada 3 días
ii. Último número de carnet en intervalo 5 <= X <= 9
1 set de accesorios cada 2 días
Su almacén tiene una capacidad máxima de 10 sets de accesorios
2. Ensambladores de vehículos: Este tipo de empleados accede al almacén,
toma las partes de vehículos necesarias (dadas según la empresa con la que
se trabaje) y ensambla un vehículo, esto le toma 2 días y cobra 25$ la hora
(trabaje o no trabaje). No hay máximo de vehículos que se puedan
almacenar, ya que estos cuentan con su almacén especial

Adicionalmente, cada empresa tiene sus políticas especiales para ensamblar vehículos con accesorios, así que cada X vehículos que se ensamblen, se debe ensamblar un vehículo con accesorios. Esta política, en conjunto con las partes necesarias para ensamblar cada vehículo se encuentran anexas al final del documento

Se deben poder distribuir el total de empleados de la planta, entre los 5 tipos de creadores de partes de vehículos y los ensambladores de los mismos.

Considere que todos los empleados trabajan 24 horas al día

3. Gerente de operaciones: Solo hay uno por cada planta de ensamblaje, y su trabajo es registrar el paso de los días. Tiene acceso a un contador con los
días restantes para la entrega de los vehículos ensamblados al concesionario. Sin embargo, al Gerente de operaciones se le conoce por su fanatismo a la fórmula 1, a tal punto que las primeras 16 horas del día logra ver carreras a escondidas. Cada intervalo de 30 minutos ve carreras, y los siguientes 30 minutos trabaja revisando la contabilidad del proyecto, siguiendo el ciclo durante las primeras 16 horas del día. Las últimas 8 horas del día las invierte cambiando el contador con los días restantes para la entrega. El gerente de operaciones cobra $20 la hora esté trabajando o esté viendo carreras

4. Director de la planta: Solo hay uno por planta y se encarga de revisar cuántos días restan para la entrega de los vehículos al concesionario. El director siempre cobra $30 la hora 
a. Si el contador marca 0 días restantes, el director se encarga de enviar todos los vehículos ya ensamblados al concesionario, lo que le toma 24 horas. Una vez terminado registra la nueva ganancia de los vehículos enviados y reinicia el contador de los días restantes para entregar los vehículos, lo cual le toma un tiempo despreciable.
b. Si el contador marca 1 día o más restantes, entonces el director
trabajará con labores administrativas durante todo el día, Además,
escogerá una hora aleatoria del día en la que revisará lo que está
haciendo el gerente de operaciones por 25 minutos, si durante ese
intervalo el director descubre al gerente de operaciones viendo
carreras, le colocará una falta y descontará $50 de su sueldo

Requerimientos funcionales
- Deben hacer uso de Hilos/Threads y Semáforos/Semaphores para
plantear su solución a la problemática
- Se debe asegurar Exclusión mutua cuando se intente actualizar los valores
del almacén
- Cada planta de ensamblaje debe contar en todo momento con un empleado
de cada tipo como mínimo
- Cada empresa requiere conocer los datos más relevantes sobre la simulación
de su planta, esto incluye: ganancias en bruto, costos operativos y utilidad total de la planta. Se debe mostrar esta información a través de un
Dashboard ordenado y creativo
- Bono 10%: Mostrar en un mismo gráfico la utilidad con respecto al tiempo
de las plantas de las 2 empresas que se están comparando. Puede hacerse
uso de librerías de gráficos para Java
- Se debe hacer uso de una interfaz gráfica que permita observar y controlar
la simulación, se debe observar en todo momento:
o La cantidad de cada tipo de empleado y de ensambladores
o La cantidad disponible de cada parte de vehículo en el almacén
o La cantidad máxima de almacenaje para cada parte de vehículo en el
almacén
o La cantidad de vehículos listos para entregar de cada tipo: estándar y
con accesorios
o Los días que faltan para la entrega
o Qué está haciendo el gerente de operaciones
o Qué está haciendo el director de la planta
o La cantidad de faltas del gerente de operaciones y el dinero total
descontado de su salario

- La simulación debe permitir en tiempo de ejecución:
o Intercambiar los tipos de empleados y ensambladores dentro de la
planta, respetando la cantidad máxima y mínima de empleados
- A través de un archivo (texto, objeto, CSV o JSON), se le debe poder indicar
al programa los siguientes parámetros DESDE LA INTERFAZ:
o Duración en segundos de un día dentro de la simulación
o Cantidad de días entre las entregas de los vehículos al concesionario,
es decir, deadline de entrega
o Cantidad inicial de cada tipo de empleado y de ensambladores

Consideraciones
- El proyecto puede ser elaborado máximo por 2 personas (3 si alguno queda
solo)
- Solo se permite el uso de librerías para la realización del Bono de 10%
- Para entregar el proyecto deben enviar el repositorio de GitHub donde lo
trabajen a fin de validar el trabajo individual de cada estudiante. Es
importante que el primer commit sea un proyecto vacío. Se enviará el enlace
del repositorio a isaac.olivares@correo.unimet.edu.ve antes de las 11:59pm
del 1 de junio del 2023. Tener un repositorio en GitHub es obligatorio.
- Para la entrega, junto al código, se debe entregar un informe donde se
detalle la funcionalidad de las clases y métodos más importantes del
proyecto, no hace falta documentar todo el código. Además, los estudiantes
deben realizar un análisis de los Dashboards generados para sacar
conclusiones sobre las diferentes plantas de ensamblaje que llevarán a cabo,
como, por ejemplo: cuál es más rentable, cuál es la distribución óptima de
empleados, cuál gasta menos en personal, etc.
- El día siguiente, 2 de junio, se realizará un interrogatorio por turnos en el
laboratorio habitual. Todos los integrantes del equipo deben estar presentes
(preferiblemente con alguna de sus computadoras).
- Se recibirán proyectos al correo anteriormente indicado hasta el día 2 de
junio con una penalización de puntos, después de ese día, no será
corregido ningún proyecto.
- Los proyectos sin interfaz gráfica, serán calificados en base a 0 (cero).
- Los proyectos sin repositorio en GitHub, serán calificados en base a 0 (cero).
- Los alumnos que no asistan al interrogatorio, serán calificados en base a 0
(cero).
- Los programas que “no corran”, serán calificados en base a 0 (cero).
- Los proyectos que sean iguales o parecidos, serán calificados en base a 0
(cero).
- Los proyectos que no sean realizados en Java serán calificados en base a 0
(cero)

Comentarios
- Si se tiene cualquier duda o circunstancia, puede preguntar a través del grupo
de WhatsApp, en las prácticas o por mensaje privado al preparador
- La creatividad será tomada en cuenta al igual que el aporte individual al
proyecto. Si hay una diferencia muy grande en el número de commits de
los participantes, se descontarán puntos de aquel miembro del equipo que
haya aportado menos al proyecto

Especificaciones de las empresas automotrices
Bugatti:
- Vehículo estándar: Carrocería reforzada (2 carrocerías), chasis estándar (1
chasis), motor de 4 cilindros (4 motores), ruedas sin repuestos (4 ruedas).
Precio de venta: $550K
- Vehículo con accesorios: Después de ensamblar 5 vehículos, el siguiente
tendrá 2 sets de accesorios adicionales. Precio de venta: $600K
Lamborghini:
- Vehículo estándar: Carrocería estándar (1 carrocería), chasis reforzado (2
chasis), motor de 6 cilindros (6 motores), ruedas con repuesto (5 ruedas).
Precio de venta: $400K
- Vehículo con accesorios: Después de ensamblar 3 vehículos, el siguiente
tendrá 1 set de accesorios adicionales. Precio de venta: $750K
Maserati:
- Vehículo estándar: Carrocería estándar (1 carrocería), chasis estándar (1
chasis), motor de 2 cilindros (2 motores), ruedas sin repuesto (4 ruedas).
Precio de venta: $350K
- Vehículo con accesorios: Después de ensamblar 2 vehículos, el siguiente
tendrá 3 sets de accesorios adicionales. Precio de venta: $700K

Rolls Royce:
- Vehículo estándar: Carrocería reforzada (2 carrocería), chasis especial (3
chasis), motor de 4 cilindros (4 motores), ruedas con repuesto doble (6
ruedas). Precio de venta: $450K
- Vehículo con accesorios: Después de ensamblar 6 vehículos, el siguiente
tendrá 5 sets de accesorios adicionales. Precio de venta: $900K
