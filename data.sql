--------------------------------------------------------
--  File created - Thursday-November-29-2018   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table COACHH
--------------------------------------------------------

  CREATE TABLE "SPUNN"."COACHH" 
   (	"COACH_NAME" VARCHAR2(20 BYTE), 
	"COACH_ID" NUMBER, 
	"CONTRACT_YEAR" NUMBER, 
	"TEAM_ID" NUMBER
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "DBCOURSE" ;
--------------------------------------------------------
--  DDL for Table MATCHH
--------------------------------------------------------

  CREATE TABLE "SPUNN"."MATCHH" 
   (	"MATCH_ID" NUMBER, 
	"DATES" VARCHAR2(20 BYTE), 
	"STADIUM_ID" NUMBER, 
	"HOME_TEAM" VARCHAR2(20 BYTE), 
	"AWAY_TEAM" VARCHAR2(20 BYTE), 
	"H_TEAM_ID" NUMBER, 
	"A_TEAM_ID" NUMBER, 
	"RESULT" NUMBER, 
	"SUSPENSION" NUMBER
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "DBCOURSE" ;
--------------------------------------------------------
--  DDL for Table MATCHH_RESULTS
--------------------------------------------------------

  CREATE TABLE "SPUNN"."MATCHH_RESULTS" 
   (	"ATTENDANCE" NUMBER, 
	"RESULT" VARCHAR2(20 BYTE), 
	"MAN_OF_THE_MATCH" NUMBER, 
	"RESULT_ID" NUMBER
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "DBCOURSE" ;
--------------------------------------------------------
--  DDL for Table OFFICIATESS
--------------------------------------------------------

  CREATE TABLE "SPUNN"."OFFICIATESS" 
   (	"OFF_ID" NUMBER, 
	"MATCH_ID" NUMBER, 
	"REF_ID" NUMBER
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "DBCOURSE" ;
--------------------------------------------------------
--  DDL for Table PLAYERR
--------------------------------------------------------

  CREATE TABLE "SPUNN"."PLAYERR" 
   (	"PLAYER_NAME" VARCHAR2(20 BYTE), 
	"TYPE" VARCHAR2(20 BYTE), 
	"AGE" NUMBER, 
	"NATION" VARCHAR2(20 BYTE), 
	"AWARDS" NUMBER, 
	"SALARY" NUMBER, 
	"PLAYER_ID" NUMBER, 
	"TEAM_ID" NUMBER, 
	"SUSPENSION" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "DBCOURSE" ;
--------------------------------------------------------
--  DDL for Table PLAYERR_STAT
--------------------------------------------------------

  CREATE TABLE "SPUNN"."PLAYERR_STAT" 
   (	"PLAYERID" NUMBER, 
	"PACE" NUMBER, 
	"DRIBBLING" NUMBER, 
	"PASSING" NUMBER, 
	"DEFENSE" NUMBER, 
	"PHYSIQUE" NUMBER
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "DBCOURSE" ;
--------------------------------------------------------
--  DDL for Table REFEEE
--------------------------------------------------------

  CREATE TABLE "SPUNN"."REFEEE" 
   (	"REF_ID" NUMBER, 
	"REF_TYPE" VARCHAR2(20 BYTE), 
	"REF_NAME" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "DBCOURSE" ;
--------------------------------------------------------
--  DDL for Table STADIUMM
--------------------------------------------------------

  CREATE TABLE "SPUNN"."STADIUMM" 
   (	"STADIUM_ID" NUMBER, 
	"CAPACITY" NUMBER, 
	"LOCATION" VARCHAR2(20 BYTE), 
	"TEAM_ID" NUMBER
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "DBCOURSE" ;
--------------------------------------------------------
--  DDL for Table SUSS
--------------------------------------------------------

  CREATE TABLE "SPUNN"."SUSS" 
   (	"TYPE" VARCHAR2(20 BYTE), 
	"MATCHES" NUMBER
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "DBCOURSE" ;
--------------------------------------------------------
--  DDL for Table TEAMM
--------------------------------------------------------

  CREATE TABLE "SPUNN"."TEAMM" 
   (	"TEAM_NAME" VARCHAR2(20 BYTE), 
	"GAMES_PLAYED" NUMBER, 
	"TEAM_ID" NUMBER, 
	"WINS" NUMBER, 
	"LOSS" NUMBER, 
	"DRAWS" NUMBER, 
	"GOALS_SCORED" NUMBER, 
	"GOALS_DIFFERNETIAL" NUMBER, 
	"POINTS" NUMBER, 
	"GOALS_AGAINST" NUMBER
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "DBCOURSE" ;
REM INSERTING into SPUNN.COACHH
SET DEFINE OFF;
REM INSERTING into SPUNN.MATCHH
SET DEFINE OFF;
REM INSERTING into SPUNN.MATCHH_RESULTS
SET DEFINE OFF;
REM INSERTING into SPUNN.OFFICIATESS
SET DEFINE OFF;
REM INSERTING into SPUNN.PLAYERR
SET DEFINE OFF;
REM INSERTING into SPUNN.PLAYERR_STAT
SET DEFINE OFF;
REM INSERTING into SPUNN.REFEEE
SET DEFINE OFF;
REM INSERTING into SPUNN.STADIUMM
SET DEFINE OFF;
REM INSERTING into SPUNN.SUSS
SET DEFINE OFF;
REM INSERTING into SPUNN.TEAMM
SET DEFINE OFF;
--------------------------------------------------------
--  Constraints for Table PLAYERR_STAT
--------------------------------------------------------

  ALTER TABLE "SPUNN"."PLAYERR_STAT" ADD PRIMARY KEY ("PLAYERID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "DBCOURSE"  ENABLE;
--------------------------------------------------------
--  Constraints for Table MATCHH_RESULTS
--------------------------------------------------------

  ALTER TABLE "SPUNN"."MATCHH_RESULTS" ADD PRIMARY KEY ("RESULT_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "DBCOURSE"  ENABLE;
--------------------------------------------------------
--  Constraints for Table OFFICIATESS
--------------------------------------------------------

  ALTER TABLE "SPUNN"."OFFICIATESS" ADD PRIMARY KEY ("OFF_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "DBCOURSE"  ENABLE;
--------------------------------------------------------
--  Constraints for Table STADIUMM
--------------------------------------------------------

  ALTER TABLE "SPUNN"."STADIUMM" ADD PRIMARY KEY ("STADIUM_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "DBCOURSE"  ENABLE;
--------------------------------------------------------
--  Constraints for Table PLAYERR
--------------------------------------------------------

  ALTER TABLE "SPUNN"."PLAYERR" ADD PRIMARY KEY ("PLAYER_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "DBCOURSE"  ENABLE;
--------------------------------------------------------
--  Constraints for Table TEAMM
--------------------------------------------------------

  ALTER TABLE "SPUNN"."TEAMM" ADD PRIMARY KEY ("TEAM_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "DBCOURSE"  ENABLE;
--------------------------------------------------------
--  Constraints for Table SUSS
--------------------------------------------------------

  ALTER TABLE "SPUNN"."SUSS" ADD PRIMARY KEY ("TYPE")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "DBCOURSE"  ENABLE;
--------------------------------------------------------
--  Constraints for Table MATCHH
--------------------------------------------------------

  ALTER TABLE "SPUNN"."MATCHH" ADD PRIMARY KEY ("MATCH_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "DBCOURSE"  ENABLE;
--------------------------------------------------------
--  Constraints for Table COACHH
--------------------------------------------------------

  ALTER TABLE "SPUNN"."COACHH" ADD PRIMARY KEY ("COACH_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "DBCOURSE"  ENABLE;
--------------------------------------------------------
--  Constraints for Table REFEEE
--------------------------------------------------------

  ALTER TABLE "SPUNN"."REFEEE" ADD PRIMARY KEY ("REF_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "DBCOURSE"  ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table COACHH
--------------------------------------------------------

  ALTER TABLE "SPUNN"."COACHH" ADD FOREIGN KEY ("TEAM_ID")
	  REFERENCES "SPUNN"."TEAMM" ("TEAM_ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table MATCHH_RESULTS
--------------------------------------------------------

  ALTER TABLE "SPUNN"."MATCHH_RESULTS" ADD FOREIGN KEY ("MAN_OF_THE_MATCH")
	  REFERENCES "SPUNN"."PLAYERR" ("PLAYER_ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table OFFICIATESS
--------------------------------------------------------

  ALTER TABLE "SPUNN"."OFFICIATESS" ADD FOREIGN KEY ("MATCH_ID")
	  REFERENCES "SPUNN"."MATCHH" ("MATCH_ID") ENABLE;
  ALTER TABLE "SPUNN"."OFFICIATESS" ADD FOREIGN KEY ("REF_ID")
	  REFERENCES "SPUNN"."REFEEE" ("REF_ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table PLAYERR
--------------------------------------------------------

  ALTER TABLE "SPUNN"."PLAYERR" ADD FOREIGN KEY ("TEAM_ID")
	  REFERENCES "SPUNN"."TEAMM" ("TEAM_ID") ENABLE;
  ALTER TABLE "SPUNN"."PLAYERR" ADD FOREIGN KEY ("SUSPENSION")
	  REFERENCES "SPUNN"."SUSS" ("TYPE") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table PLAYERR_STAT
--------------------------------------------------------

  ALTER TABLE "SPUNN"."PLAYERR_STAT" ADD FOREIGN KEY ("PLAYERID")
	  REFERENCES "SPUNN"."PLAYERR" ("PLAYER_ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table STADIUMM
--------------------------------------------------------

  ALTER TABLE "SPUNN"."STADIUMM" ADD FOREIGN KEY ("TEAM_ID")
	  REFERENCES "SPUNN"."TEAMM" ("TEAM_ID") ENABLE;
