CREATE TABLE Data
(
  data_id uuid NOT NULL,
  data_description character varying(100) NOT NULL,
  CONSTRAINT Data_id_pk PRIMARY KEY (data_id)
)
WITH (
OIDS=FALSE
);
ALTER TABLE Data
  OWNER TO postgres;
