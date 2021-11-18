-- Crear un trigger capaz de impedir que se creen nuevos servicios en un
mes para un anciano el cual no ha cancelado los pagos pendientes:

--Creacion de la funcion
create or replace function tg_sadana() returns trigger
as
$tg_sadana$
declare
cancelado_r BOOLEAN;
begin
select cancelado into cancelado_r from factura 
where cancelado=new.cancelado;
if (cancelado_r=TRUE ) then
raise notice 'Registrado!';
else
raise EXCEPTION 'No se aceptan nuevos registro de servicios! ';
return new;
end if;
end;
$tg_sadana$
language 'plpgsql';

--Creación del trigger
create trigger tg_sadana after insert
on factura for each row
execute procedure tg_sadana();

--COMPROBACIÓN
insert into factura values (1804, '2021-05-13', 'Tarjeta de crédito', 'No cancelado', 100, false)
