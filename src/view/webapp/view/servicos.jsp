<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<jsp:include page="layouttopo.jsp"></jsp:include>
	<c:set var="mensagem" value="Bem-Vindo!"></c:set>
	<c:set var="numero" value="5"></c:set>
	<div class="row">	
		<h1>
			Serviços
		</h1>
		<ul>
		<c:forEach items="${listaServicos}" var="servico">
			<li>${servico}</li>
		</c:forEach>
		</ul>
	</div>
	<p>${mensagem}</p>
	<c:if test="${numero > 0}">
	O numero é maior que zero!
	</c:if>
<jsp:include page="layoutrodape.jsp"></jsp:include>