DROP TABLE FLOW_PROCESS_FILE;;

CREATE TABLE FLOW_PROCESS_FILE(
    FILE_ VARCHAR2(50) NOT NULL,
    CONTENT_ CLOB NOT NULL,
    CREATED_BY VARCHAR2(32) NOT NULL,
    CREATED_TIME TIMESTAMP NOT NULL,
    UPDATED_BY VARCHAR2(32),
    UPDATED_TIME TIMESTAMP,
    PRIMARY KEY (FILE_)
);;

COMMENT ON TABLE FLOW_PROCESS_FILE IS '流程文件表';;
COMMENT ON COLUMN FLOW_PROCESS_FILE.FILE_ IS '文件';;
COMMENT ON COLUMN FLOW_PROCESS_FILE.CONTENT_ IS '内容';;
COMMENT ON COLUMN FLOW_PROCESS_FILE.CREATED_BY IS '创建人';;
COMMENT ON COLUMN FLOW_PROCESS_FILE.CREATED_TIME IS '创建时间';;
COMMENT ON COLUMN FLOW_PROCESS_FILE.UPDATED_BY IS '更新人';;
COMMENT ON COLUMN FLOW_PROCESS_FILE.UPDATED_TIME IS '更新时间';;

