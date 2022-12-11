<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<jsp:include page="layouttopo.jsp"></jsp:include>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://unpkg.com/flowbite@1.5.3/dist/flowbite.min.css" />
    <script src="https://unpkg.com/flowbite@1.5.3/dist/flowbite.js"></script>
    <script src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
    <script src="/path/to/cdn/jquery.min.js"></script>
    <link rel="stylesheet" href="./css/notifier.css">

    
    <title>HRB Kids | Cadastro Avaliação </title>
</head>

<body class="grid grid-cols-0  gap-2  margin  bg-gray-50	dark:bg-gray-800">
    <script src="./js/notifier.js"></script>

<!-- Breadcrumbs -->
<div class="flex pl-5 pt-5" aria-label="Breadcrumb">
    <ol class="inline-flex items-center space-x-1 md:space-x-3">
      <li class="inline-flex items-center">
        <a href="#" class="inline-flex items-center  font-medium text-gray-700 hover:text-gray-900 dark:text-gray-400 dark:hover:text-white">
          <svg class="w-4 h-4 mr-2" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path d="M10.707 2.293a1 1 0 00-1.414 0l-7 7a1 1 0 001.414 1.414L4 10.414V17a1 1 0 001 1h2a1 1 0 001-1v-2a1 1 0 011-1h2a1 1 0 011 1v2a1 1 0 001 1h2a1 1 0 001-1v-6.586l.293.293a1 1 0 001.414-1.414l-7-7z"></path></svg>
          Página Inicial
        </a>
      </li>
      <li>
        <div class="flex items-center">
          <svg class="w-6 h-6 text-gray-400" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" d="M7.293 14.707a1 1 0 010-1.414L10.586 10 7.293 6.707a1 1 0 011.414-1.414l4 4a1 1 0 010 1.414l-4 4a1 1 0 01-1.414 0z" clip-rule="evenodd"></path></svg>
          <a href="#" class="ml-1  font-medium text-gray-700 hover:text-gray-900 md:ml-2 dark:text-gray-400 dark:hover:text-white">Avaliação</a>
        </div>
      </li>
      <li>
        <div class="flex items-center">
          <svg class="w-6 h-6 text-gray-400" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" d="M7.293 14.707a1 1 0 010-1.414L10.586 10 7.293 6.707a1 1 0 011.414-1.414l4 4a1 1 0 010 1.414l-4 4a1 1 0 01-1.414 0z" clip-rule="evenodd"></path></svg>
          <a href="#" class="ml-1  font-medium text-gray-700 hover:text-gray-900 md:ml-2 dark:text-gray-400 dark:hover:text-white">Cadastrar Avaliação </a>
        </div>
      </li>
    </ol>
</div>
<div class="bg-white marginlateral pb-5 dark:bg-gray-700">
  <div class="flex justify-between items-end responsividade">
  <h3 class="flex pl-4 pt-5 text-4xl font-semibold text-gray-800 dark:text-white" id="h3">Avaliação
  </h3>

</div>

 <!-- forms -->
<form id="traducao"  method="POST" action="/cadastraravaliacao" accept-charset="UTF-8">
    <div class="pl-4 pt-5 pr-4 grid gap-6 mb-4 md:grid-cols-3 ">
        <div>
            <label class="block mb-2  font-medium text-black dark:text-gray-300">Nome do Cliente</label>
            <input type="text" id="nomecliente" name="nomecliente" class="bg-white border border-gray-300 text-gray-900  rounded-lg focus:ring-gray-300 focus:border-gray-200 w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400 focus:border-gray-200n-500" placeholder="Ciclano da Silva" required >
        </div>
        <div>
          <label class="block mb-2  font-medium text-black dark:text-gray-300">Data da avaliação</label>
          <input  id="dataavaliacao" name="data" class="bg-white border border-gray-300 text-gray-900  rounded-lg focus:ring-gray-300 focus:border-gray-200 w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400 focus:border-gray-200n-500" placeholder="20/09/2022" type="date" required>
      </div>
