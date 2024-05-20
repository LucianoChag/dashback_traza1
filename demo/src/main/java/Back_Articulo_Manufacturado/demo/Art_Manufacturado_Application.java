package Back_Articulo_Manufacturado.demo;

import Back_Articulo_Manufacturado.demo.domain.entities.*;
import Back_Articulo_Manufacturado.demo.repositories.*;
import jakarta.transaction.Transactional;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.time.LocalTime;


@SpringBootApplication
public class Art_Manufacturado_Application {
	private static final Logger logger = LoggerFactory.getLogger(Art_Manufacturado_Application.class);

	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ImagenPersonaRepository imagenPersonaRepository;


	@Autowired
	private PaisRepository paisRepository;

	@Autowired
	private ProvinciaRepository provinciaRepository;

	@Autowired
	private LocalidadRepository localidadRepository;

	@Autowired
	private EmpresaRepository empresaRepository;

	@Autowired
	private SucursalRepository sucursalRepository;

	@Autowired
	private DomicilioRepository domicilioRepository;

	@Autowired
	private UnidadMedidaRepository unidadMedidaRepository;

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
	private ArticuloInsumoRepository articuloInsumoRepository;

	@Autowired
	private ArticuloManufacturadoRepository articuloManufacturadoRepository;

	@Autowired
	private ImagenArticuloRepository imagenArticuloRepository;

	@Autowired
	private PromocionRepository promocionRepository;

	@Autowired
	private ArticuloManufacturadoDetalleRepository articuloManufacturadoDetalleRepository;

	@Autowired
	private PedidoRepository pedidoRepository;

	public static void main(String[] args) {
		SpringApplication.run(Art_Manufacturado_Application.class, args);
		logger.info("Estoy activo en el main");
	}

