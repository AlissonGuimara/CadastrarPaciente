package connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import metodos.Pessoa;

//As exceções devem ser propagadas para a camada de apresentação, ou seja, deve ser utilizado throws em cada um dos métodos
public class PacienteDao {

    public void delete(Pessoa paciente) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "delete from Pessoa where codigo = ?,?,?,?,?,?,?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, paciente.getCodigo());
            ps.setString(2, paciente.getCpf());
            ps.setString(3, paciente.getIdade());
            ps.setString(4, paciente.getNome());
            ps.setString(5, paciente.getNomeMae());
            ps.setString(6, paciente.getNomePai());
            ps.setString(7, paciente.getSexo()); 
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

    public void insert(Pessoa paciente) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "insert into Pessoa (codigo, cpf, Idade, nome, nomeMae, nomePai, sexo) values(?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, paciente.getCodigo());
            ps.setString(2, paciente.getCpf());
            ps.setString(3, paciente.getIdade());
            ps.setString(4, paciente.getNome());
            ps.setString(5, paciente.getNomeMae());
            ps.setString(6, paciente.getNomePai());
            ps.setString(7, paciente.getSexo());
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

    public void update(Pessoa paciente) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "update Pessoa set codigo = ?, cpf = ?, idade = ?, nome = ? , nomeMae = ?, nomePai = ?,"
                    + "sexo = ? where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, paciente.getCodigo());
            ps.setString(2, paciente.getCpf());
            ps.setString(3, paciente.getIdade());
            ps.setString(4, paciente.getNome());
            ps.setString(5, paciente.getNomeMae());
            ps.setString(6, paciente.getNomePai());
            ps.setString(7, paciente.getSexo());
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



    public List<Pessoa> getAll() {
        List<Pessoa> lista = new ArrayList<Pessoa>();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select codigo from Pessoa";
            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                String codigo = rs.getString(1);
                String cpf = rs.getString(2);
                String idade = rs.getString(3);
                String nome = rs.getString(4);
                String nomeMae = rs.getString(5);
                String nomePai = rs.getString(6);
                String sexo = rs.getString(7);
                                
                Pessoa paciente = new Pessoa();
                paciente.setCodigo(codigo);
                paciente.setCpf(cpf);
                paciente.setIdade(idade);
                paciente.setNome(nome);
                paciente.setNomeMae(nomeMae);
                paciente.setNomePai(nomePai);
                paciente.setSexo(sexo);
                
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

    public Pessoa getPaciente(Pessoa p) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select codigo from Pessoa where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, p.getCodigo());
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()) {
                Pessoa paciente = new Pessoa();
               
                paciente.setCodigo(rs.getString(1));
                paciente.setCpf(rs.getString(2));
                paciente.setIdade(rs.getString(3));
                paciente.setNome(rs.getString(4));
                paciente.setNomeMae(rs.getString(5));
                paciente.setNomePai(rs.getString(6));
                paciente.setSexo(rs.getString(7));
                return paciente;
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
