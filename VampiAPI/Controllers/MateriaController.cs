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
    public class MateriaController : Controller
    {
        // GET: api/<DriverController>
        [HttpGet]
        public MateriasResponse Get()
        {
            return new MateriaModel().GetAll();
        }

        // GET: api/<DriverController>
        [HttpGet("{idMateria}")]
        public MateriasResponse GetById(int idMateria)
        {
            return new MateriaModel().GetMateriaById(idMateria);
        }
    }
}
