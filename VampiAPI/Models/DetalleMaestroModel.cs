using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Threading.Tasks;
using VampiAPI.Models;

namespace VampiAPI.Models
{
    public class DetalleMaestroModel
    {
        string ConnectionString = "Server=tcp:drivervampiserver.database.windows.net,1433;Initial Catalog=DriverVampi;Persist Security Info=False;User ID=drivervampiuser;Password=HermanasVampiro1@;MultipleActiveResultSets=False;Encrypt=True;TrustServerCertificate=False;Connection Timeout=30;";

        public int idDetalleMaestro { get; set; }

        public int idMateria { get; set; }

        public int matricula { get; set; }

        // GET ALL
        public DetalleMaestrosResponse GetAll()
        {
            List<DetalleMaestroModel> list = new List<DetalleMaestroModel>();
            try
            {
                using (SqlConnection conn = new SqlConnection(ConnectionString))
                {
                    conn.Open();
                    string tsql = "SELECT * FROM DetalleMaestro";
                    using (SqlCommand cmd = new SqlCommand(tsql, conn))
                    {
                        using (SqlDataReader reader = cmd.ExecuteReader())
                        {
                            while (reader.Read())
                            {
                                list.Add(new DetalleMaestroModel
                                {
                                    idDetalleMaestro = int.Parse(reader["idDetalleMaestro"].ToString()),
                                    idMateria = int.Parse(reader["idMateria"].ToString()),
                                    matricula = int.Parse(reader["matricula"].ToString())
                                });
                            }
                        }
                    }
                }
                return new DetalleMaestrosResponse
                {
                    detalleMaestros = list
                };
            }
            catch (Exception ex)
            {
                return new DetalleMaestrosResponse
                {
                    detalleMaestros = null
                };
            }
        }

        // GET BY MATRICULA
        public DetalleMaestrosResponse GetMateriaByMaestro(int matricula)
        {
            List<DetalleMaestroModel> list = new List<DetalleMaestroModel>();
            try
            {
                using (SqlConnection conn = new SqlConnection(ConnectionString))
                {
                    conn.Open();
                    string tsql = "SELECT * FROM DetalleMaestro WHERE matricula = @matricula";
                    using (SqlCommand cmd = new SqlCommand(tsql, conn))
                    {
                        cmd.Parameters.AddWithValue("@matricula", matricula);
                        using (SqlDataReader reader = cmd.ExecuteReader())
                        {
                            while (reader.Read())
                            {
                                list.Add(new DetalleMaestroModel
                                {
                                    idDetalleMaestro = int.Parse(reader["idDetalleMaestro"].ToString()),
                                    idMateria = int.Parse(reader["idMateria"].ToString()),
                                    matricula = int.Parse(reader["matricula"].ToString())
                                });
                            }
                        }
                    }
                }
                return new DetalleMaestrosResponse
                {
                    detalleMaestros = list
                };
            }
            catch (Exception ex)
            {
                return new DetalleMaestrosResponse
                {
                    detalleMaestros = null
                };
            }
        }
    }
}
