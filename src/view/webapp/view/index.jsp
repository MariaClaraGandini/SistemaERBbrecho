<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>
	HRB KIDS| Página Inicial
    </title>
    <meta name="description" content="Simple landind page" />
    <meta name="keywords" content="" />
    <meta name="author" content="" />
    <link rel="stylesheet" href="https://unpkg.com/tailwindcss@2.2.19/dist/tailwind.min.css"/>
    <!--Replace with your tailwind.css once created-->
    <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:400,700" rel="stylesheet" />
    <!-- Define your gradient here - use online tools to find a gradient matching your branding-->
  </head>
  <body class="leading-normal tracking-normal text-white gradient" style="font-family: 'Source Sans Pro', sans-serif;">
    <!--Nav-->
    
     
    <nav class="bg-white border-gray-300 dark:bg-gray-900 w-full">
        <div class="flex flex-wrap w-full  h-15 justify-between tamanho">
          <div class="flex ml-4 tirarmargin">
          <a href="/src/home.html" class="flex items-start">
            <img src="/imagens/logohrb.png" class="  mr-3 mt-1 h-12 w-12 logo" alt="HRB Kids Logo" />
        </a>
    
        <!-- escolha do idioma -->
  
        <!-- TELAS -->
        <div class="navcontainer">
        <div class="hidden  navbarmobile w-full md:flex md:w-auto md:order-1" id="navbar-sticky">
          <ul class="flex flex-col p-4 mt-4 optionsnav rounded-lg md:flex-row md:space-x-8 md:mt-0  md:font-medium md:border-0">
            <li>
              <a href="/listarprodutos" id="Produtos" class="block py-2 pr-4 pl-3 text-gray-700 rounded 0 md:hover:bg-transparent  md:p-0 dark:text-gray-400 md:dark:hover:text-white md:dark:hover:bg-transparent dark:border-gray-700" aria-current="page">Produtos</a>
            </li>
            <li>
              <a href="/listarclientes" id="Clientes" class="block py-2 pr-4 pl-3 text-gray-700 rounded  md:hover:bg-transparent  md:p-0 dark:text-gray-400 md:dark:hover:text-white dark:hover:bg-gray-700 dark:hover:text-white md:dark:hover:bg-transparent dark:border-gray-700">Clientes</a>
            </li>
           
             <li>
              <a href="/listaravaliacoes" id="Avaliacao" class="block py-2 pr-4 pl-3 text-gray-700 rounded  md:hover:bg-transparent md:p-0 dark:text-gray-400 md:dark:hover:text-white dark:hover:bg-gray-700 dark:hover:text-white md:dark:hover:bg-transparent dark:border-gray-700">Avaliação</a>
            </li>
            <li>
              <a href="/cadastrarpermuta" id="Permuta" class="block py-2 pr-2s pl-3 text-gray-700 rounded  md:hover:bg-transparent md:p-0 dark:text-gray-400 md:dark:hover:text-white dark:hover:bg-gray-700 dark:hover:text-white md:dark:hover:bg-transparent dark:border-gray-700">Permuta</a>
            </li>
            <li>
              <button class="login rounded-lg pl-3 p-1 pr-3">
                <a href="/loginusuario" id="login" class="block text-gray-700 md:text-white dark:text-gray-400 md:dark:text-white  rounded md:p-0 ">Entrar</a>
              </button>
            </li>          
            <li>
                 <button class="login rounded-lg pl-3 p-1 pr-2">
                <a href="/logoutusuario" id="login" class="block text-gray-700 md:text-white dark:text-gray-400 md:dark:text-white  rounded md:p-0 ">Sair</a>
              </button>
            </li>
          </ul>
        </div>
      </div>
    </div>
      <div class="ml-5 relative margintop">
      <div class="flex md:order-2 tirarmargin mt-2 mr-2  md:font-medium">
        <button id="theme-toggle" type="button" class="mr-4 tirarmargin text-gray-500 dark:text-gray-400 hover:bg-gray-100 dark:hover:bg-gray-700 focus:outline-none focus:ring-4 focus:ring-gray-200 dark:focus:ring-gray-700 rounded-lg  p-2.5">
          <svg id="theme-toggle-dark-icon" class="hidden w-5 h-5" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path d="M17.293 13.293A8 8 0 016.707 2.707a8.001 8.001 0 1010.586 10.586z"></path></svg>
          <svg id="theme-toggle-light-icon" class="hidden w-5 h-5" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path d="M10 2a1 1 0 011 1v1a1 1 0 11-2 0V3a1 1 0 011-1zm4 8a4 4 0 11-8 0 4 4 0 018 0zm-.464 4.95l.707.707a1 1 0 001.414-1.414l-.707-.707a1 1 0 00-1.414 1.414zm2.12-10.607a1 1 0 010 1.414l-.706.707a1 1 0 11-1.414-1.414l.707-.707a1 1 0 011.414 0zM17 11a1 1 0 100-2h-1a1 1 0 100 2h1zm-7 4a1 1 0 011 1v1a1 1 0 11-2 0v-1a1 1 0 011-1zM5.05 6.464A1 1 0 106.465 5.05l-.708-.707a1 1 0 00-1.414 1.414l.707.707zm1.414 8.486l-.707.707a1 1 0 01-1.414-1.414l.707-.707a1 1 0 011.414 1.414zM4 11a1 1 0 100-2H3a1 1 0 000 2h1z" fill-rule="evenodd" clip-rule="evenodd"></path></svg>
      </button>
 
         <button type="button" data-dropdown-toggle="language-dropdown-menu" class="font-semibold inline-flex justify-center idioma p-2  text-gray-500 rounded cursor-pointer hover:text-gray-900 hover:bg-gray-100 dark:hover:bg-gray-700 dark:hover:text-white">
          <a href="javascript:trocarIdioma('en')">  <img class="w-5 h-5 rounded-full " aria-hidden="true" src="/imagens/bandeira-eua.png"/></a>
        </button>
        <button type="button" data-dropdown-toggle="language-dropdown-menu" class="font-semibold inline-flex justify-center idioma p-2  text-gray-500 rounded cursor-pointer hover:text-gray-900 hover:bg-gray-100 dark:hover:bg-gray-700 dark:hover:text-white">
          <a href="javascript:trocarIdioma('pt')"> <img class=" w-5 h-5 rounded-full " aria-hidden="true" src="/imagens/bandeira-do-brasil.png"/></a>
        </button>
         <div id="google_translate_element" class="boxTradutor"></div>
        
        <div class="flex md:order-2">
          <button data-collapse-toggle="navbar-sticky" type="button" class="inline-flex items-center p-2  text-gray-500 rounded-lg md:hidden hover:bg-gray-100 focus:outline-none focus:ring-2 focus:ring-gray-200 dark:text-gray-400 dark:hover:bg-gray-700 dark:focus:ring-gray-600" aria-controls="navbar-sticky" aria-expanded="false">
            <span class="sr-only">Open main menu</span>
            <svg class="w-6 h-6" aria-hidden="true" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" d="M3 5a1 1 0 011-1h12a1 1 0 110 2H4a1 1 0 01-1-1zM3 10a1 1 0 011-1h12a1 1 0 110 2H4a1 1 0 01-1-1zM3 15a1 1 0 011-1h12a1 1 0 110 2H4a1 1 0 01-1-1z" clip-rule="evenodd"></path></svg>
        </button>
      </div>
     
  </div>
  </div>
      </nav>
      <style>
    .gradient {
      background: linear-gradient(90deg, #0bc889 0%, #8af8d4 100%);
    }
  </style>
  
    <!--Hero-->
    <div class="pt-8 div">
      <div class=" pl-3 mx-auto flex flex-wrap flex-col md:flex-row items-center">
        <!--Left Col-->
        <div class="flex flex-col width md:w-2/5 justify-center items-start text-center md:text-left">
          <p class="uppercase tracking-loose w-full">HRB Kids apresenta:</p>
          <h1 class="my-4 text-5xl font-bold leading-tight ">
            Sistema ERP Brechozinho
          </h1>
          <p class="leading-normal text-2xl mb-8">
            Cadastre clientes, produtos e automatize o processo de avaliação! 
          </p>
          <button class="mx-auto lg:mx-0 hover:underline bg-white text-gray-800 font-bold rounded-full my-6 py-4 px-8 shadow-lg focus:outline-none focus:shadow-outline transform transition hover:scale-105 duration-300 ease-in-out">
            Entrar
          </button>
        </div>
        <!--Right Col-->
        <div class="img1 md:w-3/5 text-center">
          <img class="img" src="/imagens/girl.png" />
        </div>
      </div>
    </div>
    <section class="bg-white border-b py-8">
      <div class="container max-w-5xl mx-auto m-8">
        <h2 class="w-full my-2 text-5xl font-bold leading-tight text-center text-gray-800">
          Sistema de Gestão
        </h2>
        <div class="w-full mb-4 mt-5">
          <div class="h-1 mx-auto gradient w-64 opacity-25 my-0 py-0 rounded-t"></div>
        </div>
        <div class="flex flex-wrap">
          <div class="w-5/6 sm:w-1/2 md:py-24	p-6">
            <h3 class="text-3xl text-gray-800 md:px-8 font-bold leading-none mt-4 mb-3">
              Solução Personalizada
            </h3>
            <p class="text-gray-600 md:px-8 ">
             Software desenvolvido pensando em todas as necessidades do brechozinho! Cadastre clientes, produtos, avaliações e gerencie o valor do Crédito gerado!
              <br />
              <br/>
            </p>
          </div>
          <div class="w-full sm:w-1/2 p-6 items-center	">
            <img src="/imagens/avaliacoes.svg">
           
          </div>
        </div>
        <div class="flex flex-wrap flex-col-reverse sm:flex-row mt-10">
          <div class="w-full sm:w-1/2  mt-6">
            <img src="/imagens/avaliar.svg">

          </div>
          <div class="w-full sm:w-1/2 p-6 mt-7">
            <div class="align-middle">
              <h3 class="text-3xl text-gray-800 font-bold leading-none mb-3">
                Praticidade
              </h3>
              <p class="text-gray-600 mb-8">
                Chega de planilhas confusas! Agora com nosso sistema todas as informações necessárias do brechozinho ficam em um
                único lugar, com muita praticidade, organização e eficiência!
                <br />
                <br />
                
              </p>
            </div>
          </div>
        </div>
      </div>
    </section>
    <section class="bg-white border-b py-8">
      <div class="container containerwidth mx-auto flex flex-wrap pt-4 pb-12">
        <h2 class="w-full my-2 text-5xl font-bold leading-tight text-center text-gray-800">
          Acesso rápido
        </h2>
        <div class="w-full mb-4">
          <div class="h-1 mx-auto gradient w-64 opacity-25 my-0 py-0 rounded-t"></div>
        </div>
        <div class="w-full md:w-1/3 p-6 flex flex-col flex-grow flex-shrink">
          <div class="flex-1 bg-white rounded-t rounded-b-none overflow-hidden shadow">
              <div class=" text-center w-full mt-5 font-bold text-xl text-gray-800 px-6">
                Clientes
              </div>
              <p class=" text-center text-gray-800 text-base px-6 mb-5 mt-3">
                Consulte/cadastre clientes em nosso sistema! Através desse cadastro fica muito fácil o acesso aos dados do cliente!</p>
            </a>
          </div>
          <div class="flex-none mt-auto bg-white rounded-b rounded-t-none overflow-hidden shadow ">
            <div class="flex items-center justify-center">
              <button class="mx-auto lg:mx-0 hover:underline gradient text-white font-bold rounded-full my-6 py-4 px-8 shadow-lg focus:outline-none focus:shadow-outline transform transition hover:scale-105 duration-300 ease-in-out">
                Clique aqui
              </button>
            </div>
          </div>
        </div>
       
        <div class="w-full md:w-1/3 p-6 flex flex-col flex-grow flex-shrink">
          <div class="flex-1 bg-white rounded-t rounded-b-none overflow-hidden shadow">
              <div class=" text-center w-full mt-5 font-bold text-xl text-gray-800 px-6">
                Avaliações
              </div>
              <p class=" text-center text-gray-800 text-base px-6 mb-5 mt-3">
                Consulte/cadastre avaliações! Tenha total controle sobre a sacola, tenha acesso a informações como lucro líquido e valor do crédito gerado!
            </a>
          </div>
          <div class="flex-none mt-auto bg-white rounded-b rounded-t-none overflow-hidden shadow ">
            <div class="flex items-center justify-center">
              <button class="mx-auto lg:mx-0 hover:underline gradient text-white font-bold rounded-full my-6 py-4 px-8 shadow-lg focus:outline-none focus:shadow-outline transform transition hover:scale-105 duration-300 ease-in-out">
                Clique aqui
              </button>
            </div>
          </div>
        </div>
        
      <div class="w-full md:w-1/3 p-6 flex flex-col flex-grow flex-shrink">
          <div class="flex-1 bg-white rounded-t rounded-b-none overflow-hidden shadow">
              <div class=" text-center w-full mt-5 font-bold text-xl text-gray-800 px-6">
                Permuta
              </div>
              <p class=" text-center text-gray-800 text-base px-6 mb-5 mt-3">
                Cadastre/consulte as permutas do brechozinho! 
            </a>
          </div>
          <div class="flex-none mt-auto bg-white rounded-b rounded-t-none overflow-hidden shadow ">
            <div class="flex items-center justify-center">
              <button class="mx-auto lg:mx-0 hover:underline gradient text-white font-bold rounded-full my-6 py-4 px-8 shadow-lg focus:outline-none focus:shadow-outline transform transition hover:scale-105 duration-300 ease-in-out">
                Clique aqui
              </button>
            </div>
          </div>
        </div>
        
      </div>
    </section>
    
   
   
    <!-- jQuery if you need it
  <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  -->
    <style>
      .gradient {
        background: linear-gradient(90deg, #0bc889 0%, #8af8d4 100%);
      }
 .img1{
    margin-top: 0;
  margin-top: 5%;}

.div{
      width: 80%;
      margin-left: 6%;

    }
    /* .containerwidth{
      width: 80%;
      height: 60%;
    } */
   @media (max-width:767px){
    .div{
      text-align: center;
    }
    .img1{
    margin-top: 0;
  text-align: center;}

 .img{
  width: 90%;
  margin-left:6%;
 }

   }
   @media (max-width:1190px){
    .div{
      height: 75%;
      width: 90%;
    }
    .img1{
      margin-top:5%
    }
   }
    @media (min-width:1200px){
      .div{
        width: 60%;
        margin-left: 15%;
      }
      .img{
        margin-left: 20%;
      }
    }
 style>
  .color{
    color:#0bde97;
  }
  a:hover{
    color:#0bc889;
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
     <style type="text/css">
    #google_translate_element {
        display: none;
    }
    
    .goog-te-banner-frame {
        display: none !important;
    }
    body {
        position: static !important;
        top: 0 !important;
    }
    
    </style>
    <!-- 
    <script>
    

////////////////
//TEMA DARK
// On page load or when changing themes, best to add inline in `head` to avoid FOUC
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

</script> -->

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

  
<jsp:include page="layoutrodape.jsp"></jsp:include>
   
  </body>
</html>
	
