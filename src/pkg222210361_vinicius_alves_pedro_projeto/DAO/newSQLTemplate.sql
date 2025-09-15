/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  vinic
 * Created: 23 de nov. de 2022
 */
-- Table: public.historico

-- DROP TABLE IF EXISTS public.historico;

CREATE TABLE IF NOT EXISTS public.historico
(
    contas character varying COLLATE pg_catalog."default",
    resultados double precision
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.historico
    OWNER to postgres;