</div>
<div>
<h2 class="flex pl-4 text-xl text-gray-400" id="text">Peças aprovadas</h2>
</div>
<table class="ml-4 ">
  <div>
    <thead>
      <th class=" font-medium text-black dark:text-gray-300">Descrição</th>
      <th class=" font-medium text-black dark:text-gray-300">Quantidade</th>
      <th class=" font-medium text-black dark:text-gray-300">Preço Custo UN. (R$)</th>
      <th class=" font-medium text-black dark:text-gray-300">Preço Venda UN. (R$)</th>
    </div>
    </thead>
    <tbody>
      <tr id="tabela">
         <div class="flex rounded-l-lg inserir ">
              <td>
                <input type="text" id="descricao" class="border-1 border-r-0 rounded-l-lg bg-white border-gray-300  text-gray-900 rounded-l-lg focus:ring-gray-400 focus:border-gray-400 w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400 focus:border-gray-200" placeholder="Ex: Body" required>
              </td>
              <td>
                <input type="number" min="1" step=".01" id="quantidade" class="border-1 border-r-0 bg-white border-gray-300  text-gray-900  focus:ring-gray-400 focus:border-gray-400 w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400 focus:border-gray-200" placeholder="Ex: 1" required>
              </td>
              <td>
                <input disabled="disabled" type="number" id="valorcusto" onblur="validar()"  class= "border-1 border-r-0 bg-gray-100 border-gray-300 text-gray-900   focus:ring-gray-400 focus:border-gray-400 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400 focus:border-gray-200"><a onblur="Atualizar()"></a>
              </td>
                <td>
                <input type="text" onblur="Atualizar()"  id="valorvenda" class="border-1 border-r-0 bg-white border-gray-300 text-gray-900   focus:ring-gray-400 focus:border-gray-400 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400 focus:border-gray-200" placeholder="Ex: 8,00" required>
            
              </td>
                <td>
                  <a type="text" class="padding remove-item border-1 rounded-r-lg bg-white border-gray-300  text-gray-900  rounded-r-lg focus:ring-red-500 focus:border-red-500 block mr-5 p-2.5 dark:bg-gray-700 dark:border-red-600 dark:placeholder-gray-400 dark:text-white r-5">
                  <svg  class="mb-1 w-6 h-5"id="Camada_1" data-name="Camada 1" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 18"><defs><style>.cls-1{fill:#ed2121;}</style></defs><title>trash</title><path class="cls-1" d="M9,3V4H4V6H5V19a2,2,0,0,0,2,2H17a2,2,0,0,0,2-2V6h1V4H15V3H9M7,6H17V19H7V6M9,8v9h2V8H9m4,0v9h2V8Z" transform="translate(-4 -3)"/></svg>
                </a>
                  </td>
                  </div>
        </tr>
      </tbody>
</table>
 <div id="div" class="ml-4 font-semibold">
  <a onclick="Inserir()" id="add-more" class="position color mb-6">+ Adicionar Item</a></div>
    <div class="flex mt-3 ml-4">
      <p  class="font-semibold text-gray-800">Quantidade de peças:</p>
      
      <input  href="#" id="quantidadetotal" name="itensaprovados" onblur="Atualizar()"  class="  bg-white ml-1 text-gray-800 dark:text-white">0
    </div>
    <div class="flex ml-4">
      <p class="font-semibold text-gray-800">Lucro Bruto:<p class="ml-1 text-gray-800 dark:text-white">R$</p>
      <div  class="text-gray-800 dark:text-white" id="vendatotal"></div>
    </div>
  <div class="flex ml-4">
  <p  class="font-semibold  text-gray-800">Crédito brechozinho:<p class="ml-1 text-red-500">R$</p></p>
  <input  id="valorsacola"  class="flex-wrap text-red-500 bg-white" name="valorcredito">0
</div>

<div class="flex ml-4">
  <p class="font-semibold  text-gray-800">Lucro Líquido: <p class="ml-1 text-green-400">R$</p></p>
  <input  class="text-green-400 bg-white" id="lucroliquido" name="lucroliquido">
</div>
</div>
<!-- s 
<div class="pl-5">
  <p class="font-semibold text-2x1 text-gray-800 dark:text-white">Caso aprovada, o valor será retirado em:</p>
  <div class="flex mt-2 mb-10">
    <div class="items-center ">
      <input type="checkbox" onclick="checkdinheiro()" id="dinheiro" name="credito" class="items-center mb-1 checkbox ">
      <label for="aprovada"  class=" mt-5 text-green-700 font-semibold">Dinheiro</label>
    </div>
