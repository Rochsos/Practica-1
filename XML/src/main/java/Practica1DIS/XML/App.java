package Practica1DIS.XML;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

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
            
            DocumentType doctype = implementation.createDocumentType("doctype",
                    "TIENDA",
                    "tienda.dtd");
 
            // Creo un documento con un elemento raiz
            Document documento = implementation.createDocument(null, "tienda", null);
            documento.setXmlVersion("1.0");
  
            // Creo los elementos
            Element productos = documento.createElement("productos");
            Element producto = documento.createElement("producto");
 
            // codigo
            Element codigo = documento.createElement("codigo");
            Text textcodigo = documento.createTextNode("1111AAA");
            codigo.appendChild(textcodigo);
            producto.appendChild(codigo);
            //Nombre
            Element nombre = documento.createElement("nombre");
            Text textnombre = documento.createTextNode("Chanclas");
            nombre.appendChild(textnombre);
            producto.appendChild(nombre);
 
            // Descripción
            Element descripcion = documento.createElement("descripción");
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
            Element pendientes = documento.createElement("pendientes");
            Text textpendientes = documento.createTextNode("300");
            pendientes.appendChild(textpendientes);
            producto.appendChild(pendientes);
            
            // Añado al elemento productos el elemento producto
            productos.appendChild(producto);


            //Añadimos el apartado para clientes
            Element clientes = documento.createElement("clientes");
            Element cliente = documento.createElement("cliente");
            // codigo
            Element cnombre = documento.createElement("nombre");
            Text textcnombre = documento.createTextNode("Godofredo");
            nombre.appendChild(textcnombre);
            cliente.appendChild(cnombre);
            //Nombre
            Element capellidos= documento.createElement("apellidos");
            Text textcapellidos = documento.createTextNode("Perez Ortiz");
            capellidos.appendChild(textcapellidos);
            cliente.appendChild(capellidos);
 
            // Descripción
            Element email = documento.createElement("email");
            Text textemail = documento.createTextNode("godofredopor@email.com");
            email.appendChild(textemail);
            cliente.appendChild(email);
 
            // Telefono
            Element telefono = documento.createElement("telefono");
            Text texttelefono= documento.createTextNode("60175243");
            telefono.appendChild(texttelefono);
            cliente.appendChild(telefono);
            
            // Direccion de entrega
            Element direccionentrega = documento.createElement("direccion");
            // Calle
            Element calle  = documento.createElement("calle");
            Text textcalle  = documento.createTextNode("Aljofrillos");
            //Numero 
            Element numero = documento.createElement("numero");
            Text textnumero  = documento.createTextNode("8");
            //Codigo postal
            Element codigopostal  = documento.createElement("cp");
            Text textcodigopostal   = documento.createTextNode("29031"); 
            //Poblacion
            Element poblacion  = documento.createElement("poblacion");
            Text textpoblacion   = documento.createTextNode("Guadalajara");             
            //Codigo postal
            Element pais  = documento.createElement("pais");
            Text textpais  = documento.createTextNode("España"); 
            
            
            calle.appendChild(textcalle);
            direccionentrega.appendChild(calle);
            
            numero.appendChild(textnumero);
            direccionentrega.appendChild(numero);
            
            codigopostal.appendChild(textcodigopostal );
            direccionentrega.appendChild(codigopostal);
            
            poblacion.appendChild(textpoblacion );
            direccionentrega.appendChild(poblacion);
            
            pais.appendChild(textpais);
            direccionentrega.appendChild(pais);
            
            //Cerramos la dirección de entrega a clientes
            cliente.appendChild(direccionentrega);
            
            //Cerramos la información de clientes
            clientes.appendChild(cliente);
            
        
            //Añadimos el apartado para pedidos
            Element pedidos = documento.createElement("pedidos");
            Element pedido = documento.createElement("pedido");
            // Productos
            Element productosp = documento.createElement("productos");
            Text textproductosp= documento.createTextNode("100");
            productosp.appendChild(textproductosp);
            pedido.appendChild(productosp);
            
            // Cantidad
            Element cantidad = documento.createElement("cantidad");
            Text textcantidad = documento.createTextNode("100000");
            cantidad.appendChild(textcantidad);
            pedido.appendChild(cantidad);
            
            // Direccion de entrega
            Element direccionentregap = documento.createElement("direccion");
            // Calle
            Element callep  = documento.createElement("calle");
            Text textcallep  = documento.createTextNode("Aljofrillos");
            //Numero 
            Element numerop = documento.createElement("numero");
            Text textnumerop  = documento.createTextNode("8");
            //Codigo postal
            Element codigopostalp  = documento.createElement("cp");
            Text textcodigopostalp   = documento.createTextNode("29031"); 
            //Poblacion
            Element poblacionp  = documento.createElement("poblacion");
            Text textpoblacionp   = documento.createTextNode("Guadalajara");             
            //Codigo postal
            Element paisp  = documento.createElement("pais");
            Text textpaisp  = documento.createTextNode("España"); 
            
            callep.appendChild(textcallep);
            direccionentregap.appendChild(callep);
            
            numerop.appendChild(textnumerop);
            direccionentregap.appendChild(numerop);
            
            codigopostalp.appendChild(textcodigopostalp);
            direccionentregap.appendChild(codigopostalp);
            
            poblacionp.appendChild(textpoblacionp);
            direccionentregap.appendChild(poblacionp);
            
            paisp.appendChild(textpaisp);
            direccionentregap.appendChild(pais);
            pedido.appendChild(direccionentregap);       
		    // Destinatario
		    Element destinatario = documento.createElement("destinatario");
		    Text textdestinatario = documento.createTextNode("Pepe");
		    destinatario.appendChild(textdestinatario);
		    pedido.appendChild(destinatario);
		    
		    // Fecha de entrega aproximada
		    Element fechaentrega = documento.createElement("fechaEntrega");
		    Text textfechaentrega = documento.createTextNode("11/03/2020");
		    fechaentrega.appendChild(textfechaentrega);
		    pedido.appendChild(fechaentrega);
		    
		    pedidos.appendChild(pedido);
		    
            //Cerramos la dirección de entrega a clientes


            //Añado al root el elemento productos 
            documento.getDocumentElement().appendChild(productos);
            documento.getDocumentElement().appendChild(clientes);
            documento.getDocumentElement().appendChild(pedidos);
            // Asocio el source con el Document
            Source source = new DOMSource(documento);
            // Creo el Result, indicado que fichero se va a crear
            Result result = new StreamResult(new File("tienda.xml"));
 
            // Creo un transformer, se crea el fichero XML.
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty(OutputKeys.DOCTYPE_PUBLIC, doctype.getPublicId());
            transformer.setOutputProperty(OutputKeys.DOCTYPE_SYSTEM, doctype.getSystemId());
            
            transformer.transform(source, result);
 
        } catch (ParserConfigurationException | TransformerException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
