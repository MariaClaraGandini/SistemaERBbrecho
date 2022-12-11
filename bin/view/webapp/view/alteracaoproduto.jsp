
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alterar | Produto </title>

</head>
<body>
<jsp:include page="layouttopo.jsp"></jsp:include>
<div class="flex pl-5 mt-20" aria-label="Breadcrumb">
    <ol class="inline-flex items-center space-x-1 md:space-x-3">
      <li class="inline-flex items-center">
        <a href="/index" class="inline-flex items-center text-sm font-medium text-gray-700 hover:text-gray-900 dark:text-gray-400 dark:hover:text-white">
          <svg class="w-4 h-4 mr-2" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path d="M10.707 2.293a1 1 0 00-1.414 0l-7 7a1 1 0 001.414 1.414L4 10.414V17a1 1 0 001 1h2a1 1 0 001-1v-2a1 1 0 011-1h2a1 1 0 011 1v2a1 1 0 001 1h2a1 1 0 001-1v-6.586l.293.293a1 1 0 001.414-1.414l-7-7z"></path></svg>
          P�gina Inicial
        </a>
      </li>
      <li>
        <div class="flex items-center">
          <svg class="w-6 h-6 text-gray-400" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" d="M7.293 14.707a1 1 0 010-1.414L10.586 10 7.293 6.707a1 1 0 011.414-1.414l4 4a1 1 0 010 1.414l-4 4a1 1 0 01-1.414 0z" clip-rule="evenodd"></path></svg>
          <a href="/listagemprodutos" class="ml-1 text-sm font-medium text-gray-700 hover:text-gray-900 md:ml-2 dark:text-gray-400 dark:hover:text-white">Produtos</a>
        </div>
      </li>
      <li>
        <div class="flex items-center">
          <svg class="w-6 h-6 text-gray-400" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" d="M7.293 14.707a1 1 0 010-1.414L10.586 10 7.293 6.707a1 1 0 011.414-1.414l4 4a1 1 0 010 1.414l-4 4a1 1 0 01-1.414 0z" clip-rule="evenodd"></path></svg>
          <a href="/alterarproduto" class="ml-1 text-sm font-medium text-gray-700 hover:text-gray-900 md:ml-2 dark:text-gray-400 dark:hover:text-white">Cadastrar Produto</a>
        </div>
      </li>
    </ol>
</div>

<div class="bg-white m-5  dark:bg-gray-700">
  <div class="flex justify-between items-end responsividade">
  <h1 class="flex pl-4 pt-5 text-4xl font-semibold text-gray-700 dark:text-white ">Produto</h1>
</div>

 <!-- forms -->
<form method="POST" action="/alterarproduto">
    <h2 class="flex pl-4 pt-5 text-xl text-gray-400">Dados Cadastrais</h2>
    <div class="pl-4 pt-5 pr-4 grid gap-6 mb-6 md:grid-cols-3">
    	<input class="form-control hidden" type="text" id="codigo" name="codigo" 
					value="${produto.getCodigo()}" disabled>
	<input type="hidden" name="codigo" value="${produto.getCodigo()}">
				
        <div>
        
            <label class="block mb-2 text-sm font-medium text-black dark:text-gray-300">Descri��o</label>
            <input type="text" id="descricao" name="descricao" value="${produto.getDescricao()}" class="bg-white border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-gray-400 focus:border-gray-200 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400  dark:bg-gray-700 dark:focus:border-gray-200" required>
        </div>
        <!-- <div>
            <label class="block mb-2 text-sm font-medium text-black dark:text-gray-300">C�digo de barras (EAN)</label>
           <input type="text" id="codigo" class="bg-white border border-r-2 border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-gray-400 focus:border-gray-200 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400 dark:bg-gray-700 dark:focus:border-gray-200" placeholder="Ex: 0000000001" required>
        </div> -->
        <div class="pr-2">
            <label class="block mb-2 text-sm font-medium text-black dark:text-gray-300">Pre�o de Venda (R$)</label>
            <input type="text" step="0.1" value="${produto.getValor()}" id="valorvenda" name="valor" class="bg-white border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-gray-400 focus:border-gray-200 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400 dark:focus:border-gray-200" placeholder="Ex: 199,50" required>
        </div>
    </div>
    <h2 class="flex pl-5  ml-5 text-xl text-gray-400">Estoque</h2>
    <label class="block mb-2 pl-5 text-sm font-medium text-black dark:text-gray-300 mt-4">Estoque</label>
      
    
    <input type="number" step="1" id="estoque" name="quantidade" value="${produto.getQuantidade()}" class="block p-2.5 ml-4 input z-20 text-sm text-gray-900  rounded-lg border-l-gray-100 border-l-2 border border-gray-300 focus:ring-gray-400 focus:border-gray-200 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:border-gray-200" placeholder="Ex:1" required>
     <h2 class="flex pl-5 pt-5 text-xl text-gray-400">Dados Fiscais</h2>
    <div class="pl-5 pt-5 pr-5 grid gap-6 mb-6 md:grid-cols-3 mr-4">
                  <div >
                <label class="block mb-2 text-sm font-medium text-black dark:text-gray-300">Origem</label>
                <select id="origem" class="bg-white border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-gray-400 focus:border-gray-200 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400 dark:focus:border-gray-200">
                  <option value="0" selected>0 - Nacional, exceto as indicadas nos códigos 3, 4, 5 e 8</option>
                  <option value="1">1 - Estrangeira - Importação direta, exceto a indicada no código 6</option>
                  <option value="2">2 - Estrangeira - Adquirida no mercado interno, exceto a indicada no código 7</option>
                  <option value="3">3 - Nacional, mercadoria ou bem com Conteúdo de Importação superior a 40% e inferior ou igual a 70%</option>
                  <option value="4">4 - Nacional, cuja produção tenha sido feita em conformidade com os processos produtivos básicos de que tratam as legislações citadas nos Ajustes</option>
                  <option value="5">5 - Nacional, mercadoria ou bem com Conteúdo de Importação inferior ou igual a 40%</option>
                  <option value="6">6 - Estrangeira - Importação direta, sem similar nacional, constante em lista da CAMEX</option>
                  <option value ="7">7 - Estrangeira - Adquirida no mercado interno, sem similar nacional, constante em lista da CAMEX</option>
                  <option value="8">8 - Nacional, mercadoria ou bem com Conteúdo de Importação superior a 70%</option>
                  </select>
              </div>
            <div>
                <label class="block mb-2 text-sm font-medium text-black dark:text-gray-300">NCM</label>
                  <input id="ncm" class="block p-2.5 w-full z-20 text-sm text-gray-900  rounded-lg border-l-gray-100 border-l-2 border border-gray-300 focus:ring-gray-400 focus:border-gray-200 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:border-gray-200" placeholder="NCM" required>
            </div>
              <div>
                <label class="block mb-2 text-sm font-medium text-black dark:text-gray-300">CEST</label>
                <input type="text" id="cest" name="cest" class="bg-white border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-gray-400 focus:border-gray-200 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400 dark:focus:border-gray-200" placeholder="City Name" required>
            </div>
            </div>
            <div class="flex pt-5">
              <button class=" ml-1 mt-5 cancelarbotao bg-transparent hover:bg-green-200  block  mb-2 p-2.5 w-full z-20 text-sm text-gray-900  rounded-lg  border border border-green-300 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:hover:bg-green-700 mr-1">Cancelar</button>
    
              <button  id="btn-nt-show" type="submit" class=" flex-wrap block cadastrarbotao 0 mt-1 mb-2 p-2.5 w-full z-20 text-sm text-gray-900  rounded-lg border-l-gray-100 border-l-2 border border-gray-300 focus:ring-gray-400 focus:border-gray-200 ">Cadastrar</button>
          </div>
         </div>
