package Practica1DIS.XML;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 try {
             // Creo una instancia de DocumentBuilderFactory
             DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
             // Creo un documentBuilder
             DocumentBuilder builder = factory.newDocumentBuilder();
             // Creo un DOMImplementation
             DOMImplementation implementation = builder.getDOMImplementation();
  
             // Creo un documento con un elemento raiz
             Document documento = implementation.createDocument(null, "tienda", null);
             documento.setXmlVersion("1.0");
   
             // Creo los elementos
             Element productos = documento.createElement("productos");
             Element producto = documento.createElement("producto");
  
             // codigo
             Element codigo = documento.createElement("Codigo");
             Text textcodigo = documento.createTextNode("1111AAA");
             codigo.appendChild(textcodigo);
             producto.appendChild(codigo);
             //Nombre
             Element nombre = documento.createElement("Nombre");
             Text textnombre = documento.createTextNode("Chanclas");
             nombre.appendChild(textnombre);
             producto.appendChild(nombre);
  
             // Descripción
             Element descripcion = documento.createElement("Descripción");
             Text textdescripcion = documento.createTextNode("Para pies");
             descripcion.appendChild(textdescripcion);
             producto.appendChild(descripcion);
  
             // Precio
             Element precio = documento.createElement("stock");
             Text textPrecio = documento.createTextNode("30000");
             precio.appendChild(textPrecio);
             producto.appendChild(precio);
             
             // Localización
             Element localizacion = documento.createElement("localizacion");
             // Pasillo
             Element pasillo  = documento.createElement("pasillo");
             Text textpasillo  = documento.createTextNode("A-2");
             //Estanteria
             Element estanteria  = documento.createElement("estanteria");
             Text textestanteria  = documento.createTextNode("32");
             //Estante
             Element estante  = documento.createElement("estante");
             Text textestante  = documento.createTextNode("1");  
             pasillo.appendChild(textpasillo);
             localizacion.appendChild(pasillo);
             estanteria.appendChild(textestanteria);
             localizacion.appendChild(estanteria);
             estante.appendChild(textestante);
             localizacion.appendChild(estante);
             producto.appendChild(localizacion);
             
             // Pendientes de entrada en el almacen
             Element pendientes = documento.createElement("Pendientes");
             Text textpendientes = documento.createTextNode("300");
             pendientes.appendChild(textpendientes);
             producto.appendChild(pendientes);
             // Añado al elemento productos el elemento producto
             productos.appendChild(producto);
    }
}
