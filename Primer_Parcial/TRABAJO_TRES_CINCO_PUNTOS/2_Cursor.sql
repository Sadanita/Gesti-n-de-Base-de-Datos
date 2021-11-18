--Consulta hist�rica mediante cursor que realiza la b�squeda mediante el a�o, g�nero de anciano 
y servicio aplicado

do $$
declare
historico record;
cur_historico cursor for
select 
extract (year from anciano.fecha_ingreso) as A�o,
cast(anciano.genero_anciano as varchar(50)) as Genero,
count(anciano.genero_anciano) as cantidad,
servicio.tipo_servicio as TipoSevicio
from anciano
inner join plantilla_registro on anciano.id_anciano = plantilla_registro.id_anciano
inner join factura on plantilla_registro.id_factura = factura.id_factura
inner join detalles_servicio on factura.id_factura = detalles_servicio.id_factura
inner join servicio on detalles_servicio.id_servicio = servicio.id_servicio
where extract(year from fecha_ingreso) >= '2014' and  extract(year from fecha_ingreso) <='2020'
GROUP BY
anciano.genero_anciano,
servicio.tipo_servicio,
extract (year from anciano.fecha_ingreso);
begin
open cur_historico ;
fetch cur_historico into historico ;
while (found)loop
raise notice
'A�o: % 
Genero: %
Cantidad de generos: %
tipo de servicio: %
------------------------',
historico.A�o,historico.Genero,historico.cantidad,historico.TipoSevicio;
fetch cur_historico into historico;
end loop;
end $$
language plpgsql;