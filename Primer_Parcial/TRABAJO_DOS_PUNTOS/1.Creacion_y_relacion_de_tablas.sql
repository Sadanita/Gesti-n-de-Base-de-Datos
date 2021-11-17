/*==============================================================*/
/* DBMS name:      PostgreSQL 8                                 */
/* Created on:     10/11/2021 22:55:21                          */
/*==============================================================*/

/*==============================================================*/
/* Table: ANCIANO                                               */
/*==============================================================*/

-----------------------------------CREACIONES DE TABLAS------------------------------
create table ANCIANO (
   ID_ANCIANO           INT4                 not null,
   CI_ANCIANO           CHAR(10)             not null,
   NOMBRE_ANCIANO       TEXT                 null,
   APELLIDO_ANCIANO     TEXT                 null,
   GENERO_ANCIANO       VARCHAR(15)          null,
   ENFERMEDADES_ANCIANO VARCHAR(50)          null,
   ALERGIAS_ANCIANO     VARCHAR(50)          null,
   TIPOSANGRE_ANCIANO   CHAR(10)             null,
   FECHA_INGRESO        DATE                 null,
   constraint PK_ANCIANO primary key (ID_ANCIANO)
);

/*==============================================================*/
/* Table: CERTIFICADO                                           */
/*==============================================================*/
create table CERTIFICADO (
   ID_CERTIFICADO       INT4                 not null,
   ID_ANCIANO           INT4                 not null,
   TIPO_CERTIFICADO     VARCHAR(20)          null,
   FECHA_CERTIFICACION  DATE                 null,
   COSTO_CERTIFICADO    MONEY                null,
   constraint PK_CERTIFICADO primary key (ID_CERTIFICADO)
);


/*==============================================================*/
/* Table: DETALLES_ESTANCIA                                     */
/*==============================================================*/
create table DETALLES_ESTANCIA (
   ID_DETALLER_ESTANCIA INT4                 not null,
   ID_ESTANCIA          INT4                 not null,
   ID_FACTURA           INT4                 not null,
   ID_REGISTRO          INT4                 not null,
   constraint PK_DETALLES_ESTANCIA primary key (ID_DETALLER_ESTANCIA)
);

/*==============================================================*/
/* Table: DETALLES_SERVICIO                                     */
/*==============================================================*/
create table DETALLES_SERVICIO (
   ID_DETALLE_SERVICIO  INT4                 not null,
   ID_FACTURA           INT4                 not null,
   ID_SERVICIO          INT4                 not null,
   constraint PK_DETALLES_SERVICIO primary key (ID_DETALLE_SERVICIO)
);


/*==============================================================*/
/* Table: EMPLEADO                                              */
/*==============================================================*/
create table EMPLEADO (
   ID_EMPLEADO          INT4                 not null,
   NOMBRE_EMPLEADO      VARCHAR(40)          null,
   APELLIDO_EMPLEADO    VARCHAR(40)          null,
   ESPECIALIZACION_EMPLEADO VARCHAR(20)          null,
   constraint PK_EMPLEADO primary key (ID_EMPLEADO)
);

/*==============================================================*/
/* Table: EMPLEADO_ANCIANO                                      */
/*==============================================================*/
create table EMPLEADO_ANCIANO (
   ID_EMPLEADO_ANCIANO  INT4                 not null,
   ID_ANCIANO           INT4                 not null,
   ID_EMPLEADO          INT4                 not null,
   constraint PK_EMPLEADO_ANCIANO primary key (ID_EMPLEADO_ANCIANO)
);


/*==============================================================*/
/* Table: ESTANCIA                                              */
/*==============================================================*/
create table ESTANCIA (
   ID_ESTANCIA          INT4                 not null,
   TIPO_ESTANCIA        TEXT                 null,
   COSTO_ESTANCIA       MONEY                null,
   constraint PK_ESTANCIA primary key (ID_ESTANCIA)
);

/*==============================================================*/
/* Table: FACTURA                                               */
/*==============================================================*/
create table FACTURA (
   ID_FACTURA           INT4                 not null,
   FECHA_FACTURA        DATE                 null,
   FORMA_PAGO           VARCHAR(40)          null,
   ESTADO_FACTURA       VARCHAR(20)          null,
   COSTO_TOTAL          MONEY                null,
   CANCELADO            BOOL                 null,
   constraint PK_FACTURA primary key (ID_FACTURA)
);

