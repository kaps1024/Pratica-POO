import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class ServidorTeste {

    public static void iniciarServidor()
        throws IOException {

        HttpServer server =
            HttpServer.create(
                new InetSocketAddress(8080),
                0
            );

        server.createContext(
            "/testeEntrada",
            (HttpExchange exchange) -> {

                EntradaEstoqueTest teste =
                    new EntradaEstoqueTest();

                teste.verificarEntrada();

                String resposta =
                    "Teste EntradaEstoque executado com sucesso.";

                exchange.sendResponseHeaders(
                    200,
                    resposta.length()
                );

                OutputStream os =
                    exchange.getResponseBody();

                os.write(
                    resposta.getBytes()
                );

                os.close();
            }
        );

        server.setExecutor(null);

        server.start();

        System.out.println(
            "Servidor iniciado:"
        );

        System.out.println(
            "http://localhost:8080/testeEntrada"
        );
    }
}