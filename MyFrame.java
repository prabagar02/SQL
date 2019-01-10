import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import java.sql.Connection;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Properties;

class MyFrame extends JFrame {
  public static String pid = "";  
  public  static String tn = "";
  public static String tnName = "";

  public static String playerName = "";
  public static String playerType = "";
  public static int playerAge = 0;
  public static String playerNation = "";
  public static int playerAwards = 0;
  public static int playerSalary = 0;
  public static int playerID = 0;
  public static int teamID = 0;
  public static String playerSus = "";
  public static int player_IDD = 0;

   public static JTextArea outputA = new JTextArea();

   public static void populateT() {
  
  Connection conn1 = null;
  Statement stmt = null;

        try {
            Class.forName("oracle.jdbc.OracleDriver");
            String dbURL1 = "jdbc:oracle:thin:spunn/10151087@oracle12c.scs.ryerson.ca:1521:orcl12c";  // that is school Oracle database and you can only use it in the labs
        conn1 = DriverManager.getConnection(dbURL1);
            if (conn1 != null) {
                System.out.println("Connected with database 510-Oracle, connection #1");
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println();
            
      stmt = conn1.createStatement();
     
      String  sql = "INSERT INTO TEAMM VALUES ('Liverpool',3,3,1,2,0,1,1,1,0)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO TEAMM VALUES ('Real Madrid',3,2,2,0,1,4,2,7,2)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO TEAMM VALUES ('Barcelona',4,1,3,0,0,6,6,18,0)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO TEAMM VALUES ('Manchester United',4,4,1,2,1,3,-4,2,7)";
            stmt.executeUpdate(sql);
          
            sql = "INSERT INTO COACHH VALUES ('Mourinho',1,4,4)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO COACHH VALUES ('Zidane',2,3,2)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO COACHH VALUES ('Valverde',3,4,1)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO COACHH VALUES ('Klopp',4,5,3)";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO STADIUMM VALUES (4,81044,'Santiago Bernabeu',2)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO STADIUMM VALUES (3,54074,'Anfield',3)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO STADIUMM VALUES (1,99354,'Camp Nou',1)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO STADIUMM VALUES (2,74994,'Old Trafford',4)";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO SUSS VALUES ('Low',2)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO SUSS VALUES ('Medium',5)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO SUSS VALUES ('High',10)";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO PLAYERR VALUES ('Bale','Right Wing',31,'WLS',1,22,5,2,'Low')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO PLAYERR VALUES ('Marcelo','Left Back',34,'BRZ',2,11,6,2,null)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO PLAYERR VALUES ('Pique','Centre Back',30,'SPN',1,10,7,1,null)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO PLAYERR VALUES ('Suarez','Forward',33,'URG',3,100,8,1,'Medium')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO PLAYERR VALUES ('Mane','Left Wing',29,'IND',2,90,9,3,null)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO PLAYERR VALUES ('Allison','Goalkeeper',28,'BRZ',1,90,10,3,'Medium')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO PLAYERR VALUES ('Rooney','Right Wing',34,'ENG',4,80,11,4,null)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO PLAYERR VALUES ('Giggs','Midfielder',35,'ENG',2,90,12,4,'Low')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO PLAYERR VALUES ('Ronaldo','Forward',32,'POR',2,0,1,2,'Low')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO PLAYERR VALUES ('Messi','Forward',30,'ARG',3,20,2,1,null)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO PLAYERR VALUES ('Salah','Right Wing',28,'SRB',0,0,3,3,null)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO PLAYERR VALUES ('De Gea','Goalkeeper',26,'SPN',1,20,4,4,'High')";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO REFEEE VALUES (5,'Main','John')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO REFEEE VALUES (6,'Assistant','Bob')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO REFEEE VALUES (1,'Assistant','Prabagar')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO REFEEE VALUES (2,'Main','George')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO REFEEE VALUES (3,'Main','Martin')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO REFEEE VALUES (4,'Assistant','Allen')";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO MATCHH_RESULTS (ATTENDANCE,RESULT,MAN_OF_THE_MATCH,RESULT_ID) VALUES (70534,'3-0',5,1)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO MATCHH_RESULTS (ATTENDANCE,RESULT,MAN_OF_THE_MATCH,RESULT_ID) VALUES (45063,'2-3',8,2)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO MATCHH_RESULTS (ATTENDANCE,RESULT,MAN_OF_THE_MATCH,RESULT_ID) VALUES (52890,'4-1',3,3)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO MATCHH_RESULTS (ATTENDANCE,RESULT,MAN_OF_THE_MATCH,RESULT_ID) VALUES (99230,'3-1',2,4)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO MATCHH_RESULTS (ATTENDANCE,RESULT,MAN_OF_THE_MATCH,RESULT_ID) VALUES (80727,'2-0',6,5)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO MATCHH_RESULTS (ATTENDANCE,RESULT,MAN_OF_THE_MATCH,RESULT_ID) VALUES (72899,'2-5',11,6)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO MATCHH_RESULTS (ATTENDANCE,RESULT,MAN_OF_THE_MATCH,RESULT_ID) VALUES (73245,'4-2',12,7)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO MATCHH_RESULTS (ATTENDANCE,RESULT,MAN_OF_THE_MATCH,RESULT_ID) VALUES (96389,'2-2',9,8)";
            stmt.executeUpdate(sql);

             sql = "INSERT INTO MATCHH VALUES (1,'15/10/18',4,'Real Madrid','Liverpool',2,3,1,3)";
            stmt.executeUpdate(sql);
            sql = "INSERT into MATCHH VALUES (2,'08/10/18',3,'Liverpool','Barcelona',3,1,2,0)";
            stmt.executeUpdate(sql);
            sql = "INSERT into MATCHH VALUES (3,'29/10/18',3,'Liverpool','Manchester United',3,4,3,2)";
            stmt.executeUpdate(sql);
            sql = "INSERT into MATCHH VALUES (4,'22/10/18',1,'Barcelona','Real Madrid',1,2,4,4)";
            stmt.executeUpdate(sql);
            sql = "INSERT into MATCHH VALUES (5,'08/10/18',4,'Real Madrid','Manchester United',2,4,5,5)";
            stmt.executeUpdate(sql);
            sql = "INSERT into MATCHH VALUES (6,'15/10/18',2,'Manchester United','Barcelona',4,1,6,0)";
            stmt.executeUpdate(sql);
            sql = "INSERT into MATCHH VALUES (7,'05/11/18',2,'Manchester United','Real Madrid',4,2,7,1)";
            stmt.executeUpdate(sql);
            sql = "INSERT into MATCHH VALUES (8,'05/11/18',1,'Barcelona','Liverpool',1,3,8,0)";
            stmt.executeUpdate(sql);
            sql = "INSERT into MATCHH VALUES (9,'29/10/18',4,'REAL MADRID','BARCELONA',2,1,9,0)";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO OFFICIATESS VALUES (1,1,1)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO OFFICIATESS VALUES (3,6,2)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO OFFICIATESS VALUES (5,2,1)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO OFFICIATESS VALUES (7,5,3)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO OFFICIATESS VALUES (9,3,4)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO OFFICIATESS VALUES (11,9,5)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO OFFICIATESS VALUES (13,4,3)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO OFFICIATESS VALUES (15,7,6)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO OFFICIATESS VALUES (17,8,5)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO OFFICIATESS VALUES (2,1,3)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO OFFICIATESS VALUES (4,6,4)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO OFFICIATESS VALUES (6,2,5)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO OFFICIATESS VALUES (8,5,6)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO OFFICIATESS VALUES (10,3,2)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO OFFICIATESS VALUES (12,9,1)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO OFFICIATESS VALUES (14,4,4)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO OFFICIATESS VALUES (16,7,3)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO OFFICIATESS VALUES (18,8,1)";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO PLAYERR_STAT VALUES (1,90,90,60,35,79)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO PLAYERR_STAT VALUES (2,92,93,70,40,60)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO PLAYERR_STAT VALUES (3,89,85,78,49,69)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO PLAYERR_STAT VALUES (4,88,90,95,79,70)";
            stmt.executeUpdate(sql);

        JOptionPane.showMessageDialog(null, 
                              "TABLES ARE POPULATED", 
                              "POPULATED", 
                              JOptionPane.WARNING_MESSAGE);
        

        } catch (ClassNotFoundException ex) {
          JOptionPane.showMessageDialog(null, 
                              "ERROR PLEASE TRY AGAIN", 
                              "ERROR", 
                              JOptionPane.WARNING_MESSAGE);
            //ex.printStackTrace();
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, 
                              "ERROR PLEASE TRY AGAIN", 
                              "ERROR", 
                              JOptionPane.WARNING_MESSAGE);
            //ex.printStackTrace();
        } finally {
            try {
                if (conn1 != null && !conn1.isClosed()) {
                    conn1.close();
                }
     
            } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, 
                              "ERROR PLEASE TRY AGAIN", 
                              "ERROR", 
                              JOptionPane.WARNING_MESSAGE);
                //ex.printStackTrace();
            }
        }
      
}

   public static void createT() {
  
  Connection conn1 = null;
  Statement stmt = null;

        try {
            Class.forName("oracle.jdbc.OracleDriver");
            String dbURL1 = "jdbc:oracle:thin:spunn/10151087@oracle12c.scs.ryerson.ca:1521:orcl12c";  // that is school Oracle database and you can only use it in the labs
        conn1 = DriverManager.getConnection(dbURL1);
            if (conn1 != null) {
                System.out.println("Connected with database 510-Oracle, connection #1");
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println();
            
      stmt = conn1.createStatement();


       String sql = "CREATE TABLE TEAMM " +
                   "(TEAM_NAME  VARCHAR(20), " + 
                   " GAMES_PLAYED NUMBER, " + 
                   " TEAM_ID NUMBER, " + 
                   " WINS NUMBER, " + 
                   " LOSS NUMBER, " + 
                   " DRAWS NUMBER, " + 
                   " GOALS_SCORED NUMBER, " + 
                   " GOALS_DIFFERNETIAL NUMBER, " + 
                   " POINTS NUMBER, " + 
                   " GOALS_AGAINST NUMBER, " + 
                   " PRIMARY KEY ( TEAM_ID ))"; 
      stmt.executeUpdate(sql);


     sql = "CREATE TABLE COACHH " +
                   "(COACH_NAME VARCHAR(20), " + 
                   " COACH_ID NUMBER, " + 
                   " CONTRACT_YEAR NUMBER, " + 
                   " TEAM_ID NUMBER, " + 
                   " FOREIGN KEY ( TEAM_ID ) REFERENCES TEAMM (TEAM_ID), " + 
                   " PRIMARY KEY ( COACH_ID ))"; 
    stmt.executeUpdate(sql);
        
        sql = "CREATE TABLE STADIUMM " +
                   "(STADIUM_ID NUMBER, " + 
                   " CAPACITY NUMBER, " + 
                   " LOCATION VARCHAR(20), " + 
                   " TEAM_ID NUMBER, " + 
                    " FOREIGN KEY ( TEAM_ID ) REFERENCES TEAMM (TEAM_ID), " + 
                   " PRIMARY KEY ( STADIUM_ID ))"; 
      stmt.executeUpdate(sql);

      sql = "CREATE TABLE SUSS " +
                   "(TYPE VARCHAR(20), " + 
                   " MATCHES NUMBER, " + 
                   " PRIMARY KEY ( TYPE ))"; 
      stmt.executeUpdate(sql);


 sql = "CREATE TABLE PLAYERR " +
                   "(PLAYER_NAME  VARCHAR(20), " + 
                   " TYPE VARCHAR(20), " + 
                   " AGE NUMBER, " + 
                   " NATION VARCHAR(20), " + 
                   " AWARDS NUMBER, " + 
                   " SALARY NUMBER, " + 
                   " PLAYER_ID NUMBER, " + 
                   " TEAM_ID NUMBER, " + 
                   " SUSPENSION VARCHAR(20), " + 
                   " FOREIGN KEY ( TEAM_ID ) REFERENCES TEAMM (TEAM_ID), " + 
                   " FOREIGN KEY ( SUSPENSION ) REFERENCES SUSS(TYPE), " + 
                   " PRIMARY KEY ( PLAYER_ID ))"; 
      stmt.executeUpdate(sql);

      sql = "CREATE TABLE REFEEE " +
                   "(REF_ID  NUMBER, " + 
                   " REF_TYPE VARCHAR(20), " + 
                   " REF_NAME VARCHAR(20), " + 
                   " PRIMARY KEY ( REF_ID ))"; 
      stmt.executeUpdate(sql);

      sql = "CREATE TABLE MATCHH_RESULTS " +
                   "(ATTENDANCE NUMBER, " + 
                   " RESULT VARCHAR(20), " + 
                   " MAN_OF_THE_MATCH NUMBER, " + 
                   " RESULT_ID NUMBER, " + 
                   " FOREIGN KEY ( MAN_OF_THE_MATCH ) REFERENCES PLAYERR(PLAYER_ID), " + 
                   " PRIMARY KEY ( RESULT_ID ))"; 
      stmt.executeUpdate(sql);

        sql = "CREATE TABLE MATCHH " +
                   "(MATCH_ID NUMBER, " + 
                   " DATES VARCHAR(20), " + 
                   " STADIUM_ID NUMBER, " + 
                   " HOME_TEAM VARCHAR(20), " + 
                   " AWAY_TEAM VARCHAR(20), " + 
                   " H_TEAM_ID NUMBER, " + 
                   " A_TEAM_ID NUMBER, " + 
                   " RESULT NUMBER, " + 
                   " SUSPENSION NUMBER, " + 
                   " PRIMARY KEY ( MATCH_ID ))"; 
      stmt.executeUpdate(sql);


       sql = "CREATE TABLE OFFICIATESS " +
                   "(OFF_ID NUMBER, " + 
                   " MATCH_ID NUMBER, " + 
                   " REF_ID NUMBER, " + 
                   " FOREIGN KEY ( MATCH_ID ) REFERENCES MATCHH(MATCH_ID), " + 
                   " FOREIGN KEY ( REF_ID ) REFERENCES REFEEE(REF_ID), " + 
                   " PRIMARY KEY ( OFF_ID ))"; 
      stmt.executeUpdate(sql);

     
 sql = "CREATE TABLE PLAYERR_STAT " +
                   "(PLAYERID  NUMBER, " + 
                   " PACE NUMBER, " + 
                   " DRIBBLING NUMBER, " + 
                   " PASSING NUMBER, " + 
                   " DEFENSE NUMBER, " + 
                   " PHYSIQUE NUMBER, " +
                   " FOREIGN KEY ( PLAYERID ) REFERENCES PLAYERR(PLAYER_ID), " +  
                   " PRIMARY KEY ( PLAYERID ))"; 
      stmt.executeUpdate(sql);

        JOptionPane.showMessageDialog(null, 
                              "TABLES ARE CREATED", 
                              "CREATED", 
                              JOptionPane.WARNING_MESSAGE);
        
        } catch (ClassNotFoundException ex) {
          JOptionPane.showMessageDialog(null, 
                              "ERROR PLEASE TRY AGAIN", 
                              "ERROR", 
                              JOptionPane.WARNING_MESSAGE);
            //ex.printStackTrace();
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, 
                              "ERROR PLEASE TRY AGAIN", 
                              "ERROR", 
                              JOptionPane.WARNING_MESSAGE);
            //ex.printStackTrace();
        } finally {
            try {
                if (conn1 != null && !conn1.isClosed()) {
                    conn1.close();
                }
     
            } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, 
                              "ERROR PLEASE TRY AGAIN", 
                              "ERROR", 
                              JOptionPane.WARNING_MESSAGE);
                //ex.printStackTrace();
            }
        }
      
}
public static void advQ2() {
  Connection conn1 = null;

        try {
            Class.forName("oracle.jdbc.OracleDriver");
            String dbURL1 = "jdbc:oracle:thin:spunn/10151087@oracle12c.scs.ryerson.ca:1521:orcl12c";  // that is school Oracle database and you can only use it in the labs
        conn1 = DriverManager.getConnection(dbURL1);
            if (conn1 != null) {
                System.out.println("Connected with database 510-Oracle, connection #1");
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println();
            
      //String query = "select * from PLAYERR where AGE >= 29 and AGE <= 31";
      String query = "select c.COACH_NAME, PLAYER_NAME, t.TEAM_NAME from TEAMM t, PLAYERR p, COACHH c where t.TEAM_ID = 2 AND p.TEAM_ID = 2 AND c.TEAM_ID = 2 ORDER BY PLAYER_ID ASC";



              
      try (Statement stmt = conn1.createStatement()) {

      ResultSet rs = stmt.executeQuery(query);
      String finall = "";
            while (rs.next()) {
        String name = rs.getString("PLAYER_NAME");
        int num = rs.getInt("AGE");
        finall = finall + "Player: " +name+ ", Age: "+ num + "\n";
        //System.out.println(finall);
      //  System.out.println(name + ", " + num);
         //outputA.setText(name + ", " + num);
      }
      outputA.setText(finall);
      } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, 
                              "ERROR PLEASE TRY AGAIN", 
                              "ERROR", 
                              JOptionPane.WARNING_MESSAGE);
        //System.out.println(e.getErrorCode());
      }

        } catch (ClassNotFoundException ex) {
          JOptionPane.showMessageDialog(null, 
                              "ERROR PLEASE TRY AGAIN", 
                              "ERROR", 
                              JOptionPane.WARNING_MESSAGE);
            //ex.printStackTrace();
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, 
                              "ERROR PLEASE TRY AGAIN", 
                              "ERROR", 
                              JOptionPane.WARNING_MESSAGE);
            //ex.printStackTrace();
        } finally {
            try {
                if (conn1 != null && !conn1.isClosed()) {
                    conn1.close();
                }
     
            } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, 
                              "ERROR PLEASE TRY AGAIN", 
                              "ERROR", 
                              JOptionPane.WARNING_MESSAGE);
                //ex.printStackTrace();
            }
        }
      
}

   public static void advQ3() {
  Connection conn1 = null;

        try {
            Class.forName("oracle.jdbc.OracleDriver");
            String dbURL1 = "jdbc:oracle:thin:spunn/10151087@oracle12c.scs.ryerson.ca:1521:orcl12c";  // that is school Oracle database and you can only use it in the labs
        conn1 = DriverManager.getConnection(dbURL1);
            if (conn1 != null) {
                System.out.println("Connected with database 510-Oracle, connection #1");
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println();
            
      //String query = "select * from PLAYERR where AGE >= 29 and AGE <= 31";
      String query = "select AVG(AGE) from PLAYERR";

       //SELECT 'Average age of players is', AVG(AGE)
//FROM "PLAYER";
              
      try (Statement stmt = conn1.createStatement()) {

      ResultSet rs = stmt.executeQuery(query);
      String finall = "";
            while (rs.next()) {
        //String name = rs.getString("PLAYER_NAME");
        int num = rs.getInt("AGE");
        finall = finall + "Player: " +num  + "\n";
        //System.out.println(finall);
      //  System.out.println(name + ", " + num);
         //outputA.setText(name + ", " + num);
      }
      outputA.setText(finall);
      } catch (SQLException e) {
        System.out.println(e.getErrorCode());
      }

        } catch (ClassNotFoundException ex) {
          JOptionPane.showMessageDialog(null, 
                              "ERROR PLEASE TRY AGAIN", 
                              "ERROR", 
                              JOptionPane.WARNING_MESSAGE);
            //ex.printStackTrace();
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, 
                              "ERROR PLEASE TRY AGAIN", 
                              "ERROR", 
                              JOptionPane.WARNING_MESSAGE);
            //ex.printStackTrace();
        } finally {
            try {
                if (conn1 != null && !conn1.isClosed()) {
                    conn1.close();
                }
     
            } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, 
                              "ERROR PLEASE TRY AGAIN", 
                              "ERROR", 
                              JOptionPane.WARNING_MESSAGE);
                //ex.printStackTrace();
            }
        }
      
}

  
   public static void advQ1() {
  Connection conn1 = null;

        try {
            Class.forName("oracle.jdbc.OracleDriver");
            String dbURL1 = "jdbc:oracle:thin:spunn/10151087@oracle12c.scs.ryerson.ca:1521:orcl12c";  // that is school Oracle database and you can only use it in the labs
        conn1 = DriverManager.getConnection(dbURL1);
            if (conn1 != null) {
                System.out.println("Connected with database 510-Oracle, connection #1");
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println();
            
      String query = "select * from PLAYERR where AGE >= 29 and AGE <= 31";
              
      try (Statement stmt = conn1.createStatement()) {

      ResultSet rs = stmt.executeQuery(query);
      String finall = "";
            while (rs.next()) {
        String name = rs.getString("PLAYER_NAME");
        int num = rs.getInt("AGE");
        finall = finall + "Player: " +name+ ", Age: "+ num + "\n";
        //System.out.println(finall);
      //  System.out.println(name + ", " + num);
         //outputA.setText(name + ", " + num);
      }
      outputA.setText(finall);
      } catch (SQLException e) {
        System.out.println(e.getErrorCode());
      }

        } catch (ClassNotFoundException ex) {
          JOptionPane.showMessageDialog(null, 
                              "ERROR PLEASE TRY AGAIN", 
                              "ERROR", 
                              JOptionPane.WARNING_MESSAGE);
            //ex.printStackTrace();
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, 
                              "ERROR PLEASE TRY AGAIN", 
                              "ERROR", 
                              JOptionPane.WARNING_MESSAGE);
            //ex.printStackTrace();
        } finally {
            try {
                if (conn1 != null && !conn1.isClosed()) {
                    conn1.close();
                }
     
            } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, 
                              "ERROR PLEASE TRY AGAIN", 
                              "ERROR", 
                              JOptionPane.WARNING_MESSAGE);
                //ex.printStackTrace();
            }
        }
      
}

