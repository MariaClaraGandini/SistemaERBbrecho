
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<jsp:include page="layouttopo.jsp"></jsp:include><!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
    <link rel="stylesheet" href="https://unpkg.com/flowbite@1.5.3/dist/flowbite.min.css" />
    <script src="https://unpkg.com/flowbite@1.5.3/dist/flowbite.js"></script>
    <link rel="stylesheet" href="/src/notifier.css">
    <link rel="stylesheet" href="/src/modaledit.css">
    <link rel="stylesheet" href="./css/permuta.css">
    <script src="/src/modaledit.js"></script>

    <title>HRB Kids | Permuta </title>
</head>
<body class="bg-gray-50">
  <script src="/src/notifier.js"></script>

  <div class="grid grid-cols-1 sm:grid-cols-2 m-5 shadow containertodo">

      <div>
        <div  class="bg-white p-8">
          <div class="flex abas-navegacao mt-5  ">
            <ul class="flex w-full mt-4">
            <li class="w-1/2">
                  <button id="produtobotao" onclick="Produto()" class="produtobotao p-2 text-center text-sm font-semibold w-full botao " style="clip-path: polygon(0% 0%, calc(100% - 8px) 0%, 100% 50%, calc(100% - 8px) 100%, 0% 100%);">Produto</button>
            </li>
              <li class="w-1/2">
                <button id="pagamentobotao" onclick="Pagamento()" class="p-2 w-full text-center text-sm font-semibold botao"style="clip-path: polygon(calc(100% - 8px) 0%, 100% 50%, calc(100% - 8px) 100%, 0% 100%, 8px 50%, 0% 0%);"data-shortcut="alt+c">Pagamento</button> 
              </li>
            </ul>
          </div>
      <div id="produtovenda" class="col">
      <h1 class="mt-4 text text-2xl font-semibold">Pedido de Venda</h1>
      <div class="pt-5 flex flex-wrap">
   <form method="POST" action="/cadastrarpermuta" accept-charset="UTF-8">
        <div class="w-full  mr-3">
            <label class="mb-2  block font-medium text-black dark:text-gray-300">Nome do Cliente</label>
            <input type="text" id="nome" name="nomecliente" class=" w-full bg-white border border-gray-300 text-gray-900  rounded-lg focus:ring-gray-300 focus:border-gray-200 p-2 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400 focus:border-gray-200n-500" placeholder="Ciclano da Silva">
        </div>
        
      </div>
      <div class="mt-3">
      <label class="mb-2 block font-medium text-black dark:text-gray-300">Produto</label>
      <div class=" relative pesquisar mr-3">
        <input type="search" id="produto" class=" block p-2.5 w-1/2 w-full z-20 text-sm text-gray-900  rounded-lg border-l-gray-100 border-l-2 border border-gray-300 focus:ring-blue-500 focus:border-blue-500 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:border-blue-500" placeholder="Pesquisar o nome do produto" required>
        <button type="submit" class=" absolute top-0 right-0 p-2.5 text-sm font-medium text-gray-900 rounded-r-lg  hover:bg-gray-100 focus:ring-0 focus:outline-none dark:bg-gray-700 dark:focus:ring-blue-800 dark:text-gray-500"><svg aria-hidden="true" class="w-5 h-5" fill="none" stroke="currentColor" viewBox="0 0 24 24" xmlns="http://www.w3.org/2000/svg"><path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M21 21l-6-6m2-5a7 7 0 11-14 0 7 7 0 0114 0z"></path></svg></button>
      </div>
    </div>
    <div class="flex">
    <div class="w-1/2 mr-1">
    <label class="block mb-2 text-sm font-medium text-black dark:text-gray-300 mt-4">Quantidade</label>
    <input type="number"  value="1" min="1" id="quantidade" class=" w-full block p-2.5  input z-20 text-sm text-gray-900  rounded-lg border-l-gray-100 border-l-2 border border-gray-300 focus:ring-gray-400 focus:border-gray-200 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:border-gray-200" placeholder="Ex:1" required>
  </div>
  <div class="ml-1 mr-3 w-1/2">
    <label class="block mb-2 text-sm font-medium text-black dark:text-gray-300 mt-4 ">Pre�o de Venda (R$)</label>
      <input type="text" step="0.1" id="valorvenda" class=" bg-white border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-gray-400 focus:border-gray-200 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400 dark:focus:border-gray-200" placeholder="Ex: 199,50" required>
    </div>
    </div>
    <div class="flex pt-5 mt-4">
      <a id="inserirbotao" onclick="validar()" type="submit" class=" ml-1 mt-5 cancelarbotao bg-transparent hover:bg-green-200 mr-4  block  mb-2 p-2 w-full z-20  text-gray-900  rounded-lg  border  border-green-300 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:hover:bg-green-700">Inserir</a>
    </div>
    </div>
 
   <div  id="pagamentovenda" class="pagamentovenda">
    <h1 class="mt-4 text text-2xl font-semibold"> Pagamento</h1>
  <div class="flex">
  <div class="w-1/2 mr-1">
  <label class="block mb-2 text-sm font-medium text-black dark:text-gray-300 mt-4">Sub total </label>
  <input  id="subtotal" disabled="disabled" class=" bg-gray-100 w-full block p-2  input z-20 text-sm text-gray-900  rounded-lg border-l-gray-100 border-l-2 border border-gray-300 focus:ring-gray-400 focus:border-gray-200 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:border-gray-200" placeholder="">
