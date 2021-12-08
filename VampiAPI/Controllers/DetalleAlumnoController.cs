using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using VampiAPI.Models;

namespace VampiAPI.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class DetalleAlumnoController : Controller
    {
        // GET: api/<DriverController>
        [HttpGet]
        public DetalleAlumnosResponse Get()
        {
            return new DetalleAlumnoModel().GetAll();
        }

        // GET: api/<DriverController>
        [HttpGet("matricula/{matricula}")]
        public DetalleAlumnosResponse GetMateriaByAlumno(int matricula)
        {
            return new DetalleAlumnoModel().GetMateriaByAlumno(matricula);
        }

        // GET: api/<DriverController>
        [HttpGet("idMateria/{idMateria}")]
        public DetalleAlumnosResponse GetAlumnoByMateria(int idMateria)
        {
            return new DetalleAlumnoModel().GetAlumnoByMateria(idMateria);
        }

        /* GET: api/<DriverController>
        [HttpGet("{matricula}/{idMateria}")]
        public DetalleAlumnosResponse GetCalif(int matricula, int idMateria)
        {
            return new DetalleAlumnoModel().GetCalif(matricula, idMateria);
        }*/

        // PUT <PetsController>/5
        [HttpPut]
        public int Put([FromBody] DetalleAlumnoModel detalleAlumno)
        {
            return detalleAlumno.EditCalif();
        }
    }
}