<div class="items-center ml-4">
  <input type="checkbox"  onclick="checkcredito()"   id="credito" name="credito" class="items-center mb-1 ">
  <label for="aprovada"  class=" mt-5 text-purple-700 font-semibold">Crédito</label>
</div>
</div>
</div>-->
<div class="flex flex-wrap ml-3 ">
<button class="cancelarbotao bg-white hover:bg-gray-100  mr-4  block  mb-2 p-2.5 w-full z-20  text-gray-500  rounded-lg  border  border-gray-200 hover:text-gray-900 dark:bg-gray-700 dark:hover:bg-gray-600 dark:border-gray-500 dark:placeholder-gray-400 dark:text-gray-300 dark:hover:text-white"><a href="/index" class="w-fulls">Cancelar</a></button>
<button type="submit"  class="ml-1 mt-5 cadastrarbotao block mr-4  mb-2 p-2.5 w-full z-20  text-gray-900  rounded-lg   border border-gray-300 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:hover:cadastrarbotaodark"><a  onclick="validar()" class="w-full">Cadastrar</a></button>
</div>
</form>
<div>
  <script type="text/javascript" src="/jsf/resources/jquery.js"></script>


  <script type="text/javascript">
    function checkaprovada(){
    var credito = document.getElementById('credito');
    var dinheiro = document.getElementById('dinheiro');
    var reprovada = document.getElementById('reprovada');
    var aprovada= document.getElementById('aprovada')    
  
   
    if(aprovada.checked=true){
      reprovada.checked=false;
    }
 
    else{
      aprovada.checked=false
       reprovada.checked=false
    }
  }

  function checkreprovada(){
     if(reprovada.checked=true){
      aprovada.checked=false;
    
    }
    else{
      dinheiro.checked=false
       dinheiro.checked=false
    }
  }
    </script>
 <script type="text/javascript">
  var comboGoogleTradutor = null; //Varialvel global

  function googleTranslateElementInit() {
      new google.translate.TranslateElement({
          pageLanguage: 'pt',
          includedLanguages: 'pt,en',
          layout: google.translate.TranslateElement.InlineLayout.HORIZONTAL
      }, 'google_translate_element');

      comboGoogleTradutor = document.getElementById("google_translate_element").querySelector(".goog-te-combo");
  }

  function changeEvent(el) {
      if (el.fireEvent) {
          el.fireEvent('onchange');
      } else {
          var evObj = document.createEvent("HTMLEvents");

          evObj.initEvent("change", false, true);
          el.dispatchEvent(evObj);
      }
  }

  function trocarIdioma(sigla) {
      if (comboGoogleTradutor) {
          comboGoogleTradutor.value = sigla;
          changeEvent(comboGoogleTradutor);//Dispara a troca
      }
  }
  </script>
  <script type="text/javascript" src="https://translate.google.com/translate_a/element.js?cb=googleTranslateElementInit"></script>

</div>
<style>
  
  table{
    margin-top:2%;
  }
  th{
    text-align:start;
    margin-left: 7%;
  }
  .color{
    color:#0bde97;
  }
  a:hover{
    color:#0bc889;
  }
 
input:checked{
  background-color: #0bde97;

}
 
  .cadastrarbotao{
    
      margin-top: 2%;
      background-color: #0bde97;
      color: white;
      
    }
    .cadastrarbotao:hover{
      background-color: #0bc889;
    }
    


    
    @media (max-width:431px){
      .optionsnav{
        padding:0rem;
        margin:20%
      }
    }

@media (max-width:767px){
  .idiomatext{
    display: none;
  }
}
@media(min-width:768px){
  nav{
    width:85%
  }
  body{
    width: 100%;
    display:block;
   }
    
  table{
    width:80%;
  }
   .cadastrarbotao{
      width:13em;
      margin-right: 0.5%;
   }
  .cancelarbotao{
  width:13em;
  margin-top: 2%;
  margin-right: 0.5%;
}


.borda:focus{
  border-color:gray;
}
.padding{
  padding-top:0.70rem;
}
.login{
    background-color: #0bde97;
    margin-top: -7%;
    
  }
  .login:hover{
    background-color: #0bc889;
  }
  .login a{
    color:white;
  }
}
@media (max-width:399px){
  .tamanho{
    flex-wrap: nowrap;
  }
}



