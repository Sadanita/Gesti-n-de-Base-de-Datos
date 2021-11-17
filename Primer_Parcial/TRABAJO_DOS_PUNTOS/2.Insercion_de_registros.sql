---------------------------------------INSERCCIONES DE DATOS-------------------------------------
--insert into tabla anciano
insert into anciano (id_anciano,ci_anciano,nombre_anciano,apellido_anciano,genero_anciano,
enfermedades_anciano ,alergias_anciano,tiposangre_anciano,fecha_ingreso)
values 
('9901','1315625298','William Pedro','Parrales Zambrano','MASCULINO','Ipertención','Polvo','A+','2018/04/02'),
('9902','1355669789','José Pedro','Anchundia Zambrano','MASCULINO','Diabetes','Atópica','A-','2019/03/01'),
('9903','1355353457','José Carlos','Mero Zambrano','MASCULINO','Alzheimer','Farmacos','O+','2020/06/12'),
('9904','1356794767','Laura Linda','Anchundia Mero','FEMENINO','Parkison','Alergía alimentos','AB-','2017/04/02'),
('9905','1356788609','Sadana Marlid','Balcazar Solis','FEMENINO','Ipertención','Farmacos','O-','2014/03/02');
	  

--insert into tabla certificado
insert into certificado (id_certificado,id_anciano,tipo_certificado,fecha_certificacion,Costo_certificado)
values 
('3301','9901','Certi.enfermedad','2018/04/21','25'),
('3302','9905','Certi.enfermedad','2015/02/12','25'),
('3303','9901','Certi.estancia','2020/04/01','20');

--insert into table empleado
insert into empleado (id_empleado,nombre_empleado,apellido_empleado,especializacion_empleado)
values
('6601','Carla María','Pacheco Vera','Enfermera'),
('6602','Sofía Martha','Pacheco Anchundia','Enfermera'),
('6603','William Steven','Parrales Mero','Urólogo'),
('6604','Pedro Steven','Zambrano Cedeño','Medicina general');

--inser into table empleado_anciano
insert into empleado_anciano (id_empleado_anciano,id_anciano,id_empleado)
values
('5501','9901','6603'),
('5502','9903','6602'),
('5503','9904','6601'),
('5504','9905','6604'),
('5505','9902','6602'),
('5506','9905','6603');

--insert into table familiar 
insert into familiar (id_familiar,id_anciano,nombre_familiar,apellido_familiar,contacto_familiar)
values 
('4401','9901','Rodolfo Juan','Parrales Zamora','0968962577'),
('4402','9904','Carlos Sergio','Anchundia Mero','0968962577'),
('4403','9905','Enrrique Evaristo','Balcázar vera','0968964575'),
('4404','9903','Rodolfo Sebastian','Anchundia Zamora','0967992766'),
('4405','9902','Rodolfo Juan','Machuca Zamora','0968964599');

--insert into tatble factura 
insert into factura (id_factura,fecha_factura,forma_pago,estado_factura,costo_total,cancelado)
values
('1801','2019/06/21','Tarjeta de crédito','Cancelado','450','true'),
('1802','2018/04/11','Tarjeta de crédito','No Cancelado','450','false'),
('1803','2020/06/03','Tarjeta de crédito','Cancelado','450','true');

--insert into tabla plantilla_registro
insert into plantilla_registro(id_registro,id_anciano,id_factura,anio_registro,estado_salud,con_cuerpo_boveda)
values 
('2201','9901','1801','2019/04/05','Estable','true'),
('2202','9902','1803','2018/02/06','Critico','false'),
('2203','9903','1802','2019/02/02','Estable','false'),
('2204','9905','1801','2019/03/08','Critico','true'),  
('2205','9904','1803','2020/03/11','Inestable','true');

--insert into table estancia
insert into estancia(id_estancia,tipo_estancia,costo_estancia)
values
('7701','Residencia permanente','200'),
('7702','Estancia diaria-guarderia','70'),
('7703','Cuidados especiales','300'),
('7704','Postoperatorio','300');

--insert into table detalles_estancia
insert into detalles_estancia (id_detaller_estancia,id_registro,id_estancia,id_factura)
values 
('7801','2201','7704','1801'),
('7802','2203','7702','1802'),
('7803','2201','7703','1803'),
('7804','2202','7701','1801');

--insert into table servicio
insert into servicio (id_servicio,tipo_servicio,costo_servicio,fecha_servicio)
values
('8801','Actividades recreativas','50','2021/05/02'),
('8802','Terapia Física diaria','100','2018/02/11'),
('8803','instalaciones erconómicas','100','2019/03/02');

--insert insto table detalles_servicios
insert into detalles_servicio(id_detalle_servicio,id_factura,id_servicio)
values 
('1201','1801','8801'),
('1202','1802','8802'),    
('1203','1803','8803');
