using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Threading.Tasks;
using VampiAPI.Models;

namespace VampiAPI.Models
{
    public class DetalleAlumnoModel
    {
        string ConnectionString = "Server=tcp:drivervampiserver.database.windows.net,1433;Initial Catalog=DriverVampi;Persist Security Info=False;User ID=drivervampiuser;Password=HermanasVampiro1@;MultipleActiveResultSets=False;Encrypt=True;TrustServerCertificate=False;Connection Timeout=30;";

        public int idDetalleAlumno { get; set; }

        public int matricula { get; set; }

        public float calif1 { get; set; }

        public float calif2 { get; set; }

        public float calif3 { get; set; }

        public string nombre { get; set; }

        public string descripcion { get; set; }

        public string foto { get; set; }

        public string horario { get; set; }

        // GET ALL
        public DetalleAlumnosResponse GetAll()
        {
            List<DetalleAlumnoModel> list = new List<DetalleAlumnoModel>();
            try
            {
                using (SqlConnection conn = new SqlConnection(ConnectionString))
                {
                    conn.Open();
                    string tsql = "SELECT * FROM DetalleAlumno";
                    using (SqlCommand cmd = new SqlCommand(tsql, conn))
                    {
                        using (SqlDataReader reader = cmd.ExecuteReader())
                        {
                            while (reader.Read())
                            {
                                list.Add(new DetalleAlumnoModel
                                {
                                    idDetalleAlumno = int.Parse(reader["idDetalleAlumno"].ToString()),
                                    matricula = int.Parse(reader["matricula"].ToString()),
                                    calif1 = float.Parse(reader["calif1"].ToString()),
                                    calif2 = float.Parse(reader["calif2"].ToString()),
                                    calif3 = float.Parse(reader["calif3"].ToString())
                                });
                            }
                        }
                    }
                }
                return new DetalleAlumnosResponse
                {
                    detalleAlumnos = list
                };
            }
            catch (Exception ex)
            {
                return new DetalleAlumnosResponse
                {
                    detalleAlumnos = null
                };
            }
        }

        // GET BY MATRICULA
        public DetalleAlumnosResponse GetMateriaByAlumno(int matricula)
        {
            List<DetalleAlumnoModel> list = new List<DetalleAlumnoModel> ();
            try
            {
                using (SqlConnection conn = new SqlConnection(ConnectionString))
                {
                    conn.Open();
                    string tsql = "SELECT idDetalleAlumno, matricula, calif1, calif2, calif3, nombre, descripcion, foto, horario FROM DetalleAlumno JOIN Materia ON DetalleAlumno.idMateria = Materia.idMateria WHERE DetalleAlumno.matricula = @matricula;";
                    using (SqlCommand cmd = new SqlCommand(tsql, conn))
                    {
                        cmd.Parameters.AddWithValue("@matricula", matricula);
                        using (SqlDataReader reader = cmd.ExecuteReader())
                        {
                            while (reader.Read())
                            {
                                list.Add(new DetalleAlumnoModel
                                {
                                    idDetalleAlumno = int.Parse(reader["idDetalleAlumno"].ToString()),
                                    matricula = int.Parse(reader["matricula"].ToString()),
                                    calif1 = float.Parse(reader["calif1"].ToString()),
                                    calif2 = float.Parse(reader["calif2"].ToString()),
                                    calif3 = float.Parse(reader["calif3"].ToString()),
                                    nombre = reader["nombre"].ToString(),
                                    descripcion = reader["descripcion"].ToString(),
                                    foto = reader["foto"].ToString(),
                                    horario = reader["horario"].ToString()
                                });
                            }
                        }
                    }
                }
                return new DetalleAlumnosResponse
                {
                    detalleAlumnos = list
                };
            }
            catch (Exception ex)
            {
                return new DetalleAlumnosResponse
                {
                    detalleAlumnos = null
                };
            }
        }