</style>
<script src="../path/to/flowbite/dist/flowbite.js"></script>


 <script>
  var custototal = 0;
  var estoquetotal=0;
  var lucrobruto = 0;
  var lucroliq =0;

  let quantidade = document.getElementById("quantidade");
  let valorcusto = document.getElementById("valorcusto")
    let valorvenda = document.getElementById("valorvenda");
    let valorsacola = document.getElementById("valorsacola");
    let quantidadetotal =document.getElementById("quantidadetotal")
    let vendatotal = document.getElementById("vendatotal")
    let lucroliquido =document.getElementById("lucroliquido")

  function validar(){
    let nomecliente= document.getElementById("nomecliente")

    let descricao = document.getElementById("descricao");
    let quantidade = document.getElementById("quantidade");
    let valorcusto = document.getElementById("valorcusto")
    let valorvenda = document.getElementById("valorvenda");
    let valorsacola = document.getElementById("valorsacola");
    let quantidadetotal =document.getElementById("quantidadetotal")
    let vendatotal = document.getElementById("vendatotal")
    let lucroliquido =document.getElementById("lucroliquido")
    ;

    descricao.className="";

if(nomecliente.value==''|| descricao.value=='' || quantidade.value<=0|| valorvenda.value<=0){
  notifier.show('Preencha todos os campos!', 'Campos em vermelho precisam ser preenchidos ', 'warning', '/src/img/danger.png', 0);
}
    if(nomecliente.value==""){
      nomecliente.classList="bg-white border border-red-500 text-gray-900  rounded-lg focus:ring-red-500 focus:border-red-500 w-full p-2.5 dark:bg-gray-700 dark:border-red-500 dark:placeholder-gray-400 dark:text-white dark:focus:ring-red-500 focus:border-red-500"
      alert("teste")
    }
    else if(descricao.value== ''){
      descricao.className=" border-1 border-r-0 roborder-1  bg-white border-red-500  text-gray-900  focus:ring-red-500 focus:border-red-500 w-full p-2.5 dark:bg-gray-700 dark:border-red-500 dark:placeholder-gray-400 dark:text-white dark:focus:ring-red-400 focus:border-red-500"
    } 
    else if(quantidade.value<=0){
     quantidade.className=" border-1  bg-white border-red-500  text-gray-900  focus:ring-red-500 focus:border-red-500 w-full p-2.5 dark:bg-gray-700 dark:border-red-500 dark:placeholder-gray-400 dark:text-white dark:focus:ring-red-400 focus:border-red-500"
    }
    else if(valorvenda.value<=0){
      valorvenda.className="negative border-1 border-l-0 bg-white border-red-500  text-gray-900   focus:ring-red-500 focus:border-red-500 w-full p-2.5 dark:bg-gray-700 dark:border-red-500 dark:placeholder-gray-400 dark:text-white dark:focus:ring-red-400 focus:border-red-500"
    } else{

  

    descricao.className="border-1 border-r-0 rounded-l-lg bg-white border-gray-300  text-gray-900 rounded-l-lg focus:ring-gray-400 focus:border-gray-400 w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400 focus:border-gray-200";
    quantidade.className="border-1  bg-white border-gray-300 text-gray-900   focus:ring-gray-400 focus:border-gray-400 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400 focus:border-gray-200";
    valorvenda.className="border-1 border-r-0 bg-white border-gray-300 text-gray-900   focus:ring-gray-400 focus:border-gray-400 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400 focus:border-gray-200"
  
    
    
  }
}