/*==============================================================*/
/* Table: FAMILIAR                                              */
/*==============================================================*/
create table FAMILIAR (
   ID_FAMILIAR          INT4                 not null,
   ID_ANCIANO           INT4                 not null,
   NOMBRE_FAMILIAR      VARCHAR(40)          null,
   APELLIDO_FAMILIAR    VARCHAR(40)          null,
   CONTACTO_FAMILIAR    CHAR(10)             null,
   constraint PK_FAMILIAR primary key (ID_FAMILIAR)
);


/*==============================================================*/
/* Table: PLANTILLA_REGISTRO                                    */
/*==============================================================*/
create table PLANTILLA_REGISTRO (
   ID_REGISTRO          INT4                 not null,
   ID_ANCIANO           INT4                 not null,
   ID_FACTURA           INT4                 not null,
   ANIO_REGISTRO        DATE                 null,
   ESTADO_SALUD         TEXT                 null,
   CON_CUERPO_BOVEDA    BOOL                 null,
   constraint PK_PLANTILLA_REGISTRO primary key (ID_REGISTRO)
);

/*==============================================================*/
/* Table: SERVICIO                                              */
/*==============================================================*/
create table SERVICIO (
   ID_SERVICIO          INT4                 not null,
   TIPO_SERVICIO        VARCHAR(40)          null,
   COSTO_SERVICIO       MONEY                null,
   FECHA_SERVICIO       DATE                 null,
   constraint PK_SERVICIO primary key (ID_SERVICIO)
);

----------------------------------RELACIONES DE LAS TABLAS-------------------------
alter table CERTIFICADO
   add constraint FK_CERTIFIC_RELATIONS_ANCIANO foreign key (ID_ANCIANO)
      references ANCIANO (ID_ANCIANO)
      on delete restrict on update restrict;

alter table DETALLES_ESTANCIA
   add constraint FK_DETALLES_RELATIONS_ESTANCIA foreign key (ID_ESTANCIA)
      references ESTANCIA (ID_ESTANCIA)
      on delete restrict on update restrict;

alter table DETALLES_ESTANCIA
   add constraint FK_DETALLES_RELATIONS_PLANTILL foreign key (ID_REGISTRO)
      references PLANTILLA_REGISTRO (ID_REGISTRO)
      on delete restrict on update restrict;

alter table DETALLES_ESTANCIA
   add constraint FK_DETALLES_RELATIONS_FACTURA foreign key (ID_FACTURA)
      references FACTURA (ID_FACTURA)
      on delete restrict on update restrict;

alter table DETALLES_SERVICIO
   add constraint FK_DETALLES_RELATIONS_FACTURA foreign key (ID_FACTURA)
      references FACTURA (ID_FACTURA)
      on delete restrict on update restrict;

alter table DETALLES_SERVICIO
   add constraint FK_DETALLES_RELATIONS_SERVICIO foreign key (ID_SERVICIO)
      references SERVICIO (ID_SERVICIO)
      on delete restrict on update restrict;

alter table EMPLEADO_ANCIANO
   add constraint FK_EMPLEADO_RELATIONS_ANCIANO foreign key (ID_ANCIANO)
      references ANCIANO (ID_ANCIANO)
      on delete restrict on update restrict;

alter table EMPLEADO_ANCIANO
   add constraint FK_EMPLEADO_RELATIONS_EMPLEADO foreign key (ID_EMPLEADO)
      references EMPLEADO (ID_EMPLEADO)
      on delete restrict on update restrict;

alter table FAMILIAR
   add constraint FK_FAMILIAR_RELATIONS_ANCIANO foreign key (ID_ANCIANO)
      references ANCIANO (ID_ANCIANO)
      on delete restrict on update restrict;

alter table PLANTILLA_REGISTRO
   add constraint FK_PLANTILL_RELATIONS_ANCIANO foreign key (ID_ANCIANO)
      references ANCIANO (ID_ANCIANO)
      on delete restrict on update restrict;

alter table PLANTILLA_REGISTRO
   add constraint FK_PLANTILL_RELATIONS_FACTURA foreign key (ID_FACTURA)
      references FACTURA (ID_FACTURA)
      on delete restrict on update restrict;