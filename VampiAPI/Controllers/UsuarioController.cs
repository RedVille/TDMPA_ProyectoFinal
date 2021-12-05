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
    public class UsuarioController : Controller
    {
        // GET: api/<DriverController>
        [HttpGet]
        public UsuariosResponse Get()
        {
            return new UsuarioModel().GetAll();
        }

        // GET: api/<DriverController>
        [HttpGet("{matricula}")]
        public UsuariosResponse GetByMatricula(int matricula)
        {
            return new UsuarioModel().GetUsuarioByMatricula(matricula);
        }

        // PUT <PetsController>/5
        [HttpPut]
        public int Put([FromBody] UsuarioModel usuario)
        {
            return usuario.EditUsuario();
        }
    }
}