</div>
<div class="ml-1 mr-3 w-1/2">
  <label class="block mb-2 text-sm font-medium text-black dark:text-gray-300 mt-4 ">Valor do Cr�dito</label>
    <input    id="valorcredito" name="valorcredito" class=" bg-white border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-gray-400 focus:border-gray-200 block w-full p-2 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400 dark:focus:border-gray-200" placeholder="Ex: 199,50" required>
  </div>
  
  </div>
  <div class="flex">
    <div class="w-1/2 mr-1">
    <label class="block mb-2 text-sm font-medium text-black dark:text-gray-300 mt-4">Saldo em Cr�dito</label>
    <input id="saldo" name="saldocredito" class=" bg-gray-100 w-full block p-2  input z-20 text-sm text-gray-900  rounded-lg border-l-gray-100 border-l-2 border border-gray-300 focus:ring-gray-400 focus:border-gray-200 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:border-gray-200" placeholder="">
  </div>

  
    
    </div>
  </div>
</div>
</div>
     <div class="bg-white lado2 w-full col">

      <table class="w-full">
        <thead class="bg-gray-50 p-5  font-semibold p-4 sombra">
          <tr>
            <td class="p-4 ">Produtos</td>
            <td class="p-4 ">Quantidade</td>
            <td class="p-4 ">Pre�o</td>
            <td class="p-4 ">A��es</td>
          </tr>
        </thead>
        <tbody id="tabelaProdutosEmTable">
          
          <tr class="shadow-sm">
            <td class="p-4 ">Body</td>
            <td class="p-4 texto">1,00</td>
            <td class="p-4">14,90</td>
            <td>
              <button type="button" data-modal-toggle="authentication-modal">
                <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke-width="1.5" stroke="currentColor" class=" w-5 h-5">
                  <path stroke-linecap="round" stroke-linejoin="round" d="M16.862 4.487l1.687-1.688a1.875 1.875 0 112.652 2.652L6.832 19.82a4.5 4.5 0 01-1.897 1.13l-2.685.8.8-2.685a4.5 4.5 0 011.13-1.897L16.863 4.487zm0 0L19.5 7.125" />
                </svg>
              </button>

            <button onclick="Delete()">
              <svg  class="w-full h-4 px-3 " id="Camada_1" data-name="Camada 1" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 18"><defs><style>.cls-1{fill:#ed2121;}</style></defs><title>trash</title><path class="cls-1" d="M9,3V4H4V6H5V19a2,2,0,0,0,2,2H17a2,2,0,0,0,2-2V6h1V4H15V3H9M7,6H17V19H7V6M9,8v9h2V8H9m4,0v9h2V8Z" transform="translate(-4 -3)"/></svg>
            </button>
          </td>
          </tr>
          
        </tbody>
      </table>

        </div>
        
      <div class="sombra bg-white border w-full valortotal">
        <div class="flex  flex-wrap justify-between items-center	">
        <div class="flex  ml-3 ">
          <button class="ml-1 mt-5 cancelarbotao bg-transparent hover:bg-green-200 mr-4  block  mb-2 p-2.5 w-full z-20  text-gray-900  rounded-lg  border  border-green-300 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:hover:bg-green-700">Cancelar</button>
          <button type="submit" class="flex-wrap block w-full cadastrarbotao colorbutton 0 mt-1 mb-2 p-2.5 w-full z-20 text-sm text-gray-900  rounded-lg border-l-gray-100 border-l-2 border border-gray-300 focus:ring-gray-400 focus:border-gray-200 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:border-green-500 dark:text-white dark:hover:cadastrarbotaodark">Finalizar Troca</button>
          </div>
          <div class="flex">
            <p class="text-2xl mr-3 mt-2 text-gray-800 dark:text-white" >Pagar</p>
            <input id="totalp" name="valorpago" class="text-4xl mb-4 mr-4 items-center font-semibold text-gray-800 dark:text-white" value="0,00"  />
          </div>
        </form>
        </div>
      </div>
    </div>

  </div>
