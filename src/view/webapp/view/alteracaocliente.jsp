<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Cliente</title>

</head>
<body class="bg-gray-50 dark:bg-gray-800">
<jsp:include page="layouttopo.jsp"></jsp:include>
<div class="flex pl-5 pt-5" aria-label="Breadcrumb">
    <ol class="inline-flex items-center space-x-1 md:space-x-3">
      <li class="inline-flex items-center">
        <a href="/index" class="inline-flex items-center text-sm font-medium text-gray-700 hover:text-gray-900 dark:text-gray-400 dark:hover:text-white">
          <svg class="w-4 h-4 mr-2" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path d="M10.707 2.293a1 1 0 00-1.414 0l-7 7a1 1 0 001.414 1.414L4 10.414V17a1 1 0 001 1h2a1 1 0 001-1v-2a1 1 0 011-1h2a1 1 0 011 1v2a1 1 0 001 1h2a1 1 0 001-1v-6.586l.293.293a1 1 0 001.414-1.414l-7-7z"></path></svg>
          Página Inicial
        </a>
      </li>
      <li>
        <div class="flex items-center">
          <svg class="w-6 h-6 text-gray-400" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" d="M7.293 14.707a1 1 0 010-1.414L10.586 10 7.293 6.707a1 1 0 011.414-1.414l4 4a1 1 0 010 1.414l-4 4a1 1 0 01-1.414 0z" clip-rule="evenodd"></path></svg>
          <a href="/clientes" class="ml-1 text-sm font-medium text-gray-700 hover:text-gray-900 md:ml-2 dark:text-gray-400 dark:hover:text-white">Clientes</a>
        </div>
      </li>
      <li>
        <div class="flex items-center">
          <svg class="w-6 h-6 text-gray-400" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" d="M7.293 14.707a1 1 0 010-1.414L10.586 10 7.293 6.707a1 1 0 011.414-1.414l4 4a1 1 0 010 1.414l-4 4a1 1 0 01-1.414 0z" clip-rule="evenodd"></path></svg>
          <a href="/cadastracliente" class="ml-1 text-sm font-medium text-gray-700 hover:text-gray-900 md:ml-2 dark:text-gray-400 dark:hover:text-white">Cadastrar Clientes</a>
        </div>
      </li>
    </ol>
</div>

<div class="bg-white m-5 dark:bg-gray-700" ">
  <div class="flex justify-between items-end responsividade">
  <h1 class="flex pl-4 pt-5 text-4xl font-semibold dark:text-white">Cliente</h1>
</div>

 <!-- forms -->