public static void searchF() {
  Connection conn1 = null;

        try {
            Class.forName("oracle.jdbc.OracleDriver");
            String dbURL1 = "jdbc:oracle:thin:spunn/10151087@oracle12c.scs.ryerson.ca:1521:orcl12c";  // that is school Oracle database and you can only use it in the labs
        conn1 = DriverManager.getConnection(dbURL1);
            if (conn1 != null) {
                System.out.println("Connected with database 510-Oracle, connection #1");
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println();
            
             try { 
           player_IDD = Integer.parseInt(JOptionPane.showInputDialog(null, "Type in player id:"));

        } catch(NumberFormatException e) { 
          JOptionPane.showMessageDialog(null, "Value must be an integer!");
        }

      String query = "select * from PLAYERR where PLAYER_ID = " + player_IDD;
              
      try (Statement stmt = conn1.createStatement()) {

      ResultSet rs = stmt.executeQuery(query);
      String finall = "";
            while (rs.next()) {
        String name = rs.getString("PLAYER_NAME");
        int num = rs.getInt("AGE");
        String t = rs.getString("TYPE");
        String n = rs.getString("NATION");
        int a = rs.getInt("AWARDS");
        int s = rs.getInt("SALARY");
        int pi = rs.getInt("PLAYER_ID");
        int ti = rs.getInt("TEAM_ID");
        String ss = rs.getString("SUSPENSION");
        finall = finall + "Player: " +name+ ", Age: "+ num + "\n" + "Nation: " + n + "\n" + "Awards: " + a + " Salary: " + s
        + "\n" + "Player_ID: " + pi + " Team_ID: " + ti + "\n" + "Suspension: " + ss;

         JOptionPane.showMessageDialog(null, 
                              finall, 
                              "PLAYER INFO", 
                              JOptionPane.WARNING_MESSAGE);
        
        //System.out.println(finall);
      //  System.out.println(name + ", " + num);
         //outputA.setText(name + ", " + num);
      }
      outputA.setText(finall);
      } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, 
                              "ERROR PLEASE TRY AGAIN", 
                              "ERROR", 
                              JOptionPane.WARNING_MESSAGE);
        //System.out.println(e.getErrorCode());
      }

        } catch (ClassNotFoundException ex) {
          JOptionPane.showMessageDialog(null, 
                              "ERROR PLEASE TRY AGAIN", 
                              "ERROR", 
                              JOptionPane.WARNING_MESSAGE);
            //ex.printStackTrace();
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, 
                              "ERROR PLEASE TRY AGAIN", 
                              "ERROR", 
                              JOptionPane.WARNING_MESSAGE);
           //ex.printStackTrace();
        } finally {
            try {
                if (conn1 != null && !conn1.isClosed()) {
                    conn1.close();
                } 
               
     
            } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, 
                              "ERROR PLEASE TRY AGAIN", 
                              "ERROR", 
                              JOptionPane.WARNING_MESSAGE);
                //ex.printStackTrace();
            }
        }
      
}

  public static void dropT() {

    Connection conn1 = null;
    Statement stmt = null;

    try {
      Class.forName("oracle.jdbc.OracleDriver");
      String dbURL1 = "jdbc:oracle:thin:spunn/10151087@oracle12c.scs.ryerson.ca:1521:orcl12c"; // that is school Oracle
                                                                                               // database and you can
                                                                                               // only use it in the
                                                                                               // labs
      conn1 = DriverManager.getConnection(dbURL1);
      if (conn1 != null) {
        System.out.println("Connected with database 510-Oracle, connection #1");
      }

      Scanner scanner = new Scanner(System.in);
      System.out.println();

      stmt = conn1.createStatement();

      String sql = "DROP TABLE MATCHH_RESULTS ";
      stmt.executeUpdate(sql);
      sql = "DROP TABLE OFFICIATESS ";
      stmt.executeUpdate(sql);
      sql = "DROP TABLE PLAYERR_STAT ";
      stmt.executeUpdate(sql);
      sql = "DROP TABLE PLAYERR ";
      stmt.executeUpdate(sql);
      sql = "DROP TABLE COACHH ";
      stmt.executeUpdate(sql);
      sql = "DROP TABLE STADIUMM ";
      stmt.executeUpdate(sql);
      sql = "DROP TABLE TEAMM ";
      stmt.executeUpdate(sql);
      sql = "DROP TABLE SUSS ";
      stmt.executeUpdate(sql);
      sql = "DROP TABLE REFEEE ";
      stmt.executeUpdate(sql);
      sql = "DROP TABLE MATCHH ";
      stmt.executeUpdate(sql);

      JOptionPane.showMessageDialog(null, 
                              "TABLES ARE DROPPED", 
                              "DROPPED", 
                              JOptionPane.WARNING_MESSAGE);

    } catch (ClassNotFoundException ex) {
      //ex.printStackTrace();
         JOptionPane.showMessageDialog(null, 
                              "ERROR PLEASE TRY AGAIN", 
                              "ERROR", 
                              JOptionPane.WARNING_MESSAGE);
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, 
                              "ERROR PLEASE TRY AGAIN", 
                              "ERROR", 
                              JOptionPane.WARNING_MESSAGE);
      //ex.printStackTrace();
    } finally {
      try {
        if (conn1 != null && !conn1.isClosed()) {
          conn1.close();
        }

      } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, 
                              "ERROR PLEASE TRY AGAIN", 
                              "ERROR", 
                              JOptionPane.WARNING_MESSAGE);
        //ex.printStackTrace();
      }
    }

  }

  public static void delete1() {

    Connection conn1 = null;
    Statement stmt = null;

    try {
      Class.forName("oracle.jdbc.OracleDriver");
      String dbURL1 = "jdbc:oracle:thin:spunn/10151087@oracle12c.scs.ryerson.ca:1521:orcl12c"; // that is school Oracle
                                                                                               // database and you can
                                                                                               // only use it in the
                                                                                               // labs
      conn1 = DriverManager.getConnection(dbURL1);
      if (conn1 != null) {
        System.out.println("Connected with database 510-Oracle, connection #1");
      }

      Scanner scanner = new Scanner(System.in);
      System.out.println();

      stmt = conn1.createStatement();

    //String sql = "DELETE FROM COACHH WHERE COACH_ID = 4";
    String sql = "DELETE FROM " + tn + " WHERE " + tnName + " = " + pid;



      stmt.executeUpdate(sql);
     

     

      JOptionPane.showMessageDialog(null, 
                              "ROW DELETED", 
                              "DELETED", 
                              JOptionPane.WARNING_MESSAGE);

    } catch (ClassNotFoundException ex) {
      JOptionPane.showMessageDialog(null, 
                              "ERROR PLEASE TRY AGAIN", 
                              "ERROR", 
                              JOptionPane.WARNING_MESSAGE);
      //ex.printStackTrace();
      
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, 
                              "ERROR PLEASE TRY AGAIN", 
                              "ERROR", 
                              JOptionPane.WARNING_MESSAGE);
      //ex.printStackTrace();
    } finally {
      try {
        if (conn1 != null && !conn1.isClosed()) {
          conn1.close();
        }

      } catch (SQLException ex) {
JOptionPane.showMessageDialog(null, 
                              "ERROR PLEASE TRY AGAIN", 
                              "ERROR", 
                              JOptionPane.WARNING_MESSAGE);
        //ex.printStackTrace();
      }
    }

  }

  public static void createPlayer() {

    Connection conn1 = null;
    Statement stmt = null;

    try {
      Class.forName("oracle.jdbc.OracleDriver");
      String dbURL1 = "jdbc:oracle:thin:spunn/10151087@oracle12c.scs.ryerson.ca:1521:orcl12c"; // that is school Oracle
                                                                                               // database and you can
                                                                                               // only use it in the
                                                                                               // labs
      conn1 = DriverManager.getConnection(dbURL1);
      if (conn1 != null) {
        System.out.println("Connected with database 510-Oracle, connection #1");
      }

      Scanner scanner = new Scanner(System.in);
      System.out.println();

      stmt = conn1.createStatement();

    //String sql = "DELETE FROM COACHH WHERE COACH_ID = 4";
    //String sql = "DELETE FROM " + tn + " WHERE " + tnName + " = " + pid;
    //String sql = "INSERT INTO PLAYERR VALUES ('" + playerName + "', '" + playerType + "', '" + playerAge + "', '" + playerNation
    //+ "', '" + playerAwards + "', '" + playerSalary + "', '" + playerID + "', '" + teamID + "', '" + playerSus + "')";

    

    //String sql =  "INSERT INTO PLAYERR VALUES ('PP', 'Go', 78, 'NB', 45, 456, 13, 1, 'Medium')";

    String sql =  "INSERT INTO PLAYERR VALUES ('" + playerName + "', '" + playerType + "', " + playerAge + ", '" + playerNation + "', "
    + playerAwards + "," + playerSalary +  "," + playerID + "," + teamID + "," + "'" + playerSus + "')";


   // INSERT INTO PLAYERR VALUES ('PP', 'Go', 78, 'NB', 45, 45, 18, 1, 'Low');

      stmt.executeUpdate(sql);
     
      JOptionPane.showMessageDialog(null, 
                              "PLAYER HAS BEEN ADDED", 
                              "PLAYER ADD", 
                              JOptionPane.WARNING_MESSAGE);
                              
                              
    } catch (ClassNotFoundException ex) {
      JOptionPane.showMessageDialog(null, 
                              "ERROR PLEASE TRY AGAIN", 
                              "ERROR", 
                              JOptionPane.WARNING_MESSAGE);
      //ex.printStackTrace();
      
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, 
                              "ERROR PLEASE TRY AGAIN", 
                              "ERROR", 
                              JOptionPane.WARNING_MESSAGE);
      //ex.printStackTrace();
    } finally {
      try {
        if (conn1 != null && !conn1.isClosed()) {
          conn1.close();
        }

      } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, 
                              "ERROR PLEASE TRY AGAIN", 
                              "ERROR", 
                              JOptionPane.WARNING_MESSAGE);
        //ex.printStackTrace();
      }
    }

  }


  private JButton btnCreate  = new JButton("Create");
  private JButton btnDrop = new JButton("Drop");
  private JButton btnPopulate = new JButton("Populate");
  private JButton btnAdv = new JButton("Adv Q");
  private JButton btnExit = new JButton("Exit");
  private JButton btnSearch = new JButton("Search");

  private JButton btnBack = new JButton("<--");
  private JButton btnBack2 = new JButton("<--");
  private JButton btnBack3 = new JButton("<--");
  private JButton btnBack4 = new JButton("<--");


  private JButton btnDrop1 = new JButton("Drop All Tables");
  private JButton btnDrop2 = new JButton("Drop A Table");
  private JButton create1 = new JButton("Create All Tables");
  private JButton create2 = new JButton("Add a player");

  private JButton populateB = new JButton("Populate All Tables");


  private JButton a1 = new JButton("Adv Query 1");
  private JButton a2 = new JButton("Adv Query 2");
    private JButton a3 = new JButton("Adv Query 3");


  //private JTextField txtOutput = new JTextField();
  private JLabel logo = new JLabel(new ImageIcon("ll.png"));

  private JLabel log = new JLabel("sss");

 
 JFrame secondForm = new JFrame();


 JFrame thirdForm = new JFrame();

 JFrame fourthForm = new JFrame();

 JFrame fifthForm = new JFrame();

 JFrame createeF = new JFrame();

  public MyFrame(){
    setTitle("CPS 510 SOCCBER DBMS");
    setSize(650,459);
    setLocation(new Point(300,200));
    setLayout(null);    
    setResizable(false);
    setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    try {
    setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("2.jpg")))));
     } catch (IOException e) {
       JOptionPane.showMessageDialog(null, 
                              "ERROR PLEASE TRY AGAIN", 
                              "ERROR", 
                              JOptionPane.WARNING_MESSAGE);
            //e.printStackTrace();
        }

    initComponent();    
    initEvent();    
  }

  private void initComponent(){
    //txtOutput.setBounds(190,130, 165,25);
    //txtOutput.setEditable(false);
    //txtOutput.setText("Click Button for SQL Query");

    logo.setBounds(190,25, 165,25);
    logo.setSize(320,50);
  

    btnCreate.setBounds(60,195,100,20);
    btnCreate.setSize(150,30);
    btnDrop.setBounds(250,195,100,20);
    btnDrop.setSize(150,30);
    btnPopulate.setBounds(440,195,100,20);
    btnPopulate.setSize(150,30);
    btnAdv.setBounds(250,235,100,20);
    btnAdv.setSize(150,30);
    btnExit.setBounds(60,320,100,20);
    btnSearch.setBounds(440,235,100,20);
    btnSearch.setSize(150,30);



    add(btnCreate);
    add(btnDrop);
    add(btnPopulate);
    add(btnAdv);
    add(btnExit);
    add(btnSearch);

    //add(txtOutput);
    add(logo);
  
  }

  private void initEvent(){

    this.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e){
       System.exit(1);
      }
    });

    btnCreate.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        btnCreate(e);
      }
    });

     btnBack.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        btnBack(e);
      }
    });

     btnBack2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        btnBack2(e);
      }
    });

    

     btnBack3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        btnBack3(e);
      }
    });

     btnSearch.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        btnSearch(e);
      }
    });

     btnBack4.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        btnBack4(e);
      }
    });

    btnDrop.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        btnDrop(e);
      }
    });

     btnPopulate.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        btnPopulate(e);
      }
    });

    btnAdv.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        btnAdv(e);
      }
    });

     btnExit.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        btnExit(e);
      }
    });

      a1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        a1(e);
      }
    });

    a2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        a2(e);
      }
    });

    a3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        a3(e);
      }
    });


    btnDrop1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        btnDrop1(e);
      }
    });

     btnDrop2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        btnDrop2(e);
      }
    });

    create1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        create1(e);
      }
    });

     create2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        create2(e);
      }
    });

    populateB.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        populateB(e);
      }
    });

  
     btnCreate.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        btnCreate.setBackground(Color.GREEN);
    }

    public void mouseExited(java.awt.event.MouseEvent evt) {
        btnCreate.setBackground(UIManager.getColor("control"));
    }
});

      btnBack2.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        btnBack2.setBackground(Color.PINK);
    }

    public void mouseExited(java.awt.event.MouseEvent evt) {
        btnBack2.setBackground(UIManager.getColor("control"));
    }
});

 btnBack3.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        btnBack3.setBackground(Color.PINK);
    }

    public void mouseExited(java.awt.event.MouseEvent evt) {
        btnBack3.setBackground(UIManager.getColor("control"));
    }
});

 btnBack4.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        btnBack4.setBackground(Color.PINK);
    }

    public void mouseExited(java.awt.event.MouseEvent evt) {
        btnBack4.setBackground(UIManager.getColor("control"));
    }
});

     btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        btnBack.setBackground(Color.PINK);
    }

    public void mouseExited(java.awt.event.MouseEvent evt) {
        btnBack.setBackground(UIManager.getColor("control"));
    }
});

         btnDrop.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        btnDrop.setBackground(Color.RED);
    }

    public void mouseExited(java.awt.event.MouseEvent evt) {
        btnDrop.setBackground(UIManager.getColor("control"));
    }
});

             btnPopulate.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        btnPopulate.setBackground(Color.GREEN);
    }

    public void mouseExited(java.awt.event.MouseEvent evt) {
        btnPopulate.setBackground(UIManager.getColor("control"));
    }
});

                 btnAdv.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        btnAdv.setBackground(Color.GREEN);
    }

    public void mouseExited(java.awt.event.MouseEvent evt) {
        btnAdv.setBackground(UIManager.getColor("control"));
    }
});

                 btnDrop2.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        btnDrop2.setBackground(Color.RED);
    }

    public void mouseExited(java.awt.event.MouseEvent evt) {
        btnDrop2.setBackground(UIManager.getColor("control"));
    }
});

                             btnDrop1.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        btnDrop1.setBackground(Color.RED);
    }

    public void mouseExited(java.awt.event.MouseEvent evt) {
        btnDrop1.setBackground(UIManager.getColor("control"));
    }
});


                     btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        btnExit.setBackground(Color.RED);
    }

    public void mouseExited(java.awt.event.MouseEvent evt) {
        btnExit.setBackground(UIManager.getColor("control"));
    }
});



  }
  
  private void btnCreate(ActionEvent evt){

fourthForm.invalidate();
fourthForm.validate();
fourthForm.repaint();

    fourthForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    fourthForm.setTitle("CPS 510 SOCCBER DBMS");
    fourthForm.setSize(650,459);
    fourthForm.setLocation(new Point(300,200));
    fourthForm.setLayout(null);    
    fourthForm.setResizable(false);

    try {
    fourthForm.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("2.jpg")))));
     } catch (IOException e) {
       JOptionPane.showMessageDialog(null, 
                              "ERROR PLEASE TRY AGAIN", 
                              "ERROR", 
                              JOptionPane.WARNING_MESSAGE);
            //e.printStackTrace();
        }


 fourthForm.setDefaultCloseOperation(fourthForm.EXIT_ON_CLOSE);

