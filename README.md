# services-architecture

Caso Amazon

Suponho que você seja contratado para desenvolver algunas funcionalidades do e-commerce da
Amazon, alguns desejos dos usuários são descritos abaixo e você deve desenhar e implementar uma
solução baseada em Microserviços.
* Possibilidade de visualizar os produtos de um determinado gênero;
* Possibilidade de visualizar os detalhes de cada produto;
* Possibilidade de adicionar itens na sua lista de desejo;
* Possibilidade de buscar um produto por palavra-chave;
* Possibilidade de exibir os produtos mais vistos por categorias;
* Possibilidade de abrir um chamado técnico de algum problema que está acontecendo;
* Possibilidade de acompanhar os dados do seu pedido;
* Possibilidade de calcular o frete de uma compra;


Microserviço amazom-produto

listar produto GET
http://localhost:8080/produto

buscar produto por id GET
http://localhost:8080/produto/1

Adicionar produto POST
http://localhost:8080/produto
Payload:
{
        "nome": "Capa Kindle",
        "descricao": "Capa do Kidle 8",
        "tag": "leitor",
        "detalhe": {
            "id": 1
        },
        "genero": {
            "id": 1
        }
}

Alterar produto POST
http://localhost:8080/produto
Payload:
{
        "id": 1,
        "nome": "Capa Kindle",
        "descricao": "Capa do Kidle 8",
        "tag": "leitor",
        "detalhe": {
            "id": 1
        },
        "genero": {
            "id": 1
        }
}

Obter produto por genero GET
http://localhost:8080/produto/obter-por-genero/1

Obter produto por tag
http://localhost:8080/produto/obter-por-tag/leitor


amazon-desejo

adicionar itens - POST
	http://localhost:8080/desejo
	Payload:
	{
        "id_cliente": "2",
        "id_produto": "10",
        "data": "25/10/2019",
    }
	
buscar desejo por id - GET
	http://localhost:8080/desejo/1
	
	
amazon-pedido
	 acompanhar os dados do seu pedido; buscar por id -GET
	 http://localhost:8080/pedido/1
	
amazon-suporte
	
	buscar chamado por ID - GET - http://localhost:8080/chamado/1
	 
	 abrir um chamado técnico de algum problema que está acontecendo - POST
	 http://localhost:8080/chamado
	Payload:
	{
        	"descricao": "Erro ao adicionar produto",
        	"telefone_contato": "(11) 98888-8888)",
        	"data": "20/11/2019",
        	"status": "aberto"
	}
	 

amazon-frete
	 calcular o frete de uma compra - POST;
	http://localhost:8080/frete
	{
        	"cep": "06666-666",
        	"peso": "5 kg"
	}
	
	
