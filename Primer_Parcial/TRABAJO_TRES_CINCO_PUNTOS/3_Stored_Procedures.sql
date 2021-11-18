--Se desea ingresar el nombre de un especialista y que devuelva la cantidad de atenciones que realizó 
 (stored procedures)

create or replace function cantidad_anc(varchar)
returns table(CantidadAnciano numeric, FechaIngreso numeric)
as
$$
select 
cast(count(anciano) as numeric) as cantidad,
extract(year from fecha_ingreso)
from anciano
inner join empleado_anciano   on anciano.id_anciano=empleado_anciano.id_anciano
inner join empleado on empleado.id_empleado=empleado_anciano.id_empleado
where nombre_empleado=$1
group by anciano,fecha_ingreso;
$$
language sql

--Comprobacion:
select cantidad_anc('William Steven')