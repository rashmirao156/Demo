CREATE SCHEMA IF NOT EXISTS TRADEHUB;

DROP TABLE IF EXISTS TRADEHUB.ALADDIN_RAW_TRADES;

CREATE TABLE TRADEHUB.ALADDIN_RAW_TRADES(
    TRD_NUM BIGINT null,
    TRD_VER varchar(255) null,
    SETTL_CCY varchar(255) null,
    TXN_TM varchar(255) null,
    LAST_UPDATE_TM varchar(255) null,
    LAST_PX varchar(255) null,
    GROSS_TRD_AMT varchar(255) null,
    TRANS_TYP varchar(255) null,
    TRD_DT varchar(255) null
);