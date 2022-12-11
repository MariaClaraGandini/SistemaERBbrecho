<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<jsp:include page="layouttopo.jsp"></jsp:include>

<!DOCTYPE html>
<html lang="pt-br">

    <link rel="stylesheet" href="https://unpkg.com/flowbite@1.5.3/dist/flowbite.min.css"/>
    <script src="https://unpkg.com/flowbite@1.5.3/dist/flowbite.js"></script>
    <script src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
    <script src="/path/to/cdn/jquery.min.js"></script>

    <title>HRB Kids | Cadastrar Usuário </title>
</head>
<body class="bg-gray-50 dark:bg-gray-800" > 

    <script src="../path/to/flowbite/dist/flowbite.js"></script>
   

    <script src="/src/notifier.js"></script>


    <body class="bg-gray-50 dark:bg-gray-800 ">
      <div class="h-screen flex justify-center items-center  ">
          <div class="tamanhodiv -5 bg-white shadow-md rounded px-8 pb-8 mb-4">
              <h1 class="text-3xl mb font-bold text-center text-gray-700">Cadastro</h1>
              <form method="POST" action="/cadastrarusuario">
               <div class="mb-4">
                <label class="mt-3 block text-gray-700 text-sm font-bold mb-2" for="email">
                  Nome Completo
                </label>
                <input type="text" id="nome" name="nome" class="shadow border-1 border-gray-300 focus:border-gray-500 focus:ring-gray-500 rounded-lg w-full py-2 px-3 text-gray-700"  placeholder="Ciclano da Silva" required>
                <div class="nome"></div>
              </div>
              <div class="mb-4">
                <label class="mt-3 block text-gray-700 text-sm font-bold mb-2" for="email">
                  Nome de Usuário
                </label>
                <input type="text" id="email" name="login" class="shadow border-1 border-gray-300 focus:border-gray-500 focus:ring-gray-500 rounded-lg w-full py-2 px-3 text-gray-700"  placeholder="ciclano21" required>
                <div class="text"></div>
              </div>
              <div class="mb-2">
                <label class="block text-gray-700 text-sm font-bold mb-2" for="password">
                  Password
                </label>
                <input  type="password" id="password" name="senha" class="shadow border-1 border-gray-300 focus:ring-gray-300 focus:border-gray-400 rounded-lg w-full py-2 px-3 text-gray-700" id="password" type="password" placeholder="************" required>
                <div class="senha"></div>
              </div> 
              <div>
              <a class=" mb-6 inline-block align-baseline font-bold text-sm text-blue-500 hover:text-blue-800" href="/loginusuario">
        Já possui uma conta? Faça login!
      </a>
              <button type="submit" class=" w-full button  p-3 flex text-center rounded-lg" onclick="validar()"><p class="w-full  text-center ">Cadastrar</p></button>
              </div>
              </form>
      </div>
        <style>
          .tamanhodiv{
            width: 50%;
            padding-right: 5%;
            padding-left: 5%;
            padding-top: 5%;
            padding-bottom: 5%;
          }
          .button{
            
        margin-top: 2%;
        background-color: #0bde97;
        color: white;
        
       }
     input:focus{
      border-color: #0bde97
     }

     .redirecionar{
      text-align: center;
     }
   
        </style>
        <script>
            
          function validar(){
            const email = document.getElementById("email")
            const password = document.getElementById("password")
            const nome = document.getElementById("nome")
  
    
    if(email.value==''){

    email.className=" shadow border-1 border-red-500 focus:border-red-500 focus:ring-red-500 rounded-lg w-full py-2 px-3 text-gray-700";
    let div= $("<p class='text-red-400 italic'>Preencha o campo de e-mail </p>")
   $(".text").append(div);
  } 
   if(password.value==''){
    password.className=" shadow border-1 border-red-500 focus:border-red-500 focus:ring-red-500 rounded-lg w-full py-2 px-3 text-gray-700";
    let div= $("<p class='text-red-400 italic'>Preencha o campo de senha </p>")
   $(".senha").append(div)

  }  
   
   if(nome.value==''){
	   
	   nome.className="shadow border-1 border-red-500 focus:border-red-500 focus:ring-red-500 rounded-lg w-full py-2 px-3 text-gray-700";
	    let div= $("<p class='text-red-400 italic'>Preencha o seu nome completo! </p>")
	   $(".nome").append(div)
   }
	   
    else{
    email.className="shadow border-1 border-gray-300 focus:border-gray-500 focus:ring-gray-500 rounded-lg w-full py-2 px-3 text-gray-700"
    div=""
    

  }
  }
  
        </script>  <!-- NAVBAR  -->


</body>
</html>
<jsp:include page="layoutrodape.jsp"></jsp:include>