<form method="POST" action="/alterarcliente" accept-charset="UTF-8">
    <h2 class="flex pl-4 pt-5 text-xl text-gray-400">Dados Cadastrais</h2>
    <div class="pl-4 pt-5 pr-4 grid gap-6 mb-6 md:grid-cols-3">

	<input type="hidden" name="codigo" value="${cliente.getCodigo()}">
				
        <div>
            <label class="block mb-2 text-sm font-medium text-black dark:text-gray-300">Nome Completo</label>
            <input type="text" id="nome" name="nome" value="${cliente.getNome()}" class="bg-white border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-gray-400 focus:border-gray-200 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400 dark:focus:b-gray-2lue-500" placeholder="Ex: Maria Pereira" required >
        </div>
        <div>
            <label class="block mb-2 text-sm font-medium text-black dark:text-gray-300">CPF</label>
            <input type="text" id="cpf" name="cpf" value="${cliente.getCpf()}" class="bg-white border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-gray-400 focus:border-gray-200 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400 dark:focus:b-gray-2lue-500" placeholder="000.000.000-00" required>
        </div>
        <div class="pr-2">
            <label class="block mb-2 text-sm font-medium text-black dark:text-gray-300">E-mail</label>
            <input type="text" id="email" name="email" value="${cliente.getEmail()}" class="bg-white border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-gray-400 focus:border-gray-200 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400 dark:focus:b-gray-2lue-500" placeholder="mariapereira@hotmail.com" >
        </div>
        <div>
            <label class="block mb-2 text-sm font-medium text-black dark:text-gray-300">Telefone</label>
            <input type="text" id="telefone" name="telefone" value="${cliente.getTelefone()}" class="bg-white border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-gray-400 focus:border-gray-200 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400 dark:focus:b-gray-2lue-500" placeholder="(00) 00000-0000" >
        </div>
        <div>
            <label class="block mb-2 text-sm font-medium text-black dark:text-gray-300">Celular</label>
            <input type="text" id="celular" name="celular" value="${cliente.getCelular()}" class="bg-white border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-gray-400 focus:border-gray-200 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400 dark:focus:b-gray-2lue-500" placeholder="(00) 00000-0000" >
        </div>
        <div class="pr-2">
            <label class="block mb-2 text-sm font-medium text-gray-900 dark:text-gray-400">Conheceu a loja por</label>
            <select name="option"  class="bg-white border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-gray-400 focus:border-gray-200 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400 dark:focus:b-gray-2lue-500">
            <option value="${cliente.getOption()}">Escolha uma opção</option>
            <option value="Indicação">Indicação</option>
            <option value="Facebook">Facebook</option>
            <option value="Instagram">Instagram</option>
            <option value="Outros">Outros</option>
            </select>
        </div>
    </div>
    <h2 class="flex pl-5 pt-5 text-xl text-gray-400">Endereço</h2>
    <div class="pl-5 pt-5 pr-5 grid gap-6 mb-6 md:grid-cols-3 mr-4 pb-5">
                  <div >
                <label class="block mb-2 text-sm font-medium text-black dark:text-gray-300">CEP</label>
                    <input type="search" id="cep" name="cep" value="${cliente.getCep()}" size="10" maxlength="9" class="bg-white border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-gray-400 focus:border-gray-200 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400 dark:focus:b-gray-2lue-500 " placeholder="CEP" onblur="pesquisacep(this.value)";>
              </div>
            <div>
                <label for="countries" class="block mb-2 text-sm font-medium text-gray-900 dark:text-gray-400">Estado</label>
                <input id="uf" name="uf" value="${cliente.getUf()}" class=" bg-white border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-gray-400 focus:border-gray-200 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400 dark:focus:b-gray-2lue-500 ">

            </div>
            <div>
                <label class="block mb-2 text-sm font-medium text-black dark:text-gray-300">Cidade</label>
                <input type="text" id="cidade" name="cidade" value="${cliente.getCidade()}" class="bg-white border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-gray-400 focus:border-gray-200 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400 dark:focus:b-gray-2lue-500" placeholder="Ex: Matão" >
            </div>
        <div>
            <label class="block mb-2 text-sm font-medium text-black dark:text-gray-300">Rua</label>
            <input type="text" id="rua" name="rua" value="${cliente.getRua()}" class="bg-white border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-gray-400 focus:border-gray-200 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400 dark:focus:b-gray-2lue-500" placeholder="Ex.: Rua ABC" >
        </div>
        <div >
            <label class="block mb-2 text-sm font-medium text-black dark:text-gray-300">Número</label>
            <input type="text" id="numero" name="numero" value="${cliente.getNumero()}" class="bg-white border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-gray-400 focus:border-gray-200 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400 dark:focus:b-gray-2lue-500" placeholder="1234" >
        </div>

        <div>
            <label class="block mb-2 text-sm font-medium text-black dark:text-gray-300">Bairro</label>
            <input type="text" id="bairro" name="bairro" value="${cliente.getBairro()}" class="bg-white border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-gray-400 focus:border-gray-200 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-gray-400 dark:focus:b-gray-500" placeholder="District Name" >
        </div>

        <div class="flex pt-5">
          <button class=" ml-1 mt-5 cancelarbotao bg-transparent hover:bg-gray-200  block  mb-2 p-2.5 w-full z-20 text-sm text-gray-900  rounded-lg  border border border-gray-300 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:hover:bg-gray-600 mr-1">Cancelar</button>

          <button id="btn-nt-show" type="submit" class=" flex-wrap block cadastrarbotao 0 mt-1 mb-2 p-2.5 w-full z-20 text-sm text-gray-900  rounded-lg  focus:ring-gray-400 ">Cadastrar</button>
      </div>
    </div>