	@Bean
	@Transactional
	CommandLineRunner init(
			ClienteRepository clienteRepository,
			ImagenPersonaRepository imagenPersonaRepository,
			PromocionDetalleRepository promocionDetalleRepository,
			UsuarioRepository usuarioRepository,
			PaisRepository paisRepository,
			ProvinciaRepository provinciaRepository,
			LocalidadRepository localidadRepository,
			EmpresaRepository empresaRepository,
			SucursalRepository sucursalRepository,
			DomicilioRepository domicilioRepository,
			UnidadMedidaRepository unidadMedidaRepository,
			CategoriaRepository categoriaRepository,
			ArticuloInsumoRepository articuloInsumoRepository,
			ArticuloManufacturadoRepository articuloManufacturadoRepository,
			ImagenArticuloRepository imagenArticuloRepository,
			PromocionRepository promocionRepository,
			PedidoRepository pedidoRepository,
			EmpleadoRepository empleadoRepository,
			FacturaRepository facturaRepository) {
		return args -> {
			logger.info("----------------ESTOY----FUNCIONANDO---------------------");

			// Persistir datos iniciales

			// Crear y guardar pais
			Pais pais1 = Pais.builder().nombre("Argentina").build();
			paisRepository.save(pais1);

			// Crear y guardar provincias
			Provincia provincia1 = Provincia.builder().nombre("Mendoza1").pais(pais1).build();
			Provincia provincia2 = Provincia.builder().nombre("Buenos Aires1").pais(pais1).build();
			provinciaRepository.save(provincia1);
			provinciaRepository.save(provincia2);

			// Crear y guardar localidades
			Localidad localidad1 = Localidad.builder().nombre("Lujan de Cuyo1").provincia(provincia1).build();
			Localidad localidad2 = Localidad.builder().nombre("Guaymallen1").provincia(provincia1).build();
			Localidad localidad3 = Localidad.builder().nombre("Mar del Plata1").provincia(provincia2).build();
			Localidad localidad4 = Localidad.builder().nombre("Mar de las Pampas1").provincia(provincia2).build();
			localidadRepository.save(localidad1);
			localidadRepository.save(localidad2);
			localidadRepository.save(localidad3);
			localidadRepository.save(localidad4);

			// Crear y guardar empresa
			Empresa empresaCarlos = Empresa.builder().nombre("Lo de Carlos").cuil(30546780L).razonSocial("Venta de Alimentos").build();
			empresaRepository.save(empresaCarlos);

			// Crear y guardar sucursales y domicilios
			Sucursal sucursalGuaymallen = Sucursal.builder()
					.nombre("En Guaymallen")
					.horarioApertura(LocalTime.of(17, 0))
					.horarioCierre(LocalTime.of(23, 0))
					.esCasaMatriz(true)
					.domicilio(Domicilio.builder().cp(5519).calle("Berutti").numero(2684).piso(0).nroDpto(5).localidad(localidad1).build())
					.empresa(empresaCarlos)
					.build();

			Sucursal sucursalMarDelPlata = Sucursal.builder()
					.nombre("En MDQ")
					.horarioApertura(LocalTime.of(16, 0))
					.horarioCierre(LocalTime.of(23, 30))
					.esCasaMatriz(false)
					.domicilio(Domicilio.builder().cp(7600).calle("Gaboto").numero(3475).localidad(localidad2).build())
					.empresa(empresaCarlos)
					.build();

			sucursalRepository.save(sucursalGuaymallen);
			sucursalRepository.save(sucursalMarDelPlata);
			empresaRepository.save(empresaCarlos);

			// Crear y guardar categorías
			Categoria categoriaBebidas = Categoria.builder().denominacion("Bebidas").esInsumo(true).build();
			categoriaRepository.save(categoriaBebidas);

			Categoria categoriaGaseosas = Categoria.builder().denominacion("Gaseosas").esInsumo(true).build();
			categoriaRepository.save(categoriaGaseosas);

			Categoria categoriaTragos = Categoria.builder().denominacion("Tragos").esInsumo(true).build();
			categoriaRepository.save(categoriaTragos);

			Categoria categoriaPizzas = Categoria.builder().denominacion("Pizzas").esInsumo(false).build();
			categoriaRepository.save(categoriaPizzas);

			Categoria categoriaInsumos = Categoria.builder().denominacion("Insumos").esInsumo(true).build();
			categoriaRepository.save(categoriaInsumos);

			// Asociar subcategorías
			categoriaBebidas.getSubCategorias().add(categoriaGaseosas);
			categoriaBebidas.getSubCategorias().add(categoriaTragos);
			categoriaRepository.save(categoriaBebidas);

			// Asociar categorías a sucursales
			sucursalGuaymallen.getCategorias().add(categoriaInsumos);
			sucursalGuaymallen.getCategorias().add(categoriaBebidas);
			sucursalGuaymallen.getCategorias().add(categoriaGaseosas);
			sucursalGuaymallen.getCategorias().add(categoriaTragos);
			sucursalGuaymallen.getCategorias().add(categoriaPizzas);
			sucursalRepository.save(sucursalGuaymallen);

			sucursalMarDelPlata.getCategorias().add(categoriaInsumos);
			sucursalMarDelPlata.getCategorias().add(categoriaBebidas);
			sucursalMarDelPlata.getCategorias().add(categoriaGaseosas);
			sucursalMarDelPlata.getCategorias().add(categoriaTragos);
			sucursalMarDelPlata.getCategorias().add(categoriaPizzas);
			sucursalRepository.save(sucursalMarDelPlata);

			// Crear y guardar unidades de medida
			UnidadMedida unidadMedidaLitros = UnidadMedida.builder().denominacion("Litros").build();
			UnidadMedida unidadMedidaGramos = UnidadMedida.builder().denominacion("Gramos").build();
			UnidadMedida unidadMedidaCantidad = UnidadMedida.builder().denominacion("Cantidad").build();
			UnidadMedida unidadMedidaPorciones = UnidadMedida.builder().denominacion("Porciones").build();
			unidadMedidaRepository.save(unidadMedidaLitros);
			unidadMedidaRepository.save(unidadMedidaGramos);
			unidadMedidaRepository.save(unidadMedidaCantidad);
			unidadMedidaRepository.save(unidadMedidaPorciones);

			// Crear y guardar insumos
			ArticuloInsumo cocaCola = ArticuloInsumo.builder()
					.denominacion("Coca cola")
					.unidadMedida(unidadMedidaLitros)
					.esParaElaborar(false)
					.stockActual(5)
					.stockMaximo(50)
					.precioCompra(50.0)
					.precioVenta(70.0)
					.build();

			ArticuloInsumo harina = ArticuloInsumo.builder()
					.denominacion("Harina")
					.unidadMedida(unidadMedidaGramos)
					.esParaElaborar(true)
					.stockActual(4)
					.stockMaximo(40)
					.precioCompra(40.0)
					.precioVenta(60.5)
					.build();

			ArticuloInsumo queso = ArticuloInsumo.builder()
					.denominacion("Queso")
					.unidadMedida(unidadMedidaGramos)
					.esParaElaborar(true)
					.stockActual(20)
					.stockMaximo(50)
					.precioCompra(23.6)
					.precioVenta(66.6)
					.build();

			ArticuloInsumo tomate = ArticuloInsumo.builder()
					.denominacion("Tomate")
					.unidadMedida(unidadMedidaCantidad)
					.esParaElaborar(true)
					.stockActual(20)
					.stockMaximo(50)
					.precioCompra(23.6)
					.precioVenta(66.6)
					.build();

			articuloInsumoRepository.save(cocaCola);
			articuloInsumoRepository.save(harina);
			articuloInsumoRepository.save(queso);
			articuloInsumoRepository.save(tomate);

			// Crear y guardar manufacturados
			ArticuloManufacturado pizzaMuzza = ArticuloManufacturado.builder()
					.denominacion("Pizza de muzza")
					.precioVenta(600.0)
					.tiempoEstimadoMinutos(10)
					.build();
			articuloManufacturadoRepository.save(pizzaMuzza);

			ArticuloManufacturado pizzaNapolitana = ArticuloManufacturado.builder()
					.denominacion("Pizza napolitana")
					.precioVenta(700.0)
					.tiempoEstimadoMinutos(10)
					.build();
			articuloManufacturadoRepository.save(pizzaNapolitana);


		};
	}
}
