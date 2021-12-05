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
    public class DetalleMaestroController : Controller
    {
        // GET: api/<DriverController>
        [HttpGet]
        public DetalleMaestrosResponse Get()
        {
            return new DetalleMaestroModel().GetAll();
        }

        // GET: api/<DriverController>
        [HttpGet("{matricula}")]
        public DetalleMaestrosResponse GetMateriaByMaestro(int matricula)
        {
            return new DetalleMaestroModel().GetMateriaByMaestro(matricula);
        }
    }
}