</form>
</div>
  <footer class="leading-normal tracking-normal text-white gradient" style="font-family: 'Source Sans Pro', sans-serif;">
<svg class="wave-top" viewBox="0 0 1439 147" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink">
  <g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd">
    <g transform="translate(-1.000000, -14.000000)" fill-rule="nonzero">
      <g class="wave" fill="#f8fafc">
        <path
          d="M1440,84 C1383.555,64.3 1342.555,51.3 1317,45 C1259.5,30.824 1206.707,25.526 1169,22 C1129.711,18.326 1044.426,18.475 980,22 C954.25,23.409 922.25,26.742 884,32 C845.122,37.787 818.455,42.121 804,45 C776.833,50.41 728.136,61.77 713,65 C660.023,76.309 621.544,87.729 584,94 C517.525,105.104 484.525,106.438 429,108 C379.49,106.484 342.823,104.484 319,102 C278.571,97.783 231.737,88.736 205,84 C154.629,75.076 86.296,57.743 0,32 L0,0 L1440,0 L1440,84 Z"
        ></path>
      </g>
      <g transform="translate(1.000000, 15.000000)" fill="#FFFFFF">
        <g transform="translate(719.500000, 68.500000) rotate(-180.000000) translate(-719.500000, -68.500000) ">
          <path d="M0,0 C90.7283404,0.927527913 147.912752,27.187927 291.910178,59.9119003 C387.908462,81.7278826 543.605069,89.334785 759,82.7326078 C469.336065,156.254352 216.336065,153.6679 0,74.9732496" opacity="0.100000001"></path>
          <path
            d="M100,104.708498 C277.413333,72.2345949 426.147877,52.5246657 546.203633,45.5787101 C666.259389,38.6327546 810.524845,41.7979068 979,55.0741668 C931.069965,56.122511 810.303266,74.8455141 616.699903,111.243176 C423.096539,147.640838 250.863238,145.462612 100,104.708498 Z"
            opacity="0.100000001"
          ></path>
          <path d="M1046,51.6521276 C1130.83045,29.328812 1279.08318,17.607883 1439,40.1656806 L1439,120 C1271.17211,77.9435312 1140.17211,55.1609071 1046,51.6521276 Z" opacity="0.200000003"></path>
        </g>
      </g>
    </g>
  </g>
</svg>
<section class=" mt-5 text-center lg:text-left  text-white">
  <div class="mx-6 pt-5 py-10 text-center md:text-left">
    <div class="grid grid-1 md:grid-cols-2 lg:grid-cols-4 gap-8 pb-5">
      <div class="">
        <h6 class="
            flex
            items-center
            justify-center
            md:justify-start
            negativemargin
          ">
        <img class="tamanhoimg"src="/src/log.png">
        </h6>
        <p class="font-semibold ml-4 negativemargin">
          Importados & Brechó Infantil 
        </p>
      </div>
      <div class="">
        <h6 class="uppercase font-semibold mb-4 flex justify-center md:justify-start">
          Produtos
        </h6>
        <p class="mb-4">
          <a href="#!" class="text-white">Lista</a>
        </p>
        <p class="mb-4">
          <a href="#!" class="text-white">Cadastrar</a>
        </p>
      </div>
      <div class="">
        <h6 class="uppercase font-semibold mb-4 flex justify-center md:justify-start">
          Clientes
        </h6>
        <p class="mb-4">
          <a href="#!" class="text-white">Lista</a>
        </p>
        <p class="mb-4">
          <a href="#!" class="text-white">Cadastrar</a>
        </p>
      </div>
      <div class="">
        <h6 class="uppercase font-semibold mb-4 flex justify-center md:justify-start">
          Avaliação
        </h6>
        <p class="mb-4">
          <a href="#!" class="text-white">Lista</a>
        </p>
        <p class="mb-4">
          <a href="#!" class="text-white">Cadastrar</a>
        </p>
      </div>  
  </div>
</section> 
</footer>


<style>


.tamanhoimg{
  width: 40%;
}
.negativemargin{
  margin-top: -4%;
}
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