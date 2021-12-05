using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Threading.Tasks;
using VampiAPI.Models;

namespace VampiAPI.Models
{
    public class UsuarioModel
    {
        string ConnectionString = "Server=tcp:drivervampiserver.database.windows.net,1433;Initial Catalog=DriverVampi;Persist Security Info=False;User ID=drivervampiuser;Password=HermanasVampiro1@;MultipleActiveResultSets=False;Encrypt=True;TrustServerCertificate=False;Connection Timeout=30;";

        public int matricula { get; set; }

        public string nombre { get; set; }

        public string apPaterno { get; set; }

        public string apMaterno { get; set; }

        public string correo { get; set; }

        public string contrasena { get; set; }

        public string foto { get; set; }

        public string tipo { get; set; }


        // GET ALL
        public UsuariosResponse GetAll()
        {
            List<UsuarioModel> list = new List<UsuarioModel>();
            try
            {
                using(SqlConnection conn = new SqlConnection(ConnectionString))
                {
                    conn.Open();
                    string tsql = "SELECT * FROM Usuario";
                    using (SqlCommand cmd = new SqlCommand(tsql, conn))
                    {
                        using (SqlDataReader reader = cmd.ExecuteReader())
                        {
                            while (reader.Read())
                            {
                                list.Add(new UsuarioModel 
                                {
                                    matricula = int.Parse(reader["matricula"].ToString()),
                                    nombre = reader["nombre"].ToString(),
                                    apPaterno = reader["apPaterno"].ToString(),
                                    apMaterno = reader["apMaterno"].ToString(),
                                    correo = reader["correo"].ToString(),
                                    contrasena = reader["contrasena"].ToString(),
                                    foto = reader["foto"].ToString(),
                                    tipo = reader["tipo"].ToString()
                                });
                            }
                        }
                    }
                }
                return new UsuariosResponse
                {
                    usuarios = list
                };
            }
            catch (Exception ex)
            {
                return new UsuariosResponse
                {
                    usuarios = null
                };
            }
        }

        // GET BY MATRICULA
        public UsuariosResponse GetUsuarioByMatricula(int matricula)
        {
            List<UsuarioModel> list = new List<UsuarioModel>();
            try
            {
                using (SqlConnection conn = new SqlConnection(ConnectionString))
                {
                    conn.Open();
                    string tsql = "SELECT * FROM Usuario WHERE matricula = @matricula";
                    using (SqlCommand cmd = new SqlCommand(tsql, conn))
                    {
                        cmd.Parameters.AddWithValue("@matricula", matricula);
                        using (SqlDataReader reader = cmd.ExecuteReader())
                        {
                            while (reader.Read())
                            {
                                list.Add(new UsuarioModel
                                {
                                    matricula = int.Parse(reader["matricula"].ToString()),
                                    nombre = reader["nombre"].ToString(),
                                    apPaterno = reader["apPaterno"].ToString(),
                                    apMaterno = reader["apMaterno"].ToString(),
                                    correo = reader["correo"].ToString(),
                                    contrasena = reader["contrasena"].ToString(),
                                    foto = reader["foto"].ToString(),
                                    tipo = reader["tipo"].ToString()
                                });
                            }
                        }
                    }
                }
                return new UsuariosResponse
                {
                    usuarios = list
                };
            }
            catch (Exception ex)
            {
                return new UsuariosResponse
                {
                    usuarios = null
                };
            }
        }

        // EDIT USER
        public int EditUsuario()
        {
            List<UsuarioModel> list = new List<UsuarioModel>();
            try
            {
                using (SqlConnection conn = new SqlConnection(ConnectionString))
                {
                    conn.Open();
                    string tsql = "UPDATE Usuario SET nombre = @nombre, apPaterno = @apPaterno, apMaterno = @apMaterno, correo = @correo, foto = @foto WHERE matricula = @matricula";
                    using (SqlCommand cmd = new SqlCommand(tsql, conn))
                    {
                        cmd.CommandType = System.Data.CommandType.Text;
                        cmd.Parameters.AddWithValue("@nombre", nombre);
                        cmd.Parameters.AddWithValue("@apPaterno", apPaterno);
                        cmd.Parameters.AddWithValue("@apMaterno", apMaterno);
                        cmd.Parameters.AddWithValue("@correo", correo);
                        cmd.Parameters.AddWithValue("@foto", foto);
                        cmd.Parameters.AddWithValue("@matricula", matricula);
                        cmd.ExecuteNonQuery();
                    }
                }
                return matricula;
            }
            catch (Exception ex)
            {
                return 0;
            }
        }
    }
}