</div>
<div id="authentication-modal" tabindex="-1" aria-hidden="true" class="hidden overflow-y-auto overflow-x-hidden fixed top-0 right-0 left-0 z-50 w-full md:inset-0 h-modal md:h-full">
  <div class="relative p-4 w-full max-w-md h-full md:h-auto">
<div class="relative bg-white rounded-lg shadow dark:bg-gray-700">
            <a class="absolute top-3 right-2.5 text-gray-400 bg-transparent hover:bg-gray-200 hover:text-gray-900 rounded-lg text-sm p-1.5 ml-auto inline-flex items-center dark:hover:bg-gray-800 dark:hover:text-white" data-modal-toggle="authentication-modal">
                <svg aria-hidden="true" class="w-5 h-5" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" d="M4.293 4.293a1 1 0 011.414 0L10 8.586l4.293-4.293a1 1 0 111.414 1.414L11.414 10l4.293 4.293a1 1 0 01-1.414 1.414L10 11.414l-4.293 4.293a1 1 0 01-1.414-1.414L8.586 10 4.293 5.707a1 1 0 010-1.414z" clip-rule="evenodd"></path></svg>
                <span class="sr-only">Close modal</span>
            </a>
            <div class="py-6 px-6 lg:px-8">
                <h3 class="mb-4 text-xl font-medium text-gray-900 dark:text-white">VESTIDO HENECY</h3>
                <form class="space-y-6" >
                  <div class="flex">
                    <div class="mr-2">
                        <label class="block mb-2 text-sm  font-medium text-gray-900 dark:text-gray-300">Quantidade</label>
                        <input type="text" name="quantidadeformatacao" step="1" min="1" id="editarquntidade" class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-gray-300 focus:border-gray-200 block w-full p-2.5 dark:bg-gray-600 dark:border-gray-500 dark:placeholder-gray-400 dark:text-white" placeholder="name@company.com">
                    </div>
                    <div class="ml-2">
                        <label class="block mb-2 text-sm font-medium text-gray-900 dark:text-gray-300">Valor unit�rio</label>
                        <input type="text" id="valorunitario" placeholder="" class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-gray-300 focus:border-gray-200 block w-full p-2.5 dark:bg-gray-600 dark:border-gray-500 dark:placeholder-gray-400 dark:text-white">
                    </div>
                  </div>
                    <button type="submit" class="w-full colorbutton p-2 rounded-lg ">Salvar</button>
               <!--  </form> -->
            </div>
        </div>
    </div>
