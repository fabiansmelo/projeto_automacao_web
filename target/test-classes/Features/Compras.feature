#language:pt
@TesteCompras
Funcionalidade: Adicionar itens ao carrinho
	
	Contexto: 
		Dado que o usuario esteja logado no sistema
	
	Cenario: Adicionar um item ao carrinho de compras
		Quando o usuario clica no botao Add To Cart
		Entao o sistema devera validar que os itens foram adicionados ao carrinho
	
	