fourthForm.setVisible(true);
//this.setState(Frame.ICONIFIED);
 this.setVisible(false);


  create1.setBounds(60,195,100,20);
    create1.setSize(190,30);
    create2.setBounds(320,195,100,20);
    create2.setSize(150,30);
    btnBack2.setBounds(60,320,100,20);
      
    log.setBounds(60,250,100,20);
    


    fourthForm.add(create1);
    fourthForm.add(create2);
    fourthForm.add(btnBack2);
  
    fourthForm.add(log);
   
  }
  
  private void btnDrop(ActionEvent evt){
   


secondForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    secondForm.setTitle("CPS 510 SOCCBER DBMS");
    secondForm.setSize(650,459);
    secondForm.setLocation(new Point(300,200));
    secondForm.setLayout(null);    
    secondForm.setResizable(false);

    try {
    secondForm.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("2.jpg")))));
     } catch (IOException e) {
       JOptionPane.showMessageDialog(null, 
                              "ERROR PLEASE TRY AGAIN", 
                              "ERROR", 
                              JOptionPane.WARNING_MESSAGE);
            //e.printStackTrace();
        }

 secondForm.setDefaultCloseOperation(secondForm.EXIT_ON_CLOSE);

secondForm.setVisible(true);
//this.setState(Frame.ICONIFIED);
 this.setVisible(false);


  btnDrop1.setBounds(60,195,100,20);
    btnDrop1.setSize(150,30);
    btnDrop2.setBounds(250,195,100,20);
    btnDrop2.setSize(150,30);
    btnBack.setBounds(60,320,100,20);
      
    log.setBounds(60,250,100,20);
    


    secondForm.add(btnDrop1);
    secondForm.add(btnDrop2);
    secondForm.add(btnBack);
  
    secondForm.add(log);

  }

  private void btnPopulate(ActionEvent evt){


    fifthForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    fifthForm.setTitle("CPS 510 SOCCBER DBMS");
    fifthForm.setSize(650,459);
    fifthForm.setLocation(new Point(300,200));
    fifthForm.setLayout(null);    
    fifthForm.setResizable(false);

    try {
    fifthForm.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("2.jpg")))));
     } catch (IOException e) {
       JOptionPane.showMessageDialog(null, 
                              "ERROR PLEASE TRY AGAIN", 
                              "ERROR", 
                              JOptionPane.WARNING_MESSAGE);
            //e.printStackTrace();
        }

 fifthForm.setDefaultCloseOperation(fifthForm.EXIT_ON_CLOSE);