function Inserir(){

let nomecliente= document.getElementById("nomecliente")
let descricao = document.getElementById("descricao");
let quantidade = document.getElementById("quantidade");
let valorcusto = document.getElementById("valorcusto");


if(descricao.value=='' || quantidade.value<=0|| valorvenda.value<=0){
notifier.show('Preencha todos os campos!', 'Campos em vermelho precisam ser preenchidos ', 'warning', '/src/img/danger.png', 0);
}
else{
nomecliente.classList="border-1 border-r-0 rounded-l-lg bg-white border-gray-300  text-gray-900 rounded-l-lg focus:ring-gray-400 focus:border-gray-400 w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400 focus:border-gray-200"
descricao.className="border-1 border-r-0 rounded-l-lg bg-white border-gray-300  text-gray-900 rounded-l-lg focus:ring-gray-400 focus:border-gray-400 w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400 focus:border-gray-200";
quantidade.className="border-1  bg-white border-gray-300 text-gray-900   focus:ring-gray-400 focus:border-gray-400 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400 focus:border-gray-200";
valorvenda.className="border-1 border-r-0 bg-white border-gray-300 text-gray-900   focus:ring-gray-400 focus:border-gray-400 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400 focus:border-gray-200"

descricao.removeAttribute('id');
   quantidade.removeAttribute('id');
    valorcusto.removeAttribute('id');
    valorvenda.removeAttribute('id');

let inserir= $("<tr id='tabela'><div class='flex rounded-l-lg inserir'><td><input type='text' id='descricao' class='w-1/2 border-1 border-r-0 rounded-l-lg bg-white border-gray-300  text-gray-900 rounded-l-lg focus:ring-gray-400 focus:border-gray-400 w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400 focus:border-gray-200' placeholder='Ex: Body'></td><td><input type='number' min='1' step='.01' id='quantidade' class='border-1 border-r-0 bg-white border-gray-300  text-gray-900  focus:ring-gray-400 focus:border-gray-400 w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400 focus:border-gray-200' placeholder='Ex: 1'></td><td><input disabled='disabled' type='number' id='valorcusto'  class= 'border-1 border-r-0 bg-gray-100 border-gray-300 text-gray-900   focus:ring-gray-400 focus:border-gray-400 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400 focus:border-gray-200'></td><td><input type='text' id='valorvenda' onblur='Atualizar()' class='border-1 border-r-0 bg-white border-gray-300 text-gray-900   focus:ring-gray-400 focus:border-gray-400 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400 focus:border-gray-200' placeholder='Ex: 8,00'></td><td><a onclick='Delete()' type='text' class='padding w-1/2 remove-item border-1 rounded-r-lg bg-white border-gray-300  text-gray-900  rounded-r-lg focus:ring-red-500 focus:border-red-500 block mr-5 p-2.5 dark:bg-gray-700 dark:border-red-600 dark:placeholder-gray-400 dark:text-white r-5'><svg  class='mb-1 w-6 h-5'id='Camada_1' data-name='Camada 1' xmlns='http://www.w3.org/2000/svg' viewBox='0 0 16 18'><defs><style>.cls-1{fill:#ed2121;}</style></defs><title>trash</title><path class='cls-1' d='M9,3V4H4V6H5V19a2,2,0,0,0,2,2H17a2,2,0,0,0,2-2V6h1V4H15V3H9M7,6H17V19H7V6M9,8v9h2V8H9m4,0v9h2V8Z' transform='translate(-4 -3)'/></svg></a></td></div></tr>")
$("tbody").append(inserir);
}
;

}

function Atualizar(){
    let quantidade = document.getElementById("quantidade");
  let valorcusto = document.getElementById("valorcusto")
    let valorvenda = document.getElementById("valorvenda");
    let valorsacola = document.getElementById("valorsacola");
    let quantidadetotal =document.getElementById("quantidadetotal")
    let vendatotal = document.getElementById("vendatotal")
    let lucroliquido =document.getElementById("lucroliquido")

  valorcusto.value = ((valorvenda.value * quantidade.value) * 0.15) 
    custototal+= parseFloat(valorcusto.value)
    estoquetotal+=parseFloat(quantidade.value)
    lucrobruto +=parseFloat(valorvenda.value)
    lucroliq +=parseFloat((valorvenda.value)- (valorcusto.value))

    valorsacola.value = custototal;
    quantidadetotal.value = estoquetotal;
    vendatotal.value = lucrobruto;
    lucroliquido.innerHTML =lucroliq;


}

function Delete(){
var tabela = document.getElementById("tabela")
let quantidade = document.getElementById("quantidade").value;
let valorvenda = document.getElementById("valorvenda");

if(descricao.value=='' || quantidade.value<=0|| valorvenda.value<=0){
	validar()
	tabela.remove()
	AtualizarRemove()
}else{}

}
function AtualizarRemove(){
    let quantidade = document.getElementById("quantidade");
  let valorcusto = document.getElementById("valorcusto")
    let valorvenda = document.getElementById("valorvenda");
    let valorsacola = document.getElementById("valorsacola");
    let quantidadetotal =document.getElementById("quantidadetotal")
    let vendatotal = document.getElementById("vendatotal")
    let lucroliquido =document.getElementById("lucroliquido")

  valorcusto.value = ((valorvenda.value * quantidade.value) * 0.15) 
    custototal-= parseFloat(valorcusto.value)
    estoquetotal-=parseFloat(quantidade.value)
    lucrobruto -=parseFloat(valorvenda.value)
    lucroliq -=parseFloat((valorvenda.value)- (valorcusto.value))

    valorsacola.value = custototal;
    quantidadetotal.value = estoquetotal;
    vendatotal.value = lucrobruto;
    lucroliquido.value =lucroliq;


}
   
    ///Volta o input para cor normal
    
    
  
       // Create a function to change
    // the hash value of the page
  
  
