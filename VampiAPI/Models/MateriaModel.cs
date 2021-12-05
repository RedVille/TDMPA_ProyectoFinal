using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Threading.Tasks;

namespace VampiAPI.Models
{
    public class MateriaModel
    {
        string ConnectionString = "Server=tcp:drivervampiserver.database.windows.net,1433;Initial Catalog=DriverVampi;Persist Security Info=False;User ID=drivervampiuser;Password=HermanasVampiro1@;MultipleActiveResultSets=False;Encrypt=True;TrustServerCertificate=False;Connection Timeout=30;";

        public int idMateria { get; set; }

        public string nombre { get; set; }

        public string descripcion { get; set; }

        public string foto { get; set; }

        public string horario { get; set; }

        // GET ALL
        public MateriasResponse GetAll()
        {
            List<MateriaModel> list = new List<MateriaModel>();
            try
            {
                using (SqlConnection conn = new SqlConnection(ConnectionString))
                {
                    conn.Open();
                    string tsql = "SELECT * FROM Materia";
                    using (SqlCommand cmd = new SqlCommand(tsql, conn))
                    {
                        using (SqlDataReader reader = cmd.ExecuteReader())
                        {
                            while (reader.Read())
                            {
                                list.Add(new MateriaModel
                                {
                                    idMateria = int.Parse(reader["idMateria"].ToString()),
                                    nombre = reader["nombre"].ToString(),
                                    descripcion = reader["descripcion"].ToString(),
                                    foto = reader["foto"].ToString(),
                                    horario = reader["horario"].ToString()
                                });
                            }
                        }
                    }
                }
                return new MateriasResponse
                {
                    materias = list
                };
            }
            catch (Exception ex)
            {
                return new MateriasResponse
                {
                    materias = null
                };
            }
        }

        // GET BY MATRICULA
        public MateriasResponse GetMateriaById(int idMateria)
        {
            List<MateriaModel> list = new List<MateriaModel>();
            try
            {
                using (SqlConnection conn = new SqlConnection(ConnectionString))
                {
                    conn.Open();
                    string tsql = "SELECT * FROM Materia WHERE idMateria = @idMateria";
                    using (SqlCommand cmd = new SqlCommand(tsql, conn))
                    {
                        cmd.Parameters.AddWithValue("@idMateria", idMateria);
                        using (SqlDataReader reader = cmd.ExecuteReader())
                        {
                            while (reader.Read())
                            {
                                list.Add(new MateriaModel
                                {
                                    idMateria = int.Parse(reader["idMateria"].ToString()),
                                    nombre = reader["nombre"].ToString(),
                                    descripcion = reader["descripcion"].ToString(),
                                    foto = reader["foto"].ToString(),
                                    horario = reader["horario"].ToString()
                                });
                            }
                        }
                    }
                }
                return new MateriasResponse
                {
                    materias = list
                };
            }
            catch (Exception ex)
            {
                return new MateriasResponse
                {
                    materias = null
                };
            }
        }
    }
}