fifthForm.setVisible(true);
//sssthis.setState(Frame.ICONIFIED);
 this.setVisible(false);

    populateB.setBounds(250,195,100,20);
    populateB.setSize(200,30);
    btnBack3.setBounds(60,320,100,20);
      
    log.setBounds(60,250,100,20);
    

    
    fifthForm.add(populateB);
    fifthForm.add(btnBack3);
  
    fifthForm.add(log);
   
  }

  private void a1(ActionEvent evt){
    //advQ();

    advQ1();
   
  }

  private void a2(ActionEvent evt){
    //advQ();

    advQ2();
   
  }

  private void a3(ActionEvent evt){
    //advQ();

    advQ3();
   
  }

  private void btnDrop1(ActionEvent evt){
    System.out.println("sd");
    dropT();
  }

   private void btnDrop2(ActionEvent evt){
    
   
    tn = JOptionPane.showInputDialog(this, "Type in table name:");
    //tn = "JOptionPane.showInputDialog(this, "Type in table name:");"
    //pid = Integer.parseInt(JOptionPane.showInputDialog(this, "Type in pid:"));
    if(tn.equals("COACHH")){
      pid = JOptionPane.showInputDialog(this, "Type in Coach ID:");
      tnName = "COACH_ID";
    }
    if(tn.equals("MATCHH")){
      pid = JOptionPane.showInputDialog(this, "Type in Match ID:");
      tnName = "MATCH_ID";
    }
    if(tn.equals("MATCHH_RESULTS")){
      pid = JOptionPane.showInputDialog(this, "Type in Match Results ID:"); 
      tnName = "RESULT_ID";
    }
    if(tn.equals("OFFICIATESS")){
      pid = JOptionPane.showInputDialog(this, "Type in Officiates ID:");
      tnName = "OFF_ID";
    }
    if(tn.equals("PLAYERR")){
      pid = JOptionPane.showInputDialog(this, "Type in Player ID:");
      tnName = "PLAYER_ID";
    }
    if(tn.equals("PLAYERR_STAT")){
      pid = JOptionPane.showInputDialog(this, "Type in Player Stat ID:");
      tnName = "PLAYERID";
    }
    if(tn.equals("REFEEE")){
      pid = JOptionPane.showInputDialog(this, "Type in Referee ID:");
      tnName = "REF_ID";
    }
    if(tn.equals("STADIUMM")){
      pid = JOptionPane.showInputDialog(this, "Type in Stadium ID:");
      tnName = "STADIUM_ID";
    }
    if(tn.equals("SUSS")){
      pid = JOptionPane.showInputDialog(this, "Type in Suspension ID:");
      tnName = "TYPE";
    }
    if(tn.equals("TEAMM")){
      pid = JOptionPane.showInputDialog(this, "Type in Team ID:");
      tnName = "TEAM_ID";
    }
     
    
    //pid = JOptionPane.showInputDialog(this, "Type in pid:");
    System.out.println(tn);

    
   System.out.println(pid);

    delete1();


  }

  private void btnAdv(ActionEvent evt){



thirdForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    thirdForm.setTitle("CPS 510 SOCCBER DBMS");
    thirdForm.setSize(650,459);
    thirdForm.setLocation(new Point(300,200));
    thirdForm.setLayout(null);    
    thirdForm.setResizable(false);

    try {
    thirdForm.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("2.jpg")))));
     } catch (IOException e) {
       JOptionPane.showMessageDialog(null, 
                              "ERROR PLEASE TRY AGAIN", 
                              "ERROR", 
                              JOptionPane.WARNING_MESSAGE);
            //e.printStackTrace();
        }