</form>
</div>

<script>
const descricao= document.getElementById("descricao")
const codigo = document.getElementById("codigo")
const valorvenda= document.getElementById("valorvenda")
const estoque= document.getElementById("estoque")
const ncm= document.getElementById("ncm")

	var teste= 2;



function validar(){

if(descricao.value=='') {
descricao.className="bg-white border  border-red-500 text-gray-900 text-sm rounded-lg focus:ring-red-500 focus:border-red-500 block w-full p-2.5 dark:bg-gray-700 dark:border-red-500 dark:placeholder-gray-400 dark:text-white dark:focus:ring-red-500 dark:focus:border-red-500";

  
} 
 if(codigo.value=='') {
codigo.className="bg-white border  border-red-500 text-gray-900 text-sm rounded-lg focus:ring-red-500 focus:border-red-500 block w-full p-2.5 dark:bg-gray-700 dark:border-red-500 dark:placeholder-gray-400 dark:text-white dark:focus:ring-red-500 dark:focus:border-red-500";

  
} 
 if(valorvenda.value=='') {
valorvenda.className="bg-white border border-red-500 text-gray-900 text-sm rounded-lg focus:ring-red-500 focus:border-red-500 block w-full p-2.5 dark:bg-gray-700 dark:border-red-500 dark:placeholder-gray-400 dark:text-white dark:focus:ring-red-500 dark:focus:border-red-500"   ;

} 
 if(estoque.value=='') {
estoque.className=" block p-2.5 ml-4 input z-20 text-sm text-gray-900  rounded-lg border-lg  border border-red-500 focus:ring-gray-400 focus:border-red-500 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:border-red-500";

  
}
 if(ncm.value=='') {
ncm.className="bg-white border border-red-500 text-gray-900 text-sm rounded-lg focus:ring-red-500 focus:border-red-500 block w-full p-2.5 dark:bg-gray-700 dark:border-red-500 dark:placeholder-gray-400 dark:text-white dark:focus:ring-red-500 dark:focus:border-red-500";
 
}
 if(descricao.value=='' || codigo.value=='' || valorvenda.value<=0|| estoque.value<=0 || ncm.value=='' ){
	  notifier.show('Preencha todos os campos!', 'campos em vermelho precisam ser preenchidos.', 'warning', '/imagens/danger.png', 5000);
}
 else {
	
	  notifier.show('Produto Cadastrado com sucesso!', '', 'success', '/imagens/check-mark-img.png', 5000);
	  descricao.className="bg-white border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-gray-400 focus:border-gray-200 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400  dark:bg-gray-700 dark:focus:border-gray-200";
	  codigo.className="bg-white border border-r-2 border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-gray-400 focus:border-gray-200 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400 dark:bg-gray-700 dark:focus:border-gray-200";
	  valorvenda.className="bg-white border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-gray-400 focus:border-gray-200 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400 dark:focus:border-gray-200";
	  estoque.className="block p-2.5 ml-4 input z-20 text-sm text-gray-900  rounded-lg border-lg  border border-red-500 focus:ring-gray-400 focus:border-red-500 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:border-red-500";
	
 }
 
	}
	  function redirecionar(){
	  window.location="/listagemprodutos";
	  }
  
</script>
<style>

  .input{
    width:31%;
  }
  .cadastrarbotao{
      width:13em;
      margin-top: 2%;
      background-color: #0bde97;
      color: white;
      
    }
    .cadastrarbotao:hover{
      background-color: #0bc889;
    }

.cancelarbotao{
  width:13em;
  margin-top: 2%;
}


</style>
</body>
</html>