////////////////
// TEMA DARK
  // On page load or when changing themes, best to add inline in `head` to avoid FOUC
  if (localStorage.getItem('color-theme') === 'dark' || (!('color-theme' in localStorage) && window.matchMedia('(prefers-color-scheme: dark)').matches)) {
      document.documentElement.classList.add('dark');
  } else {
      document.documentElement.classList.remove('dark')
  }

  var themeToggleDarkIcon = document.getElementById('theme-toggle-dark-icon');
var themeToggleLightIcon = document.getElementById('theme-toggle-light-icon');

// Change the icons inside the button based on previous settings
if (localStorage.getItem('color-theme') === 'dark' || (!('color-theme' in localStorage) && window.matchMedia('(prefers-color-scheme: dark)').matches)) {
    themeToggleLightIcon.classList.remove('hidden');
} else {
    themeToggleDarkIcon.classList.remove('hidden');
}

var themeToggleBtn = document.getElementById('theme-toggle');

themeToggleBtn.addEventListener('click', function() {

    // toggle icons inside button
    themeToggleDarkIcon.classList.toggle('hidden');
    themeToggleLightIcon.classList.toggle('hidden');

    // if set via local storage previously
    if (localStorage.getItem('color-theme')) {
        if (localStorage.getItem('color-theme') === 'light') {
            document.documentElement.classList.add('dark');
            localStorage.setItem('color-theme', 'dark');
        } else {
            document.documentElement.classList.remove('dark');
            localStorage.setItem('color-theme', 'light');
        }

    // if NOT set via local storage previously
    } else {
        if (document.documentElement.classList.contains('dark')) {
            document.documentElement.classList.remove('dark');
            localStorage.setItem('color-theme', 'light');
        } else {
            document.documentElement.classList.add('dark');
            localStorage.setItem('color-theme', 'dark');
        }
    }
})
</script>
  <script>
if (localStorage.getItem('color-theme') === 'dark' || (!('color-theme' in localStorage) && window.matchMedia('(prefers-color-scheme: dark)').matches)) {
    document.documentElement.classList.add('dark');
} else {
    document.documentElement.classList.remove('dark')
}

var themeToggleDarkIcon = document.getElementById('theme-toggle-dark-icon');
var themeToggleLightIcon = document.getElementById('theme-toggle-light-icon');

//Change the icons inside the button based on previous settings
if (localStorage.getItem('color-theme') === 'dark' || (!('color-theme' in localStorage) && window.matchMedia('(prefers-color-scheme: dark)').matches)) {
  themeToggleLightIcon.classList.remove('hidden');
} else {
  themeToggleDarkIcon.classList.remove('hidden');
}

var themeToggleBtn = document.getElementById('theme-toggle');

themeToggleBtn.addEventListener('click', function() {

  // toggle icons inside button
  themeToggleDarkIcon.classList.toggle('hidden');
  themeToggleLightIcon.classList.toggle('hidden');

  // if set via local storage previously
  if (localStorage.getItem('color-theme')) {
      if (localStorage.getItem('color-theme') === 'light') {
          document.documentElement.classList.add('dark');
          localStorage.setItem('color-theme', 'dark');
      } else {
          document.documentElement.classList.remove('dark');
          localStorage.setItem('color-theme', 'light');
      }

  // if NOT set via local storage previously
  } else {
      if (document.documentElement.classList.contains('dark')) {
          document.documentElement.classList.remove('dark');
          localStorage.setItem('color-theme', 'light');
      } else {
          document.documentElement.classList.add('dark');
          localStorage.setItem('color-theme', 'dark');
      }
  }
})

</script>

</body>
</html>