thirdForm.setVisible(true);
//sthis.setState(Frame.ICONIFIED);

thirdForm.setDefaultCloseOperation(thirdForm.EXIT_ON_CLOSE);

 this.setVisible(false);

    outputA.setBounds(200,8,100,20);
    outputA.setSize(300,180);
    outputA.setEditable(false);
    a1.setSize(30,150);

   a1.setBounds(60,195,100,20);
    a1.setSize(150,30);
    a2.setBounds(250,195,100,20);
    a2.setSize(150,30);
    a3.setBounds(440,195,100,20);
    a3.setSize(150,30);




    btnBack4.setBounds(60,320,100,20);
      
    log.setBounds(60,250,100,20);
    

    thirdForm.add(a1);
    thirdForm.add(a2);
    thirdForm.add(a3);
  
    thirdForm.add(log);
    thirdForm.add(outputA);
    thirdForm.add(btnBack4);
    
  }

  private void btnExit(ActionEvent evt){
    System.exit(0);
   
  }

  


  private void btnBack(ActionEvent evt){
    
//secondForm.dispatchEvent(new WindowEvent(secondForm, WindowEvent.WINDOW_CLOSING));

SwingUtilities.updateComponentTreeUI(this);
this.invalidate();
this.validate();
this.repaint();
this.setVisible(true);


  }


  private void btnBack2(ActionEvent evt){
    
//fourthForm.dispatchEvent(new WindowEvent(fourthForm, WindowEvent.WINDOW_CLOSING));

SwingUtilities.updateComponentTreeUI(this);
this.invalidate();
this.validate();
this.repaint();
this.setVisible(true);

 
  }

  private void btnBack4(ActionEvent evt){
//fifthForm.dispatchEvent(new WindowEvent(fifthForm, WindowEvent.WINDOW_CLOSING));

SwingUtilities.updateComponentTreeUI(this);
this.invalidate();
this.validate();
this.repaint();
this.setVisible(true);



 
  }

    private void btnBack3(ActionEvent evt){
    
//thirdForm.dispatchEvent(new WindowEvent(thirdForm, WindowEvent.WINDOW_CLOSING));

SwingUtilities.updateComponentTreeUI(this);
this.invalidate();
// this.validate();/
this.repaint();
this.setVisible(true);


  }

   private void create1(ActionEvent evt){
    createT();
  }

 private void populateB(ActionEvent evt){
    populateT();
  }

    private void btnSearch(ActionEvent evt){
    searchF();
  }


   private void create2(ActionEvent evt){

    playerName = JOptionPane.showInputDialog(this, "Type in player name:");
    playerType = JOptionPane.showInputDialog(this, "Type in player type:");
    
    try { 
           playerAge = Integer.parseInt(JOptionPane.showInputDialog(this, "Type in player age:"));

        } catch(NumberFormatException e) { 
          JOptionPane.showMessageDialog(null, "Value must be an integer!");
        }
        playerNation = JOptionPane.showInputDialog(this, "Type in player nation:");
        try { 
           playerAwards = Integer.parseInt(JOptionPane.showInputDialog(this, "Type in player number of awards:"));

        } catch(NumberFormatException e) { 
          JOptionPane.showMessageDialog(null, "Value must be an integer!");
        }
        try { 
           playerSalary = Integer.parseInt(JOptionPane.showInputDialog(this, "Type in player's salary:"));

        } catch(NumberFormatException e) { 
          JOptionPane.showMessageDialog(null, "Value must be an integer!");
        }
        try { 
           playerID = Integer.parseInt(JOptionPane.showInputDialog(this, "Type in player id:"));

        } catch(NumberFormatException e) { 
          JOptionPane.showMessageDialog(null, "Value must be an integer!");
        }
        try { 
           teamID = Integer.parseInt(JOptionPane.showInputDialog(this, "Type in team id:"));

        } catch(NumberFormatException e) { 
          JOptionPane.showMessageDialog(null, "Value must be an integer!");
        }

        playerSus = JOptionPane.showInputDialog(this, "Type in player's level of suspension:");

        

        createPlayer();



  }


}
