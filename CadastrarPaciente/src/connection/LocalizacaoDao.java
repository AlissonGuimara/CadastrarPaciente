package connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import metodos.Localizacao;

//As exceções devem ser propagadas para a camada de apresentação, ou seja, deve ser utilizado throws em cada um dos métodos
public class LocalizacaoDao {

    
    public void delete(Localizacao loc) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "delete from LOCALIZACAO where codigo = ?,?,?,?,?,?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, loc.getBairro());
            ps.setString(2, loc.getCidade());
            ps.setString(3, loc.getEmail());
            ps.setString(4, loc.getEstado());
            ps.setString(5, loc.getTelefone());
            ps.setString(6, loc.getCodigo());
            
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

    public void insert(Localizacao loc) throws SQLException {
        Conexao con = new Conexao();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "insert into LOCALIZACAO (codigo, bairro, cidade, estado, pais, email, telefone) values(?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, loc.getCodigo());
            ps.setString(2, loc.getBairro());
            ps.setString(3, loc.getCidade());
            ps.setString(4, loc.getEstado());
            ps.setString(5, "Brasil");
            ps.setString(6, loc.getEmail());
            ps.setString(7, loc.getTelefone());
                        
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
            
            throw e;
            
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

    public void update(Localizacao loc) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "update LOCALIZACAO set bairro = ?, cidade = ?, email = ?, estado = ? , telefone = ?,"
                    + " codigo = ? where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, loc.getBairro());
            ps.setString(2, loc.getCidade());
            ps.setString(3, loc.getEmail());
            ps.setString(4, loc.getEstado());
            ps.setString(5, loc.getTelefone());
            ps.setString(6, loc.getCodigo());
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



    public List<Localizacao> getAll() {
        List<Localizacao> lista = new ArrayList<Localizacao>();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select codigo from LOCALIZACAO";
            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                String bairro = rs.getString(1);
                String cidade = rs.getString(2);
                String email = rs.getString(3);
                String estado = rs.getString(4);
                String telefone = rs.getString(5);
                String codigo = rs.getString(6);
                                
                Localizacao loc = new Localizacao();
                loc.setBairro(bairro);
                loc.setCidade(cidade);
                loc.setEmail(email);
                loc.setEstado(estado);
                loc.setTelefone(telefone);
                loc.setCodigo(codigo);
                lista.add(loc);
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

    public Localizacao getLocalizacao(Localizacao loc) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select codigo from LOCALIZACAO where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, loc.getCodigo());
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()) {
                Localizacao l = new Localizacao();
               
                l.setBairro(rs.getString(1));
                l.setCidade(rs.getString(2));
                l.setEmail(rs.getString(3));
                l.setEstado(rs.getString(4));
                l.setTelefone(rs.getString(5));
                l.setCodigo(rs.getString(6));
                return l;
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