        // GET BY MATRICULA
        public DetalleAlumnosResponse GetAlumnoByMateria(int idMateria)
        {
            List<DetalleAlumnoModel> list = new List<DetalleAlumnoModel>();
            try
            {
                using (SqlConnection conn = new SqlConnection(ConnectionString))
                {
                    conn.Open();
                    string tsql = "SELECT idDetalleAlumno, matricula, calif1, calif2, calif3, nombre, descripcion, foto, horario FROM DetalleAlumno JOIN Materia ON DetalleAlumno.idMateria = Materia.idMateria WHERE DetalleAlumno.idMateria = @idMateria;";
                    using (SqlCommand cmd = new SqlCommand(tsql, conn))
                    {
                        cmd.Parameters.AddWithValue("@idMateria", idMateria);
                        using (SqlDataReader reader = cmd.ExecuteReader())
                        {
                            while (reader.Read())
                            {
                                list.Add(new DetalleAlumnoModel
                                {
                                    idDetalleAlumno = int.Parse(reader["idDetalleAlumno"].ToString()),
                                    matricula = int.Parse(reader["matricula"].ToString()),
                                    calif1 = float.Parse(reader["calif1"].ToString()),
                                    calif2 = float.Parse(reader["calif2"].ToString()),
                                    calif3 = float.Parse(reader["calif3"].ToString()),
                                    nombre = reader["nombre"].ToString(),
                                    descripcion = reader["descripcion"].ToString(),
                                    foto = reader["foto"].ToString(),
                                    horario = reader["horario"].ToString()
                                });
                            }
                        }
                    }
                }
                return new DetalleAlumnosResponse
                {
                    detalleAlumnos = list
                };
            }
            catch (Exception ex)
            {
                return new DetalleAlumnosResponse
                {
                    detalleAlumnos = null
                };
            }
        }

        /* GET BY MATRICULA
        public DetalleAlumnosResponse GetCalif(int matricula, int idMateria)
        {
            List<DetalleAlumnoModel> list = new List<DetalleAlumnoModel>();
            try
            {
                using (SqlConnection conn = new SqlConnection(ConnectionString))
                {
                    conn.Open();
                    string tsql = "SELECT idDetalleAlumno, matricula, calif1, calif2, calif3, nombre, descripcion, foto, horario FROM DetalleAlumno JOIN Materia ON DetalleAlumno.idMateria = Materia.idMateria WHERE matricula = @matricula AND idMateria = @idMateria";
                    using (SqlCommand cmd = new SqlCommand(tsql, conn))
                    {
                        cmd.Parameters.AddWithValue("@matricula", matricula);
                        cmd.Parameters.AddWithValue("@idMateria", idMateria);
                        using (SqlDataReader reader = cmd.ExecuteReader())
                        {
                            while (reader.Read())
                            {
                                list.Add(new DetalleAlumnoModel
                                {
                                    idDetalleAlumno = int.Parse(reader["idDetalleAlumno"].ToString()),
                                    matricula = int.Parse(reader["matricula"].ToString()),
                                    calif1 = float.Parse(reader["calif1"].ToString()),
                                    calif2 = float.Parse(reader["calif2"].ToString()),
                                    calif3 = float.Parse(reader["calif3"].ToString()),
                                    nombre = reader["nombre"].ToString(),
                                    descripcion = reader["descripcion"].ToString(),
                                    foto = reader["foto"].ToString(),
                                    horario = reader["horario"].ToString()
                                });
                            }
                        }
                    }
                }
                return new DetalleAlumnosResponse
                {
                    detalleAlumnos = list
                };
            }
            catch (Exception ex)
            {
                return new DetalleAlumnosResponse
                {
                    detalleAlumnos = null
                };
            }
        }*/

        // EDIT USER
        public int EditCalif()
        {
            try
            {
                using (SqlConnection conn = new SqlConnection(ConnectionString))
                {
                    conn.Open();
                    string tsql = "UPDATE DetalleAlumno SET calif1 = @calif1, calif2 = @calif2, calif3 = @calif3 WHERE idDetalleAlumno = @idDetalleAlumno";
                    using (SqlCommand cmd = new SqlCommand(tsql, conn))
                    {
                        cmd.CommandType = System.Data.CommandType.Text;
                        cmd.Parameters.AddWithValue("@calif1", calif1);
                        cmd.Parameters.AddWithValue("@calif2", calif2);
                        cmd.Parameters.AddWithValue("@calif3", calif3);
                        cmd.Parameters.AddWithValue("@idDetalleAlumno", idDetalleAlumno);
                        cmd.ExecuteNonQuery();
                    }
                }
                return idDetalleAlumno;
            }
            catch (Exception ex)
            {
                return 0;
            }
        }
    }
}
