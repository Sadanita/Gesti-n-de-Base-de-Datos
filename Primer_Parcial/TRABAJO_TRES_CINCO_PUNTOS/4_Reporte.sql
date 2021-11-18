select
cast(sum(factura.costo_total) as numeric)as costo_total,
cast(extract (year from plantilla_registro.anio_registro) as varchar(50)) as Año

from factura

inner join plantilla_registro on factura.id_factura=plantilla_registro.id_factura
group by costo_total,
año;