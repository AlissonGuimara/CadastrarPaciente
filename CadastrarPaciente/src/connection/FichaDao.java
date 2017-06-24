
package connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import metodos.Ficha;

public class FichaDao {
    

    public void delete(Ficha paciente) {
     
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "delete from Pessoa where codigo = ?,?,?,?,?,?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, paciente.getRegSUS());
            ps.setString(2, paciente.getNomeDoença());
            ps.setString(3, paciente.getTipoSangue());
            ps.setString(4, paciente.getAltura());
            ps.setString(5, paciente.getPeso());
            ps.setString(6, paciente.getCodigo());
            
            ps.execute();

            conn.commit();
        } catch(SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if(conn != null){
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }


        } finally {
            if( ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }

    public void insert(Ficha paciente) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "insert into Ficha (regSUS, nomeDoença,tipoSangue,altura, peso, codigo) values(?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, paciente.getRegSUS());
            ps.setString(2, paciente.getNomeDoença());
            ps.setString(3, paciente.getTipoSangue());
            ps.setString(4, paciente.getAltura());
            ps.setString(5, paciente.getPeso());
            ps.setString(6, paciente.getCodigo());
            ps.execute();

            conn.commit();

        } catch(SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if(conn != null){
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }

        } finally {
            if( ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }

    public void update(Ficha paciente) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "update Ficha set regSUS =?, nomeDoença =?, tipoSangue =?,"
                    + "altura =?, peso =?, codigo =? where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, paciente.getRegSUS());
            ps.setString(2, paciente.getNomeDoença());
            ps.setString(3, paciente.getTipoSangue());
            ps.setString(4, paciente.getAltura());
            ps.setString(5, paciente.getPeso());    
            ps.setString(6, paciente.getCodigo());
            ps.execute();

            conn.commit();
        } catch(SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if(conn != null){
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }


        } finally {
            if( ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }



    public List<Ficha> getAll() {
        List<Ficha> lista = new ArrayList<Ficha>();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select codigo from Ficha";
            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                String regSUS = rs.getString(1);
                String nomeDoença = rs.getString(2);
                String tipoSangue = rs.getString(3);
                String altura = rs.getString(4);
                String peso = rs.getString(5);
                String codigo = rs.getString(6);
                
                Ficha paciente = new Ficha();
                
                paciente.setRegSUS(regSUS);
                paciente.setNomeDoença(nomeDoença);
                paciente.setTipoSangue(tipoSangue);
                paciente.setAltura(altura);
                paciente.setPeso(peso);
                paciente.setCodigo(codigo);
                lista.add(paciente);
            }
        } catch(SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
        } finally {
            if( ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
        return lista;
    }

    public Ficha getFicha(Ficha F) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select codigo from Ficha where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, F.getCodigo());
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()) {
                Ficha ficha = new Ficha();
               
                ficha.setRegSUS(rs.getString(1));
                ficha.setNomeDoença(rs.getString(2));
                ficha.setTipoSangue(rs.getString(3));
                ficha.setAltura(rs.getString(4));
                ficha.setPeso(rs.getString(5));
                ficha.setCodigo(rs.getString(6));
                return ficha;
            }
        } catch(SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
        } finally {
            if( ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
        return null;
    }



}

    
    
    

