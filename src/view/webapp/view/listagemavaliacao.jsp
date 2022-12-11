<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<jsp:include page="layouttopo.jsp"></jsp:include>
<div class="flex pl-5 pt-5" aria-label="Breadcrumb">
    <ol class="inline-flex items-center space-x-1 md:space-x-3">
      <li class="inline-flex items-center">
        <a href="#" class="inline-flex items-center text-sm font-medium text-gray-700 hover:text-gray-900 dark:text-gray-400 dark:hover:text-white">
          <svg class="w-4 h-4 mr-2" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path d="M10.707 2.293a1 1 0 00-1.414 0l-7 7a1 1 0 001.414 1.414L4 10.414V17a1 1 0 001 1h2a1 1 0 001-1v-2a1 1 0 011-1h2a1 1 0 011 1v2a1 1 0 001 1h2a1 1 0 001-1v-6.586l.293.293a1 1 0 001.414-1.414l-7-7z"></path></svg>
          Página Inicial
        </a>
      </li>
      <li>
        <div class="flex items-center">
          <svg class="w-6 h-6 text-gray-400" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" d="M7.293 14.707a1 1 0 010-1.414L10.586 10 7.293 6.707a1 1 0 011.414-1.414l4 4a1 1 0 010 1.414l-4 4a1 1 0 01-1.414 0z" clip-rule="evenodd"></path></svg>
          <a href="#" class="ml-1 text-sm font-medium text-gray-700 hover:text-gray-900 md:ml-2 dark:text-gray-400 dark:hover:text-white">Produtos</a>
        </div>
      </li>
    </ol>
</div>
<h1 class="flex pl-4 pt-5 text-4xl font-semibold text-gray-800 dark:text-white ">Avaliações</h1>
<div class="flex">
<div class="pt-5 pl-4 flex w-full flexwrap">
<form class="relative pesquisar mr-3" method="GET" action="/pesquisaravaliacao">
    <input name="nomecliente" id="search-dropdown" class=" block p-2.5 w-1/2 w-full z-20 text-sm text-gray-900  rounded-lg border-l-gray-100 border-l-2 border border-gray-300 focus:ring-blue-500 focus:border-blue-500 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:border-blue-500" placeholder="Pesquisar o nome do produto" required>
    <button type="submit" class=" absolute top-0 right-0 p-2.5 text-sm font-medium text-gray-900 rounded-r-lg  hover:bg-gray-100 dark:bg-gray-700 dark:focus:ring-blue-800 dark:text-gray-500"><svg aria-hidden="true" class="w-5 h-5" fill="none" stroke="currentColor" viewBox="0 0 24 24" xmlns="http://www.w3.org/2000/svg"><path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M21 21l-6-6m2-5a7 7 0 11-14 0 7 7 0 0114 0z"></path></svg></button>
  </form>
  <button class=" ml-5 cadastrarbotao block  mb-2 p-2.5 w-full z-20 text-sm text-gray-900  rounded-lg border-l-gray-100 border-l-2 border border-gray-300 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:hover:cadastrarbotao"><a href="/cadastraravaliacao" class="w-full h-full">Adicionar Avaliação</a></button>

</div>
</div>

<div class="overflow-x-auto relative pl-1 pt-5">
    <table class="w-full text-sm text-left text-gray-500 dark:text-gray-400">
        <thead class="text-base text-gray-700 bg-gray-50 dark:bg-gray-800 dark:text-gray-400">
            <tr>
                <th scope="col" class="py-3 px-6 font-semibold dark:text-white">
                    Nome
                </th>
                  <th scope="col" class="py-3 px-6 font-semibold dark:text-white">
                    Data
                </th>
                <th scope="col" class="py-3 px-6 font-semibold dark:text-white">
                    Aprovados
                </th>
                <th scope="col" class="py-3 px-6 font-semibold dark:text-white">
                    Crédito
                </th>
                <th scope="col" class="py-3 px-6 font-semibold dark:text-white">
                  Excluir
              </th>
            </tr>
        </thead>
        <tbody>
        	<c:forEach items="${listaAvaliacoes}" var="avaliacao">
        
            <tr class="bg-white border-b dark:bg-gray-700 dark:border-gray-700">
              <th scope="row" class="py-4 px-6 font-medium text-gray-900 whitespace-nowrap dark:text-white">
                    ${avaliacao.getNomecliente()}
                </th>
                <td class="py-4 px-6 dark:text-white">
                ${avaliacao.getData()}
                </td>
                <td class="py-4 px-6 dark:text-white">
                    ${avaliacao.getItensaprovados()}
                </td>
                <td class="py-4 px-6 dark:text-white">
                    ${avaliacao.getValorcredito()}
                </td>
         
                <td class="py-4 px-6">
                 	<a href="/excluiravaliacao?codigo=${avaliacao.getCodigo()}" class="remove-item border-0 focus:ring-red-500 focus:border-red-500 block p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-green-500 dark:focus:border-red-500">
                    <svg  class="w-6 h-5"id="Camada_1" data-name="Camada 1" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 18"><defs><style>.cls-1{fill:#ed2121;}</style></defs><title>trash</title><path class="cls-1" d="M9,3V4H4V6H5V19a2,2,0,0,0,2,2H17a2,2,0,0,0,2-2V6h1V4H15V3H9M7,6H17V19H7V6M9,8v9h2V8H9m4,0v9h2V8Z" transform="translate(-4 -3)"/></svg>
                  </a>
                  </td>
                </tr>
                  
                <div>
                  <div class=" hidden z-50 pr-3 pl-5 my-4 text-base list-none bg-white rounded divide-y divide-gray-100 shadow dark:bg-gray-700" id="language-dropdown-menu">
                    <ul class="py-1" role="none">
                      <li>
                        <a href="#" class=" font-semibold block py-2 px-4 text-sm text-gray-700 hover:bg-gray-100 dark:text-gray-400 dark:hover:bg-gray-600 dark:hover:text-white" role="menuitem">
                        </a>
                        </li>
                        </ul>
                </div>
              </div>
 
		</c:forEach>

        </tbody>
        
    </table>
</div>

<style>
      .cadastrarbotao{
      width:20%;
      background-color: #0bde97;
      color: white;
      
    }
    .cadastrarbotao:hover{
      background-color: #0bc889;
    }
    .pesquisar{
      width:35%;
    }
    @media(max-width:767px){
      .flexwrap{
        display:block;
      }
      .cadastrarbotao{
        margin-top: 3%;
        width: 96%;
      }
      .pesquisar{
        width: 96%;
      }
    }
</style>
<jsp:include page="layoutrodape.jsp"></jsp:include>