</div> 



  <script>
    

  
    var pagamentovenda= document.getElementById("pagamentovenda");
    var produtovenda= document.getElementById("produtovenda");
    var pagamentobotao =document.getElementById("pagamentobotao");
    var produtobotao= document.getElementById("produtobotao");
     
    function Produto(){

     if (window.matchMedia("(min-width: 768px)").matches){
    pagamentovenda.style.display="none";
    produtovenda.style.display="block";
    produtobotao.style.backgroundColor="#0bde97";
    produtobotao.style.color="white";
    pagamentobotao.style.backgroundColor="#f4f4f4";
    pagamentobotao.style.color="black";
     } else{
      alert("teste")
     }

}
    function Pagamento(){

      var produtovenda= document.getElementById("produtovenda");
      produtovenda.style.display="none";
      pagamentovenda.style.display="block";
      pagamentobotao.style.backgroundColor="#0bde97";
      pagamentobotao.style.color="#FFFF";
      produtobotao.style.backgroundColor="#f4f4f4";
      produtobotao.style.color="black";

    }
    function GerarBotoes( svg, classes){
      let novoBotao = document.createElement("button")
      novoBotao.innerHTML = svg
      // novoBotao.classList.add("px-3")
      novoBotao.setAttribute('data-modal-toggle', 'authentication-modal');
      for(let i = 0; i< classes.length; i++){
        novoBotao.classList.add(classes[i])
      }
     
      return novoBotao
    }
       function GerarModal(texto){
        let modal = document.createElement("div")
        modal.innerHTML = texto
       }

       var subtotal= 0;
       function Inserirproduto(codigoProduto,produto, quantidade,valorvenda,valortotal){

let novaLinhaTR = document.createElement("tr")
novaLinhaTR.classList.add("shadow-sm")
novaLinhaTR.classList.add("p-4", "text-gray-800", "dark:text-white")
novaLinhaTR.id= codigoProduto;

let produtotabela = document.createElement("td")
produtotabela.innerHTML = produto.value;
produtotabela.classList.add("p-4","text-gray-800", "dark:text-white")

let quantidadetabela = document.createElement("td")
quantidadetabela.innerHTML = quantidade.value ;
quantidadetabela.classList.add("p-4","qtdmargin","text-gray-800", "dark:text-white")


let valorvendatabela= document.createElement("td")
var valorvendaformatado = parseFloat(valorvenda.value.replace(",","."))
var calculo = valorvendaformatado * quantidade.value

valorvendatabela.innerHTML= calculo.toLocaleString('pt-BR', { style: 'currency', currency: 'BRL' });
valorvendatabela.classList.add("p-4", "text-gray-800", "dark:text-white")
valorvendatabela.id="valortotalp"



let acoes = document.createElement("td")
valorvendatabela.TextContent = valortotal;



acoes.append(GerarBotoes("<button type='button' data-modal-toggle='authentication-modal' onclick='Mostrarmodal()'><svg xmlns='http://www.w3.org/2000/svg' fill='none' viewBox='0 0 24 24' stroke-width='1.5' stroke='currentColor' class=' w-5 h-5'><path stroke-linecap='round' stroke-linejoin='round' d='M16.862 4.487l1.687-1.688a1.875 1.875 0 112.652 2.652L6.832 19.82a4.5 4.5 0 01-1.897 1.13l-2.685.8.8-2.685a4.5 4.5 0 011.13-1.897L16.863 4.487zm0 0L19.5 7.125' /></svg><button",["bg-white"]))
acoes.append(GerarBotoes('<svg  class="w-4 h-4"id="Camada_1" data-name="Camada 1" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 18"><defs><style>.cls-1{fill:#ed2121;}</style></defs><title>trash</title><path class="cls-1" d="M9,3V4H4V6H5V19a2,2,0,0,0,2,2H17a2,2,0,0,0,2-2V6h1V4H15V3H9M7,6H17V19H7V6M9,8v9h2V8H9m4,0v9h2V8Z" transform="translate(-4 -3)"/></svg>',["px-3", "mb-2s"]))
novaLinhaTR.append(produtotabela, quantidadetabela,valorvendatabela, acoes )


let tabela = document.getElementById("tabelaProdutosEmTable")
tabela.append(novaLinhaTR)
//let div= $('<div class="ml-1 p-3 pedidoproduto flex justify-between items-center"><div><p id="nomeproduto"></p></div>')
//'<div class="tamanhodiv ml-3" id="quantidadeproduto"></div><div class="tamanhodiv text-center mr-5" id="valorvendaproduto" ></div><div class="flex tamanhodiv pl-3"><div><button type="button" data-modal-toggle="authentication-modal"><svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke-width="1.5" stroke="currentColor" class=" w-5 h-5"><path stroke-linecap="round" stroke-linejoin="round" d="M16.862 4.487l1.687-1.688a1.875 1.875 0 112.652 2.652L6.832 19.82a4.5 4.5 0 01-1.897 1.13l-2.685.8.8-2.685a4.5 4.5 0 011.13-1.897L16.863 4.487zm0 0L19.5 7.125"/></svg></button><!-- Main modal --><div id="authentication-modal" tabindex="-1" aria-hidden="true" class="hidden overflow-y-auto overflow-x-hidden fixed top-0 right-0 left-0 z-50 w-full md:inset-0 h-modal md:h-full"><div class="relative p-4 w-full max-w-md h-full md:h-auto"><!-- Modal content --><div class="relative bg-white rounded-lg shadow dark:bg-gray-700"><button type="button" class="absolute top-3 right-2.5 text-gray-400 bg-transparent hover:bg-gray-200 hover:text-gray-900 rounded-lg text-sm p-1.5 ml-auto inline-flex items-center dark:hover:bg-gray-800 dark:hover:text-white" data-modal-toggle="uthentication-modal"><svg aria-hidden="true" class="w-5 h-5" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" d="M4.293 4.293a1 1 0 011.414 0L10 8.586l4.293-4.293a1 1 0 111.414 1.414L11.414 10l4.293 4.293a1 1 0 01-1.414 1.414L10 11.414l-4.293 4.293a1 1 0 01-1.414-1.414L8.586 10 4.293 5.707a1 1 0 010-1.414z" clip-rule="evenodd"></path></svg><span class="sr-only">Close modal</span></button><div class="py-6 px-6 lg:px-8"><h3 class="mb-4 text-xl font-medium text-gray-900 dark:text-white uppercase" id="nomeproduto"></h3><form class="space-y-6" action="#"><div class="flex"><div class="mr-2"<label class="block mb-2 text-sfont-medium text-gray-900 dark:text-gray-300">Quantidade</label><input type="number"step="1" id="editarquantidade" class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-gray-300 focus:border-gray-200 block w-full p-2.5 dark:bg-gray-600 dark:border-gray-500 dark:placeholder-gray-400 dark:text-white"></div><div class="ml-2"><label class="block mb-2 text-sm font-medium text-gray-900 dark:text-gray-300">Valor unit�rio</label><input type="number" id="valorunitario" class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-gray-300 focus:border-gray-200 block w-full p-2.5 dark:bg-gray-600 dark:border-gray-500 dark:placeholder-gray-400 dark:text-white"></div></div><button type="submit" class="w-full colorbutton p-2 rounded-lg">Salvar</button></form></div></div></div></div> </button></div><div><button onclick="Delete()" class="px-3"><svg class="w-4 h-4" id="Camada_1" data-name="Camada 1" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 18"><defs><style>.cls-1{fill:#ed2121;}</style></defs><title>trash</title><path class="cls-1" d="M9,3V4H4V6H5V19a2,2,0,0,0,2,2H17a2,2,0,0,0,2-2V6h1V4H15V3H9M7,6H17V19H7V6M9,8v9h2V8H9m4,0v9h2V8Z" transform="translate(-4 -3)"/></svg></button></div></div></div>");

let novaDiv = document.createElement("div");
novaDiv.classList.add("ml-1", "p-3", "pedidoproduto","border-red-500", "flex", "justify-between", "items-center", "text-gray-800")
let novoP = document.createElement("p")
novoP.id = codigoProduto;
novoP.innerHTML = "<h1>teste</h1>"
novaDiv.append(novoP)

novoP.append(document.createElement("i"))


subtotalinput= document.getElementById("subtotal")
valorvenda=document.getElementById("valorvenda");
quantidade = document.getElementById("quantidade");
subtotal += calculo;
subtotalformatado = subtotal.toLocaleString('pt-BR', { style: 'currency', currency: 'BRL' });
subtotalinput.value= subtotalformatado;

var valorcredito = document.getElementById("valorcredito").value;
var saldo = document.getElementById("saldo");
var total =  subtotal - valorcredito

if (valorcredito> subtotal){

var totalpositivo = valorcredito - subtotal;//total * -1
//totalformatado = 'R$ '+ totalpositivo.toFixed(2).replace('.',',');// totalpositivo.toLocaleString('pt-BR', { style: 'currency', currency: 'BRL' });
totalformatado = totalpositivo.toLocaleString('pt-BR', { style: 'currency', currency: 'BRL' });
saldo.value= totalformatado;
}

else if(valorcredito< subtotal){
var totalp = document.getElementById("totalp");

totalformatado = total.toLocaleString('pt-BR', { style: 'currency', currency: 'BRL' });
totalp.value= totalformatado


}

else{
  var zero = 0 

  saldo.value= zero.toLocaleString('pt-BR', { style: 'currency', currency: 'BRL' })
  totalp.innerHTML= zero.toLocaleString('pt-BR', { style: 'currency', currency: 'BRL' })

}

}

        
      
    function validar(){
      var nome = document.getElementById("nome");
      var produto = document.getElementById("produto");
      var quantidade = document.getElementById("quantidade");
      var valorvenda = document.querySelector("#valorvenda");
      var subtotal = document.getElementById("subtotal");
      var valorcredito = document.getElementById("valorcredito");
      var totalp = document.getElementById("totalp");

      

      

        if(nome.value==''){
          nome.className="w-full p-2 bg-white border border-red-500 text-gray-900  rounded-lg focus:ring-red-500 focus:border-red-500 dark:bg-gray-700 dark:border-red-500 dark:placeholder-gray-400 dark:text-white dark:focus:ring-red-500 focus:border-red-500";
          notifier.show('Preencha o nome do cliente!', 'por favor, preencha o campo em vermelho!', 'warning', '/src/img/danger.png', 5000);
          
        }
        if (produto.value==''){
          produto.className="block p-2.5 w-1/2 w-full z-20 text-sm text-gray-900  rounded-lg border border-red-500 focus:ring-red-500 focus:border-red-500 dark:bg-gray-700 dark:border-red-500 dark:placeholder-gray-400 dark:text-white dark:focus:border-red-500";
          notifier.show('Preencha o campo produto!', 'por favor, preencha o campo em vermelho', 'warning', '/src/img/danger.png', 5000);

        }

        if (valorcredito.value==''){
          valorcredito.className=" bg-white border border-red-500 text-gray-900 text-sm rounded-lg focus:ring-red-500 focus:border-red-500 block w-full p-2 dark:bg-gray-700 dark:border-red-500 dark:placeholder-gray-400 dark:text-white dark:focus:ring-red-500 dark:focus:border-red-500"
          notifier.show('Preencha o valor do cr�dito!', 'por favor, preencha o campo em vermelho na aba Pagamentos', 'warning', '/src/img/danger.png', 5000);

        }else{
        Inserirproduto(Math.random()*2,produto, quantidade,valorvenda)
      }
        
  

    }
 
  </script>

</body>