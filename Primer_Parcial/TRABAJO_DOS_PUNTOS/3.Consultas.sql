-------------------------------CONSULTAS-----------------------------------
--Se requiere una consulta histórica de costos cobrados por servicio: nombre de anciano, año, servicio y costo.
select 
anciano.nombre_anciano as nombre_anciano,
servicio.tipo_servicio as servicio,
servicio.costo_servicio,
servicio.fecha_servicio
from anciano 
inner join plantilla_registro on anciano.id_anciano = plantilla_registro.id_anciano
inner join factura on plantilla_registro.id_factura = factura.id_factura
inner join detalles_servicio on factura.id_factura = detalles_servicio.id_factura
inner join servicio on detalles_servicio.id_servicio = servicio.id_servicio

--Se requiere una consulta histórica por personal de tratamiento: nombre de empleado, tratamiento, año de tratamiento

select
empleado.nombre_empleado as nombre_profesional,
empleado.especializacion_empleado as tipo_de_tratamiento,
plantilla_registro.anio_registro as año_tratamiento
from empleado
inner join empleado_anciano on empleado.id_empleado = empleado_anciano.id_empleado
inner join anciano on empleado_anciano.id_anciano = anciano.id_anciano
inner join plantilla_registro on anciano.id_anciano = plantilla_registro.id_anciano
where anio_registro >='2019-01-01' and anio_registro <='2019-12-31'

--Se requiere una consulta histórica que muestre la revision médica: nombre_doctor, año, paciente

select 
empleado.nombre_empleado,
empleado.apellido_empleado,
anciano.nombre_anciano,
plantilla_registro.anio_registro
from empleado
inner join empleado_anciano on empleado.id_empleado = empleado_anciano.id_empleado
inner join anciano on empleado_anciano.id_anciano = anciano.id_anciano
inner join plantilla_registro on anciano.id_anciano = plantilla_registro.id_anciano
where nombre_empleado='William Steven'

--Se necesita conocer los eventos recreativos: nombre de evento, año, ancianos.

select 
anciano.nombre_anciano ,
servicio.tipo_servicio as nombre_evento,
servicio.fecha_servicio as fecha
from anciano 
inner join plantilla_registro on anciano.id_anciano = plantilla_registro.id_anciano
inner join factura on plantilla_registro.id_factura = factura.id_factura
inner join detalles_servicio on factura.id_factura = detalles_servicio.id_factura
inner join servicio on detalles_servicio.id_servicio = servicio.id_servicio
Where tipo_servicio='Actividades recreativas'